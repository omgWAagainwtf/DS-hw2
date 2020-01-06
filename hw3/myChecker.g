grammar myChecker;

options {
    language = Java;
    backtrack = true;
    memoize = true;
    k = 2;
}

@header {
	import java.util.HashMap;
}

@members {
	boolean TRACEON = false;
    HashMap<String,Integer> symtab = new HashMap<String,Integer>();
	int attr_type;
}

program
    :   LINE_COMMAND* 
        (type_num | type_void)MAIN '(' ')' '{' stats '}'
		{ if (TRACEON) System.out.println("VOID MAIN () {declarations stats}"); }
    ;
    
stats : stat* ;
    
stat : declarations| assignment| whilestat| ifstat| returnstat| expr ';';
type_num returns [int attr_type]
    : INT 	{ if (TRACEON) System.out.println("type: INT");  $attr_type = 1; }
    | FLOAT	{ if (TRACEON) System.out.println("type: FLOAT");  $attr_type = 2; }
    ;

type_char returns [int attr_type]
    : CHAR	{ if (TRACEON) System.out.println("type: CHAR");  $attr_type = 3; };
type_void returns [int attr_type]
    : VOID	{ if (TRACEON) System.out.println("type: VOID");  $attr_type = 4; };

declarations returns [int attr_type]
    : type_num a = Id ('=' b = expr)? (',' c = Id ('=' d = expr)? )* ';' 
	 {
	   if (symtab.containsKey($a.text)) {
	       System.out.println("Type Error: " + $a.getLine() + 
							  ": Redeclared identifier " + $a.text + ".");
	   } else if ( ($type_num.attr_type != $b.attr_type) &&($b.text != null)) {
			System.out.println("Type Error: " + $b.start.getLine() +
						      ": Type mismatch for the two silde operands in an assignment statement.");
			$attr_type = -2;
			symtab.put($a.text, $type_num.attr_type);
       } else {
           symtab.put($a.text, $type_num.attr_type);
	   }
	   
	   if ($c.text != null){
			if (symtab.containsKey($c.text)) {
			System.out.println("Type Error: " + $c.getLine() + ": Redeclared identifier " + $c.text );
			} else if (($d.text != null) && ($type_num.attr_type != $d.attr_type)) {
				System.out.println("Type Error: " + $d.start.getLine() +
								": Type mismatch for the two silde operands in an assignment statement.");
				$attr_type = -2;
				symtab.put($c.text, $type_num.attr_type);
			} else {
				symtab.put($c.text, $type_num.attr_type);
			}
	   }	   
	 }
	|type_char a = Id ('=' '\''(.)'\'')? (',' c = Id ('=' '\''(.)'\'')? )* ';' 	 
	 {
	   if (TRACEON) System.out.println("declarations: type_char Id : declarations");
	 
  	   if (symtab.containsKey($a.text)) 
		   System.out.println("Type Error: " + $a.getLine() + ": Redeclared identifier " + $a.text);
	   else
		   symtab.put($a.text, $type_char.attr_type);

	   if ($c.text != null){
			if (symtab.containsKey($c.text)) 
				System.out.println("Type Error: " + $c.getLine() + ": Redeclared identifier " + $c.text);
			else 
				symtab.put($c.text, $type_char.attr_type);
	 	}
	 }
    | type_num Id Arr '=' '{' (INT_NUMBER | FLOAT_NUMBER) '}' ';' 
	 {
	   if (TRACEON) System.out.println("declarations: type_num Id : declarations");
	 
  	   if (symtab.containsKey($Id.text)) 
		   System.out.println("Type Error: " + $Id.getLine() + ": Redeclared identifier " + $Id.text);
	   else 
		   symtab.put($Id.text, $type_num.attr_type);
	   
	 }
	| (type_num | type_char) Id Arr ';'
	 {
		if (TRACEON) System.out.println("declarations: type_num Id : declarations");
		if (symtab.containsKey($Id.text)) 
		   System.out.println("Type Error: " + $Id.getLine() + ": Redeclared identifier " + $Id.text);
	    else 
		   symtab.put($Id.text, $type_num.attr_type);
	 }
    ;
    
assignment returns [int attr_type]
    : Id '=' expr ';'
	 {
	   if (symtab.containsKey($Id.text)) {
	       $attr_type = symtab.get($Id.text);
	   } else {
			System.out.println("Type Error: " + $Id.getLine() + ": Undeclared identifier " + $Id.text );
			$attr_type = -2;
			return $attr_type;
	   }
		
	   if (symtab.get($Id.text) != $expr.attr_type) {
			System.out.println("Type Error: " + $expr.start.getLine() +
						      ": Type mismatch for the two silde operands in an assignment statement.");
			$attr_type = -2;
       }
	 }
	| Id Arr '=' expr ';'
	 {
	   if (symtab.containsKey($Id.text)) {
	       $attr_type = symtab.get($Id.text);
	   } else {
			System.out.println("Type Error: " + $Id.getLine() + ": Unknown Identifier " + $Id.text);
			$attr_type = -2;
			return $attr_type;
	   }
	   if (symtab.get($Id.text) != $expr.attr_type) {
			System.out.println("Type Error: " + $expr.start.getLine() +
						      ": Type mismatch for the two silde operands in an assignment statement.");
			$attr_type = -2;
       }
	 }
    ;

