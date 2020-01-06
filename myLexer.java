// $ANTLR 3.5.2 myLexer.g 2017-04-06 21:01:06

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class myLexer extends Lexer {
	public static final int EOF=-1;
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

	public myLexer() {} 
	public myLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public myLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "myLexer.g"; }

	// $ANTLR start "INT_TYPE"
	public final void mINT_TYPE() throws RecognitionException {
		try {
			int _type = INT_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myLexer.g:10:11: ( 'int' )
			// myLexer.g:10:13: 'int'
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
			// myLexer.g:11:11: ( 'char' )
			// myLexer.g:11:13: 'char'
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
			// myLexer.g:12:11: ( 'void' )
			// myLexer.g:12:13: 'void'
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
			// myLexer.g:13:11: ( 'float' )
			// myLexer.g:13:13: 'float'
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
			// myLexer.g:14:11: ( 'while' )
			// myLexer.g:14:13: 'while'
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
			// myLexer.g:15:3: ( 'if' )
			// myLexer.g:15:5: 'if'
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
			// myLexer.g:16:5: ( 'else' )
			// myLexer.g:16:7: 'else'
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
			// myLexer.g:17:4: ( 'for' )
			// myLexer.g:17:5: 'for'
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
			// myLexer.g:18:7: ( 'printf' )
			// myLexer.g:18:9: 'printf'
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
			// myLexer.g:22:7: ( ',' )
			// myLexer.g:22:9: ','
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
			// myLexer.g:23:7: ( '>' )
			// myLexer.g:23:9: '>'
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
			// myLexer.g:24:7: ( '<' )
			// myLexer.g:24:9: '<'
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
			// myLexer.g:25:7: ( '==' )
			// myLexer.g:25:9: '=='
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
			// myLexer.g:26:7: ( '<=' )
			// myLexer.g:26:9: '<='
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
			// myLexer.g:27:7: ( '>=' )
			// myLexer.g:27:9: '>='
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
			// myLexer.g:28:7: ( '!=' )
			// myLexer.g:28:9: '!='
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
			// myLexer.g:29:7: ( '++' )
			// myLexer.g:29:9: '++'
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
			// myLexer.g:30:7: ( '--' )
			// myLexer.g:30:9: '--'
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
			// myLexer.g:31:11: ( '<<' )
			// myLexer.g:31:13: '<<'
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
			// myLexer.g:32:11: ( '>>' )
			// myLexer.g:32:13: '>>'
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
			// myLexer.g:33:7: ( '[' )
			// myLexer.g:33:9: '['
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
			// myLexer.g:34:7: ( ']' )
			// myLexer.g:34:9: ']'
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
			// myLexer.g:35:6: ( '+' )
			// myLexer.g:35:8: '+'
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
			// myLexer.g:36:7: ( '-' )
			// myLexer.g:36:9: '-'
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
			// myLexer.g:37:6: ( '*' )
			// myLexer.g:37:8: '*'
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
			// myLexer.g:38:5: ( '/' )
			// myLexer.g:38:7: '/'
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
			// myLexer.g:39:5: ( '%' )
			// myLexer.g:39:7: '%'
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
			// myLexer.g:40:5: ( '!' )
			// myLexer.g:40:7: '!'
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
			// myLexer.g:41:6: ( ';' )
			// myLexer.g:41:8: ';'
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
			// myLexer.g:42:8: ( '=' )
			// myLexer.g:42:10: '='
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
			// myLexer.g:43:6: ( '(' )
			// myLexer.g:43:8: '('
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
			// myLexer.g:44:6: ( ')' )
			// myLexer.g:44:8: ')'
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
			// myLexer.g:45:8: ( '{' )
			// myLexer.g:45:10: '{'
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
			// myLexer.g:46:8: ( '}' )
			// myLexer.g:46:10: '}'
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
			// myLexer.g:47:4: ( '||' )
			// myLexer.g:47:6: '||'
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
			// myLexer.g:48:5: ( '&&' )
			// myLexer.g:48:7: '&&'
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
			// myLexer.g:49:6: ( 'true' )
			// myLexer.g:49:8: 'true'
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
			// myLexer.g:50:7: ( 'false' )
			// myLexer.g:50:9: 'false'
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
			// myLexer.g:51:9: ( ( '0' | ( '1' .. '9' ) ( DIGIT )* ) )
			// myLexer.g:51:11: ( '0' | ( '1' .. '9' ) ( DIGIT )* )
			{
			// myLexer.g:51:11: ( '0' | ( '1' .. '9' ) ( DIGIT )* )
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
					// myLexer.g:51:12: '0'
					{
					match('0'); 
					}
					break;
				case 2 :
					// myLexer.g:51:18: ( '1' .. '9' ) ( DIGIT )*
					{
					if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// myLexer.g:51:28: ( DIGIT )*
					loop1:
					while (true) {
						int alt1=2;
						int LA1_0 = input.LA(1);
						if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
							alt1=1;
						}

						switch (alt1) {
						case 1 :
							// myLexer.g:
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
			// myLexer.g:53:4: ( ( LETTER ) ( LETTER | DIGIT )* )
			// myLexer.g:53:6: ( LETTER ) ( LETTER | DIGIT )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// myLexer.g:53:14: ( LETTER | DIGIT )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='_'||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// myLexer.g:
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
			// myLexer.g:55:10: ( FLOAT_NUM1 | FLOAT_NUM2 | FLOAT_NUM3 )
			int alt4=3;
			alt4 = dfa4.predict(input);
			switch (alt4) {
				case 1 :
					// myLexer.g:55:12: FLOAT_NUM1
					{
					mFLOAT_NUM1(); 

					}
					break;
				case 2 :
					// myLexer.g:55:25: FLOAT_NUM2
					{
					mFLOAT_NUM2(); 

					}
					break;
				case 3 :
					// myLexer.g:55:38: FLOAT_NUM3
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
			// myLexer.g:56:20: ( ( DIGIT )+ '.' ( DIGIT )* )
			// myLexer.g:56:22: ( DIGIT )+ '.' ( DIGIT )*
			{
			// myLexer.g:56:22: ( DIGIT )+
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
					// myLexer.g:
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
			// myLexer.g:56:33: ( DIGIT )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// myLexer.g:
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
			// myLexer.g:57:20: ( '.' ( DIGIT )+ )
			// myLexer.g:57:22: '.' ( DIGIT )+
			{
			match('.'); 
			// myLexer.g:57:25: ( DIGIT )+
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
					// myLexer.g:
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
			// myLexer.g:58:20: ( ( DIGIT )+ )
			// myLexer.g:58:22: ( DIGIT )+
			{
			// myLexer.g:58:22: ( DIGIT )+
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
					// myLexer.g:
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
			// myLexer.g:62:10: ( '//' ( . )* '\\n' )
			// myLexer.g:62:12: '//' ( . )* '\\n'
			{
			match("//"); 

			// myLexer.g:62:16: ( . )*
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
					// myLexer.g:62:17: .
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
			// myLexer.g:63:10: ( '/*' ( options {greedy=false; } : . )* '*/' )
			// myLexer.g:63:12: '/*' ( options {greedy=false; } : . )* '*/'
			{
			match("/*"); 

			// myLexer.g:63:17: ( options {greedy=false; } : . )*
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
					// myLexer.g:63:42: .
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
			// myLexer.g:66:9: ( '\\n' )
			// myLexer.g:66:11: '\\n'
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
			// myLexer.g:68:17: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
			// myLexer.g:
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
			// myLexer.g:69:16: ( '0' .. '9' )
			// myLexer.g:
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
			// myLexer.g:70:8: ( ( '\"' (~ '\"' )* '\"' ) )
			// myLexer.g:70:10: ( '\"' (~ '\"' )* '\"' )
			{
			// myLexer.g:70:10: ( '\"' (~ '\"' )* '\"' )
			// myLexer.g:70:11: '\"' (~ '\"' )* '\"'
			{
			match('\"'); 
			// myLexer.g:70:15: (~ '\"' )*
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( ((LA11_0 >= '\u0000' && LA11_0 <= '!')||(LA11_0 >= '#' && LA11_0 <= '\uFFFF')) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// myLexer.g:
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
			// myLexer.g:72:5: ( ( ' ' | '\\r' | '\\t' )+ )
			// myLexer.g:72:7: ( ' ' | '\\r' | '\\t' )+
			{
			// myLexer.g:72:7: ( ' ' | '\\r' | '\\t' )+
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
					// myLexer.g:
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
		// myLexer.g:1:8: ( INT_TYPE | CHAR_TYPE | VOID_TYPE | FLOAT_TYPE | WHILE_ | IF | ELSE | FOR | SYSTEM | COMMA | GT_OP | LT_OP | EQ_OP | LE_OP | GE_OP | NE_OP | PP_OP | MM_OP | RSHIFT_OP | LSHIFT_OP | LE_BR | RE_BR | PLUS | MINUS | MULT | DIV | MOD | NOT | SCOL | ASSIGN | OPAR | CPAR | OBRACE | CBRACE | OR | AND | TRUE | FALSE | DEC_NUM | ID | FLOAT_NUM | COMMENT1 | COMMENT2 | NEW_LINE | STRING | WS )
		int alt13=46;
		alt13 = dfa13.predict(input);
		switch (alt13) {
			case 1 :
				// myLexer.g:1:10: INT_TYPE
				{
				mINT_TYPE(); 

				}
				break;
			case 2 :
				// myLexer.g:1:19: CHAR_TYPE
				{
				mCHAR_TYPE(); 

				}
				break;
			case 3 :
				// myLexer.g:1:29: VOID_TYPE
				{
				mVOID_TYPE(); 

				}
				break;
			case 4 :
				// myLexer.g:1:39: FLOAT_TYPE
				{
				mFLOAT_TYPE(); 

				}
				break;
			case 5 :
				// myLexer.g:1:50: WHILE_
				{
				mWHILE_(); 

				}
				break;
			case 6 :
				// myLexer.g:1:57: IF
				{
				mIF(); 

				}
				break;
			case 7 :
				// myLexer.g:1:60: ELSE
				{
				mELSE(); 

				}
				break;
			case 8 :
				// myLexer.g:1:65: FOR
				{
				mFOR(); 

				}
				break;
			case 9 :
				// myLexer.g:1:69: SYSTEM
				{
				mSYSTEM(); 

				}
				break;
			case 10 :
				// myLexer.g:1:76: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 11 :
				// myLexer.g:1:82: GT_OP
				{
				mGT_OP(); 

				}
				break;
			case 12 :
				// myLexer.g:1:88: LT_OP
				{
				mLT_OP(); 

				}
				break;
			case 13 :
				// myLexer.g:1:94: EQ_OP
				{
				mEQ_OP(); 

				}
				break;
			case 14 :
				// myLexer.g:1:100: LE_OP
				{
				mLE_OP(); 

				}
				break;
			case 15 :
				// myLexer.g:1:106: GE_OP
				{
				mGE_OP(); 

				}
				break;
			case 16 :
				// myLexer.g:1:112: NE_OP
				{
				mNE_OP(); 

				}
				break;
			case 17 :
				// myLexer.g:1:118: PP_OP
				{
				mPP_OP(); 

				}
				break;
			case 18 :
				// myLexer.g:1:124: MM_OP
				{
				mMM_OP(); 

				}
				break;
			case 19 :
				// myLexer.g:1:130: RSHIFT_OP
				{
				mRSHIFT_OP(); 

				}
				break;
			case 20 :
				// myLexer.g:1:140: LSHIFT_OP
				{
				mLSHIFT_OP(); 

				}
				break;
			case 21 :
				// myLexer.g:1:150: LE_BR
				{
				mLE_BR(); 

				}
				break;
			case 22 :
				// myLexer.g:1:156: RE_BR
				{
				mRE_BR(); 

				}
				break;
			case 23 :
				// myLexer.g:1:162: PLUS
				{
				mPLUS(); 

				}
				break;
			case 24 :
				// myLexer.g:1:167: MINUS
				{
				mMINUS(); 

				}
				break;
			case 25 :
				// myLexer.g:1:173: MULT
				{
				mMULT(); 

				}
				break;
			case 26 :
				// myLexer.g:1:178: DIV
				{
				mDIV(); 

				}
				break;
			case 27 :
				// myLexer.g:1:182: MOD
				{
				mMOD(); 

				}
				break;
			case 28 :
				// myLexer.g:1:186: NOT
				{
				mNOT(); 

				}
				break;
			case 29 :
				// myLexer.g:1:190: SCOL
				{
				mSCOL(); 

				}
				break;
			case 30 :
				// myLexer.g:1:195: ASSIGN
				{
				mASSIGN(); 

				}
				break;
			case 31 :
				// myLexer.g:1:202: OPAR
				{
				mOPAR(); 

				}
				break;
			case 32 :
				// myLexer.g:1:207: CPAR
				{
				mCPAR(); 

				}
				break;
			case 33 :
				// myLexer.g:1:212: OBRACE
				{
				mOBRACE(); 

				}
				break;
			case 34 :
				// myLexer.g:1:219: CBRACE
				{
				mCBRACE(); 

				}
				break;
			case 35 :
				// myLexer.g:1:226: OR
				{
				mOR(); 

				}
				break;
			case 36 :
				// myLexer.g:1:229: AND
				{
				mAND(); 

				}
				break;
			case 37 :
				// myLexer.g:1:233: TRUE
				{
				mTRUE(); 

				}
				break;
			case 38 :
				// myLexer.g:1:238: FALSE
				{
				mFALSE(); 

				}
				break;
			case 39 :
				// myLexer.g:1:244: DEC_NUM
				{
				mDEC_NUM(); 

				}
				break;
			case 40 :
				// myLexer.g:1:252: ID
				{
				mID(); 

				}
				break;
			case 41 :
				// myLexer.g:1:255: FLOAT_NUM
				{
				mFLOAT_NUM(); 

				}
				break;
			case 42 :
				// myLexer.g:1:265: COMMENT1
				{
				mCOMMENT1(); 

				}
				break;
			case 43 :
				// myLexer.g:1:274: COMMENT2
				{
				mCOMMENT2(); 

				}
				break;
			case 44 :
				// myLexer.g:1:283: NEW_LINE
				{
				mNEW_LINE(); 

				}
				break;
			case 45 :
				// myLexer.g:1:292: STRING
				{
				mSTRING(); 

				}
				break;
			case 46 :
				// myLexer.g:1:299: WS
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
			return "55:1: FLOAT_NUM : ( FLOAT_NUM1 | FLOAT_NUM2 | FLOAT_NUM3 );";
		}
	}

	static final String DFA13_eotS =
		"\1\uffff\7\36\1\uffff\1\57\1\62\1\64\1\66\1\70\1\72\3\uffff\1\75\10\uffff"+
		"\1\36\2\77\5\uffff\1\36\1\102\10\36\21\uffff\1\36\1\uffff\1\77\1\114\1"+
		"\uffff\3\36\1\120\5\36\1\uffff\1\126\1\127\1\36\1\uffff\2\36\1\133\1\36"+
		"\1\135\2\uffff\1\136\1\137\1\140\1\uffff\1\36\4\uffff\1\142\1\uffff";
	static final String DFA13_eofS =
		"\143\uffff";
	static final String DFA13_minS =
		"\1\11\1\146\1\150\1\157\1\141\1\150\1\154\1\162\1\uffff\1\75\1\74\2\75"+
		"\1\53\1\55\3\uffff\1\52\10\uffff\1\162\2\56\5\uffff\1\164\1\60\1\141\1"+
		"\151\1\157\1\162\1\154\1\151\1\163\1\151\21\uffff\1\165\1\uffff\1\56\1"+
		"\60\1\uffff\1\162\1\144\1\141\1\60\1\163\1\154\1\145\1\156\1\145\1\uffff"+
		"\2\60\1\164\1\uffff\2\145\1\60\1\164\1\60\2\uffff\3\60\1\uffff\1\146\4"+
		"\uffff\1\60\1\uffff";
	static final String DFA13_maxS =
		"\1\175\1\156\1\150\2\157\1\150\1\154\1\162\1\uffff\1\76\3\75\1\53\1\55"+
		"\3\uffff\1\57\10\uffff\1\162\2\71\5\uffff\1\164\1\172\1\141\1\151\1\157"+
		"\1\162\1\154\1\151\1\163\1\151\21\uffff\1\165\1\uffff\1\71\1\172\1\uffff"+
		"\1\162\1\144\1\141\1\172\1\163\1\154\1\145\1\156\1\145\1\uffff\2\172\1"+
		"\164\1\uffff\2\145\1\172\1\164\1\172\2\uffff\3\172\1\uffff\1\146\4\uffff"+
		"\1\172\1\uffff";
	static final String DFA13_acceptS =
		"\10\uffff\1\12\6\uffff\1\25\1\26\1\31\1\uffff\1\33\1\35\1\37\1\40\1\41"+
		"\1\42\1\43\1\44\3\uffff\1\50\1\51\1\54\1\55\1\56\12\uffff\1\17\1\24\1"+
		"\13\1\16\1\23\1\14\1\15\1\36\1\20\1\34\1\21\1\27\1\22\1\30\1\52\1\53\1"+
		"\32\1\uffff\1\47\2\uffff\1\6\11\uffff\1\1\3\uffff\1\10\5\uffff\1\2\1\3"+
		"\3\uffff\1\7\1\uffff\1\45\1\4\1\46\1\5\1\uffff\1\11";
	static final String DFA13_specialS =
		"\143\uffff}>";
	static final String[] DFA13_transitionS = {
			"\1\42\1\40\2\uffff\1\42\22\uffff\1\42\1\14\1\41\2\uffff\1\23\1\32\1\uffff"+
			"\1\25\1\26\1\21\1\15\1\10\1\16\1\37\1\22\1\34\11\35\1\uffff\1\24\1\12"+
			"\1\13\1\11\2\uffff\32\36\1\17\1\uffff\1\20\1\uffff\1\36\1\uffff\2\36"+
			"\1\2\1\36\1\6\1\4\2\36\1\1\6\36\1\7\3\36\1\33\1\36\1\3\1\5\3\36\1\27"+
			"\1\31\1\30",
			"\1\44\7\uffff\1\43",
			"\1\45",
			"\1\46",
			"\1\51\12\uffff\1\47\2\uffff\1\50",
			"\1\52",
			"\1\53",
			"\1\54",
			"",
			"\1\55\1\56",
			"\1\61\1\60",
			"\1\63",
			"\1\65",
			"\1\67",
			"\1\71",
			"",
			"",
			"",
			"\1\74\4\uffff\1\73",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\76",
			"\1\37\1\uffff\12\37",
			"\1\37\1\uffff\12\100",
			"",
			"",
			"",
			"",
			"",
			"\1\101",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"\1\103",
			"\1\104",
			"\1\105",
			"\1\106",
			"\1\107",
			"\1\110",
			"\1\111",
			"\1\112",
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
			"\1\113",
			"",
			"\1\37\1\uffff\12\100",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"",
			"\1\115",
			"\1\116",
			"\1\117",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"\1\121",
			"\1\122",
			"\1\123",
			"\1\124",
			"\1\125",
			"",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"\1\130",
			"",
			"\1\131",
			"\1\132",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"\1\134",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"",
			"",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
			"",
			"\1\141",
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
			return "1:1: Tokens : ( INT_TYPE | CHAR_TYPE | VOID_TYPE | FLOAT_TYPE | WHILE_ | IF | ELSE | FOR | SYSTEM | COMMA | GT_OP | LT_OP | EQ_OP | LE_OP | GE_OP | NE_OP | PP_OP | MM_OP | RSHIFT_OP | LSHIFT_OP | LE_BR | RE_BR | PLUS | MINUS | MULT | DIV | MOD | NOT | SCOL | ASSIGN | OPAR | CPAR | OBRACE | CBRACE | OR | AND | TRUE | FALSE | DEC_NUM | ID | FLOAT_NUM | COMMENT1 | COMMENT2 | NEW_LINE | STRING | WS );";
		}
	}

}
