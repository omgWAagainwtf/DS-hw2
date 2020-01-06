grammar myparser;

options {
		language = Java;
}
parse
 : block EOF
;

block
: stat*
;

stat
: assignment
| if_stat
| while_stat
;

assignment
: ID ASSIGN expr SCOL
;

if_stat
: 'if('expr')'
'{'stat* '}'
('else if('expr')'
'{'stat* '}')*
('else'
'{'stat*'}')?
;

condition_block
: expr stat_block
;

stat_block
: OBRACE block CBRACE
| stat
;

while_stat
: WHILE_'(' 'expr' ')' expr stat_block
;

expr
 : opstat (AND | OR opstat)*
;

opstat
 : addexpr(( GT_OP | GE_OP | LT_OP | LE_OP | EQ_OP | NE_OP | '+=' | '*=' | '/=' | '-=' | '=' ) addexpr)*
 ;


addexpr
: multiexp
( '+' multiexp
| '-' multiexp
)*
;

multiexp
:
(
'*' atom
|'/' atom
)*
;


atom
: OPAR expr CPAR 
| (DEC_NUM | FLOAT_NUM)  
| (TRUE | FALSE) 
| ID             
| STRING                    
;

/*----------------------*/
/*   Reserved Keywords  */
/*----------------------*/
INT_TYPE  : 'int';
CHAR_TYPE : 'char';
VOID_TYPE : 'void';
FLOAT_TYPE: 'float';
WHILE_    : 'while';
IF: 'if';
ELSE: 'else';
FOR:'for';
SYSTEM: 'printf';
/*----------------------*/
/*  Compound Operators  */
/*----------------------*/
COMMA : ',';
GT_OP : '>';
LT_OP : '<';
EQ_OP : '==';
LE_OP : '<=';
GE_OP : '>=';
NE_OP : '!=';
PP_OP : '++';
MM_OP : '--'; 
RSHIFT_OP : '<<';
LSHIFT_OP : '>>';
LE_BR : '[';
RE_BR : ']';
PLUS : '+';
MINUS : '-';
MULT : '*';
DIV : '/';
MOD : '%';
NOT : '!';
SCOL : ';';
ASSIGN : '=';
OPAR : '(';
CPAR : ')';
OBRACE : '{';
CBRACE : '}';
OR : '||';
AND : '&&';
TRUE : 'true';
FALSE : 'false';
DEC_NUM : ('0' | ('1'..'9')(DIGIT)*);

ID : (LETTER)(LETTER | DIGIT)*;

FLOAT_NUM: FLOAT_NUM1 | FLOAT_NUM2 | FLOAT_NUM3;
fragment FLOAT_NUM1: (DIGIT)+'.'(DIGIT)*;
fragment FLOAT_NUM2: '.'(DIGIT)+;
fragment FLOAT_NUM3: (DIGIT)+;


/* Comments */
COMMENT1 : '//'(.)*'\n';
COMMENT2 : '/*' (options{greedy=false;}: .)* '*/';


NEW_LINE: '\n';

fragment LETTER : 'a'..'z' | 'A'..'Z' | '_';
fragment DIGIT : '0'..'9';
STRING : ('"' (~'"')* '"');

WS  : (' '|'\r'|'\t')+
;