whilestat:	'while(' expr ')' '{' stats '}'	;
    
ifstat
    :
        'if(' expr ')'
		(stat | ('{' stats '}'))
		('else if(' expr ')'
		(stat | ('{' stats '}')))*
		('else'WS*
		(stat | ('{' stats '}')))?
	;
returnstat: 'return' expr ';';

expr returns [int attr_type]
	: a = operand { $attr_type = $a.attr_type; }
	(('&&' | '||') b = operand)*
    ;
    
operand returns [int attr_type]
	: a = add { $attr_type = $a.attr_type; }
	( COMP  b = add
	 { 		
		if ($a.attr_type != $b.attr_type) {
			  System.out.println("Type Error: " + $a.start.getLine() +
						         ": Type mismatch for the compare operator in an expr.");
		      $attr_type = -2;
		}
     }
	| OPER c = add
	{ 		
		if ($a.attr_type != $c.attr_type) {
			  System.out.println("Type Error: " + $a.start.getLine() +
						         ": Type mismatch for the assignment operator in an expr.");
		      $attr_type = -2;
		}
     }
	)*
	;
	
add returns [int attr_type]
    : a = mult { $attr_type = $a.attr_type; }
	('+' b = mult
	 { 
		if ($a.attr_type != $b.attr_type) {
			  System.out.println("Type Error: " + $a.start.getLine() +
						         ": Type mismatch for the operator + in an expr.");
		      $attr_type = -2;
		}
     }
	| '-' c = mult
     { 
		if ($a.attr_type != $c.attr_type) {
			  System.out.println("Type Error: " + $a.start.getLine() +
						         ": Type mismatch for the operator - in an expr.");
		      $attr_type = -2;
		}
     }
	)*
    ;

mult returns [int attr_type]
    : a = prior { $attr_type = $a.attr_type; }
	(('*' | '/' | '%') b = prior
	 { 
		if ($a.attr_type != $b.attr_type) {
			  System.out.println("Type Error: " + $a.start.getLine() +
						         ": Type mismatch for the mul operator( * , / ...) in an expr.");
		      $attr_type = -2;
		}
     }
	)*
    ;
    
prior returns [int attr_type]
    : Id ('++' | '--')?
	 {
		if (symtab.containsKey($Id.text)) {
	       $attr_type = symtab.get($Id.text);
		} else {
			System.out.println("Type Error: " + $Id.getLine() + ": Undeclared Identifier " + $Id.text);
			$attr_type = -2;
		}
	 }
    | INT_NUMBER	{ $attr_type = 1; }
    | FLOAT_NUMBER	{ $attr_type = 2; }
    | '(' expr ')'	{ $attr_type = $expr.attr_type; }
    ; 
	 
NEWLINE : ('\\r' | '\\n');
WS : (' ' | '\t' | '\n' | '\r' | '\f')+ {$channel = HIDDEN;};
TAB : '\\t';

VOID : 'void';
MAIN : 'main';
INT : 'int';
FLOAT : 'float';
CHAR : 'char';
WHILE : 'while';
IF : 'if';
COMP: ('==' | '!=' | '<' | '<=' | '>' | '>=');
OPER: ('=' | '*=' | '/=' | '%=' | '+=' | '-=');

STRING_LITERAL
	:	'"'
		{ StringBuilder b = new StringBuilder(); }
		(	'"' '"'				{ b.appendCodePoint('"');}
		|	c=~('"'|'\r'|'\n')	{ b.appendCodePoint(c);}
		)*
		'"'
		{ setText(b.toString()); }
	;
	
Arr : ('['(INT_NUMBER+ | Id)']')+;
Id : (LETTER | '_')(LETTER | DIGIT | '_')*;

INT_NUMBER : (DIGIT)+;
FLOAT_NUMBER : (DIGIT)+ '.' (DIGIT)+;

fragment LETTER : 'a'..'z' | 'A'..'Z';
fragment DIGIT : '0'..'9';
COMMENT1 : '//'(.)*('\r'? '\n') {$channel=HIDDEN;};
COMMENT2 : '/*' (options{greedy = false;}: .)* '*/' {$channel=HIDDEN;};
LINE_COMMAND 
    : '#' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    ;
