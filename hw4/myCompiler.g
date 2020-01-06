grammar myCompiler;

options {
		language = Java;
}

@header {
		// import packages here.
		import java.util.HashMap;
		import java.util.ArrayList;
}

@members {
		boolean TRACEON = false;
		HashMap<String,Integer> symtab = new HashMap<String,Integer>();
		int labelCount = 0;

		/*
		   public enum TypeInfo {
		   StringConstant,
		   Integer,
		   Float,
		   Unknown,
		   No_Exist,
		   Error
		   }
		 */

		/* attr_type:
		   1 => integer,
		   2 => float,
		   3 => String constant,
		   -1 => do not exist,
		   -2 => error
		 */

		List<String> DataCode = new ArrayList<String>();
		List<String> TextCode = new ArrayList<String>();

		/*t0 ~ t9*/
		public static register reg = new register(0, 6);

		/*
		 * Output prologue.
		 */
		void prologue(String id)
		{
				TextCode.add("\n\n/* Text section */");
				TextCode.add("\t.section .text");
				TextCode.add("\t.globl " + id);
				TextCode.add("\t.type " + id + ",\%function");
				TextCode.add(id + ":");
				TextCode.add("\tmov ip, sp");
				TextCode.add("\tstmfd sp!, {r4-r10, fp, ip, lr, pc}");
				TextCode.add("\tsub fp, ip, #4\n");
		}

		/*
		 * Output epilogue.
		 */
		void epilogue()
		{
				/* handle epilogue */
				TextCode.add("\n\tldmea fp, {r4-r10, fp, sp, pc}");
		}


		/* Generate a new label */
		String newLabel()
		{
				labelCount ++;
				return (new String("L")) + Integer.toString(labelCount);
		}


		public List<String> getDataCode()
		{
				return DataCode;
		}

		public List<String> getTextCode()
		{
				return TextCode;
		}
}


program
: inlib declarations functions
;

inlib
: INCLUDE_TYPE '<' LIBARY_ID '>' inlib/*new*/
| INCLUDE_TYPE '<' LIBARY_ID '>' /*new*/;

functions
: function functions
|
;

function
: type Identifier '(' ')' '{'
{
		/* output function prologue */
		prologue($Identifier.text);
}
l_declarations statements '}'
{
		if (TRACEON)
				System.out.println("type Identifier () {declarations statements}");

		/* output function epilogue */
		epilogue();
}
;


/* global declaraction */
declarations
:
type Identifier ';' /*declarations*/
{
		if (TRACEON) System.out.println("declarations: type Identifier : declarations");
		if (symtab.containsKey($Identifier.text))
		{
				System.err.println("Type Error: " + $Identifier.getLine() + ": Redeclared identifier.");
		}
		else
		{
				/* Add ID and its attr_type into the symbol table. */
				symtab.put($Identifier.text, $type.attr_type);
		}

		/* code generation */
		switch($type.attr_type) {
				case 1:
						DataCode.add("\t.type "+ $Identifier.text +", \%object");
						DataCode.add($Identifier.text + ":\n\t.word 0\n");
						break;
				case 2:
						DataCode.add("\t.type "+ $Identifier.text +", \%object");
						DataCode.add($Identifier.text + ":\n\t.double 0\n");
						break;
				default:
		}
}
declarations
| { if (TRACEON) System.out.println("declarations: ");}
;


l_declarations
:
type Identifier ';' /*l_declarations*/
{
		/* If you want to handle local variables, fix it. */
		if (TRACEON) System.out.println("declarations: type Identifier : declarations");
		if (symtab.containsKey($Identifier.text))
		{
				System.err.println("Type Error: " + $Identifier.getLine() + ": Redeclared identifier.");
		}
		else
		{
				/* Add ID and its attr_type into the symbol table. */
				symtab.put($Identifier.text, $type.attr_type);
		}
		switch($type.attr_type) {
				case 1:
						DataCode.add("\t.type "+ $Identifier.text +", \%object");
						DataCode.add($Identifier.text + ":\n\t.word 0\n");
						break;
				case 2:
						DataCode.add("\t.type "+ $Identifier.text +", \%object");
						DataCode.add($Identifier.text + ":\n\t.double 0\n");
						break;
				default:
		}
}
l_declarations
| { if (TRACEON) System.out.println("declarations: ");}
;


type returns [int attr_type]
: INT   { if (TRACEON) System.out.println("type: INT");  $attr_type=1; }
| FLOAT { if (TRACEON) System.out.println("type: FLOAT");  $attr_type=2; }
| VOID
| CHAR
;

