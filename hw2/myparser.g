grammar myparser;
options {
    backtrack=true;
    memoize=true;
    k=2;
}
parse
	:	function*
		type 'main()'WS*
		'{'
		stat*
		'}'
		function*
	;

type
	:	'int'
	|	'void'
	|	'double'
	|	'float'
	|	'char'
	;

stat
	:	assignstat
	|	exprList	
	|	ifstat
	|	forstat
	|	whilestat
	|	procedstat
	|	declstat
	|	retstat

	;
assignstat
	:	ID '=' expr ';'
	|	ID '=' procedstat 
	;

exprList
	:	expr (',' expr)* ';'
	;

procedstat
	:	ID '(' trparam? ')' ';'
	;
	
trparam
	:	expr (',' expr)*
	;

forstat
	:	'for(' expr+ ';' expr* ';' expr+ ')'
		'{' stat* '}' 
	|	'for(' expr+ ';' expr* ';' expr+ ')'(';')?
	;
		
ifstat
	:	'if(' expr ')'
		'{' stat* '}'
		('else if(' expr ')'
		'{' stat* '}')*
		('else'
		'{' stat* '}')?
		
	;

whilestat
	:	'while(' expr ')'
		'{' stat* '}'
	;

declstat
	:	type exprList
	;

retstat
	:	'return' expr ';'
	;

function
	:	type ID '(' params? ')'WS*
		'{' stat* '}'
	|	type ID '(' params? ')'';'
	;	
	
params
	:	param (',' param)*
	;
	
param
	:	type 
	|	type expr
	;

expr
	:	opstat (('&&' | '||') opstat)*
	;

atom
	:	Number
	|	'(' expr ')' 
	|	ID
	|	ARRAY
	;

	
add
	:	mult (('+' | '-') mult)*
	;
	
mult
	:	atom (('*' | '/' | '%') atom)*
	;

opstat
	:	add (( '<' | '<=' | '>=' | '>' | '==' | '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '!='  ) add)*
	;
	

ARRAY: ID'['( |Number|ID )']';
	
fragment LETTER : ('a'..'z' | 'A'..'Z' | '_') ;
fragment DIGIT : '0'..'9';
Number
    :    ('0'..'9')+ ('.' ('0'..'9')+)?
    ;
ID : LETTER (LETTER | DIGIT)*;
WS : (' ' | '\t' | '\n' | '\r' | '\f')+ {$channel = HIDDEN;};
COMMENT1 
	: '//' .* ('\n'|'\r') {$channel = HIDDEN;};
	
COMMENT2 : '/*' .* '*/' {$channel = HIDDEN;};
LINE_COMMAND 
    : '#' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    ;
