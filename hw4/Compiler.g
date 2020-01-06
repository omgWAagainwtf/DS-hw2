grammer myCompiler;
@options {
		language = Java;
}
@header {
		import java.util.HashMap;
		import java.util.ArrayList;
}
@member {
		boolean TRACEON = false;
		HashMap<String,Integer> symtab = new HashMap<String,Integer>();

		List<String> DataCode = new ArrayList<String>();
		List<String> TextCode = new ArrayList<String>();

		public static register reg = new register(0, 10);
		int attr_type;
		void prologue(String id)
		{
				TextCode.add("\n\n/* Text section */");
				TextCode.add("\t.section .text");
				TextCode.add("\t.global " + id);
				TextCode.add("\t.type " + id + ",\%function");
				TextCode.add(id + ":");

				TextCode.add("\tmov ip, sp");
				TextCode.add("\tstmfd sp!, {r4-r10, fp, ip, lr, pc}");
				TextCode.add("\tsub fp, ip, #4");
		}

		void epilogue()
		{
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
:	LINE_COMMAND*
(type_num | type_void) MAIN '(' ')' '{' stats '}'
;
stats: stat*;
stat: decl;

type_num returns [int attr_type]
	: INT {$attr_type = 1;}
	| FLOAT {$attr_type = 2;}
	;

decl returns [int attr_type]
	: type_num a = ID ('=' b = expr)? (',' c = ID ('=' d = expr)?)* ';'
	{
		if(symtab.containsKey($a.text)) {
			System.out.println("Type Error " + $a.getline() + ": Redeclared identifier " + $a.text + ".");
		}
	}


WS: (' ' | '\t' | '\n' | '\r' )+ {$channel = HIDDEN;};
VOID: 'void';
MAIN: 'main';
INT: 'int';
FLOAT: 'float';
WHILE: 'while';
IF: 'if';

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
ID : (LETTER | '_')(LETTER | DIGIT | '_')*;

INT_NUMBER : (DIGIT)+;
FLOAT_NUMBER : (DIGIT)+ '.' (DIGIT)+;

fragment LETTER : 'a'..'z' | 'A'..'Z';
fragment DIGIT : '0'..'9';
COMMENT1 : '//'(.)*('\r'? '\n') {$channel=HIDDEN;};
COMMENT2 : '/*' (options{greedy = false;}: .)* '*/' {$channel=HIDDEN;};
LINE_COMMAND 
: '#' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
;
LINE_COMMAND 
: '#' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
;

