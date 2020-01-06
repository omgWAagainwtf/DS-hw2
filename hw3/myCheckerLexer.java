// $ANTLR 3.5 myChecker.g 2017-05-31 11:15:44

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class myCheckerLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int T__46=46;
	public static final int T__47=47;
	public static final int Arr=4;
	public static final int CHAR=5;
	public static final int COMMENT1=6;
	public static final int COMMENT2=7;
	public static final int COMP=8;
	public static final int DIGIT=9;
	public static final int FLOAT=10;
	public static final int FLOAT_NUMBER=11;
	public static final int IF=12;
	public static final int INT=13;
	public static final int INT_NUMBER=14;
	public static final int Id=15;
	public static final int LETTER=16;
	public static final int LINE_COMMAND=17;
	public static final int MAIN=18;
	public static final int NEWLINE=19;
	public static final int OPER=20;
	public static final int STRING_LITERAL=21;
	public static final int TAB=22;
	public static final int VOID=23;
	public static final int WHILE=24;
	public static final int WS=25;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public myCheckerLexer() {} 
	public myCheckerLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public myCheckerLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "myChecker.g"; }

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:7:7: ( '%' )
			// myChecker.g:7:9: '%'
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
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:8:7: ( '&&' )
			// myChecker.g:8:9: '&&'
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
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:9:7: ( '(' )
			// myChecker.g:9:9: '('
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
	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:10:7: ( ')' )
			// myChecker.g:10:9: ')'
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
	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:11:7: ( '*' )
			// myChecker.g:11:9: '*'
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
	// $ANTLR end "T__30"

	// $ANTLR start "T__31"
	public final void mT__31() throws RecognitionException {
		try {
			int _type = T__31;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:12:7: ( '+' )
			// myChecker.g:12:9: '+'
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
	// $ANTLR end "T__31"

	// $ANTLR start "T__32"
	public final void mT__32() throws RecognitionException {
		try {
			int _type = T__32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:13:7: ( '++' )
			// myChecker.g:13:9: '++'
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
	// $ANTLR end "T__32"

	// $ANTLR start "T__33"
	public final void mT__33() throws RecognitionException {
		try {
			int _type = T__33;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:14:7: ( ',' )
			// myChecker.g:14:9: ','
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
	// $ANTLR end "T__33"

	// $ANTLR start "T__34"
	public final void mT__34() throws RecognitionException {
		try {
			int _type = T__34;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:15:7: ( '-' )
			// myChecker.g:15:9: '-'
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
	// $ANTLR end "T__34"

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:16:7: ( '--' )
			// myChecker.g:16:9: '--'
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
	// $ANTLR end "T__35"

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:17:7: ( '/' )
			// myChecker.g:17:9: '/'
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
	// $ANTLR end "T__36"

	// $ANTLR start "T__37"
	public final void mT__37() throws RecognitionException {
		try {
			int _type = T__37;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:18:7: ( ';' )
			// myChecker.g:18:9: ';'
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
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:19:7: ( '=' )
			// myChecker.g:19:9: '='
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
	// $ANTLR end "T__38"

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:20:7: ( '\\'' )
			// myChecker.g:20:9: '\\''
			{
			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__39"

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:21:7: ( 'else if(' )
			// myChecker.g:21:9: 'else if('
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
	// $ANTLR end "T__40"

	// $ANTLR start "T__41"
	public final void mT__41() throws RecognitionException {
		try {
			int _type = T__41;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:22:7: ( 'else' )
			// myChecker.g:22:9: 'else'
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
	// $ANTLR end "T__41"

	// $ANTLR start "T__42"
	public final void mT__42() throws RecognitionException {
		try {
			int _type = T__42;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:23:7: ( 'if(' )
			// myChecker.g:23:9: 'if('
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
	// $ANTLR end "T__42"

	// $ANTLR start "T__43"
	public final void mT__43() throws RecognitionException {
		try {
			int _type = T__43;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:24:7: ( 'return' )
			// myChecker.g:24:9: 'return'
			{
			match("return"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__43"

	// $ANTLR start "T__44"
	public final void mT__44() throws RecognitionException {
		try {
			int _type = T__44;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:25:7: ( 'while(' )
			// myChecker.g:25:9: 'while('
			{
			match("while("); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__44"

	// $ANTLR start "T__45"
	public final void mT__45() throws RecognitionException {
		try {
			int _type = T__45;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:26:7: ( '{' )
			// myChecker.g:26:9: '{'
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
	// $ANTLR end "T__45"

	// $ANTLR start "T__46"
	public final void mT__46() throws RecognitionException {
		try {
			int _type = T__46;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:27:7: ( '||' )
			// myChecker.g:27:9: '||'
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
	// $ANTLR end "T__46"

	// $ANTLR start "T__47"
	public final void mT__47() throws RecognitionException {
		try {
			int _type = T__47;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:28:7: ( '}' )
			// myChecker.g:28:9: '}'
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
	// $ANTLR end "T__47"

	// $ANTLR start "NEWLINE"
	public final void mNEWLINE() throws RecognitionException {
		try {
			int _type = NEWLINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:225:9: ( ( '\\\\r' | '\\\\n' ) )
			// myChecker.g:225:11: ( '\\\\r' | '\\\\n' )
			{
			// myChecker.g:225:11: ( '\\\\r' | '\\\\n' )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='\\') ) {
				int LA1_1 = input.LA(2);
				if ( (LA1_1=='r') ) {
					alt1=1;
				}
				else if ( (LA1_1=='n') ) {
					alt1=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// myChecker.g:225:12: '\\\\r'
					{
					match("\\r"); 

					}
					break;
				case 2 :
					// myChecker.g:225:20: '\\\\n'
					{
					match("\\n"); 

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
	// $ANTLR end "NEWLINE"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:226:4: ( ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+ )
			// myChecker.g:226:6: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
			{
			// myChecker.g:226:6: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '\t' && LA2_0 <= '\n')||(LA2_0 >= '\f' && LA2_0 <= '\r')||LA2_0==' ') ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// myChecker.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
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
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			_channel = HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "TAB"
	public final void mTAB() throws RecognitionException {
		try {
			int _type = TAB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:227:5: ( '\\\\t' )
			// myChecker.g:227:7: '\\\\t'
			{
			match("\\t"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TAB"

	// $ANTLR start "VOID"
	public final void mVOID() throws RecognitionException {
		try {
			int _type = VOID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:229:6: ( 'void' )
			// myChecker.g:229:8: 'void'
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
	// $ANTLR end "VOID"

	// $ANTLR start "MAIN"
	public final void mMAIN() throws RecognitionException {
		try {
			int _type = MAIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:230:6: ( 'main' )
			// myChecker.g:230:8: 'main'
			{
			match("main"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MAIN"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:231:5: ( 'int' )
			// myChecker.g:231:7: 'int'
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
	// $ANTLR end "INT"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:232:7: ( 'float' )
			// myChecker.g:232:9: 'float'
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
	// $ANTLR end "FLOAT"

	// $ANTLR start "CHAR"
	public final void mCHAR() throws RecognitionException {
		try {
			int _type = CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:233:6: ( 'char' )
			// myChecker.g:233:8: 'char'
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
	// $ANTLR end "CHAR"

	// $ANTLR start "WHILE"
	public final void mWHILE() throws RecognitionException {
		try {
			int _type = WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:234:7: ( 'while' )
			// myChecker.g:234:9: 'while'
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
	// $ANTLR end "WHILE"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:235:4: ( 'if' )
			// myChecker.g:235:6: 'if'
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

	// $ANTLR start "COMP"
	public final void mCOMP() throws RecognitionException {
		try {
			int _type = COMP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:236:5: ( ( '==' | '!=' | '<' | '<=' | '>' | '>=' ) )
			// myChecker.g:236:7: ( '==' | '!=' | '<' | '<=' | '>' | '>=' )
			{
			// myChecker.g:236:7: ( '==' | '!=' | '<' | '<=' | '>' | '>=' )
			int alt3=6;
			switch ( input.LA(1) ) {
			case '=':
				{
				alt3=1;
				}
				break;
			case '!':
				{
				alt3=2;
				}
				break;
			case '<':
				{
				int LA3_3 = input.LA(2);
				if ( (LA3_3=='=') ) {
					alt3=4;
				}

				else {
					alt3=3;
				}

				}
				break;
			case '>':
				{
				int LA3_4 = input.LA(2);
				if ( (LA3_4=='=') ) {
					alt3=6;
				}

				else {
					alt3=5;
				}

				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// myChecker.g:236:8: '=='
					{
					match("=="); 

					}
					break;
				case 2 :
					// myChecker.g:236:15: '!='
					{
					match("!="); 

					}
					break;
				case 3 :
					// myChecker.g:236:22: '<'
					{
					match('<'); 
					}
					break;
				case 4 :
					// myChecker.g:236:28: '<='
					{
					match("<="); 

					}
					break;
				case 5 :
					// myChecker.g:236:35: '>'
					{
					match('>'); 
					}
					break;
				case 6 :
					// myChecker.g:236:41: '>='
					{
					match(">="); 

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
	// $ANTLR end "COMP"

	// $ANTLR start "OPER"
	public final void mOPER() throws RecognitionException {
		try {
			int _type = OPER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:237:5: ( ( '=' | '*=' | '/=' | '%=' | '+=' | '-=' ) )
			// myChecker.g:237:7: ( '=' | '*=' | '/=' | '%=' | '+=' | '-=' )
			{
			// myChecker.g:237:7: ( '=' | '*=' | '/=' | '%=' | '+=' | '-=' )
			int alt4=6;
			switch ( input.LA(1) ) {
			case '=':
				{
				alt4=1;
				}
				break;
			case '*':
				{
				alt4=2;
				}
				break;
			case '/':
				{
				alt4=3;
				}
				break;
			case '%':
				{
				alt4=4;
				}
				break;
			case '+':
				{
				alt4=5;
				}
				break;
			case '-':
				{
				alt4=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// myChecker.g:237:8: '='
					{
					match('='); 
					}
					break;
				case 2 :
					// myChecker.g:237:14: '*='
					{
					match("*="); 

					}
					break;
				case 3 :
					// myChecker.g:237:21: '/='
					{
					match("/="); 

					}
					break;
				case 4 :
					// myChecker.g:237:28: '%='
					{
					match("%="); 

					}
					break;
				case 5 :
					// myChecker.g:237:35: '+='
					{
					match("+="); 

					}
					break;
				case 6 :
					// myChecker.g:237:42: '-='
					{
					match("-="); 

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
	// $ANTLR end "OPER"

	// $ANTLR start "STRING_LITERAL"
	public final void mSTRING_LITERAL() throws RecognitionException {
		try {
			int _type = STRING_LITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			int c;

			// myChecker.g:240:2: ( '\"' ( '\"' '\"' |c=~ ( '\"' | '\\r' | '\\n' ) )* '\"' )
			// myChecker.g:240:4: '\"' ( '\"' '\"' |c=~ ( '\"' | '\\r' | '\\n' ) )* '\"'
			{
			match('\"'); 
			 StringBuilder b = new StringBuilder(); 
			// myChecker.g:242:3: ( '\"' '\"' |c=~ ( '\"' | '\\r' | '\\n' ) )*
			loop5:
			while (true) {
				int alt5=3;
				int LA5_0 = input.LA(1);
				if ( (LA5_0=='\"') ) {
					int LA5_1 = input.LA(2);
					if ( (LA5_1=='\"') ) {
						alt5=1;
					}

				}
				else if ( ((LA5_0 >= '\u0000' && LA5_0 <= '\t')||(LA5_0 >= '\u000B' && LA5_0 <= '\f')||(LA5_0 >= '\u000E' && LA5_0 <= '!')||(LA5_0 >= '#' && LA5_0 <= '\uFFFF')) ) {
					alt5=2;
				}

				switch (alt5) {
				case 1 :
					// myChecker.g:242:5: '\"' '\"'
					{
					match('\"'); 
					match('\"'); 
					 b.appendCodePoint('"');
					}
					break;
				case 2 :
					// myChecker.g:243:5: c=~ ( '\"' | '\\r' | '\\n' )
					{
					c= input.LA(1);
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					 b.appendCodePoint(c);
					}
					break;

				default :
					break loop5;
				}
			}

			match('\"'); 
			 setText(b.toString()); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING_LITERAL"

	// $ANTLR start "Arr"
	public final void mArr() throws RecognitionException {
		try {
			int _type = Arr;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:249:5: ( ( '[' ( ( INT_NUMBER )+ | Id ) ']' )+ )
			// myChecker.g:249:7: ( '[' ( ( INT_NUMBER )+ | Id ) ']' )+
			{
			// myChecker.g:249:7: ( '[' ( ( INT_NUMBER )+ | Id ) ']' )+
			int cnt8=0;
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0=='[') ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// myChecker.g:249:8: '[' ( ( INT_NUMBER )+ | Id ) ']'
					{
					match('['); 
					// myChecker.g:249:11: ( ( INT_NUMBER )+ | Id )
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
						alt7=1;
					}
					else if ( ((LA7_0 >= 'A' && LA7_0 <= 'Z')||LA7_0=='_'||(LA7_0 >= 'a' && LA7_0 <= 'z')) ) {
						alt7=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 7, 0, input);
						throw nvae;
					}

					switch (alt7) {
						case 1 :
							// myChecker.g:249:12: ( INT_NUMBER )+
							{
							// myChecker.g:249:12: ( INT_NUMBER )+
							int cnt6=0;
							loop6:
							while (true) {
								int alt6=2;
								int LA6_0 = input.LA(1);
								if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
									alt6=1;
								}

								switch (alt6) {
								case 1 :
									// myChecker.g:249:12: INT_NUMBER
									{
									mINT_NUMBER(); 

									}
									break;

								default :
									if ( cnt6 >= 1 ) break loop6;
									EarlyExitException eee = new EarlyExitException(6, input);
									throw eee;
								}
								cnt6++;
							}

							}
							break;
						case 2 :
							// myChecker.g:249:26: Id
							{
							mId(); 

							}
							break;

					}

					match(']'); 
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

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Arr"

	// $ANTLR start "Id"
	public final void mId() throws RecognitionException {
		try {
			int _type = Id;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:250:4: ( ( LETTER | '_' ) ( LETTER | DIGIT | '_' )* )
			// myChecker.g:250:6: ( LETTER | '_' ) ( LETTER | DIGIT | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// myChecker.g:250:20: ( LETTER | DIGIT | '_' )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( ((LA9_0 >= '0' && LA9_0 <= '9')||(LA9_0 >= 'A' && LA9_0 <= 'Z')||LA9_0=='_'||(LA9_0 >= 'a' && LA9_0 <= 'z')) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// myChecker.g:
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
					break loop9;
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
	// $ANTLR end "Id"

	// $ANTLR start "INT_NUMBER"
	public final void mINT_NUMBER() throws RecognitionException {
		try {
			int _type = INT_NUMBER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:252:12: ( ( DIGIT )+ )
			// myChecker.g:252:14: ( DIGIT )+
			{
			// myChecker.g:252:14: ( DIGIT )+
			int cnt10=0;
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( ((LA10_0 >= '0' && LA10_0 <= '9')) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// myChecker.g:
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
					if ( cnt10 >= 1 ) break loop10;
					EarlyExitException eee = new EarlyExitException(10, input);
					throw eee;
				}
				cnt10++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT_NUMBER"

	// $ANTLR start "FLOAT_NUMBER"
	public final void mFLOAT_NUMBER() throws RecognitionException {
		try {
			int _type = FLOAT_NUMBER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:253:14: ( ( DIGIT )+ '.' ( DIGIT )+ )
			// myChecker.g:253:16: ( DIGIT )+ '.' ( DIGIT )+
			{
			// myChecker.g:253:16: ( DIGIT )+
			int cnt11=0;
			loop11:
			while (true) {
				int alt11=2;
				int LA11_0 = input.LA(1);
				if ( ((LA11_0 >= '0' && LA11_0 <= '9')) ) {
					alt11=1;
				}

				switch (alt11) {
				case 1 :
					// myChecker.g:
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
					if ( cnt11 >= 1 ) break loop11;
					EarlyExitException eee = new EarlyExitException(11, input);
					throw eee;
				}
				cnt11++;
			}

			match('.'); 
			// myChecker.g:253:29: ( DIGIT )+
			int cnt12=0;
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( ((LA12_0 >= '0' && LA12_0 <= '9')) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// myChecker.g:
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
	// $ANTLR end "FLOAT_NUMBER"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// myChecker.g:255:17: ( 'a' .. 'z' | 'A' .. 'Z' )
			// myChecker.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
			// myChecker.g:256:16: ( '0' .. '9' )
			// myChecker.g:
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

	// $ANTLR start "COMMENT1"
	public final void mCOMMENT1() throws RecognitionException {
		try {
			int _type = COMMENT1;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:257:10: ( '//' ( . )* ( ( '\\r' )? '\\n' ) )
			// myChecker.g:257:12: '//' ( . )* ( ( '\\r' )? '\\n' )
			{
			match("//"); 

			// myChecker.g:257:16: ( . )*
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0=='\r') ) {
					alt13=2;
				}
				else if ( (LA13_0=='\n') ) {
					alt13=2;
				}
				else if ( ((LA13_0 >= '\u0000' && LA13_0 <= '\t')||(LA13_0 >= '\u000B' && LA13_0 <= '\f')||(LA13_0 >= '\u000E' && LA13_0 <= '\uFFFF')) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// myChecker.g:257:17: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop13;
				}
			}

			// myChecker.g:257:20: ( ( '\\r' )? '\\n' )
			// myChecker.g:257:21: ( '\\r' )? '\\n'
			{
			// myChecker.g:257:21: ( '\\r' )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0=='\r') ) {
				alt14=1;
			}
			switch (alt14) {
				case 1 :
					// myChecker.g:257:21: '\\r'
					{
					match('\r'); 
					}
					break;

			}

			match('\n'); 
			}

			_channel=HIDDEN;
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
			// myChecker.g:258:10: ( '/*' ( options {greedy=false; } : . )* '*/' )
			// myChecker.g:258:12: '/*' ( options {greedy=false; } : . )* '*/'
			{
			match("/*"); 

			// myChecker.g:258:17: ( options {greedy=false; } : . )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0=='*') ) {
					int LA15_1 = input.LA(2);
					if ( (LA15_1=='/') ) {
						alt15=2;
					}
					else if ( ((LA15_1 >= '\u0000' && LA15_1 <= '.')||(LA15_1 >= '0' && LA15_1 <= '\uFFFF')) ) {
						alt15=1;
					}

				}
				else if ( ((LA15_0 >= '\u0000' && LA15_0 <= ')')||(LA15_0 >= '+' && LA15_0 <= '\uFFFF')) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// myChecker.g:258:44: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop15;
				}
			}

			match("*/"); 

			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT2"

	// $ANTLR start "LINE_COMMAND"
	public final void mLINE_COMMAND() throws RecognitionException {
		try {
			int _type = LINE_COMMAND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myChecker.g:260:5: ( '#' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
			// myChecker.g:260:7: '#' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
			{
			match('#'); 
			// myChecker.g:260:11: (~ ( '\\n' | '\\r' ) )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( ((LA16_0 >= '\u0000' && LA16_0 <= '\t')||(LA16_0 >= '\u000B' && LA16_0 <= '\f')||(LA16_0 >= '\u000E' && LA16_0 <= '\uFFFF')) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// myChecker.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
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
					break loop16;
				}
			}

			// myChecker.g:260:25: ( '\\r' )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0=='\r') ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// myChecker.g:260:25: '\\r'
					{
					match('\r'); 
					}
					break;

			}

			match('\n'); 
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LINE_COMMAND"

	@Override
	public void mTokens() throws RecognitionException {
		// myChecker.g:1:8: ( T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | NEWLINE | WS | TAB | VOID | MAIN | INT | FLOAT | CHAR | WHILE | IF | COMP | OPER | STRING_LITERAL | Arr | Id | INT_NUMBER | FLOAT_NUMBER | COMMENT1 | COMMENT2 | LINE_COMMAND )
		int alt18=42;
		alt18 = dfa18.predict(input);
		switch (alt18) {
			case 1 :
				// myChecker.g:1:10: T__26
				{
				mT__26(); 

				}
				break;
			case 2 :
				// myChecker.g:1:16: T__27
				{
				mT__27(); 

				}
				break;
			case 3 :
				// myChecker.g:1:22: T__28
				{
				mT__28(); 

				}
				break;
			case 4 :
				// myChecker.g:1:28: T__29
				{
				mT__29(); 

				}
				break;
			case 5 :
				// myChecker.g:1:34: T__30
				{
				mT__30(); 

				}
				break;
			case 6 :
				// myChecker.g:1:40: T__31
				{
				mT__31(); 

				}
				break;
			case 7 :
				// myChecker.g:1:46: T__32
				{
				mT__32(); 

				}
				break;
			case 8 :
				// myChecker.g:1:52: T__33
				{
				mT__33(); 

				}
				break;
			case 9 :
				// myChecker.g:1:58: T__34
				{
				mT__34(); 

				}
				break;
			case 10 :
				// myChecker.g:1:64: T__35
				{
				mT__35(); 

				}
				break;
			case 11 :
				// myChecker.g:1:70: T__36
				{
				mT__36(); 

				}
				break;
			case 12 :
				// myChecker.g:1:76: T__37
				{
				mT__37(); 

				}
				break;
			case 13 :
				// myChecker.g:1:82: T__38
				{
				mT__38(); 

				}
				break;
			case 14 :
				// myChecker.g:1:88: T__39
				{
				mT__39(); 

				}
				break;
			case 15 :
				// myChecker.g:1:94: T__40
				{
				mT__40(); 

				}
				break;
			case 16 :
				// myChecker.g:1:100: T__41
				{
				mT__41(); 

				}
				break;
			case 17 :
				// myChecker.g:1:106: T__42
				{
				mT__42(); 

				}
				break;
			case 18 :
				// myChecker.g:1:112: T__43
				{
				mT__43(); 

				}
				break;
			case 19 :
				// myChecker.g:1:118: T__44
				{
				mT__44(); 

				}
				break;
			case 20 :
				// myChecker.g:1:124: T__45
				{
				mT__45(); 

				}
				break;
			case 21 :
				// myChecker.g:1:130: T__46
				{
				mT__46(); 

				}
				break;
			case 22 :
				// myChecker.g:1:136: T__47
				{
				mT__47(); 

				}
				break;
			case 23 :
				// myChecker.g:1:142: NEWLINE
				{
				mNEWLINE(); 

				}
				break;
			case 24 :
				// myChecker.g:1:150: WS
				{
				mWS(); 

				}
				break;
			case 25 :
				// myChecker.g:1:153: TAB
				{
				mTAB(); 

				}
				break;
			case 26 :
				// myChecker.g:1:157: VOID
				{
				mVOID(); 

				}
				break;
			case 27 :
				// myChecker.g:1:162: MAIN
				{
				mMAIN(); 

				}
				break;
			case 28 :
				// myChecker.g:1:167: INT
				{
				mINT(); 

				}
				break;
			case 29 :
				// myChecker.g:1:171: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 30 :
				// myChecker.g:1:177: CHAR
				{
				mCHAR(); 

				}
				break;
			case 31 :
				// myChecker.g:1:182: WHILE
				{
				mWHILE(); 

				}
				break;
			case 32 :
				// myChecker.g:1:188: IF
				{
				mIF(); 

				}
				break;
			case 33 :
				// myChecker.g:1:191: COMP
				{
				mCOMP(); 

				}
				break;
			case 34 :
				// myChecker.g:1:196: OPER
				{
				mOPER(); 

				}
				break;
			case 35 :
				// myChecker.g:1:201: STRING_LITERAL
				{
				mSTRING_LITERAL(); 

				}
				break;
			case 36 :
				// myChecker.g:1:216: Arr
				{
				mArr(); 

				}
				break;
			case 37 :
				// myChecker.g:1:220: Id
				{
				mId(); 

				}
				break;
			case 38 :
				// myChecker.g:1:223: INT_NUMBER
				{
				mINT_NUMBER(); 

				}
				break;
			case 39 :
				// myChecker.g:1:234: FLOAT_NUMBER
				{
				mFLOAT_NUMBER(); 

				}
				break;
			case 40 :
				// myChecker.g:1:247: COMMENT1
				{
				mCOMMENT1(); 

				}
				break;
			case 41 :
				// myChecker.g:1:256: COMMENT2
				{
				mCOMMENT2(); 

				}
				break;
			case 42 :
				// myChecker.g:1:265: LINE_COMMAND
				{
				mLINE_COMMAND(); 

				}
				break;

		}
	}


	protected DFA18 dfa18 = new DFA18(this);
	static final String DFA18_eotS =
		"\1\uffff\1\41\3\uffff\1\42\1\44\1\uffff\1\46\1\51\1\uffff\1\52\1\uffff"+
		"\4\35\5\uffff\4\35\4\uffff\1\66\14\uffff\1\35\1\72\3\35\2\uffff\4\35\2"+
		"\uffff\1\35\2\uffff\1\103\6\35\1\113\1\uffff\2\35\1\116\1\117\1\35\1\121"+
		"\2\uffff\1\35\1\124\2\uffff\1\125\1\uffff\1\126\4\uffff";
	static final String DFA18_eofS =
		"\127\uffff";
	static final String DFA18_minS =
		"\1\11\1\75\3\uffff\1\75\1\53\1\uffff\1\55\1\52\1\uffff\1\75\1\uffff\1"+
		"\154\1\146\1\145\1\150\3\uffff\1\156\1\uffff\1\157\1\141\1\154\1\150\4"+
		"\uffff\1\56\14\uffff\1\163\1\50\2\164\1\151\2\uffff\2\151\1\157\1\141"+
		"\2\uffff\1\145\2\uffff\1\60\1\165\1\154\1\144\1\156\1\141\1\162\1\40\1"+
		"\uffff\1\162\1\145\2\60\1\164\1\60\2\uffff\1\156\1\50\2\uffff\1\60\1\uffff"+
		"\1\60\4\uffff";
	static final String DFA18_maxS =
		"\1\175\1\75\3\uffff\2\75\1\uffff\2\75\1\uffff\1\75\1\uffff\1\154\1\156"+
		"\1\145\1\150\3\uffff\1\164\1\uffff\1\157\1\141\1\154\1\150\4\uffff\1\71"+
		"\14\uffff\1\163\1\172\2\164\1\151\2\uffff\2\151\1\157\1\141\2\uffff\1"+
		"\145\2\uffff\1\172\1\165\1\154\1\144\1\156\1\141\1\162\1\172\1\uffff\1"+
		"\162\1\145\2\172\1\164\1\172\2\uffff\1\156\1\172\2\uffff\1\172\1\uffff"+
		"\1\172\4\uffff";
	static final String DFA18_acceptS =
		"\2\uffff\1\2\1\3\1\4\2\uffff\1\10\2\uffff\1\14\1\uffff\1\16\4\uffff\1"+
		"\24\1\25\1\26\1\uffff\1\30\4\uffff\1\41\1\43\1\44\1\45\1\uffff\1\52\1"+
		"\42\1\1\1\5\1\7\1\6\1\12\1\11\1\50\1\51\1\13\1\15\5\uffff\1\27\1\31\4"+
		"\uffff\1\46\1\47\1\uffff\1\21\1\40\10\uffff\1\34\6\uffff\1\17\1\20\2\uffff"+
		"\1\32\1\33\1\uffff\1\36\1\uffff\1\23\1\37\1\35\1\22";
	static final String DFA18_specialS =
		"\127\uffff}>";
	static final String[] DFA18_transitionS = {
			"\2\25\1\uffff\2\25\22\uffff\1\25\1\32\1\33\1\37\1\uffff\1\1\1\2\1\14"+
			"\1\3\1\4\1\5\1\6\1\7\1\10\1\uffff\1\11\12\36\1\uffff\1\12\1\32\1\13\1"+
			"\32\2\uffff\32\35\1\34\1\24\2\uffff\1\35\1\uffff\2\35\1\31\1\35\1\15"+
			"\1\30\2\35\1\16\3\35\1\27\4\35\1\17\3\35\1\26\1\20\3\35\1\21\1\22\1\23",
			"\1\40",
			"",
			"",
			"",
			"\1\40",
			"\1\43\21\uffff\1\40",
			"",
			"\1\45\17\uffff\1\40",
			"\1\50\4\uffff\1\47\15\uffff\1\40",
			"",
			"\1\32",
			"",
			"\1\53",
			"\1\54\7\uffff\1\55",
			"\1\56",
			"\1\57",
			"",
			"",
			"",
			"\1\60\3\uffff\1\60\1\uffff\1\61",
			"",
			"\1\62",
			"\1\63",
			"\1\64",
			"\1\65",
			"",
			"",
			"",
			"",
			"\1\67\1\uffff\12\36",
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
			"\1\70",
			"\1\71\7\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\1\73",
			"\1\74",
			"\1\75",
			"",
			"",
			"\1\76",
			"\1\77",
			"\1\100",
			"\1\101",
			"",
			"",
			"\1\102",
			"",
			"",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\1\104",
			"\1\105",
			"\1\106",
			"\1\107",
			"\1\110",
			"\1\111",
			"\1\112\17\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"",
			"\1\114",
			"\1\115",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"\1\120",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"",
			"",
			"\1\122",
			"\1\123\7\uffff\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"",
			"",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"",
			"\12\35\7\uffff\32\35\4\uffff\1\35\1\uffff\32\35",
			"",
			"",
			"",
			""
	};

	static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
	static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
	static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
	static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
	static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
	static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
	static final short[][] DFA18_transition;

	static {
		int numStates = DFA18_transitionS.length;
		DFA18_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
		}
	}

	protected class DFA18 extends DFA {

		public DFA18(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 18;
			this.eot = DFA18_eot;
			this.eof = DFA18_eof;
			this.min = DFA18_min;
			this.max = DFA18_max;
			this.accept = DFA18_accept;
			this.special = DFA18_special;
			this.transition = DFA18_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | NEWLINE | WS | TAB | VOID | MAIN | INT | FLOAT | CHAR | WHILE | IF | COMP | OPER | STRING_LITERAL | Arr | Id | INT_NUMBER | FLOAT_NUMBER | COMMENT1 | COMMENT2 | LINE_COMMAND );";
		}
	}

}
