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
    /* TRACEON is set to TRUE if you want to dump
	   detail parsing information. */
    boolean TRACEON = false;
	
	/* Symbol table */
    HashMap<String,Integer> symtab = new HashMap<String,Integer>();

	/*
    public enum TypeInfo {
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
       -1 => do not exist,
       -2 => error
    */
     
    List<String> DataCode = new ArrayList<String>();
    List<String> TextCode = new ArrayList<String>();
 
    public static register reg = new register(0, 10);
    
    /*
     * Output prologue.
     */
    void prologue(String id)
    {
       TextCode.add("\n\n/* Text section */");
       TextCode.add("\t.section .text");
       TextCode.add("\t.global " + id);
       TextCode.add("\t.type " + id + ",\%function");
       TextCode.add(id + ":");
       
       /* Follow ARM APCS calling convention */
       TextCode.add("\tmov ip, sp");
       TextCode.add("\tstmfd sp!, {r4-r10, fp, ip, lr, pc}");
       TextCode.add("\tsub fp, ip, #4");
    }
    
    /*
     * Output epilogue.
     */
    void epilogue()
    {
       /* handle epilogue */
       
       /* Follow ARM APCS calling convention */
       TextCode.add("\tldmea fp, {r4-r10, fp, sp, pc}");
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
    : func_declaractions functions
    ;

func_declaractions
    : type Identifier '(' ')' ';' func_declaractions
    |
	;

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
      declarations statements '}'
      {
	       if (TRACEON)
		        System.out.println("type Identifier () {declarations statements}");
	    
		     /* output function epilogue */	  
	       epilogue();
	    }
	;

declarations
    :
	  type Identifier ';' declarations
      { 
	    if (TRACEON) System.out.println("declarations: type Identifier : declarations");
		  if (symtab.containsKey($Identifier.text)) {
		    System.out.println("Type Error: " + 
				                   $Identifier.getLine() + 
							             ": Redeclared identifier.");
	    } else {
			/* Add ID and its attr_type into the symbol table. */
			symtab.put($Identifier.text, $type.attr_type);	   
	    }
		
		/* code generation */
		DataCode.add("\t.type " + $Identifier.text + ", \%object");
		DataCode.add($Identifier.text + ":");
		switch($type.attr_type) {
		case 1: /* Type: integer, initial value is 0. */
		        DataCode.add("\t.word 0");
				break;
		case 2: /* Type: float, initial value is 0. */
		        DataCode.add("\t.word 0");
				break;
		default:
		}
	  }
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
		
statement returns [int attr_type]
    : Identifier '=' arith_expression ';'
	  { 
	    if (symtab.containsKey($Identifier.text)) {
	       $attr_type = symtab.get($Identifier.text);
	    } else {
         /* Add codes to report and handle this error */

	       $attr_type = -2;
	    }
		  
	    if ($attr_type != $arith_expression.attr_type) {
           System.out.println("Type Error: " + 
				                       $arith_expression.start.getLine() +
						                  ": Type mismatch for the two silde operands in an assignment statement.");
		     $attr_type = -2;
      }
		
		  /* code generation */
      TextCode.add("\tstr " + "r" + $arith_expression.reg_num + ", " + $Identifier.text);
	  }  
    ;


arith_expression returns [int attr_type, int reg_num]
    : arith_term arith_expression1[$arith_term.reg_num]
	    {
	       $attr_type = $arith_term.attr_type;
	       $reg_num = $arith_expression1.reg_num;
	    }
    ;


arith_expression1 [int LeftSide_reg] returns [int attr_type, int reg_num]
    : '+' arith_term arith_expression1[$LeftSide_reg]
	    {
	       $attr_type = $arith_term.attr_type;
	       
	       /* code generation */
	       TextCode.add("\tadd " + "r" + $LeftSide_reg + ", r" + $LeftSide_reg + ", r" + $arith_term.reg_num);
	       $reg_num = $LeftSide_reg;
	    }
    | '-' arith_term arith_expression1[$LeftSide_reg]
      {
         $attr_type = $arith_term.attr_type;
      
         /* code generation */
         TextCode.add("\tadd " + "r" + $LeftSide_reg + ", r" + $LeftSide_reg + ", r" + $arith_term.reg_num);
         $reg_num = $LeftSide_reg;
      }
    | {
         $attr_type = -1;
         $reg_num = -1;
      }
	;


arith_term returns [int attr_type, int reg_num]
    : arith_factor arith_term1
	    {
	       $attr_type = $arith_factor.attr_type;
	    
	       if ($arith_term1.attr_type != -1) {
	          if ($attr_type != $arith_term1.attr_type) {
		           System.out.println("Type Error: " + 
				                           $arith_factor.start.getLine() +
						                      ": Type mismatch for the two operands of an operator.");
		        }
		     }
		  
		     $reg_num = $arith_factor.reg_num;
	  }
    ;


arith_term1 returns [int attr_type]
    : '*' arith_factor a=arith_term1 
	  { $attr_type = $arith_factor.attr_type;
	  
	    if ($a.attr_type != -1) {
		     if ($attr_type != $a.attr_type)
              System.out.println("Type Error: " + 
				                          $arith_factor.start.getLine() +
							                   ": Type mismatch for the two operands of an operator.");
		  }
	  }
    | { $attr_type = -1; }
	;


arith_factor returns [int attr_type, int reg_num]
    : '+' a=arith_factor
      {
         $attr_type = $a.attr_type;
         $reg_num = $a.reg_num;
      }
    | '-' a=arith_factor
      {
         $attr_type = $a.attr_type;
         $reg_num = $a.reg_num;
      }
    | primary_expression
      {
         $attr_type = $primary_expression.attr_type;
         $reg_num   = $primary_expression.reg_num;
      }
	;


primary_expression returns [int attr_type, int reg_num]
    : Integer_constant
      { 
         $attr_type = 1;
         
         /* code generation */
         $reg_num = reg.get();  /* get an register */
         TextCode.add("\tmov " + "r" + $reg_num + ", #" + $Integer_constant.text); 
      }
    | Floating_point_constant { $attr_type = 2; }
    | Identifier
      {
         $attr_type = symtab.get($Identifier.text);
         
         /* code generation */
         $reg_num = reg.get(); /* get an register */
         TextCode.add("\tldr " + "r" + $reg_num + ", " + $Identifier.text);
      }
	  | '(' arith_expression ')' { $attr_type = $arith_expression.attr_type; }
    ;

	
/* description of the tokens */
FLOAT:'float';
INT:'int';
VOID: 'void';
CHAR: 'char';

Identifier:('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*;
Integer_constant:'0'..'9'+;
Floating_point_constant:'0'..'9'+ '.' '0'..'9'+;

WS:( ' ' | '\t' | '\r' | '\n' ) {$channel=HIDDEN;};
COMMENT:'/*' .* '*/' {$channel=HIDDEN;};
