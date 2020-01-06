// $ANTLR 3.5 myCompiler.g 2017-06-24 21:26:41

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class myCompilerLexer extends Lexer {
	public static final int EOF=-1;
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
	public static final int CHAR=4;
	public static final int COMMENT1=5;
	public static final int COMMENT2=6;
	public static final int EscapeSequence=7;
	public static final int FLOAT=8;
	public static final int Floating_point_constant=9;
	public static final int IF=10;
	public static final int INCLUDE_TYPE=11;
	public static final int INT=12;
	public static final int IandD_TITLE=13;
	public static final int Identifier=14;
	public static final int Integer_constant=15;
	public static final int LIBARY_ID=16;
	public static final int STRING_LITERAL=17;
	public static final int VOID=18;
	public static final int WS=19;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public myCompilerLexer() {} 
	public myCompilerLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public myCompilerLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "myCompiler.g"; }

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:7:7: ( '(' )
			// myCompiler.g:7:9: '('
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
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:8:7: ( ')' )
			// myCompiler.g:8:9: ')'
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
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:9:7: ( '*' )
			// myCompiler.g:9:9: '*'
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
	// $ANTLR end "T__22"

	// $ANTLR start "T__23"
	public final void mT__23() throws RecognitionException {
		try {
			int _type = T__23;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:10:7: ( '+' )
			// myCompiler.g:10:9: '+'
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
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:11:7: ( ',' )
			// myCompiler.g:11:9: ','
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
	// $ANTLR end "T__24"

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:12:7: ( '-' )
			// myCompiler.g:12:9: '-'
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
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:13:7: ( '/' )
			// myCompiler.g:13:9: '/'
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
			// myCompiler.g:14:7: ( ';' )
			// myCompiler.g:14:9: ';'
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
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:15:7: ( '<' )
			// myCompiler.g:15:9: '<'
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
	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:16:7: ( '=' )
			// myCompiler.g:16:9: '='
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
	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:17:7: ( '>' )
			// myCompiler.g:17:9: '>'
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
	// $ANTLR end "T__30"

	// $ANTLR start "T__31"
	public final void mT__31() throws RecognitionException {
		try {
			int _type = T__31;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:18:7: ( '{' )
			// myCompiler.g:18:9: '{'
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
	// $ANTLR end "T__31"

	// $ANTLR start "T__32"
	public final void mT__32() throws RecognitionException {
		try {
			int _type = T__32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:19:7: ( '}' )
			// myCompiler.g:19:9: '}'
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
	// $ANTLR end "T__32"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:461:6: ( 'float' )
			// myCompiler.g:461:7: 'float'
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

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:462:4: ( 'int' )
			// myCompiler.g:462:5: 'int'
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

	// $ANTLR start "VOID"
	public final void mVOID() throws RecognitionException {
		try {
			int _type = VOID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:463:5: ( 'void' )
			// myCompiler.g:463:7: 'void'
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

	// $ANTLR start "CHAR"
	public final void mCHAR() throws RecognitionException {
		try {
			int _type = CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:464:5: ( 'char' )
			// myCompiler.g:464:7: 'char'
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

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:465:3: ( 'if' )
			// myCompiler.g:465:5: 'if'
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

	// $ANTLR start "INCLUDE_TYPE"
	public final void mINCLUDE_TYPE() throws RecognitionException {
		try {
			int _type = INCLUDE_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:467:14: ( ( ( IandD_TITLE ) ( 'include' ) ) )
			// myCompiler.g:467:16: ( ( IandD_TITLE ) ( 'include' ) )
			{
			// myCompiler.g:467:16: ( ( IandD_TITLE ) ( 'include' ) )
			// myCompiler.g:467:17: ( IandD_TITLE ) ( 'include' )
			{
			if ( input.LA(1)=='#' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// myCompiler.g:467:30: ( 'include' )
			// myCompiler.g:467:31: 'include'
			{
			match("include"); 

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
	// $ANTLR end "INCLUDE_TYPE"

	// $ANTLR start "IandD_TITLE"
	public final void mIandD_TITLE() throws RecognitionException {
		try {
			// myCompiler.g:468:22: ( '#' )
			// myCompiler.g:468:24: '#'
			{
			match('#'); 
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IandD_TITLE"

	// $ANTLR start "LIBARY_ID"
	public final void mLIBARY_ID() throws RecognitionException {
		try {
			int _type = LIBARY_ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:469:11: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' )* '.' ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) )
			// myCompiler.g:469:12: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )* '.' ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
			{
			// myCompiler.g:469:12: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// myCompiler.g:
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
					break;

				default :
					break loop1;
				}
			}

			match('.'); 
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LIBARY_ID"

	// $ANTLR start "Identifier"
	public final void mIdentifier() throws RecognitionException {
		try {
			int _type = Identifier;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:471:11: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// myCompiler.g:471:12: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// myCompiler.g:471:36: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// myCompiler.g:
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
					break loop2;
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
	// $ANTLR end "Identifier"

	// $ANTLR start "Integer_constant"
	public final void mInteger_constant() throws RecognitionException {
		try {
			int _type = Integer_constant;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:472:17: ( ( '0' .. '9' )+ )
			// myCompiler.g:472:18: ( '0' .. '9' )+
			{
			// myCompiler.g:472:18: ( '0' .. '9' )+
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
					// myCompiler.g:
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

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Integer_constant"

	// $ANTLR start "Floating_point_constant"
	public final void mFloating_point_constant() throws RecognitionException {
		try {
			int _type = Floating_point_constant;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:473:24: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ )
			// myCompiler.g:473:25: ( '0' .. '9' )+ '.' ( '0' .. '9' )+
			{
			// myCompiler.g:473:25: ( '0' .. '9' )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// myCompiler.g:
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
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			match('.'); 
			// myCompiler.g:473:39: ( '0' .. '9' )+
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
					// myCompiler.g:
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

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Floating_point_constant"

	// $ANTLR start "STRING_LITERAL"
	public final void mSTRING_LITERAL() throws RecognitionException {
		try {
			int _type = STRING_LITERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:476:4: ( '\"' ( EscapeSequence |~ ( '\\\\' | '\"' ) )* '\"' )
			// myCompiler.g:476:4: '\"' ( EscapeSequence |~ ( '\\\\' | '\"' ) )* '\"'
			{
			match('\"'); 
			// myCompiler.g:476:8: ( EscapeSequence |~ ( '\\\\' | '\"' ) )*
			loop6:
			while (true) {
				int alt6=3;
				int LA6_0 = input.LA(1);
				if ( (LA6_0=='\\') ) {
					alt6=1;
				}
				else if ( ((LA6_0 >= '\u0000' && LA6_0 <= '!')||(LA6_0 >= '#' && LA6_0 <= '[')||(LA6_0 >= ']' && LA6_0 <= '\uFFFF')) ) {
					alt6=2;
				}

				switch (alt6) {
				case 1 :
					// myCompiler.g:476:10: EscapeSequence
					{
					mEscapeSequence(); 

					}
					break;
				case 2 :
					// myCompiler.g:476:27: ~ ( '\\\\' | '\"' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
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

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING_LITERAL"

	// $ANTLR start "EscapeSequence"
	public final void mEscapeSequence() throws RecognitionException {
		try {
			// myCompiler.g:482:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
			// myCompiler.g:482:5: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
			{
			match('\\'); 
			if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
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
	// $ANTLR end "EscapeSequence"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:485:3: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// myCompiler.g:485:4: ( ' ' | '\\t' | '\\r' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
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
	// $ANTLR end "WS"

	// $ANTLR start "COMMENT1"
	public final void mCOMMENT1() throws RecognitionException {
		try {
			int _type = COMMENT1;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// myCompiler.g:486:10: ( '//' ( . )* ( ( '\\r' )? '\\n' ) )
			// myCompiler.g:486:12: '//' ( . )* ( ( '\\r' )? '\\n' )
			{
			match("//"); 

			// myCompiler.g:486:16: ( . )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0=='\r') ) {
					alt7=2;
				}
				else if ( (LA7_0=='\n') ) {
					alt7=2;
				}
				else if ( ((LA7_0 >= '\u0000' && LA7_0 <= '\t')||(LA7_0 >= '\u000B' && LA7_0 <= '\f')||(LA7_0 >= '\u000E' && LA7_0 <= '\uFFFF')) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// myCompiler.g:486:17: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop7;
				}
			}

			// myCompiler.g:486:20: ( ( '\\r' )? '\\n' )
			// myCompiler.g:486:21: ( '\\r' )? '\\n'
			{
			// myCompiler.g:486:21: ( '\\r' )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0=='\r') ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// myCompiler.g:486:21: '\\r'
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
			// myCompiler.g:487:10: ( '/*' ( options {greedy=false; } : . )* '*/' )
			// myCompiler.g:487:12: '/*' ( options {greedy=false; } : . )* '*/'
			{
			match("/*"); 

			// myCompiler.g:487:17: ( options {greedy=false; } : . )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0=='*') ) {
					int LA9_1 = input.LA(2);
					if ( (LA9_1=='/') ) {
						alt9=2;
					}
					else if ( ((LA9_1 >= '\u0000' && LA9_1 <= '.')||(LA9_1 >= '0' && LA9_1 <= '\uFFFF')) ) {
						alt9=1;
					}

				}
				else if ( ((LA9_0 >= '\u0000' && LA9_0 <= ')')||(LA9_0 >= '+' && LA9_0 <= '\uFFFF')) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// myCompiler.g:487:44: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop9;
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

	@Override
	public void mTokens() throws RecognitionException {
		// myCompiler.g:1:8: ( T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | FLOAT | INT | VOID | CHAR | IF | INCLUDE_TYPE | LIBARY_ID | Identifier | Integer_constant | Floating_point_constant | STRING_LITERAL | WS | COMMENT1 | COMMENT2 )
		int alt10=27;
		alt10 = dfa10.predict(input);
		switch (alt10) {
			case 1 :
				// myCompiler.g:1:10: T__20
				{
				mT__20(); 

				}
				break;
			case 2 :
				// myCompiler.g:1:16: T__21
				{
				mT__21(); 

				}
				break;
			case 3 :
				// myCompiler.g:1:22: T__22
				{
				mT__22(); 

				}
				break;
			case 4 :
				// myCompiler.g:1:28: T__23
				{
				mT__23(); 

				}
				break;
			case 5 :
				// myCompiler.g:1:34: T__24
				{
				mT__24(); 

				}
				break;
			case 6 :
				// myCompiler.g:1:40: T__25
				{
				mT__25(); 

				}
				break;
			case 7 :
				// myCompiler.g:1:46: T__26
				{
				mT__26(); 

				}
				break;
			case 8 :
				// myCompiler.g:1:52: T__27
				{
				mT__27(); 

				}
				break;
			case 9 :
				// myCompiler.g:1:58: T__28
				{
				mT__28(); 

				}
				break;
			case 10 :
				// myCompiler.g:1:64: T__29
				{
				mT__29(); 

				}
				break;
			case 11 :
				// myCompiler.g:1:70: T__30
				{
				mT__30(); 

				}
				break;
			case 12 :
				// myCompiler.g:1:76: T__31
				{
				mT__31(); 

				}
				break;
			case 13 :
				// myCompiler.g:1:82: T__32
				{
				mT__32(); 

				}
				break;
			case 14 :
				// myCompiler.g:1:88: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 15 :
				// myCompiler.g:1:94: INT
				{
				mINT(); 

				}
				break;
			case 16 :
				// myCompiler.g:1:98: VOID
				{
				mVOID(); 

				}
				break;
			case 17 :
				// myCompiler.g:1:103: CHAR
				{
				mCHAR(); 

				}
				break;
			case 18 :
				// myCompiler.g:1:108: IF
				{
				mIF(); 

				}
				break;
			case 19 :
				// myCompiler.g:1:111: INCLUDE_TYPE
				{
				mINCLUDE_TYPE(); 

				}
				break;
			case 20 :
				// myCompiler.g:1:124: LIBARY_ID
				{
				mLIBARY_ID(); 

				}
				break;
			case 21 :
				// myCompiler.g:1:134: Identifier
				{
				mIdentifier(); 

				}
				break;
			case 22 :
				// myCompiler.g:1:145: Integer_constant
				{
				mInteger_constant(); 

				}
				break;
			case 23 :
				// myCompiler.g:1:162: Floating_point_constant
				{
				mFloating_point_constant(); 

				}
				break;
			case 24 :
				// myCompiler.g:1:186: STRING_LITERAL
				{
				mSTRING_LITERAL(); 

				}
				break;
			case 25 :
				// myCompiler.g:1:201: WS
				{
				mWS(); 

				}
				break;
			case 26 :
				// myCompiler.g:1:204: COMMENT1
				{
				mCOMMENT1(); 

				}
				break;
			case 27 :
				// myCompiler.g:1:213: COMMENT2
				{
				mCOMMENT2(); 

				}
				break;

		}
	}


	protected DFA10 dfa10 = new DFA10(this);
	static final String DFA10_eotS =
		"\7\uffff\1\32\6\uffff\4\35\1\uffff\1\35\1\uffff\1\42\5\uffff\2\35\1\uffff"+
		"\1\35\1\46\2\35\2\uffff\1\35\1\52\1\uffff\3\35\1\uffff\1\56\1\57\1\60"+
		"\3\uffff";
	static final String DFA10_eofS =
		"\61\uffff";
	static final String DFA10_minS =
		"\1\11\6\uffff\1\52\6\uffff\4\56\1\uffff\1\56\1\uffff\1\56\5\uffff\2\56"+
		"\1\uffff\4\56\2\uffff\2\56\1\uffff\3\56\1\uffff\3\56\3\uffff";
	static final String DFA10_maxS =
		"\1\175\6\uffff\1\57\6\uffff\4\172\1\uffff\1\172\1\uffff\1\71\5\uffff\2"+
		"\172\1\uffff\4\172\2\uffff\2\172\1\uffff\3\172\1\uffff\3\172\3\uffff";
	static final String DFA10_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\uffff\1\10\1\11\1\12\1\13\1\14\1\15"+
		"\4\uffff\1\23\1\uffff\1\24\1\uffff\1\30\1\31\1\32\1\33\1\7\2\uffff\1\25"+
		"\4\uffff\1\26\1\27\2\uffff\1\22\3\uffff\1\17\3\uffff\1\20\1\21\1\16";
	static final String DFA10_specialS =
		"\61\uffff}>";
	static final String[] DFA10_transitionS = {
			"\2\27\2\uffff\1\27\22\uffff\1\27\1\uffff\1\26\1\22\4\uffff\1\1\1\2\1"+
			"\3\1\4\1\5\1\6\1\24\1\7\12\25\1\uffff\1\10\1\11\1\12\1\13\2\uffff\32"+
			"\23\4\uffff\1\23\1\uffff\2\23\1\21\2\23\1\16\2\23\1\17\14\23\1\20\4\23"+
			"\1\14\1\uffff\1\15",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\31\4\uffff\1\30",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\24\22\uffff\32\34\4\uffff\1\34\1\uffff\13\34\1\33\16\34",
			"\1\24\22\uffff\32\34\4\uffff\1\34\1\uffff\5\34\1\37\7\34\1\36\14\34",
			"\1\24\22\uffff\32\34\4\uffff\1\34\1\uffff\16\34\1\40\13\34",
			"\1\24\22\uffff\32\34\4\uffff\1\34\1\uffff\7\34\1\41\22\34",
			"",
			"\1\24\22\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"",
			"\1\43\1\uffff\12\25",
			"",
			"",
			"",
			"",
			"",
			"\1\24\22\uffff\32\34\4\uffff\1\34\1\uffff\16\34\1\44\13\34",
			"\1\24\22\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"",
			"\1\24\22\uffff\32\34\4\uffff\1\34\1\uffff\23\34\1\45\6\34",
			"\1\24\1\uffff\12\35\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\1\24\22\uffff\32\34\4\uffff\1\34\1\uffff\10\34\1\47\21\34",
			"\1\24\22\uffff\32\34\4\uffff\1\34\1\uffff\1\50\31\34",
			"",
			"",
			"\1\24\22\uffff\32\34\4\uffff\1\34\1\uffff\1\51\31\34",
			"\1\24\1\uffff\12\35\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"",
			"\1\24\22\uffff\32\34\4\uffff\1\34\1\uffff\3\34\1\53\26\34",
			"\1\24\22\uffff\32\34\4\uffff\1\34\1\uffff\21\34\1\54\10\34",
			"\1\24\22\uffff\32\34\4\uffff\1\34\1\uffff\23\34\1\55\6\34",
			"",
			"\1\24\1\uffff\12\35\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\1\24\1\uffff\12\35\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"\1\24\1\uffff\12\35\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
			"",
			"",
			""
	};

	static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
	static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
	static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
	static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
	static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
	static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
	static final short[][] DFA10_transition;

	static {
		int numStates = DFA10_transitionS.length;
		DFA10_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
		}
	}

	protected class DFA10 extends DFA {

		public DFA10(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 10;
			this.eot = DFA10_eot;
			this.eof = DFA10_eof;
			this.min = DFA10_min;
			this.max = DFA10_max;
			this.accept = DFA10_accept;
			this.special = DFA10_special;
			this.transition = DFA10_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | FLOAT | INT | VOID | CHAR | IF | INCLUDE_TYPE | LIBARY_ID | Identifier | Integer_constant | Floating_point_constant | STRING_LITERAL | WS | COMMENT1 | COMMENT2 );";
		}
	}

}
