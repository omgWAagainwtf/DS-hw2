// $ANTLR 3.5.2 myparser.g 2017-05-12 20:43:22

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class myparserLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
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
	public static final int T__48=48;
	public static final int T__49=49;
	public static final int ARRAY=4;
	public static final int COMMENT1=5;
	public static final int COMMENT2=6;
	public static final int DIGIT=7;
	public static final int ID=8;
	public static final int LETTER=9;
	public static final int LINE_COMMAND=10;
	public static final int Number=11;
	public static final int WS=12;

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

	// $ANTLR start "T__13"
	public final void mT__13() throws RecognitionException {
		try {
			int _type = T__13;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:2:7: ( '!=' )
			// myparser.g:2:9: '!='
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
	// $ANTLR end "T__13"

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:3:7: ( '%' )
			// myparser.g:3:9: '%'
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
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:4:7: ( '%=' )
			// myparser.g:4:9: '%='
			{
			match("%="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:5:7: ( '&&' )
			// myparser.g:5:9: '&&'
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
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:6:7: ( '(' )
			// myparser.g:6:9: '('
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
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:7:7: ( ')' )
			// myparser.g:7:9: ')'
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
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:8:7: ( '*' )
			// myparser.g:8:9: '*'
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
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:9:7: ( '*=' )
			// myparser.g:9:9: '*='
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
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:10:7: ( '+' )
			// myparser.g:10:9: '+'
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
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:11:7: ( '+=' )
			// myparser.g:11:9: '+='
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
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:12:7: ( ',' )
			// myparser.g:12:9: ','
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
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:13:7: ( '-' )
			// myparser.g:13:9: '-'
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
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:14:7: ( '-=' )
			// myparser.g:14:9: '-='
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
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:15:7: ( '/' )
			// myparser.g:15:9: '/'
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
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:16:7: ( '/=' )
			// myparser.g:16:9: '/='
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
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:17:7: ( ';' )
			// myparser.g:17:9: ';'
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
	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:18:7: ( '<' )
			// myparser.g:18:9: '<'
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
	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:19:7: ( '<=' )
			// myparser.g:19:9: '<='
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
	// $ANTLR end "T__30"

	// $ANTLR start "T__31"
	public final void mT__31() throws RecognitionException {
		try {
			int _type = T__31;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:20:7: ( '=' )
			// myparser.g:20:9: '='
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
	// $ANTLR end "T__31"

	// $ANTLR start "T__32"
	public final void mT__32() throws RecognitionException {
		try {
			int _type = T__32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:21:7: ( '==' )
			// myparser.g:21:9: '=='
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
	// $ANTLR end "T__32"

	// $ANTLR start "T__33"
	public final void mT__33() throws RecognitionException {
		try {
			int _type = T__33;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:22:7: ( '>' )
			// myparser.g:22:9: '>'
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
	// $ANTLR end "T__33"

	// $ANTLR start "T__34"
	public final void mT__34() throws RecognitionException {
		try {
			int _type = T__34;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:23:7: ( '>=' )
			// myparser.g:23:9: '>='
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
	// $ANTLR end "T__34"

	// $ANTLR start "T__35"
	public final void mT__35() throws RecognitionException {
		try {
			int _type = T__35;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:24:7: ( 'char' )
			// myparser.g:24:9: 'char'
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
	// $ANTLR end "T__35"

	// $ANTLR start "T__36"
	public final void mT__36() throws RecognitionException {
		try {
			int _type = T__36;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:25:7: ( 'double' )
			// myparser.g:25:9: 'double'
			{
			match("double"); 

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
			// myparser.g:26:7: ( 'else if(' )
			// myparser.g:26:9: 'else if('
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
	// $ANTLR end "T__37"

	// $ANTLR start "T__38"
	public final void mT__38() throws RecognitionException {
		try {
			int _type = T__38;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:27:7: ( 'else' )
			// myparser.g:27:9: 'else'
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
	// $ANTLR end "T__38"

	// $ANTLR start "T__39"
	public final void mT__39() throws RecognitionException {
		try {
			int _type = T__39;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:28:7: ( 'float' )
			// myparser.g:28:9: 'float'
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
	// $ANTLR end "T__39"

	// $ANTLR start "T__40"
	public final void mT__40() throws RecognitionException {
		try {
			int _type = T__40;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:29:7: ( 'for(' )
			// myparser.g:29:9: 'for('
			{
			match("for("); 

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
			// myparser.g:30:7: ( 'if(' )
			// myparser.g:30:9: 'if('
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
	// $ANTLR end "T__41"

	// $ANTLR start "T__42"
	public final void mT__42() throws RecognitionException {
		try {
			int _type = T__42;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:31:7: ( 'int' )
			// myparser.g:31:9: 'int'
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
	// $ANTLR end "T__42"

	// $ANTLR start "T__43"
	public final void mT__43() throws RecognitionException {
		try {
			int _type = T__43;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:32:7: ( 'main()' )
			// myparser.g:32:9: 'main()'
			{
			match("main()"); 

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
			// myparser.g:33:7: ( 'return' )
			// myparser.g:33:9: 'return'
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
	// $ANTLR end "T__44"

	// $ANTLR start "T__45"
	public final void mT__45() throws RecognitionException {
		try {
			int _type = T__45;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:34:7: ( 'void' )
			// myparser.g:34:9: 'void'
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
	// $ANTLR end "T__45"

	// $ANTLR start "T__46"
	public final void mT__46() throws RecognitionException {
		try {
			int _type = T__46;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:35:7: ( 'while(' )
			// myparser.g:35:9: 'while('
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
	// $ANTLR end "T__46"

	// $ANTLR start "T__47"
	public final void mT__47() throws RecognitionException {
		try {
			int _type = T__47;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:36:7: ( '{' )
			// myparser.g:36:9: '{'
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
	// $ANTLR end "T__47"

	// $ANTLR start "T__48"
	public final void mT__48() throws RecognitionException {
		try {
			int _type = T__48;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:37:7: ( '||' )
			// myparser.g:37:9: '||'
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
	// $ANTLR end "T__48"

	// $ANTLR start "T__49"
	public final void mT__49() throws RecognitionException {
		try {
			int _type = T__49;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:38:7: ( '}' )
			// myparser.g:38:9: '}'
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
	// $ANTLR end "T__49"

	// $ANTLR start "ARRAY"
	public final void mARRAY() throws RecognitionException {
		try {
			int _type = ARRAY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:121:6: ( ID '[' (| Number | ID ) ']' )
			// myparser.g:121:8: ID '[' (| Number | ID ) ']'
			{
			mID(); 

			match('['); 
			// myparser.g:121:13: (| Number | ID )
			int alt1=3;
			switch ( input.LA(1) ) {
			case ']':
				{
				alt1=1;
				}
				break;
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
				{
				alt1=2;
				}
				break;
			case 'A':
			case 'B':
			case 'C':
			case 'D':
			case 'E':
			case 'F':
			case 'G':
			case 'H':
			case 'I':
			case 'J':
			case 'K':
			case 'L':
			case 'M':
			case 'N':
			case 'O':
			case 'P':
			case 'Q':
			case 'R':
			case 'S':
			case 'T':
			case 'U':
			case 'V':
			case 'W':
			case 'X':
			case 'Y':
			case 'Z':
			case '_':
			case 'a':
			case 'b':
			case 'c':
			case 'd':
			case 'e':
			case 'f':
			case 'g':
			case 'h':
			case 'i':
			case 'j':
			case 'k':
			case 'l':
			case 'm':
			case 'n':
			case 'o':
			case 'p':
			case 'q':
			case 'r':
			case 's':
			case 't':
			case 'u':
			case 'v':
			case 'w':
			case 'x':
			case 'y':
			case 'z':
				{
				alt1=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// myparser.g:121:15: 
					{
					}
					break;
				case 2 :
					// myparser.g:121:16: Number
					{
					mNumber(); 

					}
					break;
				case 3 :
					// myparser.g:121:23: ID
					{
					mID(); 

					}
					break;

			}

			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ARRAY"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// myparser.g:123:17: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) )
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
			// myparser.g:124:16: ( '0' .. '9' )
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

	// $ANTLR start "Number"
	public final void mNumber() throws RecognitionException {
		try {
			int _type = Number;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:126:5: ( ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )? )
			// myparser.g:126:10: ( '0' .. '9' )+ ( '.' ( '0' .. '9' )+ )?
			{
			// myparser.g:126:10: ( '0' .. '9' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
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
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			// myparser.g:126:22: ( '.' ( '0' .. '9' )+ )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='.') ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// myparser.g:126:23: '.' ( '0' .. '9' )+
					{
					match('.'); 
					// myparser.g:126:27: ( '0' .. '9' )+
					int cnt3=0;
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
							alt3=1;
						}

						switch (alt3) {
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
							if ( cnt3 >= 1 ) break loop3;
							EarlyExitException eee = new EarlyExitException(3, input);
							throw eee;
						}
						cnt3++;
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
	// $ANTLR end "Number"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:128:4: ( LETTER ( LETTER | DIGIT )* )
			// myparser.g:128:6: LETTER ( LETTER | DIGIT )*
			{
			mLETTER(); 

			// myparser.g:128:13: ( LETTER | DIGIT )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '0' && LA5_0 <= '9')||(LA5_0 >= 'A' && LA5_0 <= 'Z')||LA5_0=='_'||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
					alt5=1;
				}

				switch (alt5) {
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
					break loop5;
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

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:129:4: ( ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+ )
			// myparser.g:129:6: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
			{
			// myparser.g:129:6: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
			int cnt6=0;
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '\t' && LA6_0 <= '\n')||(LA6_0 >= '\f' && LA6_0 <= '\r')||LA6_0==' ') ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// myparser.g:
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
					if ( cnt6 >= 1 ) break loop6;
					EarlyExitException eee = new EarlyExitException(6, input);
					throw eee;
				}
				cnt6++;
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

	// $ANTLR start "COMMENT1"
	public final void mCOMMENT1() throws RecognitionException {
		try {
			int _type = COMMENT1;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:131:2: ( '//' ( . )* ( '\\n' | '\\r' ) )
			// myparser.g:131:4: '//' ( . )* ( '\\n' | '\\r' )
			{
			match("//"); 

			// myparser.g:131:9: ( . )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0=='\n'||LA7_0=='\r') ) {
					alt7=2;
				}
				else if ( ((LA7_0 >= '\u0000' && LA7_0 <= '\t')||(LA7_0 >= '\u000B' && LA7_0 <= '\f')||(LA7_0 >= '\u000E' && LA7_0 <= '\uFFFF')) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// myparser.g:131:9: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop7;
				}
			}

			if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
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
	// $ANTLR end "COMMENT1"

	// $ANTLR start "COMMENT2"
	public final void mCOMMENT2() throws RecognitionException {
		try {
			int _type = COMMENT2;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myparser.g:133:10: ( '/*' ( . )* '*/' )
			// myparser.g:133:12: '/*' ( . )* '*/'
			{
			match("/*"); 

			// myparser.g:133:17: ( . )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0=='*') ) {
					int LA8_1 = input.LA(2);
					if ( (LA8_1=='/') ) {
						alt8=2;
					}
					else if ( ((LA8_1 >= '\u0000' && LA8_1 <= '.')||(LA8_1 >= '0' && LA8_1 <= '\uFFFF')) ) {
						alt8=1;
					}

				}
				else if ( ((LA8_0 >= '\u0000' && LA8_0 <= ')')||(LA8_0 >= '+' && LA8_0 <= '\uFFFF')) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// myparser.g:133:17: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop8;
				}
			}

			match("*/"); 

			_channel = HIDDEN;
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
			// myparser.g:135:5: ( '#' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
			// myparser.g:135:7: '#' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
			{
			match('#'); 
			// myparser.g:135:11: (~ ( '\\n' | '\\r' ) )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( ((LA9_0 >= '\u0000' && LA9_0 <= '\t')||(LA9_0 >= '\u000B' && LA9_0 <= '\f')||(LA9_0 >= '\u000E' && LA9_0 <= '\uFFFF')) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// myparser.g:
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
					break loop9;
				}
			}

			// myparser.g:135:25: ( '\\r' )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0=='\r') ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// myparser.g:135:25: '\\r'
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
		// myparser.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | ARRAY | Number | ID | WS | COMMENT1 | COMMENT2 | LINE_COMMAND )
		int alt11=44;
		alt11 = dfa11.predict(input);
		switch (alt11) {
			case 1 :
				// myparser.g:1:10: T__13
				{
				mT__13(); 

				}
				break;
			case 2 :
				// myparser.g:1:16: T__14
				{
				mT__14(); 

				}
				break;
			case 3 :
				// myparser.g:1:22: T__15
				{
				mT__15(); 

				}
				break;
			case 4 :
				// myparser.g:1:28: T__16
				{
				mT__16(); 

				}
				break;
			case 5 :
				// myparser.g:1:34: T__17
				{
				mT__17(); 

				}
				break;
			case 6 :
				// myparser.g:1:40: T__18
				{
				mT__18(); 

				}
				break;
			case 7 :
				// myparser.g:1:46: T__19
				{
				mT__19(); 

				}
				break;
			case 8 :
				// myparser.g:1:52: T__20
				{
				mT__20(); 

				}
				break;
			case 9 :
				// myparser.g:1:58: T__21
				{
				mT__21(); 

				}
				break;
			case 10 :
				// myparser.g:1:64: T__22
				{
				mT__22(); 

				}
				break;
			case 11 :
				// myparser.g:1:70: T__23
				{
				mT__23(); 

				}
				break;
			case 12 :
				// myparser.g:1:76: T__24
				{
				mT__24(); 

				}
				break;
			case 13 :
				// myparser.g:1:82: T__25
				{
				mT__25(); 

				}
				break;
			case 14 :
				// myparser.g:1:88: T__26
				{
				mT__26(); 

				}
				break;
			case 15 :
				// myparser.g:1:94: T__27
				{
				mT__27(); 

				}
				break;
			case 16 :
				// myparser.g:1:100: T__28
				{
				mT__28(); 

				}
				break;
			case 17 :
				// myparser.g:1:106: T__29
				{
				mT__29(); 

				}
				break;
			case 18 :
				// myparser.g:1:112: T__30
				{
				mT__30(); 

				}
				break;
			case 19 :
				// myparser.g:1:118: T__31
				{
				mT__31(); 

				}
				break;
			case 20 :
				// myparser.g:1:124: T__32
				{
				mT__32(); 

				}
				break;
			case 21 :
				// myparser.g:1:130: T__33
				{
				mT__33(); 

				}
				break;
			case 22 :
				// myparser.g:1:136: T__34
				{
				mT__34(); 

				}
				break;
			case 23 :
				// myparser.g:1:142: T__35
				{
				mT__35(); 

				}
				break;
			case 24 :
				// myparser.g:1:148: T__36
				{
				mT__36(); 

				}
				break;
			case 25 :
				// myparser.g:1:154: T__37
				{
				mT__37(); 

				}
				break;
			case 26 :
				// myparser.g:1:160: T__38
				{
				mT__38(); 

				}
				break;
			case 27 :
				// myparser.g:1:166: T__39
				{
				mT__39(); 

				}
				break;
			case 28 :
				// myparser.g:1:172: T__40
				{
				mT__40(); 

				}
				break;
			case 29 :
				// myparser.g:1:178: T__41
				{
				mT__41(); 

				}
				break;
			case 30 :
				// myparser.g:1:184: T__42
				{
				mT__42(); 

				}
				break;
			case 31 :
				// myparser.g:1:190: T__43
				{
				mT__43(); 

				}
				break;
			case 32 :
				// myparser.g:1:196: T__44
				{
				mT__44(); 

				}
				break;
			case 33 :
				// myparser.g:1:202: T__45
				{
				mT__45(); 

				}
				break;
			case 34 :
				// myparser.g:1:208: T__46
				{
				mT__46(); 

				}
				break;
			case 35 :
				// myparser.g:1:214: T__47
				{
				mT__47(); 

				}
				break;
			case 36 :
				// myparser.g:1:220: T__48
				{
				mT__48(); 

				}
				break;
			case 37 :
				// myparser.g:1:226: T__49
				{
				mT__49(); 

				}
				break;
			case 38 :
				// myparser.g:1:232: ARRAY
				{
				mARRAY(); 

				}
				break;
			case 39 :
				// myparser.g:1:238: Number
				{
				mNumber(); 

				}
				break;
			case 40 :
				// myparser.g:1:245: ID
				{
				mID(); 

				}
				break;
			case 41 :
				// myparser.g:1:248: WS
				{
				mWS(); 

				}
				break;
			case 42 :
				// myparser.g:1:251: COMMENT1
				{
				mCOMMENT1(); 

				}
				break;
			case 43 :
				// myparser.g:1:260: COMMENT2
				{
				mCOMMENT2(); 

				}
				break;
			case 44 :
				// myparser.g:1:269: LINE_COMMAND
				{
				mLINE_COMMAND(); 

				}
				break;

		}
	}


	protected DFA11 dfa11 = new DFA11(this);
	static final String DFA11_eotS =
		"\2\uffff\1\40\3\uffff\1\42\1\44\1\uffff\1\46\1\52\1\uffff\1\54\1\56\1"+
		"\60\11\62\3\uffff\1\62\25\uffff\1\62\1\uffff\1\62\1\uffff\17\62\1\uffff"+
		"\1\117\4\62\1\124\1\62\1\127\1\62\2\uffff\2\62\1\133\1\62\1\uffff\1\62"+
		"\2\uffff\1\136\1\uffff\1\62\1\uffff\1\62\1\141\1\uffff\1\142\3\uffff";
	static final String DFA11_eofS =
		"\143\uffff";
	static final String DFA11_minS =
		"\1\11\1\uffff\1\75\3\uffff\2\75\1\uffff\1\75\1\52\1\uffff\3\75\11\60\3"+
		"\uffff\1\60\25\uffff\1\60\1\uffff\1\60\1\uffff\4\60\1\50\11\60\1\50\1"+
		"\uffff\7\60\1\40\1\60\2\uffff\1\50\3\60\1\uffff\1\60\2\uffff\1\60\1\uffff"+
		"\1\60\1\uffff\1\50\1\60\1\uffff\1\60\3\uffff";
	static final String DFA11_maxS =
		"\1\175\1\uffff\1\75\3\uffff\2\75\1\uffff\2\75\1\uffff\3\75\11\172\3\uffff"+
		"\1\172\25\uffff\1\172\1\uffff\1\172\1\uffff\17\172\1\uffff\11\172\2\uffff"+
		"\4\172\1\uffff\1\172\2\uffff\1\172\1\uffff\1\172\1\uffff\2\172\1\uffff"+
		"\1\172\3\uffff";
	static final String DFA11_acceptS =
		"\1\uffff\1\1\1\uffff\1\4\1\5\1\6\2\uffff\1\13\2\uffff\1\20\14\uffff\1"+
		"\43\1\44\1\45\1\uffff\1\47\1\51\1\54\1\3\1\2\1\10\1\7\1\12\1\11\1\15\1"+
		"\14\1\17\1\52\1\53\1\16\1\22\1\21\1\24\1\23\1\26\1\25\1\uffff\1\50\1\uffff"+
		"\1\46\17\uffff\1\35\11\uffff\1\34\1\36\4\uffff\1\27\1\uffff\1\31\1\32"+
		"\1\uffff\1\37\1\uffff\1\41\2\uffff\1\33\1\uffff\1\42\1\30\1\40";
	static final String DFA11_specialS =
		"\143\uffff}>";
	static final String[] DFA11_transitionS = {
			"\2\35\1\uffff\2\35\22\uffff\1\35\1\1\1\uffff\1\36\1\uffff\1\2\1\3\1\uffff"+
			"\1\4\1\5\1\6\1\7\1\10\1\11\1\uffff\1\12\12\34\1\uffff\1\13\1\14\1\15"+
			"\1\16\2\uffff\32\33\4\uffff\1\33\1\uffff\2\33\1\17\1\20\1\21\1\22\2\33"+
			"\1\23\3\33\1\24\4\33\1\25\3\33\1\26\1\27\3\33\1\30\1\31\1\32",
			"",
			"\1\37",
			"",
			"",
			"",
			"\1\41",
			"\1\43",
			"",
			"\1\45",
			"\1\51\4\uffff\1\50\15\uffff\1\47",
			"",
			"\1\53",
			"\1\55",
			"\1\57",
			"\12\63\7\uffff\32\63\1\64\3\uffff\1\63\1\uffff\7\63\1\61\22\63",
			"\12\63\7\uffff\32\63\1\64\3\uffff\1\63\1\uffff\16\63\1\65\13\63",
			"\12\63\7\uffff\32\63\1\64\3\uffff\1\63\1\uffff\13\63\1\66\16\63",
			"\12\63\7\uffff\32\63\1\64\3\uffff\1\63\1\uffff\13\63\1\67\2\63\1\70"+
			"\13\63",
			"\12\63\7\uffff\32\63\1\64\3\uffff\1\63\1\uffff\5\63\1\71\7\63\1\72\14"+
			"\63",
			"\12\63\7\uffff\32\63\1\64\3\uffff\1\63\1\uffff\1\73\31\63",
			"\12\63\7\uffff\32\63\1\64\3\uffff\1\63\1\uffff\4\63\1\74\25\63",
			"\12\63\7\uffff\32\63\1\64\3\uffff\1\63\1\uffff\16\63\1\75\13\63",
			"\12\63\7\uffff\32\63\1\64\3\uffff\1\63\1\uffff\7\63\1\76\22\63",
			"",
			"",
			"",
			"\12\63\7\uffff\32\63\1\64\3\uffff\1\63\1\uffff\32\63",
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
			"",
			"",
			"",
			"",
			"\12\63\7\uffff\32\63\1\64\3\uffff\1\63\1\uffff\1\77\31\63",
			"",
			"\12\63\7\uffff\32\63\1\64\3\uffff\1\63\1\uffff\32\63",
			"",
			"\12\63\7\uffff\32\63\1\64\3\uffff\1\63\1\uffff\24\63\1\100\5\63",
			"\12\63\7\uffff\32\63\1\64\3\uffff\1\63\1\uffff\22\63\1\101\7\63",
			"\12\63\7\uffff\32\63\1\64\3\uffff\1\63\1\uffff\16\63\1\102\13\63",
			"\12\63\7\uffff\32\63\1\64\3\uffff\1\63\1\uffff\21\63\1\103\10\63",
			"\1\104\7\uffff\12\63\7\uffff\32\63\1\64\3\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\1\64\3\uffff\1\63\1\uffff\23\63\1\105\6\63",
			"\12\63\7\uffff\32\63\1\64\3\uffff\1\63\1\uffff\10\63\1\106\21\63",
			"\12\63\7\uffff\32\63\1\64\3\uffff\1\63\1\uffff\23\63\1\107\6\63",
			"\12\63\7\uffff\32\63\1\64\3\uffff\1\63\1\uffff\10\63\1\110\21\63",
			"\12\63\7\uffff\32\63\1\64\3\uffff\1\63\1\uffff\10\63\1\111\21\63",
			"\12\63\7\uffff\32\63\1\64\3\uffff\1\63\1\uffff\21\63\1\112\10\63",
			"\12\63\7\uffff\32\63\1\64\3\uffff\1\63\1\uffff\1\63\1\113\30\63",
			"\12\63\7\uffff\32\63\1\64\3\uffff\1\63\1\uffff\4\63\1\114\25\63",
			"\12\63\7\uffff\32\63\1\64\3\uffff\1\63\1\uffff\1\115\31\63",
			"\1\116\7\uffff\12\63\7\uffff\32\63\1\64\3\uffff\1\63\1\uffff\32\63",
			"",
			"\12\63\7\uffff\32\63\1\64\3\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\1\64\3\uffff\1\63\1\uffff\15\63\1\120\14\63",
			"\12\63\7\uffff\32\63\1\64\3\uffff\1\63\1\uffff\24\63\1\121\5\63",
			"\12\63\7\uffff\32\63\1\64\3\uffff\1\63\1\uffff\3\63\1\122\26\63",
			"\12\63\7\uffff\32\63\1\64\3\uffff\1\63\1\uffff\13\63\1\123\16\63",
			"\12\63\7\uffff\32\63\1\64\3\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\1\64\3\uffff\1\63\1\uffff\13\63\1\125\16\63",
			"\1\126\17\uffff\12\63\7\uffff\32\63\1\64\3\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\1\64\3\uffff\1\63\1\uffff\23\63\1\130\6\63",
			"",
			"",
			"\1\131\7\uffff\12\63\7\uffff\32\63\1\64\3\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\1\64\3\uffff\1\63\1\uffff\21\63\1\132\10\63",
			"\12\63\7\uffff\32\63\1\64\3\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\1\64\3\uffff\1\63\1\uffff\4\63\1\134\25\63",
			"",
			"\12\63\7\uffff\32\63\1\64\3\uffff\1\63\1\uffff\4\63\1\135\25\63",
			"",
			"",
			"\12\63\7\uffff\32\63\1\64\3\uffff\1\63\1\uffff\32\63",
			"",
			"\12\63\7\uffff\32\63\1\64\3\uffff\1\63\1\uffff\15\63\1\137\14\63",
			"",
			"\1\140\7\uffff\12\63\7\uffff\32\63\1\64\3\uffff\1\63\1\uffff\32\63",
			"\12\63\7\uffff\32\63\1\64\3\uffff\1\63\1\uffff\32\63",
			"",
			"\12\63\7\uffff\32\63\1\64\3\uffff\1\63\1\uffff\32\63",
			"",
			"",
			""
	};

	static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
	static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
	static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
	static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
	static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
	static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
	static final short[][] DFA11_transition;

	static {
		int numStates = DFA11_transitionS.length;
		DFA11_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
		}
	}

	protected class DFA11 extends DFA {

		public DFA11(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 11;
			this.eot = DFA11_eot;
			this.eof = DFA11_eof;
			this.min = DFA11_min;
			this.max = DFA11_max;
			this.accept = DFA11_accept;
			this.special = DFA11_special;
			this.transition = DFA11_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | ARRAY | Number | ID | WS | COMMENT1 | COMMENT2 | LINE_COMMAND );";
		}
	}

}