statements: statement statements
|
;

statement returns [int attr_type , int num_reg]
: (INT | FLOAT )? Identifier '=' arith_expression ';'
{
		if (symtab.containsKey($Identifier.text))
		{
				$attr_type = symtab.get($Identifier.text);
		}
		else
		{
				/* Add codes to report and handle this error */
				System.err.println("Type Error: " + $Identifier.getLine() + ": Undeclared identifier.");

				$attr_type = -2;
		}
		if ($attr_type != $arith_expression.attr_type)
		{
				System.err.println("Type Error: " + $arith_expression.start.getLine() +	": Type mismatch for the two silde operands in an assignment statement.");
				$attr_type = -2;
		}
		else
		{
				if($attr_type == -2 && $arith_expression.attr_type == -2)
				{
						System.err.println("Type Error: " + $arith_expression.start.getLine() + ": Type mismatch for the two silde operands in an assignment statement.");
						$attr_type = -2;
				}
		}

		/* code generation */
		$num_reg = reg.get();
		TextCode.add("\tldr r" + $num_reg + ",=" + $Identifier.text);
		TextCode.add("\tstr r" + $arith_expression.reg_num + ",[r" + $num_reg + "]");
		reg.set(" " + $num_reg );
		reg.set(" " + $arith_expression.reg_num ); /*new*/
}
| IF '(' arith_expression ')' if_then_statements
| Identifier func_argument
{
		$num_reg = reg.get();
		/* code generation */
		if($func_argument.p == 1)
		{
				TextCode.add("\tldr r0,=" + $func_argument.label);
				TextCode.add("\tmov r" + $num_reg + ",r" + $func_argument.reg_num);
				TextCode.add("\tbl printf");
		}
		else if($func_argument.p == 2)
		{
				TextCode.add("\tldr r0,=" + $func_argument.label);
				TextCode.add("\tmov r" + $num_reg + ",r" + $func_argument.reg_num);
				TextCode.add("\tbl printf");
		}
		//TextCode.add("\tsyscall");
}
;


func_argument returns [String label, int p, int attr_type , int reg_num]
: '(' ')' ';'
{
		/* handle function calls here. */
}
| '(' a = arith_expression
{
		$p = 1;
		/* handle function calls here. */

		if($a.attr_type == 3)
		{ // handle string type.
				$label = newLabel();
				DataCode.add($label + ":");
				DataCode.add("\t.ascii " + $a.str);
		}
}
(
 ',' Identifier /*new*/
 {
 		 $p = 2;
 		 if(symtab.containsKey($Identifier.text))
		 {
		 		 $attr_type = symtab.get($Identifier.text);
		 }
		 else
		 {
		 		 $attr_type = -2;
		 		 System.err.println("Type Error: " + $Identifier.getLine() + ": Undeclared identifier.");
		 }

		 //$reg_num = reg.get();
		 //TextCode.add("\tldr r" + $reg_num + ",=" + $Identifier.text + " haha");
		 //TextCode.add("\tstr " + "r" + $arith_expression.reg_num + ",[r" + $reg_num + "]");
		 //reg.set(" " + $reg_num);
 }
)*
	')'
';'
;


arith_expression returns [int attr_type, int reg_num, String str]
: a = multExpr
{
		$attr_type = $a.attr_type;
		$reg_num = $a.reg_num;
		$str = $a.str;
}
( '+' b = multExpr
{
  if ($a.attr_type != $b.attr_type)
  {
  		System.err.println("Type Error: " + $a.start.getLine() + ": Type mismatch for the operator + in an expression.");
  		$attr_type = -2;
  }
  else
  {
  		  if($a.attr_type == -2 && $b.attr_type == -2)
		  {
		  		  System.err.println("Type Error: " + $a.start.getLine() +": Type mismatch for the operator + in an expression.");
		  		  $attr_type = -2;
		  }
  }

  /* code generation */
	TextCode.add("\tadd r" + $reg_num + ",r" + $b.reg_num + ",r" + $reg_num);
	reg.set(" " + $b.reg_num); /*new*/
}
| '-' c = multExpr
{
		if ($a.attr_type != $c.attr_type)
		{
				System.err.println("Type Error: " + $a.start.getLine() + ": Type mismatch for the operator - in an expression.");
				$attr_type = -2;
		}
		else
		{
				if($a.attr_type == -2 && $c.attr_type == -2)
				{
						System.err.println("Type Error: " + $a.start.getLine() +": Type mismatch for the operator - in an expression.");
						$attr_type = -2;
				}
		}
		TextCode.add("\tsub r" + $reg_num + ",r" + $reg_num + ",r" + $c.reg_num);
		reg.set(" " + $reg_num); /*new*/
		reg.set(" " + $c.reg_num); /*new*/
}
)*
;


