// $ANTLR 3.5.2 myparser.g 2017-05-12 15:27:43

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class myparserLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__55=55;
	public static final int T__56=56;
	public static final int T__57=57;
	public static final int T__58=58;
	public static final int T__59=59;
	public static final int T__60=60;
	public static final int T__61=61;
	public static final int AND=4;
	public static final int ASSIGN=5;
	public static final int CBRACE=6;
	public static final int CHAR_TYPE=7;
	public static final int COMMA=8;
	public static final int COMMENT1=9;
	public static final int COMMENT2=10;
	public static final int CPAR=11;
	public static final int DEC_NUM=12;
	public static final int DIGIT=13;
	public static final int DIV=14;
	public static final int ELSE=15;
	public static final int EQ_OP=16;
	public static final int FALSE=17;
	public static final int FLOAT_NUM=18;
	public static final int FLOAT_NUM1=19;
	public static final int FLOAT_NUM2=20;
	public static final int FLOAT_NUM3=21;
	public static final int FLOAT_TYPE=22;
	public static final int FOR=23;
	public static final int GE_OP=24;
	public static final int GT_OP=25;
	public static final int ID=26;
	public static final int IF=27;
	public static final int INT_TYPE=28;
	public static final int LETTER=29;
	public static final int LE_BR=30;
	public static final int LE_OP=31;
	public static final int LSHIFT_OP=32;
	public static final int LT_OP=33;
	public static final int MINUS=34;
	public static final int MM_OP=35;
	public static final int MOD=36;
	public static final int MULT=37;
	public static final int NEW_LINE=38;
	public static final int NE_OP=39;
	public static final int NOT=40;
	public static final int OBRACE=41;
	public static final int OPAR=42;
	public static final int OR=43;
	public static final int PLUS=44;
	public static final int PP_OP=45;
	public static final int RE_BR=46;
	public static final int RSHIFT_OP=47;
	public static final int SCOL=48;
	public static final int STRING=49;
	public static final int SYSTEM=50;
	public static final int TRUE=51;
	public static final int VOID_TYPE=52;
	public static final int WHILE_=53;
	public static final int WS=54;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public myparserLexer() {} 
	public myparserLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public myparserLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "myparser.g"; }

	// $ANTLR start "T__55"
	public final void mT__55() throws RecognitionException {
		try {
			int _type = T__55;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:7:7: ( '*=' )
			// myparser.g:7:9: '*='
			{
			match("*="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__55"

	// $ANTLR start "T__56"
	public final void mT__56() throws RecognitionException {
		try {
			int _type = T__56;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:8:7: ( '+=' )
			// myparser.g:8:9: '+='
			{
			match("+="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__56"

	// $ANTLR start "T__57"
	public final void mT__57() throws RecognitionException {
		try {
			int _type = T__57;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:9:7: ( '-=' )
			// myparser.g:9:9: '-='
			{
			match("-="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__57"

	// $ANTLR start "T__58"
	public final void mT__58() throws RecognitionException {
		try {
			int _type = T__58;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:10:7: ( '/=' )
			// myparser.g:10:9: '/='
			{
			match("/="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__58"

	// $ANTLR start "T__59"
	public final void mT__59() throws RecognitionException {
		try {
			int _type = T__59;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:11:7: ( 'else if(' )
			// myparser.g:11:9: 'else if('
			{
			match("else if("); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__59"

	// $ANTLR start "T__60"
	public final void mT__60() throws RecognitionException {
		try {
			int _type = T__60;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:12:7: ( 'expr' )
			// myparser.g:12:9: 'expr'
			{
			match("expr"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__60"

	// $ANTLR start "T__61"
	public final void mT__61() throws RecognitionException {
		try {
			int _type = T__61;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:13:7: ( 'if(' )
			// myparser.g:13:9: 'if('
			{
			match("if("); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__61"

	// $ANTLR start "INT_TYPE"
	public final void mINT_TYPE() throws RecognitionException {
		try {
			int _type = INT_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:82:11: ( 'int' )
			// myparser.g:82:13: 'int'
			{
			match("int"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_TYPE"

	// $ANTLR start "CHAR_TYPE"
	public final void mCHAR_TYPE() throws RecognitionException {
		try {
			int _type = CHAR_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:83:11: ( 'char' )
			// myparser.g:83:13: 'char'
			{
			match("char"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CHAR_TYPE"

	// $ANTLR start "VOID_TYPE"
	public final void mVOID_TYPE() throws RecognitionException {
		try {
			int _type = VOID_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:84:11: ( 'void' )
			// myparser.g:84:13: 'void'
			{
			match("void"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VOID_TYPE"

	// $ANTLR start "FLOAT_TYPE"
	public final void mFLOAT_TYPE() throws RecognitionException {
		try {
			int _type = FLOAT_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:85:11: ( 'float' )
			// myparser.g:85:13: 'float'
			{
			match("float"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_TYPE"

	// $ANTLR start "WHILE_"
	public final void mWHILE_() throws RecognitionException {
		try {
			int _type = WHILE_;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:86:11: ( 'while' )
			// myparser.g:86:13: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHILE_"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:87:3: ( 'if' )
			// myparser.g:87:5: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:88:5: ( 'else' )
			// myparser.g:88:7: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE"

	// $ANTLR start "FOR"
	public final void mFOR() throws RecognitionException {
		try {
			int _type = FOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:89:4: ( 'for' )
			// myparser.g:89:5: 'for'
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FOR"

	// $ANTLR start "SYSTEM"
	public final void mSYSTEM() throws RecognitionException {
		try {
			int _type = SYSTEM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:90:7: ( 'printf' )
			// myparser.g:90:9: 'printf'
			{
			match("printf"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SYSTEM"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:94:7: ( ',' )
			// myparser.g:94:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA"

	// $ANTLR start "GT_OP"
	public final void mGT_OP() throws RecognitionException {
		try {
			int _type = GT_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:95:7: ( '>' )
			// myparser.g:95:9: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GT_OP"

	// $ANTLR start "LT_OP"
	public final void mLT_OP() throws RecognitionException {
		try {
			int _type = LT_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:96:7: ( '<' )
			// myparser.g:96:9: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LT_OP"

	// $ANTLR start "EQ_OP"
	public final void mEQ_OP() throws RecognitionException {
		try {
			int _type = EQ_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:97:7: ( '==' )
			// myparser.g:97:9: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQ_OP"

	// $ANTLR start "LE_OP"
	public final void mLE_OP() throws RecognitionException {
		try {
			int _type = LE_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:98:7: ( '<=' )
			// myparser.g:98:9: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LE_OP"

	// $ANTLR start "GE_OP"
	public final void mGE_OP() throws RecognitionException {
		try {
			int _type = GE_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:99:7: ( '>=' )
			// myparser.g:99:9: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GE_OP"

	// $ANTLR start "NE_OP"
	public final void mNE_OP() throws RecognitionException {
		try {
			int _type = NE_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:100:7: ( '!=' )
			// myparser.g:100:9: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NE_OP"

	// $ANTLR start "PP_OP"
	public final void mPP_OP() throws RecognitionException {
		try {
			int _type = PP_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:101:7: ( '++' )
			// myparser.g:101:9: '++'
			{
			match("++"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PP_OP"

	// $ANTLR start "MM_OP"
	public final void mMM_OP() throws RecognitionException {
		try {
			int _type = MM_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:102:7: ( '--' )
			// myparser.g:102:9: '--'
			{
			match("--"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MM_OP"

	// $ANTLR start "RSHIFT_OP"
	public final void mRSHIFT_OP() throws RecognitionException {
		try {
			int _type = RSHIFT_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:103:11: ( '<<' )
			// myparser.g:103:13: '<<'
			{
			match("<<"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RSHIFT_OP"

	// $ANTLR start "LSHIFT_OP"
	public final void mLSHIFT_OP() throws RecognitionException {
		try {
			int _type = LSHIFT_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:104:11: ( '>>' )
			// myparser.g:104:13: '>>'
			{
			match(">>"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LSHIFT_OP"

	// $ANTLR start "LE_BR"
	public final void mLE_BR() throws RecognitionException {
		try {
			int _type = LE_BR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:105:7: ( '[' )
			// myparser.g:105:9: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LE_BR"

	// $ANTLR start "RE_BR"
	public final void mRE_BR() throws RecognitionException {
		try {
			int _type = RE_BR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:106:7: ( ']' )
			// myparser.g:106:9: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RE_BR"

	// $ANTLR start "PLUS"
	public final void mPLUS() throws RecognitionException {
		try {
			int _type = PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:107:6: ( '+' )
			// myparser.g:107:8: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLUS"

	// $ANTLR start "MINUS"
	public final void mMINUS() throws RecognitionException {
		try {
			int _type = MINUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:108:7: ( '-' )
			// myparser.g:108:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MINUS"

	// $ANTLR start "MULT"
	public final void mMULT() throws RecognitionException {
		try {
			int _type = MULT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:109:6: ( '*' )
			// myparser.g:109:8: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MULT"

	// $ANTLR start "DIV"
	public final void mDIV() throws RecognitionException {
		try {
			int _type = DIV;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:110:5: ( '/' )
			// myparser.g:110:7: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIV"

	// $ANTLR start "MOD"
	public final void mMOD() throws RecognitionException {
		try {
			int _type = MOD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:111:5: ( '%' )
			// myparser.g:111:7: '%'
			{
			match('%'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOD"

	// $ANTLR start "NOT"
	public final void mNOT() throws RecognitionException {
		try {
			int _type = NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:112:5: ( '!' )
			// myparser.g:112:7: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT"

	// $ANTLR start "SCOL"
	public final void mSCOL() throws RecognitionException {
		try {
			int _type = SCOL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:113:6: ( ';' )
			// myparser.g:113:8: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SCOL"

	// $ANTLR start "ASSIGN"
	public final void mASSIGN() throws RecognitionException {
		try {
			int _type = ASSIGN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:114:8: ( '=' )
			// myparser.g:114:10: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASSIGN"

	// $ANTLR start "OPAR"
	public final void mOPAR() throws RecognitionException {
		try {
			int _type = OPAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:115:6: ( '(' )
			// myparser.g:115:8: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OPAR"

	// $ANTLR start "CPAR"
	public final void mCPAR() throws RecognitionException {
		try {
			int _type = CPAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:116:6: ( ')' )
			// myparser.g:116:8: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CPAR"

	// $ANTLR start "OBRACE"
	public final void mOBRACE() throws RecognitionException {
		try {
			int _type = OBRACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:117:8: ( '{' )
			// myparser.g:117:10: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OBRACE"

	// $ANTLR start "CBRACE"
	public final void mCBRACE() throws RecognitionException {
		try {
			int _type = CBRACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:118:8: ( '}' )
			// myparser.g:118:10: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CBRACE"

	// $ANTLR start "OR"
	public final void mOR() throws RecognitionException {
		try {
			int _type = OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:119:4: ( '||' )
			// myparser.g:119:6: '||'
			{
			match("||"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OR"

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:120:5: ( '&&' )
			// myparser.g:120:7: '&&'
			{
			match("&&"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND"

	// $ANTLR start "TRUE"
	public final void mTRUE() throws RecognitionException {
		try {
			int _type = TRUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:121:6: ( 'true' )
			// myparser.g:121:8: 'true'
			{
			match("true"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TRUE"

	// $ANTLR start "FALSE"
	public final void mFALSE() throws RecognitionException {
		try {
			int _type = FALSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:122:7: ( 'false' )
			// myparser.g:122:9: 'false'
			{
			match("false"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FALSE"

	// $ANTLR start "DEC_NUM"
	public final void mDEC_NUM() throws RecognitionException {
		try {
			int _type = DEC_NUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:123:9: ( ( '0' | ( '1' .. '9' ) ( DIGIT )* ) )
			// myparser.g:123:11: ( '0' | ( '1' .. '9' ) ( DIGIT )* )
			{
			// myparser.g:123:11: ( '0' | ( '1' .. '9' ) ( DIGIT )* )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='0') ) {
				alt2=1;
			}
			else if ( ((LA2_0 >= '1' && LA2_0 <= '9')) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// myparser.g:123:12: '0'
					{
					match('0'); 
					}
					break;
				case 2 :
					// myparser.g:123:18: ( '1' .. '9' ) ( DIGIT )*
					{
					if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// myparser.g:123:28: ( DIGIT )*
					loop1:
					while (true) {
						int alt1=2;
						int LA1_0 = input.LA(1);
						if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
							alt1=1;
						}

						switch (alt1) {
						case 1 :
							// myparser.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop1;
						}
					}

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DEC_NUM"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:125:4: ( ( LETTER ) ( LETTER | DIGIT )* )
			// myparser.g:125:6: ( LETTER ) ( LETTER | DIGIT )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// myparser.g:125:14: ( LETTER | DIGIT )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='_'||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// myparser.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop3;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "FLOAT_NUM"
	public final void mFLOAT_NUM() throws RecognitionException {
		try {
			int _type = FLOAT_NUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:127:10: ( FLOAT_NUM1 | FLOAT_NUM2 | FLOAT_NUM3 )
			int alt4=3;
			alt4 = dfa4.predict(input);
			switch (alt4) {
				case 1 :
					// myparser.g:127:12: FLOAT_NUM1
					{
					mFLOAT_NUM1(); 

					}
					break;
				case 2 :
					// myparser.g:127:25: FLOAT_NUM2
					{
					mFLOAT_NUM2(); 

					}
					break;
				case 3 :
					// myparser.g:127:38: FLOAT_NUM3
					{
					mFLOAT_NUM3(); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_NUM"

	// $ANTLR start "FLOAT_NUM1"
	public final void mFLOAT_NUM1() throws RecognitionException {
		try {
			// myparser.g:128:20: ( ( DIGIT )+ '.' ( DIGIT )* )
			// myparser.g:128:22: ( DIGIT )+ '.' ( DIGIT )*
			{
			// myparser.g:128:22: ( DIGIT )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// myparser.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt5 >= 1 ) break loop5;
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
			}

			match('.'); 
			// myparser.g:128:33: ( DIGIT )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// myparser.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop6;
				}
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_NUM1"

	// $ANTLR start "FLOAT_NUM2"
	public final void mFLOAT_NUM2() throws RecognitionException {
		try {
			// myparser.g:129:20: ( '.' ( DIGIT )+ )
			// myparser.g:129:22: '.' ( DIGIT )+
			{
			match('.'); 
			// myparser.g:129:25: ( DIGIT )+
			int cnt7=0;
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// myparser.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt7 >= 1 ) break loop7;
					EarlyExitException eee = new EarlyExitException(7, input);
					throw eee;
				}
				cnt7++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_NUM2"

	// $ANTLR start "FLOAT_NUM3"
	public final void mFLOAT_NUM3() throws RecognitionException {
		try {
			// myparser.g:130:20: ( ( DIGIT )+ )
			// myparser.g:130:22: ( DIGIT )+
			{
			// myparser.g:130:22: ( DIGIT )+
			int cnt8=0;
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( ((LA8_0 >= '0' && LA8_0 <= '9')) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// myparser.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt8 >= 1 ) break loop8;
					EarlyExitException eee = new EarlyExitException(8, input);
					throw eee;
				}
				cnt8++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT_NUM3"

	// $ANTLR start "COMMENT1"
	public final void mCOMMENT1() throws RecognitionException {
		try {
			int _type = COMMENT1;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:134:10: ( '//' ( . )* '\\n' )
			// myparser.g:134:12: '//' ( . )* '\\n'
			{
			match("//"); 

			// myparser.g:134:16: ( . )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0=='\n') ) {
					alt9=2;
				}
				else if ( ((LA9_0 >= '\u0000' && LA9_0 <= '\t')||(LA9_0 >= '\u000B' && LA9_0 <= '\uFFFF')) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// myparser.g:134:17: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop9;
				}
			}

			match('\n'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT1"

	// $ANTLR start "COMMENT2"
	public final void mCOMMENT2() throws RecognitionException {
		try {
			int _type = COMMENT2;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:135:10: ( '/*' ( options {greedy=false; } : . )* '*/' )
			// myparser.g:135:12: '/*' ( options {greedy=false; } : . )* '*/'
			{
			match("/*"); 

			// myparser.g:135:17: ( options {greedy=false; } : . )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0=='*') ) {
					int LA10_1 = input.LA(2);
					if ( (LA10_1=='/') ) {
						alt10=2;
					}
					else if ( ((LA10_1 >= '\u0000' && LA10_1 <= '.')||(LA10_1 >= '0' && LA10_1 <= '\uFFFF')) ) {
						alt10=1;
					}

				}
				else if ( ((LA10_0 >= '\u0000' && LA10_0 <= ')')||(LA10_0 >= '+' && LA10_0 <= '\uFFFF')) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// myparser.g:135:42: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop10;
				}
			}

			match("*/"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT2"

	// $ANTLR start "NEW_LINE"
	public final void mNEW_LINE() throws RecognitionException {
		try {
			int _type = NEW_LINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:138:9: ( '\\n' )
			// myparser.g:138:11: '\\n'
			{
			match('\n'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEW_LINE"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// myparser.g:140:17: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
			// myparser.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// myparser.g:141:16: ( '0' .. '9' )
			// myparser.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:142:8: ( ( '\"' (~ '\"' )* '\"' ) )
			// myparser.g:142:10: ( '\"' (~ '\"' )* '\"' )
			{
			// myparser.g:142:10: ( '\"' (~ '\"' )* '\"' )
			// myparser.g:142:11: '\"' (~ '\"' )* '\"'
			{
			match('\"'); 
			// myparser.g:142:15: (~ '\"' )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( ((LA11_0 >= '\u0000' && LA11_0 <= '!')||(LA11_0 >= '#' && LA11_0 <= '\uFFFF')) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// myparser.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop11;
				}
			}

			match('\"'); 
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:144:5: ( ( ' ' | '\\r' | '\\t' )+ )
			// myparser.g:144:7: ( ' ' | '\\r' | '\\t' )+
			{
			// myparser.g:144:7: ( ' ' | '\\r' | '\\t' )+
			int cnt12=0;
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0=='\t'||LA12_0=='\r'||LA12_0==' ') ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// myparser.g:
					{
					if ( input.LA(1)=='\t'||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt12 >= 1 ) break loop12;
					EarlyExitException eee = new EarlyExitException(12, input);
					throw eee;
				}
				cnt12++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	@Override
	public void mTokens() throws RecognitionException {
		// myparser.g:1:8: ( T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | INT_TYPE | CHAR_TYPE | VOID_TYPE | FLOAT_TYPE | WHILE_ | IF | ELSE | FOR | SYSTEM | COMMA | GT_OP | LT_OP | EQ_OP | LE_OP | GE_OP | NE_OP | PP_OP | MM_OP | RSHIFT_OP | LSHIFT_OP | LE_BR | RE_BR | PLUS | MINUS | MULT | DIV | MOD | NOT | SCOL | ASSIGN | OPAR | CPAR | OBRACE | CBRACE | OR | AND | TRUE | FALSE | DEC_NUM | ID | FLOAT_NUM | COMMENT1 | COMMENT2 | NEW_LINE | STRING | WS )
		int alt13=53;
		alt13 = dfa13.predict(input);
		switch (alt13) {
			case 1 :
				// myparser.g:1:10: T__55
				{
				mT__55(); 

				}
				break;
			case 2 :
				// myparser.g:1:16: T__56
				{
				mT__56(); 

				}
				break;
			case 3 :
				// myparser.g:1:22: T__57
				{
				mT__57(); 

				}
				break;
			case 4 :
				// myparser.g:1:28: T__58
				{
				mT__58(); 

				}
				break;
			case 5 :
				// myparser.g:1:34: T__59
				{
				mT__59(); 

				}
				break;
			case 6 :
				// myparser.g:1:40: T__60
				{
				mT__60(); 

				}
				break;
			case 7 :
				// myparser.g:1:46: T__61
				{
				mT__61(); 

				}
				break;
			case 8 :
				// myparser.g:1:52: INT_TYPE
				{
				mINT_TYPE(); 

				}
				break;
			case 9 :
				// myparser.g:1:61: CHAR_TYPE
				{
				mCHAR_TYPE(); 

				}
				break;
			case 10 :
				// myparser.g:1:71: VOID_TYPE
				{
				mVOID_TYPE(); 

				}
				break;
			case 11 :
				// myparser.g:1:81: FLOAT_TYPE
				{
				mFLOAT_TYPE(); 

				}
				break;
			case 12 :
				// myparser.g:1:92: WHILE_
				{
				mWHILE_(); 

				}
				break;
			case 13 :
				// myparser.g:1:99: IF
				{
				mIF(); 

				}
				break;
			case 14 :
				// myparser.g:1:102: ELSE
				{
				mELSE(); 

				}
				break;
			case 15 :
				// myparser.g:1:107: FOR
				{
				mFOR(); 

				}
				break;
			case 16 :
				// myparser.g:1:111: SYSTEM
				{
				mSYSTEM(); 

				}
				break;
			case 17 :
				// myparser.g:1:118: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 18 :
				// myparser.g:1:124: GT_OP
				{
				mGT_OP(); 

				}
				break;
			case 19 :
				// myparser.g:1:130: LT_OP
				{
				mLT_OP(); 

				}
				break;
			case 20 :
				// myparser.g:1:136: EQ_OP
				{
				mEQ_OP(); 

				}
				break;
			case 21 :
				// myparser.g:1:142: LE_OP
				{
				mLE_OP(); 

				}
				break;
			case 22 :
				// myparser.g:1:148: GE_OP
				{
				mGE_OP(); 

				}
				break;
			case 23 :
				// myparser.g:1:154: NE_OP
				{
				mNE_OP(); 

				}
				break;
			case 24 :
				// myparser.g:1:160: PP_OP
				{
				mPP_OP(); 

				}
				break;
			case 25 :
				// myparser.g:1:166: MM_OP
				{
				mMM_OP(); 

				}
				break;
			case 26 :
				// myparser.g:1:172: RSHIFT_OP
				{
				mRSHIFT_OP(); 

				}
				break;
			case 27 :
				// myparser.g:1:182: LSHIFT_OP
				{
				mLSHIFT_OP(); 

				}
				break;
			case 28 :
				// myparser.g:1:192: LE_BR
				{
				mLE_BR(); 

				}
				break;
			case 29 :
				// myparser.g:1:198: RE_BR
				{
				mRE_BR(); 

				}
				break;
			case 30 :
				// myparser.g:1:204: PLUS
				{
				mPLUS(); 

				}
				break;
			case 31 :
				// myparser.g:1:209: MINUS
				{
				mMINUS(); 

				}
				break;
			case 32 :
				// myparser.g:1:215: MULT
				{
				mMULT(); 

				}
				break;
			case 33 :
				// myparser.g:1:220: DIV
				{
				mDIV(); 

				}
				break;
			case 34 :
				// myparser.g:1:224: MOD
				{
				mMOD(); 

				}
				break;
			case 35 :
				// myparser.g:1:228: NOT
				{
				mNOT(); 

				}
				break;
			case 36 :
				// myparser.g:1:232: SCOL
				{
				mSCOL(); 

				}
				break;
			case 37 :
				// myparser.g:1:237: ASSIGN
				{
				mASSIGN(); 

				}
				break;
			case 38 :
				// myparser.g:1:244: OPAR
				{
				mOPAR(); 

				}
				break;
			case 39 :
				// myparser.g:1:249: CPAR
				{
				mCPAR(); 

				}
				break;
			case 40 :
				// myparser.g:1:254: OBRACE
				{
				mOBRACE(); 

				}
				break;
			case 41 :
				// myparser.g:1:261: CBRACE
				{
				mCBRACE(); 

				}
				break;
			case 42 :
				// myparser.g:1:268: OR
				{
				mOR(); 

				}
				break;
			case 43 :
				// myparser.g:1:271: AND
				{
				mAND(); 

				}
				break;
			case 44 :
				// myparser.g:1:275: TRUE
				{
				mTRUE(); 

				}
				break;
			case 45 :
				// myparser.g:1:280: FALSE
				{
				mFALSE(); 

				}
				break;
			case 46 :
				// myparser.g:1:286: DEC_NUM
				{
				mDEC_NUM(); 

				}
				break;
			case 47 :
				// myparser.g:1:294: ID
				{
				mID(); 

				}
				break;
			case 48 :
				// myparser.g:1:297: FLOAT_NUM
				{
				mFLOAT_NUM(); 

				}
				break;
			case 49 :
				// myparser.g:1:307: COMMENT1
				{
				mCOMMENT1(); 

				}
				break;
			case 50 :
				// myparser.g:1:316: COMMENT2
				{
				mCOMMENT2(); 

				}
				break;
			case 51 :
				// myparser.g:1:325: NEW_LINE
				{
				mNEW_LINE(); 

				}
				break;
			case 52 :
				// myparser.g:1:334: STRING
				{
				mSTRING(); 

				}
				break;
			case 53 :
				// myparser.g:1:341: WS
				{
				mWS(); 

				}
				break;

		}
	}


	protected DFA4 dfa4 = new DFA4(this);
	protected DFA13 dfa13 = new DFA13(this);
	static final String DFA4_eotS =
		"\1\uffff\1\4\3\uffff";
	static final String DFA4_eofS =
		"\5\uffff";
	static final String DFA4_minS =
		"\2\56\3\uffff";
	static final String DFA4_maxS =
		"\2\71\3\uffff";
	static final String DFA4_acceptS =
		"\2\uffff\1\2\1\1\1\3";
	static final String DFA4_specialS =
		"\5\uffff}>";
	static final String[] DFA4_transitionS = {
			"\1\2\1\uffff\12\1",
			"\1\3\1\uffff\12\1",
			"",
			"",
			""
	};

	static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
	static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
	static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
	static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
	static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
	static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
	static final short[][] DFA4_transition;

	static {
		int numStates = DFA4_transitionS.length;
		DFA4_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
		}
	}

	protected class DFA4 extends DFA {

		public DFA4(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 4;
			this.eot = DFA4_eot;
			this.eof = DFA4_eof;
			this.min = DFA4_min;
			this.max = DFA4_max;
			this.accept = DFA4_accept;
			this.special = DFA4_special;
			this.transition = DFA4_transition;
		}
		@Override
		public String getDescription() {
			return "127:1: FLOAT_NUM : ( FLOAT_NUM1 | FLOAT_NUM2 | FLOAT_NUM3 );";
		}
	}

	static final String DFA13_eotS =
		"\1\uffff\1\44\1\47\1\52\1\56\7\36\1\uffff\1\74\1\77\1\101\1\103\12\uffff"+
		"\1\36\2\105\21\uffff\2\36\1\112\10\36\12\uffff\1\36\1\uffff\1\105\2\36"+
		"\2\uffff\1\126\3\36\1\132\4\36\1\140\1\141\1\uffff\1\142\1\143\1\36\1"+
		"\uffff\3\36\1\150\5\uffff\1\151\1\152\1\153\1\36\4\uffff\1\155\1\uffff";
	static final String DFA13_eofS =
		"\156\uffff";
	static final String DFA13_minS =
		"\1\11\1\75\1\53\1\55\1\52\1\154\1\146\1\150\1\157\1\141\1\150\1\162\1"+
		"\uffff\1\75\1\74\2\75\12\uffff\1\162\2\56\21\uffff\1\163\1\160\1\50\1"+
		"\164\1\141\1\151\1\157\1\162\1\154\2\151\12\uffff\1\165\1\uffff\1\56\1"+
		"\145\1\162\2\uffff\1\60\1\162\1\144\1\141\1\60\1\163\1\154\1\156\1\145"+
		"\1\40\1\60\1\uffff\2\60\1\164\1\uffff\2\145\1\164\1\60\5\uffff\3\60\1"+
		"\146\4\uffff\1\60\1\uffff";
	static final String DFA13_maxS =
		"\1\175\4\75\1\170\1\156\1\150\2\157\1\150\1\162\1\uffff\1\76\3\75\12\uffff"+
		"\1\162\2\71\21\uffff\1\163\1\160\1\172\1\164\1\141\1\151\1\157\1\162\1"+
		"\154\2\151\12\uffff\1\165\1\uffff\1\71\1\145\1\162\2\uffff\1\172\1\162"+
		"\1\144\1\141\1\172\1\163\1\154\1\156\1\145\2\172\1\uffff\2\172\1\164\1"+
		"\uffff\2\145\1\164\1\172\5\uffff\3\172\1\146\4\uffff\1\172\1\uffff";
	static final String DFA13_acceptS =
		"\14\uffff\1\21\4\uffff\1\34\1\35\1\42\1\44\1\46\1\47\1\50\1\51\1\52\1"+
		"\53\3\uffff\1\57\1\60\1\63\1\64\1\65\1\1\1\40\1\2\1\30\1\36\1\3\1\31\1"+
		"\37\1\4\1\61\1\62\1\41\13\uffff\1\26\1\33\1\22\1\25\1\32\1\23\1\24\1\45"+
		"\1\27\1\43\1\uffff\1\56\3\uffff\1\7\1\15\13\uffff\1\10\3\uffff\1\17\4"+
		"\uffff\1\5\1\16\1\6\1\11\1\12\4\uffff\1\54\1\13\1\55\1\14\1\uffff\1\20";
	static final String DFA13_specialS =
		"\156\uffff}>";
	static final String[] DFA13_transitionS = {
			"\1\42\1\40\2\uffff\1\42\22\uffff\1\42\1\20\1\41\2\uffff\1\23\1\32\1\uffff"+
			"\1\25\1\26\1\1\1\2\1\14\1\3\1\37\1\4\1\34\11\35\1\uffff\1\24\1\16\1\17"+
			"\1\15\2\uffff\32\36\1\21\1\uffff\1\22\1\uffff\1\36\1\uffff\2\36\1\7\1"+
			"\36\1\5\1\11\2\36\1\6\6\36\1\13\3\36\1\33\1\36\1\10\1\12\3\36\1\27\1"+
			"\31\1\30",
			"\1\43",
			"\1\46\21\uffff\1\45",
			"\1\51\17\uffff\1\50",
			"\1\55\4\uffff\1\54\15\uffff\1\53",
			"\1\57\13\uffff\1\60",
			"\1\61\7\uffff\1\62",
			"\1\63",
			"\1\64",
			"\1\67\12\uffff\1\65\2\uffff\1\66",
			"\1\70",
			"\1\71",
			"",
			"\1\72\1\73",
			"\1\76\1\75",
			"\1\100",
			"\1\102",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\104",
			"\1\37\1\uffff\12\37",
			"\1\37\1\uffff\12\106",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\107",
			"\1\110",
			"\1\111\7\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"\1\113",
			"\1\114",
			"\1\115",
			"\1\116",
			"\1\117",
			"\1\120",
			"\1\121",
			"\1\122",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\123",
			"",
			"\1\37\1\uffff\12\106",
			"\1\124",
			"\1\125",
			"",
			"",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"\1\127",
			"\1\130",
			"\1\131",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"\1\133",
			"\1\134",
			"\1\135",
			"\1\136",
			"\1\137\17\uffff\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"\1\144",
			"",
			"\1\145",
			"\1\146",
			"\1\147",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"",
			"",
			"",
			"",
			"",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"\1\154",
			"",
			"",
			"",
			"",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			""
	};

	static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
	static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
	static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
	static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
	static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
	static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
	static final short[][] DFA13_transition;

	static {
		int numStates = DFA13_transitionS.length;
		DFA13_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
		}
	}

	protected class DFA13 extends DFA {

		public DFA13(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 13;
			this.eot = DFA13_eot;
			this.eof = DFA13_eof;
			this.min = DFA13_min;
			this.max = DFA13_max;
			this.accept = DFA13_accept;
			this.special = DFA13_special;
			this.transition = DFA13_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | INT_TYPE | CHAR_TYPE | VOID_TYPE | FLOAT_TYPE | WHILE_ | IF | ELSE | FOR | SYSTEM | COMMA | GT_OP | LT_OP | EQ_OP | LE_OP | GE_OP | NE_OP | PP_OP | MM_OP | RSHIFT_OP | LSHIFT_OP | LE_BR | RE_BR | PLUS | MINUS | MULT | DIV | MOD | NOT | SCOL | ASSIGN | OPAR | CPAR | OBRACE | CBRACE | OR | AND | TRUE | FALSE | DEC_NUM | ID | FLOAT_NUM | COMMENT1 | COMMENT2 | NEW_LINE | STRING | WS );";
		}
	}

}