multExpr returns [int attr_type, int reg_num, String str]
: a = signExpr
{
		$attr_type = $a.attr_type;
		$reg_num = $a.reg_num;
		$str = $a.str;
}
( '*' b = signExpr
{
		if($a.attr_type != $b.attr_type)
		{
				System.err.println("Type Error: " + $a.start.getLine() +": Type mismatch for the operator * in an expression.");
				$attr_type = -2;
		}
		else
		{
				if($a.attr_type == -2 && $b.attr_type == -2)
				{
						System.err.println("Type Error: " + $a.start.getLine() +": Type mismatch for the operator * in an expression.");
						$attr_type = -2;
				}
		}
		TextCode.add("\tmul r" + $reg_num + ",r" + $reg_num + ",r" + $b.reg_num);
		reg.set(" " + $reg_num);
		reg.set(" " + $b.reg_num); /*new*/

}
| '/' c = signExpr
{
		if($a.attr_type != $c.attr_type)
		{
				System.err.println("Type Error: " + $a.start.getLine() +": Type mismatch for the operator / in an expression.");
				$attr_type = -2;
		}
		else
		{
				if($a.attr_type == -2 && $c.attr_type == -2)
				{
						System.err.println("Type Error: " + $a.start.getLine() +": Type mismatch for the operator / in an expression.");
						$attr_type = -2;
				}
		}
		TextCode.add("\tdiv r" + $reg_num + ",r" + $reg_num + ",r" + $c.reg_num);
		reg.set(" " + $reg_num);
		reg.set(" " + $c.reg_num);

}
  )*
;

signExpr returns [int attr_type, int reg_num, String str]
: primaryExpr
{
		$attr_type = $primaryExpr.attr_type;
		$reg_num = $primaryExpr.reg_num;
		$str = $primaryExpr.str;
}
| '-' primaryExpr
;


primaryExpr returns [int attr_type, int reg_num, String str , int reg_num2]
: Integer_constant
{
		$attr_type = 1;
		$str = null;

		/* code generation */
		$reg_num = reg.get();  /* get an register */
		TextCode.add("\tmov r" + $reg_num + ", #" + $Integer_constant.text);

}
| Floating_point_constant
{
		$attr_type = 2;
		$str = null;

		/* code generation */
}
| STRING_LITERAL
{
		$attr_type = 3;
		$str = $STRING_LITERAL.text;

}
| Identifier
{
//		$attr_type = symtab.get($Identifier.text);
		if(symtab.containsKey($Identifier.text))
		{
				$attr_type = symtab.get($Identifier.text);
		}
		else
		{
				System.err.println("Type Error: " + $Identifier.getLine() + ": Undeclared identifier.");
				$attr_type = -2;
		}
		//         $str = null;
		$str = $Identifier.text; /*new*/

		/* code generation */
		$reg_num = reg.get(); /* get an register */
		$reg_num2 = reg.get();
		TextCode.add("\tldr r" + $reg_num + ",=" +$Identifier.text);
		TextCode.add("\tstr r" + $reg_num2 + ",[r" + $reg_num + "]");
}
| '(' arith_expression ')' { $attr_type = $arith_expression.attr_type; }
;


if_then_statements
: statement
| '{' statements '}'
;


/* description of the tokens */
FLOAT:'float';
INT:'int';
VOID: 'void';
CHAR: 'char';
IF: 'if';

INCLUDE_TYPE : ((IandD_TITLE)('include')); /*new*/
fragment IandD_TITLE : '#'; /*new*/
LIBARY_ID :('a'..'z' | 'A'..'Z' | '_')*'.'('a'..'z' | 'A'..'Z' | '_'); /*new*/

Identifier:('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
Integer_constant:'0'..'9'+;
Floating_point_constant:'0'..'9'+ '.' '0'..'9'+;

STRING_LITERAL
:  '"' ( EscapeSequence | ~('\\'|'"') )* '"'
;

fragment
EscapeSequence
:   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
;


WS:( ' ' | '\t' | '\r' | '\n' ) {$channel=HIDDEN;};
COMMENT1 : '//'(.)*('\r'? '\n') {$channel=HIDDEN;};
COMMENT2 : '/*' (options{greedy = false;}: .)* '*/' {$channel=HIDDEN;};
