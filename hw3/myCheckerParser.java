// $ANTLR 3.5 myChecker.g 2017-05-31 11:15:44

	import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class myCheckerParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "Arr", "CHAR", "COMMENT1", "COMMENT2", 
		"COMP", "DIGIT", "FLOAT", "FLOAT_NUMBER", "IF", "INT", "INT_NUMBER", "Id", 
		"LETTER", "LINE_COMMAND", "MAIN", "NEWLINE", "OPER", "STRING_LITERAL", 
		"TAB", "VOID", "WHILE", "WS", "'%'", "'&&'", "'('", "')'", "'*'", "'+'", 
		"'++'", "','", "'-'", "'--'", "'/'", "';'", "'='", "'\\''", "'else if('", 
		"'else'", "'if('", "'return'", "'while('", "'{'", "'||'", "'}'"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public myCheckerParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public myCheckerParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
		this.state.ruleMemo = new HashMap[57+1];


	}

	@Override public String[] getTokenNames() { return myCheckerParser.tokenNames; }
	@Override public String getGrammarFileName() { return "myChecker.g"; }


		boolean TRACEON = false;
	    HashMap<String,Integer> symtab = new HashMap<String,Integer>();
		int attr_type;



	// $ANTLR start "program"
	// myChecker.g:20:1: program : ( LINE_COMMAND )* ( type_num | type_void ) MAIN '(' ')' '{' stats '}' ;
	public final void program() throws RecognitionException {
		int program_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return; }

			// myChecker.g:21:5: ( ( LINE_COMMAND )* ( type_num | type_void ) MAIN '(' ')' '{' stats '}' )
			// myChecker.g:21:9: ( LINE_COMMAND )* ( type_num | type_void ) MAIN '(' ')' '{' stats '}'
			{
			// myChecker.g:21:9: ( LINE_COMMAND )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==LINE_COMMAND) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// myChecker.g:21:9: LINE_COMMAND
					{
					match(input,LINE_COMMAND,FOLLOW_LINE_COMMAND_in_program77); if (state.failed) return;
					}
					break;

				default :
					break loop1;
				}
			}

			// myChecker.g:22:9: ( type_num | type_void )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==FLOAT||LA2_0==INT) ) {
				alt2=1;
			}
			else if ( (LA2_0==VOID) ) {
				alt2=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// myChecker.g:22:10: type_num
					{
					pushFollow(FOLLOW_type_num_in_program90);
					type_num();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// myChecker.g:22:21: type_void
					{
					pushFollow(FOLLOW_type_void_in_program94);
					type_void();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,MAIN,FOLLOW_MAIN_in_program96); if (state.failed) return;
			match(input,28,FOLLOW_28_in_program98); if (state.failed) return;
			match(input,29,FOLLOW_29_in_program100); if (state.failed) return;
			match(input,45,FOLLOW_45_in_program102); if (state.failed) return;
			pushFollow(FOLLOW_stats_in_program104);
			stats();
			state._fsp--;
			if (state.failed) return;
			match(input,47,FOLLOW_47_in_program106); if (state.failed) return;
			if ( state.backtracking==0 ) { if (TRACEON) System.out.println("VOID MAIN () {declarations stats}"); }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 1, program_StartIndex); }

		}
	}
	// $ANTLR end "program"



	// $ANTLR start "stats"
	// myChecker.g:26:1: stats : ( stat )* ;
	public final void stats() throws RecognitionException {
		int stats_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return; }

			// myChecker.g:26:7: ( ( stat )* )
			// myChecker.g:26:9: ( stat )*
			{
			// myChecker.g:26:9: ( stat )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==CHAR||(LA3_0 >= FLOAT && LA3_0 <= FLOAT_NUMBER)||(LA3_0 >= INT && LA3_0 <= Id)||LA3_0==28||(LA3_0 >= 42 && LA3_0 <= 44)) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// myChecker.g:26:9: stat
					{
					pushFollow(FOLLOW_stat_in_stats127);
					stat();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop3;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 2, stats_StartIndex); }

		}
	}
	// $ANTLR end "stats"



	// $ANTLR start "stat"
	// myChecker.g:28:1: stat : ( declarations | assignment | whilestat | ifstat | returnstat | expr ';' );
	public final void stat() throws RecognitionException {
		int stat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return; }

			// myChecker.g:28:6: ( declarations | assignment | whilestat | ifstat | returnstat | expr ';' )
			int alt4=6;
			switch ( input.LA(1) ) {
			case CHAR:
			case FLOAT:
			case INT:
				{
				alt4=1;
				}
				break;
			case Id:
				{
				int LA4_4 = input.LA(2);
				if ( (LA4_4==Arr||LA4_4==38) ) {
					alt4=2;
				}
				else if ( (LA4_4==COMP||LA4_4==OPER||(LA4_4 >= 26 && LA4_4 <= 27)||(LA4_4 >= 30 && LA4_4 <= 32)||(LA4_4 >= 34 && LA4_4 <= 37)||LA4_4==46) ) {
					alt4=6;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 44:
				{
				alt4=3;
				}
				break;
			case 42:
				{
				alt4=4;
				}
				break;
			case 43:
				{
				alt4=5;
				}
				break;
			case FLOAT_NUMBER:
			case INT_NUMBER:
			case 28:
				{
				alt4=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// myChecker.g:28:8: declarations
					{
					pushFollow(FOLLOW_declarations_in_stat141);
					declarations();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// myChecker.g:28:22: assignment
					{
					pushFollow(FOLLOW_assignment_in_stat144);
					assignment();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// myChecker.g:28:34: whilestat
					{
					pushFollow(FOLLOW_whilestat_in_stat147);
					whilestat();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// myChecker.g:28:45: ifstat
					{
					pushFollow(FOLLOW_ifstat_in_stat150);
					ifstat();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					// myChecker.g:28:53: returnstat
					{
					pushFollow(FOLLOW_returnstat_in_stat153);
					returnstat();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					// myChecker.g:28:65: expr ';'
					{
					pushFollow(FOLLOW_expr_in_stat156);
					expr();
					state._fsp--;
					if (state.failed) return;
					match(input,37,FOLLOW_37_in_stat158); if (state.failed) return;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 3, stat_StartIndex); }

		}
	}
	// $ANTLR end "stat"



	// $ANTLR start "type_num"
	// myChecker.g:29:1: type_num returns [int attr_type] : ( INT | FLOAT );
	public final int type_num() throws RecognitionException {
		int attr_type = 0;

		int type_num_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return attr_type; }

			// myChecker.g:30:5: ( INT | FLOAT )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==INT) ) {
				alt5=1;
			}
			else if ( (LA5_0==FLOAT) ) {
				alt5=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return attr_type;}
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// myChecker.g:30:7: INT
					{
					match(input,INT,FOLLOW_INT_in_type_num173); if (state.failed) return attr_type;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("type: INT");  attr_type = 1; }
					}
					break;
				case 2 :
					// myChecker.g:31:7: FLOAT
					{
					match(input,FLOAT,FOLLOW_FLOAT_in_type_num184); if (state.failed) return attr_type;
					if ( state.backtracking==0 ) { if (TRACEON) System.out.println("type: FLOAT");  attr_type = 2; }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 4, type_num_StartIndex); }

		}
		return attr_type;
	}
	// $ANTLR end "type_num"



	// $ANTLR start "type_char"
	// myChecker.g:34:1: type_char returns [int attr_type] : CHAR ;
	public final int type_char() throws RecognitionException {
		int attr_type = 0;

		int type_char_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return attr_type; }

			// myChecker.g:35:5: ( CHAR )
			// myChecker.g:35:7: CHAR
			{
			match(input,CHAR,FOLLOW_CHAR_in_type_char207); if (state.failed) return attr_type;
			if ( state.backtracking==0 ) { if (TRACEON) System.out.println("type: CHAR");  attr_type = 3; }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 5, type_char_StartIndex); }

		}
		return attr_type;
	}
	// $ANTLR end "type_char"



	// $ANTLR start "type_void"
	// myChecker.g:36:1: type_void returns [int attr_type] : VOID ;
	public final int type_void() throws RecognitionException {
		int attr_type = 0;

		int type_void_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return attr_type; }

			// myChecker.g:37:5: ( VOID )
			// myChecker.g:37:7: VOID
			{
			match(input,VOID,FOLLOW_VOID_in_type_void224); if (state.failed) return attr_type;
			if ( state.backtracking==0 ) { if (TRACEON) System.out.println("type: VOID");  attr_type = 4; }
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 6, type_void_StartIndex); }

		}
		return attr_type;
	}
	// $ANTLR end "type_void"



	// $ANTLR start "declarations"
	// myChecker.g:39:1: declarations returns [int attr_type] : ( type_num a= Id ( '=' b= expr )? ( ',' c= Id ( '=' d= expr )? )* ';' | type_char a= Id ( '=' '\\'' ( . ) '\\'' )? ( ',' c= Id ( '=' '\\'' ( . ) '\\'' )? )* ';' | type_num Id Arr '=' '{' ( INT_NUMBER | FLOAT_NUMBER ) '}' ';' | ( type_num | type_char ) Id Arr ';' );
	public final int declarations() throws RecognitionException {
		int attr_type = 0;

		int declarations_StartIndex = input.index();

		Token a=null;
		Token c=null;
		Token Id3=null;
		Token Id5=null;
		ParserRuleReturnScope b =null;
		ParserRuleReturnScope d =null;
		int type_num1 =0;
		int type_char2 =0;
		int type_num4 =0;
		int type_num6 =0;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return attr_type; }

			// myChecker.g:40:5: ( type_num a= Id ( '=' b= expr )? ( ',' c= Id ( '=' d= expr )? )* ';' | type_char a= Id ( '=' '\\'' ( . ) '\\'' )? ( ',' c= Id ( '=' '\\'' ( . ) '\\'' )? )* ';' | type_num Id Arr '=' '{' ( INT_NUMBER | FLOAT_NUMBER ) '}' ';' | ( type_num | type_char ) Id Arr ';' )
			int alt13=4;
			switch ( input.LA(1) ) {
			case INT:
				{
				int LA13_1 = input.LA(2);
				if ( (LA13_1==Id) ) {
					int LA13_4 = input.LA(3);
					if ( (synpred13_myChecker()) ) {
						alt13=1;
					}
					else if ( (synpred19_myChecker()) ) {
						alt13=3;
					}
					else if ( (true) ) {
						alt13=4;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return attr_type;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 13, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case FLOAT:
				{
				int LA13_2 = input.LA(2);
				if ( (LA13_2==Id) ) {
					int LA13_5 = input.LA(3);
					if ( (synpred13_myChecker()) ) {
						alt13=1;
					}
					else if ( (synpred19_myChecker()) ) {
						alt13=3;
					}
					else if ( (true) ) {
						alt13=4;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return attr_type;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 13, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case CHAR:
				{
				int LA13_3 = input.LA(2);
				if ( (LA13_3==Id) ) {
					int LA13_6 = input.LA(3);
					if ( (synpred17_myChecker()) ) {
						alt13=2;
					}
					else if ( (true) ) {
						alt13=4;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return attr_type;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 13, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return attr_type;}
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}
			switch (alt13) {
				case 1 :
					// myChecker.g:40:7: type_num a= Id ( '=' b= expr )? ( ',' c= Id ( '=' d= expr )? )* ';'
					{
					pushFollow(FOLLOW_type_num_in_declarations242);
					type_num1=type_num();
					state._fsp--;
					if (state.failed) return attr_type;
					a=(Token)match(input,Id,FOLLOW_Id_in_declarations248); if (state.failed) return attr_type;
					// myChecker.g:40:23: ( '=' b= expr )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==38) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// myChecker.g:40:24: '=' b= expr
							{
							match(input,38,FOLLOW_38_in_declarations251); if (state.failed) return attr_type;
							pushFollow(FOLLOW_expr_in_declarations257);
							b=expr();
							state._fsp--;
							if (state.failed) return attr_type;
							}
							break;

					}

					// myChecker.g:40:39: ( ',' c= Id ( '=' d= expr )? )*
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( (LA8_0==33) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// myChecker.g:40:40: ',' c= Id ( '=' d= expr )?
							{
							match(input,33,FOLLOW_33_in_declarations262); if (state.failed) return attr_type;
							c=(Token)match(input,Id,FOLLOW_Id_in_declarations268); if (state.failed) return attr_type;
							// myChecker.g:40:51: ( '=' d= expr )?
							int alt7=2;
							int LA7_0 = input.LA(1);
							if ( (LA7_0==38) ) {
								alt7=1;
							}
							switch (alt7) {
								case 1 :
									// myChecker.g:40:52: '=' d= expr
									{
									match(input,38,FOLLOW_38_in_declarations271); if (state.failed) return attr_type;
									pushFollow(FOLLOW_expr_in_declarations277);
									d=expr();
									state._fsp--;
									if (state.failed) return attr_type;
									}
									break;

							}

							}
							break;

						default :
							break loop8;
						}
					}

					match(input,37,FOLLOW_37_in_declarations284); if (state.failed) return attr_type;
					if ( state.backtracking==0 ) {
						   if (symtab.containsKey((a!=null?a.getText():null))) {
						       System.out.println("Type Error: " + a.getLine() + 
												  ": Redeclared identifier " + (a!=null?a.getText():null) + ".");
						   } else if ( (type_num1 != (b!=null?((myCheckerParser.expr_return)b).attr_type:0)) &&((b!=null?input.toString(b.start,b.stop):null) != null)) {
								System.out.println("Type Error: " + (b!=null?(b.start):null).getLine() +
											      ": Type mismatch for the two silde operands in an assignment statement.");
								attr_type = -2;
								symtab.put((a!=null?a.getText():null), type_num1);
					       } else {
					           symtab.put((a!=null?a.getText():null), type_num1);
						   }
						   
						   if ((c!=null?c.getText():null) != null){
								if (symtab.containsKey((c!=null?c.getText():null))) {
								System.out.println("Type Error: " + c.getLine() + ": Redeclared identifier " + (c!=null?c.getText():null) );
								} else if (((d!=null?input.toString(d.start,d.stop):null) != null) && (type_num1 != (d!=null?((myCheckerParser.expr_return)d).attr_type:0))) {
									System.out.println("Type Error: " + (d!=null?(d.start):null).getLine() +
													": Type mismatch for the two silde operands in an assignment statement.");
									attr_type = -2;
									symtab.put((c!=null?c.getText():null), type_num1);
								} else {
									symtab.put((c!=null?c.getText():null), type_num1);
								}
						   }	   
						 }
					}
					break;
				case 2 :
					// myChecker.g:67:3: type_char a= Id ( '=' '\\'' ( . ) '\\'' )? ( ',' c= Id ( '=' '\\'' ( . ) '\\'' )? )* ';'
					{
					pushFollow(FOLLOW_type_char_in_declarations293);
					type_char2=type_char();
					state._fsp--;
					if (state.failed) return attr_type;
					a=(Token)match(input,Id,FOLLOW_Id_in_declarations299); if (state.failed) return attr_type;
					// myChecker.g:67:20: ( '=' '\\'' ( . ) '\\'' )?
					int alt9=2;
					int LA9_0 = input.LA(1);
					if ( (LA9_0==38) ) {
						alt9=1;
					}
					switch (alt9) {
						case 1 :
							// myChecker.g:67:21: '=' '\\'' ( . ) '\\''
							{
							match(input,38,FOLLOW_38_in_declarations302); if (state.failed) return attr_type;
							match(input,39,FOLLOW_39_in_declarations304); if (state.failed) return attr_type;
							// myChecker.g:67:29: ( . )
							// myChecker.g:67:30: .
							{
							matchAny(input); if (state.failed) return attr_type;
							}

							match(input,39,FOLLOW_39_in_declarations308); if (state.failed) return attr_type;
							}
							break;

					}

					// myChecker.g:67:39: ( ',' c= Id ( '=' '\\'' ( . ) '\\'' )? )*
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( (LA11_0==33) ) {
							alt11=1;
						}

						switch (alt11) {
						case 1 :
							// myChecker.g:67:40: ',' c= Id ( '=' '\\'' ( . ) '\\'' )?
							{
							match(input,33,FOLLOW_33_in_declarations313); if (state.failed) return attr_type;
							c=(Token)match(input,Id,FOLLOW_Id_in_declarations319); if (state.failed) return attr_type;
							// myChecker.g:67:51: ( '=' '\\'' ( . ) '\\'' )?
							int alt10=2;
							int LA10_0 = input.LA(1);
							if ( (LA10_0==38) ) {
								alt10=1;
							}
							switch (alt10) {
								case 1 :
									// myChecker.g:67:52: '=' '\\'' ( . ) '\\''
									{
									match(input,38,FOLLOW_38_in_declarations322); if (state.failed) return attr_type;
									match(input,39,FOLLOW_39_in_declarations324); if (state.failed) return attr_type;
									// myChecker.g:67:60: ( . )
									// myChecker.g:67:61: .
									{
									matchAny(input); if (state.failed) return attr_type;
									}

									match(input,39,FOLLOW_39_in_declarations328); if (state.failed) return attr_type;
									}
									break;

							}

							}
							break;

						default :
							break loop11;
						}
					}

					match(input,37,FOLLOW_37_in_declarations335); if (state.failed) return attr_type;
					if ( state.backtracking==0 ) {
						   if (TRACEON) System.out.println("declarations: type_char Id : declarations");
						 
					  	   if (symtab.containsKey((a!=null?a.getText():null))) 
							   System.out.println("Type Error: " + a.getLine() + ": Redeclared identifier " + (a!=null?a.getText():null));
						   else
							   symtab.put((a!=null?a.getText():null), type_char2);

						   if ((c!=null?c.getText():null) != null){
								if (symtab.containsKey((c!=null?c.getText():null))) 
									System.out.println("Type Error: " + c.getLine() + ": Redeclared identifier " + (c!=null?c.getText():null));
								else 
									symtab.put((c!=null?c.getText():null), type_char2);
						 	}
						 }
					}
					break;
				case 3 :
					// myChecker.g:83:7: type_num Id Arr '=' '{' ( INT_NUMBER | FLOAT_NUMBER ) '}' ';'
					{
					pushFollow(FOLLOW_type_num_in_declarations350);
					type_num4=type_num();
					state._fsp--;
					if (state.failed) return attr_type;
					Id3=(Token)match(input,Id,FOLLOW_Id_in_declarations352); if (state.failed) return attr_type;
					match(input,Arr,FOLLOW_Arr_in_declarations354); if (state.failed) return attr_type;
					match(input,38,FOLLOW_38_in_declarations356); if (state.failed) return attr_type;
					match(input,45,FOLLOW_45_in_declarations358); if (state.failed) return attr_type;
					if ( input.LA(1)==FLOAT_NUMBER||input.LA(1)==INT_NUMBER ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return attr_type;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					match(input,47,FOLLOW_47_in_declarations368); if (state.failed) return attr_type;
					match(input,37,FOLLOW_37_in_declarations370); if (state.failed) return attr_type;
					if ( state.backtracking==0 ) {
						   if (TRACEON) System.out.println("declarations: type_num Id : declarations");
						 
					  	   if (symtab.containsKey((Id3!=null?Id3.getText():null))) 
							   System.out.println("Type Error: " + Id3.getLine() + ": Redeclared identifier " + (Id3!=null?Id3.getText():null));
						   else 
							   symtab.put((Id3!=null?Id3.getText():null), type_num4);
						   
						 }
					}
					break;
				case 4 :
					// myChecker.g:93:4: ( type_num | type_char ) Id Arr ';'
					{
					// myChecker.g:93:4: ( type_num | type_char )
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0==FLOAT||LA12_0==INT) ) {
						alt12=1;
					}
					else if ( (LA12_0==CHAR) ) {
						alt12=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return attr_type;}
						NoViableAltException nvae =
							new NoViableAltException("", 12, 0, input);
						throw nvae;
					}

					switch (alt12) {
						case 1 :
							// myChecker.g:93:5: type_num
							{
							pushFollow(FOLLOW_type_num_in_declarations381);
							type_num6=type_num();
							state._fsp--;
							if (state.failed) return attr_type;
							}
							break;
						case 2 :
							// myChecker.g:93:16: type_char
							{
							pushFollow(FOLLOW_type_char_in_declarations385);
							type_char();
							state._fsp--;
							if (state.failed) return attr_type;
							}
							break;

					}

					Id5=(Token)match(input,Id,FOLLOW_Id_in_declarations388); if (state.failed) return attr_type;
					match(input,Arr,FOLLOW_Arr_in_declarations390); if (state.failed) return attr_type;
					match(input,37,FOLLOW_37_in_declarations392); if (state.failed) return attr_type;
					if ( state.backtracking==0 ) {
							if (TRACEON) System.out.println("declarations: type_num Id : declarations");
							if (symtab.containsKey((Id5!=null?Id5.getText():null))) 
							   System.out.println("Type Error: " + Id5.getLine() + ": Redeclared identifier " + (Id5!=null?Id5.getText():null));
						    else 
							   symtab.put((Id5!=null?Id5.getText():null), type_num6);
						 }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 7, declarations_StartIndex); }

		}
		return attr_type;
	}
	// $ANTLR end "declarations"



	// $ANTLR start "assignment"
	// myChecker.g:103:1: assignment returns [int attr_type] : ( Id '=' expr ';' | Id Arr '=' expr ';' );
	public final int assignment() throws RecognitionException {
		int attr_type = 0;

		int assignment_StartIndex = input.index();

		Token Id7=null;
		Token Id9=null;
		ParserRuleReturnScope expr8 =null;
		ParserRuleReturnScope expr10 =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return attr_type; }

			// myChecker.g:104:5: ( Id '=' expr ';' | Id Arr '=' expr ';' )
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==Id) ) {
				int LA14_1 = input.LA(2);
				if ( (LA14_1==38) ) {
					alt14=1;
				}
				else if ( (LA14_1==Arr) ) {
					alt14=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return attr_type;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 14, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return attr_type;}
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// myChecker.g:104:7: Id '=' expr ';'
					{
					Id7=(Token)match(input,Id,FOLLOW_Id_in_assignment421); if (state.failed) return attr_type;
					match(input,38,FOLLOW_38_in_assignment423); if (state.failed) return attr_type;
					pushFollow(FOLLOW_expr_in_assignment425);
					expr8=expr();
					state._fsp--;
					if (state.failed) return attr_type;
					match(input,37,FOLLOW_37_in_assignment427); if (state.failed) return attr_type;
					if ( state.backtracking==0 ) {
						   if (symtab.containsKey((Id7!=null?Id7.getText():null))) {
						       attr_type = symtab.get((Id7!=null?Id7.getText():null));
						   } else {
								System.out.println("Type Error: " + Id7.getLine() + ": Undeclared identifier " + (Id7!=null?Id7.getText():null) );
								attr_type = -2;
								return attr_type;
						   }
							
						   if (symtab.get((Id7!=null?Id7.getText():null)) != (expr8!=null?((myCheckerParser.expr_return)expr8).attr_type:0)) {
								System.out.println("Type Error: " + (expr8!=null?(expr8.start):null).getLine() +
											      ": Type mismatch for the two silde operands in an assignment statement.");
								attr_type = -2;
					       }
						 }
					}
					break;
				case 2 :
					// myChecker.g:120:4: Id Arr '=' expr ';'
					{
					Id9=(Token)match(input,Id,FOLLOW_Id_in_assignment436); if (state.failed) return attr_type;
					match(input,Arr,FOLLOW_Arr_in_assignment438); if (state.failed) return attr_type;
					match(input,38,FOLLOW_38_in_assignment440); if (state.failed) return attr_type;
					pushFollow(FOLLOW_expr_in_assignment442);
					expr10=expr();
					state._fsp--;
					if (state.failed) return attr_type;
					match(input,37,FOLLOW_37_in_assignment444); if (state.failed) return attr_type;
					if ( state.backtracking==0 ) {
						   if (symtab.containsKey((Id9!=null?Id9.getText():null))) {
						       attr_type = symtab.get((Id9!=null?Id9.getText():null));
						   } else {
								System.out.println("Type Error: " + Id9.getLine() + ": Unknown Identifier " + (Id9!=null?Id9.getText():null));
								attr_type = -2;
								return attr_type;
						   }
						   if (symtab.get((Id9!=null?Id9.getText():null)) != (expr10!=null?((myCheckerParser.expr_return)expr10).attr_type:0)) {
								System.out.println("Type Error: " + (expr10!=null?(expr10.start):null).getLine() +
											      ": Type mismatch for the two silde operands in an assignment statement.");
								attr_type = -2;
					       }
						 }
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 8, assignment_StartIndex); }

		}
		return attr_type;
	}
	// $ANTLR end "assignment"



	// $ANTLR start "whilestat"
	// myChecker.g:137:1: whilestat : 'while(' expr ')' '{' stats '}' ;
	public final void whilestat() throws RecognitionException {
		int whilestat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return; }

			// myChecker.g:137:10: ( 'while(' expr ')' '{' stats '}' )
			// myChecker.g:137:12: 'while(' expr ')' '{' stats '}'
			{
			match(input,44,FOLLOW_44_in_whilestat460); if (state.failed) return;
			pushFollow(FOLLOW_expr_in_whilestat462);
			expr();
			state._fsp--;
			if (state.failed) return;
			match(input,29,FOLLOW_29_in_whilestat464); if (state.failed) return;
			match(input,45,FOLLOW_45_in_whilestat466); if (state.failed) return;
			pushFollow(FOLLOW_stats_in_whilestat468);
			stats();
			state._fsp--;
			if (state.failed) return;
			match(input,47,FOLLOW_47_in_whilestat470); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 9, whilestat_StartIndex); }

		}
	}
	// $ANTLR end "whilestat"



	// $ANTLR start "ifstat"
	// myChecker.g:139:1: ifstat : 'if(' expr ')' ( stat | ( '{' stats '}' ) ) ( 'else if(' expr ')' ( stat | ( '{' stats '}' ) ) )* ( 'else' ( WS )* ( stat | ( '{' stats '}' ) ) )? ;
	public final void ifstat() throws RecognitionException {
		int ifstat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return; }

			// myChecker.g:140:5: ( 'if(' expr ')' ( stat | ( '{' stats '}' ) ) ( 'else if(' expr ')' ( stat | ( '{' stats '}' ) ) )* ( 'else' ( WS )* ( stat | ( '{' stats '}' ) ) )? )
			// myChecker.g:141:9: 'if(' expr ')' ( stat | ( '{' stats '}' ) ) ( 'else if(' expr ')' ( stat | ( '{' stats '}' ) ) )* ( 'else' ( WS )* ( stat | ( '{' stats '}' ) ) )?
			{
			match(input,42,FOLLOW_42_in_ifstat495); if (state.failed) return;
			pushFollow(FOLLOW_expr_in_ifstat497);
			expr();
			state._fsp--;
			if (state.failed) return;
			match(input,29,FOLLOW_29_in_ifstat499); if (state.failed) return;
			// myChecker.g:142:3: ( stat | ( '{' stats '}' ) )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==CHAR||(LA15_0 >= FLOAT && LA15_0 <= FLOAT_NUMBER)||(LA15_0 >= INT && LA15_0 <= Id)||LA15_0==28||(LA15_0 >= 42 && LA15_0 <= 44)) ) {
				alt15=1;
			}
			else if ( (LA15_0==45) ) {
				alt15=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// myChecker.g:142:4: stat
					{
					pushFollow(FOLLOW_stat_in_ifstat504);
					stat();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// myChecker.g:142:11: ( '{' stats '}' )
					{
					// myChecker.g:142:11: ( '{' stats '}' )
					// myChecker.g:142:12: '{' stats '}'
					{
					match(input,45,FOLLOW_45_in_ifstat509); if (state.failed) return;
					pushFollow(FOLLOW_stats_in_ifstat511);
					stats();
					state._fsp--;
					if (state.failed) return;
					match(input,47,FOLLOW_47_in_ifstat513); if (state.failed) return;
					}

					}
					break;

			}

			// myChecker.g:143:3: ( 'else if(' expr ')' ( stat | ( '{' stats '}' ) ) )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==40) ) {
					int LA17_13 = input.LA(2);
					if ( (synpred24_myChecker()) ) {
						alt17=1;
					}

				}

				switch (alt17) {
				case 1 :
					// myChecker.g:143:4: 'else if(' expr ')' ( stat | ( '{' stats '}' ) )
					{
					match(input,40,FOLLOW_40_in_ifstat520); if (state.failed) return;
					pushFollow(FOLLOW_expr_in_ifstat522);
					expr();
					state._fsp--;
					if (state.failed) return;
					match(input,29,FOLLOW_29_in_ifstat524); if (state.failed) return;
					// myChecker.g:144:3: ( stat | ( '{' stats '}' ) )
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0==CHAR||(LA16_0 >= FLOAT && LA16_0 <= FLOAT_NUMBER)||(LA16_0 >= INT && LA16_0 <= Id)||LA16_0==28||(LA16_0 >= 42 && LA16_0 <= 44)) ) {
						alt16=1;
					}
					else if ( (LA16_0==45) ) {
						alt16=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						NoViableAltException nvae =
							new NoViableAltException("", 16, 0, input);
						throw nvae;
					}

					switch (alt16) {
						case 1 :
							// myChecker.g:144:4: stat
							{
							pushFollow(FOLLOW_stat_in_ifstat529);
							stat();
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 2 :
							// myChecker.g:144:11: ( '{' stats '}' )
							{
							// myChecker.g:144:11: ( '{' stats '}' )
							// myChecker.g:144:12: '{' stats '}'
							{
							match(input,45,FOLLOW_45_in_ifstat534); if (state.failed) return;
							pushFollow(FOLLOW_stats_in_ifstat536);
							stats();
							state._fsp--;
							if (state.failed) return;
							match(input,47,FOLLOW_47_in_ifstat538); if (state.failed) return;
							}

							}
							break;

					}

					}
					break;

				default :
					break loop17;
				}
			}

			// myChecker.g:145:3: ( 'else' ( WS )* ( stat | ( '{' stats '}' ) ) )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==41) ) {
				int LA20_1 = input.LA(2);
				if ( (synpred27_myChecker()) ) {
					alt20=1;
				}
			}
			switch (alt20) {
				case 1 :
					// myChecker.g:145:4: 'else' ( WS )* ( stat | ( '{' stats '}' ) )
					{
					match(input,41,FOLLOW_41_in_ifstat547); if (state.failed) return;
					// myChecker.g:145:10: ( WS )*
					loop18:
					while (true) {
						int alt18=2;
						int LA18_0 = input.LA(1);
						if ( (LA18_0==WS) ) {
							alt18=1;
						}

						switch (alt18) {
						case 1 :
							// myChecker.g:145:10: WS
							{
							match(input,WS,FOLLOW_WS_in_ifstat548); if (state.failed) return;
							}
							break;

						default :
							break loop18;
						}
					}

					// myChecker.g:146:3: ( stat | ( '{' stats '}' ) )
					int alt19=2;
					int LA19_0 = input.LA(1);
					if ( (LA19_0==CHAR||(LA19_0 >= FLOAT && LA19_0 <= FLOAT_NUMBER)||(LA19_0 >= INT && LA19_0 <= Id)||LA19_0==28||(LA19_0 >= 42 && LA19_0 <= 44)) ) {
						alt19=1;
					}
					else if ( (LA19_0==45) ) {
						alt19=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						NoViableAltException nvae =
							new NoViableAltException("", 19, 0, input);
						throw nvae;
					}

					switch (alt19) {
						case 1 :
							// myChecker.g:146:4: stat
							{
							pushFollow(FOLLOW_stat_in_ifstat554);
							stat();
							state._fsp--;
							if (state.failed) return;
							}
							break;
						case 2 :
							// myChecker.g:146:11: ( '{' stats '}' )
							{
							// myChecker.g:146:11: ( '{' stats '}' )
							// myChecker.g:146:12: '{' stats '}'
							{
							match(input,45,FOLLOW_45_in_ifstat559); if (state.failed) return;
							pushFollow(FOLLOW_stats_in_ifstat561);
							stats();
							state._fsp--;
							if (state.failed) return;
							match(input,47,FOLLOW_47_in_ifstat563); if (state.failed) return;
							}

							}
							break;

					}

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 10, ifstat_StartIndex); }

		}
	}
	// $ANTLR end "ifstat"



	// $ANTLR start "returnstat"
	// myChecker.g:148:1: returnstat : 'return' expr ';' ;
	public final void returnstat() throws RecognitionException {
		int returnstat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return; }

			// myChecker.g:148:11: ( 'return' expr ';' )
			// myChecker.g:148:13: 'return' expr ';'
			{
			match(input,43,FOLLOW_43_in_returnstat575); if (state.failed) return;
			pushFollow(FOLLOW_expr_in_returnstat577);
			expr();
			state._fsp--;
			if (state.failed) return;
			match(input,37,FOLLOW_37_in_returnstat579); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 11, returnstat_StartIndex); }

		}
	}
	// $ANTLR end "returnstat"


	public static class expr_return extends ParserRuleReturnScope {
		public int attr_type;
	};


	// $ANTLR start "expr"
	// myChecker.g:150:1: expr returns [int attr_type] : a= operand ( ( '&&' | '||' ) b= operand )* ;
	public final myCheckerParser.expr_return expr() throws RecognitionException {
		myCheckerParser.expr_return retval = new myCheckerParser.expr_return();
		retval.start = input.LT(1);
		int expr_StartIndex = input.index();

		int a =0;
		int b =0;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }

			// myChecker.g:151:2: (a= operand ( ( '&&' | '||' ) b= operand )* )
			// myChecker.g:151:4: a= operand ( ( '&&' | '||' ) b= operand )*
			{
			pushFollow(FOLLOW_operand_in_expr596);
			a=operand();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) { retval.attr_type = a; }
			// myChecker.g:152:2: ( ( '&&' | '||' ) b= operand )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==27||LA21_0==46) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// myChecker.g:152:3: ( '&&' | '||' ) b= operand
					{
					if ( input.LA(1)==27||input.LA(1)==46 ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_operand_in_expr614);
					b=operand();
					state._fsp--;
					if (state.failed) return retval;
					}
					break;

				default :
					break loop21;
				}
			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 12, expr_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "expr"



	// $ANTLR start "operand"
	// myChecker.g:155:1: operand returns [int attr_type] : a= add ( COMP b= add | OPER c= add )* ;
	public final int operand() throws RecognitionException {
		int attr_type = 0;

		int operand_StartIndex = input.index();

		ParserRuleReturnScope a =null;
		ParserRuleReturnScope b =null;
		ParserRuleReturnScope c =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return attr_type; }

			// myChecker.g:156:2: (a= add ( COMP b= add | OPER c= add )* )
			// myChecker.g:156:4: a= add ( COMP b= add | OPER c= add )*
			{
			pushFollow(FOLLOW_add_in_operand642);
			a=add();
			state._fsp--;
			if (state.failed) return attr_type;
			if ( state.backtracking==0 ) { attr_type = (a!=null?((myCheckerParser.add_return)a).attr_type:0); }
			// myChecker.g:157:2: ( COMP b= add | OPER c= add )*
			loop22:
			while (true) {
				int alt22=3;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==COMP) ) {
					alt22=1;
				}
				else if ( (LA22_0==OPER) ) {
					alt22=2;
				}

				switch (alt22) {
				case 1 :
					// myChecker.g:157:4: COMP b= add
					{
					match(input,COMP,FOLLOW_COMP_in_operand649); if (state.failed) return attr_type;
					pushFollow(FOLLOW_add_in_operand656);
					b=add();
					state._fsp--;
					if (state.failed) return attr_type;
					if ( state.backtracking==0 ) { 		
							if ((a!=null?((myCheckerParser.add_return)a).attr_type:0) != (b!=null?((myCheckerParser.add_return)b).attr_type:0)) {
								  System.out.println("Type Error: " + (a!=null?(a.start):null).getLine() +
											         ": Type mismatch for the compare operator in an expr.");
							      attr_type = -2;
							}
					     }
					}
					break;
				case 2 :
					// myChecker.g:165:4: OPER c= add
					{
					match(input,OPER,FOLLOW_OPER_in_operand665); if (state.failed) return attr_type;
					pushFollow(FOLLOW_add_in_operand671);
					c=add();
					state._fsp--;
					if (state.failed) return attr_type;
					if ( state.backtracking==0 ) { 		
							if ((a!=null?((myCheckerParser.add_return)a).attr_type:0) != (c!=null?((myCheckerParser.add_return)c).attr_type:0)) {
								  System.out.println("Type Error: " + (a!=null?(a.start):null).getLine() +
											         ": Type mismatch for the assignment operator in an expr.");
							      attr_type = -2;
							}
					     }
					}
					break;

				default :
					break loop22;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 13, operand_StartIndex); }

		}
		return attr_type;
	}
	// $ANTLR end "operand"


	public static class add_return extends ParserRuleReturnScope {
		public int attr_type;
	};


	// $ANTLR start "add"
	// myChecker.g:176:1: add returns [int attr_type] : a= mult ( '+' b= mult | '-' c= mult )* ;
	public final myCheckerParser.add_return add() throws RecognitionException {
		myCheckerParser.add_return retval = new myCheckerParser.add_return();
		retval.start = input.LT(1);
		int add_StartIndex = input.index();

		ParserRuleReturnScope a =null;
		ParserRuleReturnScope b =null;
		ParserRuleReturnScope c =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return retval; }

			// myChecker.g:177:5: (a= mult ( '+' b= mult | '-' c= mult )* )
			// myChecker.g:177:7: a= mult ( '+' b= mult | '-' c= mult )*
			{
			pushFollow(FOLLOW_mult_in_add701);
			a=mult();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) { retval.attr_type = (a!=null?((myCheckerParser.mult_return)a).attr_type:0); }
			// myChecker.g:178:2: ( '+' b= mult | '-' c= mult )*
			loop23:
			while (true) {
				int alt23=3;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==31) ) {
					alt23=1;
				}
				else if ( (LA23_0==34) ) {
					alt23=2;
				}

				switch (alt23) {
				case 1 :
					// myChecker.g:178:3: '+' b= mult
					{
					match(input,31,FOLLOW_31_in_add707); if (state.failed) return retval;
					pushFollow(FOLLOW_mult_in_add713);
					b=mult();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) { 
							if ((a!=null?((myCheckerParser.mult_return)a).attr_type:0) != (b!=null?((myCheckerParser.mult_return)b).attr_type:0)) {
								  System.out.println("Type Error: " + (a!=null?(a.start):null).getLine() +
											         ": Type mismatch for the operator + in an expr.");
							      retval.attr_type = -2;
							}
					     }
					}
					break;
				case 2 :
					// myChecker.g:186:4: '-' c= mult
					{
					match(input,34,FOLLOW_34_in_add722); if (state.failed) return retval;
					pushFollow(FOLLOW_mult_in_add728);
					c=mult();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) { 
							if ((a!=null?((myCheckerParser.mult_return)a).attr_type:0) != (c!=null?((myCheckerParser.mult_return)c).attr_type:0)) {
								  System.out.println("Type Error: " + (a!=null?(a.start):null).getLine() +
											         ": Type mismatch for the operator - in an expr.");
							      retval.attr_type = -2;
							}
					     }
					}
					break;

				default :
					break loop23;
				}
			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 14, add_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "add"


	public static class mult_return extends ParserRuleReturnScope {
		public int attr_type;
	};


	// $ANTLR start "mult"
	// myChecker.g:197:1: mult returns [int attr_type] : a= prior ( ( '*' | '/' | '%' ) b= prior )* ;
	public final myCheckerParser.mult_return mult() throws RecognitionException {
		myCheckerParser.mult_return retval = new myCheckerParser.mult_return();
		retval.start = input.LT(1);
		int mult_StartIndex = input.index();

		ParserRuleReturnScope a =null;
		ParserRuleReturnScope b =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return retval; }

			// myChecker.g:198:5: (a= prior ( ( '*' | '/' | '%' ) b= prior )* )
			// myChecker.g:198:7: a= prior ( ( '*' | '/' | '%' ) b= prior )*
			{
			pushFollow(FOLLOW_prior_in_mult764);
			a=prior();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) { retval.attr_type = (a!=null?((myCheckerParser.prior_return)a).attr_type:0); }
			// myChecker.g:199:2: ( ( '*' | '/' | '%' ) b= prior )*
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==26||LA24_0==30||LA24_0==36) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// myChecker.g:199:3: ( '*' | '/' | '%' ) b= prior
					{
					if ( input.LA(1)==26||input.LA(1)==30||input.LA(1)==36 ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_prior_in_mult786);
					b=prior();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) { 
							if ((a!=null?((myCheckerParser.prior_return)a).attr_type:0) != (b!=null?((myCheckerParser.prior_return)b).attr_type:0)) {
								  System.out.println("Type Error: " + (a!=null?(a.start):null).getLine() +
											         ": Type mismatch for the mul operator( * , / ...) in an expr.");
							      retval.attr_type = -2;
							}
					     }
					}
					break;

				default :
					break loop24;
				}
			}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 15, mult_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "mult"


	public static class prior_return extends ParserRuleReturnScope {
		public int attr_type;
	};


	// $ANTLR start "prior"
	// myChecker.g:210:1: prior returns [int attr_type] : ( Id ( '++' | '--' )? | INT_NUMBER | FLOAT_NUMBER | '(' expr ')' );
	public final myCheckerParser.prior_return prior() throws RecognitionException {
		myCheckerParser.prior_return retval = new myCheckerParser.prior_return();
		retval.start = input.LT(1);
		int prior_StartIndex = input.index();

		Token Id11=null;
		ParserRuleReturnScope expr12 =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return retval; }

			// myChecker.g:211:5: ( Id ( '++' | '--' )? | INT_NUMBER | FLOAT_NUMBER | '(' expr ')' )
			int alt26=4;
			switch ( input.LA(1) ) {
			case Id:
				{
				alt26=1;
				}
				break;
			case INT_NUMBER:
				{
				alt26=2;
				}
				break;
			case FLOAT_NUMBER:
				{
				alt26=3;
				}
				break;
			case 28:
				{
				alt26=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}
			switch (alt26) {
				case 1 :
					// myChecker.g:211:7: Id ( '++' | '--' )?
					{
					Id11=(Token)match(input,Id,FOLLOW_Id_in_prior819); if (state.failed) return retval;
					// myChecker.g:211:10: ( '++' | '--' )?
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( (LA25_0==32||LA25_0==35) ) {
						alt25=1;
					}
					switch (alt25) {
						case 1 :
							// myChecker.g:
							{
							if ( input.LA(1)==32||input.LA(1)==35 ) {
								input.consume();
								state.errorRecovery=false;
								state.failed=false;
							}
							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							}
							break;

					}

					if ( state.backtracking==0 ) {
							if (symtab.containsKey((Id11!=null?Id11.getText():null))) {
						       retval.attr_type = symtab.get((Id11!=null?Id11.getText():null));
							} else {
								System.out.println("Type Error: " + Id11.getLine() + ": Undeclared Identifier " + (Id11!=null?Id11.getText():null));
								retval.attr_type = -2;
							}
						 }
					}
					break;
				case 2 :
					// myChecker.g:220:7: INT_NUMBER
					{
					match(input,INT_NUMBER,FOLLOW_INT_NUMBER_in_prior840); if (state.failed) return retval;
					if ( state.backtracking==0 ) { retval.attr_type = 1; }
					}
					break;
				case 3 :
					// myChecker.g:221:7: FLOAT_NUMBER
					{
					match(input,FLOAT_NUMBER,FOLLOW_FLOAT_NUMBER_in_prior850); if (state.failed) return retval;
					if ( state.backtracking==0 ) { retval.attr_type = 2; }
					}
					break;
				case 4 :
					// myChecker.g:222:7: '(' expr ')'
					{
					match(input,28,FOLLOW_28_in_prior860); if (state.failed) return retval;
					pushFollow(FOLLOW_expr_in_prior862);
					expr12=expr();
					state._fsp--;
					if (state.failed) return retval;
					match(input,29,FOLLOW_29_in_prior864); if (state.failed) return retval;
					if ( state.backtracking==0 ) { retval.attr_type = (expr12!=null?((myCheckerParser.expr_return)expr12).attr_type:0); }
					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 16, prior_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "prior"

	// $ANTLR start synpred13_myChecker
	public final void synpred13_myChecker_fragment() throws RecognitionException {
		Token a=null;
		Token c=null;
		ParserRuleReturnScope b =null;
		ParserRuleReturnScope d =null;

		// myChecker.g:40:7: ( type_num a= Id ( '=' b= expr )? ( ',' c= Id ( '=' d= expr )? )* ';' )
		// myChecker.g:40:7: type_num a= Id ( '=' b= expr )? ( ',' c= Id ( '=' d= expr )? )* ';'
		{
		pushFollow(FOLLOW_type_num_in_synpred13_myChecker242);
		type_num();
		state._fsp--;
		if (state.failed) return;
		a=(Token)match(input,Id,FOLLOW_Id_in_synpred13_myChecker248); if (state.failed) return;
		// myChecker.g:40:23: ( '=' b= expr )?
		int alt28=2;
		int LA28_0 = input.LA(1);
		if ( (LA28_0==38) ) {
			alt28=1;
		}
		switch (alt28) {
			case 1 :
				// myChecker.g:40:24: '=' b= expr
				{
				match(input,38,FOLLOW_38_in_synpred13_myChecker251); if (state.failed) return;
				pushFollow(FOLLOW_expr_in_synpred13_myChecker257);
				b=expr();
				state._fsp--;
				if (state.failed) return;
				}
				break;

		}

		// myChecker.g:40:39: ( ',' c= Id ( '=' d= expr )? )*
		loop30:
		while (true) {
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==33) ) {
				alt30=1;
			}

			switch (alt30) {
			case 1 :
				// myChecker.g:40:40: ',' c= Id ( '=' d= expr )?
				{
				match(input,33,FOLLOW_33_in_synpred13_myChecker262); if (state.failed) return;
				c=(Token)match(input,Id,FOLLOW_Id_in_synpred13_myChecker268); if (state.failed) return;
				// myChecker.g:40:51: ( '=' d= expr )?
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( (LA29_0==38) ) {
					alt29=1;
				}
				switch (alt29) {
					case 1 :
						// myChecker.g:40:52: '=' d= expr
						{
						match(input,38,FOLLOW_38_in_synpred13_myChecker271); if (state.failed) return;
						pushFollow(FOLLOW_expr_in_synpred13_myChecker277);
						d=expr();
						state._fsp--;
						if (state.failed) return;
						}
						break;

				}

				}
				break;

			default :
				break loop30;
			}
		}

		match(input,37,FOLLOW_37_in_synpred13_myChecker284); if (state.failed) return;
		}

	}
	// $ANTLR end synpred13_myChecker

	// $ANTLR start synpred17_myChecker
	public final void synpred17_myChecker_fragment() throws RecognitionException {
		Token a=null;
		Token c=null;

		// myChecker.g:67:3: ( type_char a= Id ( '=' '\\'' ( . ) '\\'' )? ( ',' c= Id ( '=' '\\'' ( . ) '\\'' )? )* ';' )
		// myChecker.g:67:3: type_char a= Id ( '=' '\\'' ( . ) '\\'' )? ( ',' c= Id ( '=' '\\'' ( . ) '\\'' )? )* ';'
		{
		pushFollow(FOLLOW_type_char_in_synpred17_myChecker293);
		type_char();
		state._fsp--;
		if (state.failed) return;
		a=(Token)match(input,Id,FOLLOW_Id_in_synpred17_myChecker299); if (state.failed) return;
		// myChecker.g:67:20: ( '=' '\\'' ( . ) '\\'' )?
		int alt32=2;
		int LA32_0 = input.LA(1);
		if ( (LA32_0==38) ) {
			alt32=1;
		}
		switch (alt32) {
			case 1 :
				// myChecker.g:67:21: '=' '\\'' ( . ) '\\''
				{
				match(input,38,FOLLOW_38_in_synpred17_myChecker302); if (state.failed) return;
				match(input,39,FOLLOW_39_in_synpred17_myChecker304); if (state.failed) return;
				// myChecker.g:67:29: ( . )
				// myChecker.g:67:30: .
				{
				matchAny(input); if (state.failed) return;
				}

				match(input,39,FOLLOW_39_in_synpred17_myChecker308); if (state.failed) return;
				}
				break;

		}

		// myChecker.g:67:39: ( ',' c= Id ( '=' '\\'' ( . ) '\\'' )? )*
		loop34:
		while (true) {
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==33) ) {
				alt34=1;
			}

			switch (alt34) {
			case 1 :
				// myChecker.g:67:40: ',' c= Id ( '=' '\\'' ( . ) '\\'' )?
				{
				match(input,33,FOLLOW_33_in_synpred17_myChecker313); if (state.failed) return;
				c=(Token)match(input,Id,FOLLOW_Id_in_synpred17_myChecker319); if (state.failed) return;
				// myChecker.g:67:51: ( '=' '\\'' ( . ) '\\'' )?
				int alt33=2;
				int LA33_0 = input.LA(1);
				if ( (LA33_0==38) ) {
					alt33=1;
				}
				switch (alt33) {
					case 1 :
						// myChecker.g:67:52: '=' '\\'' ( . ) '\\''
						{
						match(input,38,FOLLOW_38_in_synpred17_myChecker322); if (state.failed) return;
						match(input,39,FOLLOW_39_in_synpred17_myChecker324); if (state.failed) return;
						// myChecker.g:67:60: ( . )
						// myChecker.g:67:61: .
						{
						matchAny(input); if (state.failed) return;
						}

						match(input,39,FOLLOW_39_in_synpred17_myChecker328); if (state.failed) return;
						}
						break;

				}

				}
				break;

			default :
				break loop34;
			}
		}

		match(input,37,FOLLOW_37_in_synpred17_myChecker335); if (state.failed) return;
		}

	}
	// $ANTLR end synpred17_myChecker

	// $ANTLR start synpred19_myChecker
	public final void synpred19_myChecker_fragment() throws RecognitionException {
		// myChecker.g:83:7: ( type_num Id Arr '=' '{' ( INT_NUMBER | FLOAT_NUMBER ) '}' ';' )
		// myChecker.g:83:7: type_num Id Arr '=' '{' ( INT_NUMBER | FLOAT_NUMBER ) '}' ';'
		{
		pushFollow(FOLLOW_type_num_in_synpred19_myChecker350);
		type_num();
		state._fsp--;
		if (state.failed) return;
		match(input,Id,FOLLOW_Id_in_synpred19_myChecker352); if (state.failed) return;
		match(input,Arr,FOLLOW_Arr_in_synpred19_myChecker354); if (state.failed) return;
		match(input,38,FOLLOW_38_in_synpred19_myChecker356); if (state.failed) return;
		match(input,45,FOLLOW_45_in_synpred19_myChecker358); if (state.failed) return;
		if ( input.LA(1)==FLOAT_NUMBER||input.LA(1)==INT_NUMBER ) {
			input.consume();
			state.errorRecovery=false;
			state.failed=false;
		}
		else {
			if (state.backtracking>0) {state.failed=true; return;}
			MismatchedSetException mse = new MismatchedSetException(null,input);
			throw mse;
		}
		match(input,47,FOLLOW_47_in_synpred19_myChecker368); if (state.failed) return;
		match(input,37,FOLLOW_37_in_synpred19_myChecker370); if (state.failed) return;
		}

	}
	// $ANTLR end synpred19_myChecker

	// $ANTLR start synpred24_myChecker
	public final void synpred24_myChecker_fragment() throws RecognitionException {
		// myChecker.g:143:4: ( 'else if(' expr ')' ( stat | ( '{' stats '}' ) ) )
		// myChecker.g:143:4: 'else if(' expr ')' ( stat | ( '{' stats '}' ) )
		{
		match(input,40,FOLLOW_40_in_synpred24_myChecker520); if (state.failed) return;
		pushFollow(FOLLOW_expr_in_synpred24_myChecker522);
		expr();
		state._fsp--;
		if (state.failed) return;
		match(input,29,FOLLOW_29_in_synpred24_myChecker524); if (state.failed) return;
		// myChecker.g:144:3: ( stat | ( '{' stats '}' ) )
		int alt35=2;
		int LA35_0 = input.LA(1);
		if ( (LA35_0==CHAR||(LA35_0 >= FLOAT && LA35_0 <= FLOAT_NUMBER)||(LA35_0 >= INT && LA35_0 <= Id)||LA35_0==28||(LA35_0 >= 42 && LA35_0 <= 44)) ) {
			alt35=1;
		}
		else if ( (LA35_0==45) ) {
			alt35=2;
		}

		else {
			if (state.backtracking>0) {state.failed=true; return;}
			NoViableAltException nvae =
				new NoViableAltException("", 35, 0, input);
			throw nvae;
		}

		switch (alt35) {
			case 1 :
				// myChecker.g:144:4: stat
				{
				pushFollow(FOLLOW_stat_in_synpred24_myChecker529);
				stat();
				state._fsp--;
				if (state.failed) return;
				}
				break;
			case 2 :
				// myChecker.g:144:11: ( '{' stats '}' )
				{
				// myChecker.g:144:11: ( '{' stats '}' )
				// myChecker.g:144:12: '{' stats '}'
				{
				match(input,45,FOLLOW_45_in_synpred24_myChecker534); if (state.failed) return;
				pushFollow(FOLLOW_stats_in_synpred24_myChecker536);
				stats();
				state._fsp--;
				if (state.failed) return;
				match(input,47,FOLLOW_47_in_synpred24_myChecker538); if (state.failed) return;
				}

				}
				break;

		}

		}

	}
	// $ANTLR end synpred24_myChecker

	// $ANTLR start synpred27_myChecker
	public final void synpred27_myChecker_fragment() throws RecognitionException {
		// myChecker.g:145:4: ( 'else' ( WS )* ( stat | ( '{' stats '}' ) ) )
		// myChecker.g:145:4: 'else' ( WS )* ( stat | ( '{' stats '}' ) )
		{
		match(input,41,FOLLOW_41_in_synpred27_myChecker547); if (state.failed) return;
		// myChecker.g:145:10: ( WS )*
		loop36:
		while (true) {
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==WS) ) {
				alt36=1;
			}

			switch (alt36) {
			case 1 :
				// myChecker.g:145:10: WS
				{
				match(input,WS,FOLLOW_WS_in_synpred27_myChecker548); if (state.failed) return;
				}
				break;

			default :
				break loop36;
			}
		}

		// myChecker.g:146:3: ( stat | ( '{' stats '}' ) )
		int alt37=2;
		int LA37_0 = input.LA(1);
		if ( (LA37_0==CHAR||(LA37_0 >= FLOAT && LA37_0 <= FLOAT_NUMBER)||(LA37_0 >= INT && LA37_0 <= Id)||LA37_0==28||(LA37_0 >= 42 && LA37_0 <= 44)) ) {
			alt37=1;
		}
		else if ( (LA37_0==45) ) {
			alt37=2;
		}

		else {
			if (state.backtracking>0) {state.failed=true; return;}
			NoViableAltException nvae =
				new NoViableAltException("", 37, 0, input);
			throw nvae;
		}

		switch (alt37) {
			case 1 :
				// myChecker.g:146:4: stat
				{
				pushFollow(FOLLOW_stat_in_synpred27_myChecker554);
				stat();
				state._fsp--;
				if (state.failed) return;
				}
				break;
			case 2 :
				// myChecker.g:146:11: ( '{' stats '}' )
				{
				// myChecker.g:146:11: ( '{' stats '}' )
				// myChecker.g:146:12: '{' stats '}'
				{
				match(input,45,FOLLOW_45_in_synpred27_myChecker559); if (state.failed) return;
				pushFollow(FOLLOW_stats_in_synpred27_myChecker561);
				stats();
				state._fsp--;
				if (state.failed) return;
				match(input,47,FOLLOW_47_in_synpred27_myChecker563); if (state.failed) return;
				}

				}
				break;

		}

		}

	}
	// $ANTLR end synpred27_myChecker

	// Delegated rules

	public final boolean synpred17_myChecker() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred17_myChecker_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred19_myChecker() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred19_myChecker_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred13_myChecker() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred13_myChecker_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred24_myChecker() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred24_myChecker_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred27_myChecker() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred27_myChecker_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_LINE_COMMAND_in_program77 = new BitSet(new long[]{0x0000000000822400L});
	public static final BitSet FOLLOW_type_num_in_program90 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_type_void_in_program94 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_MAIN_in_program96 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_program98 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_program100 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_45_in_program102 = new BitSet(new long[]{0x00009C001000EC20L});
	public static final BitSet FOLLOW_stats_in_program104 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_program106 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stat_in_stats127 = new BitSet(new long[]{0x00001C001000EC22L});
	public static final BitSet FOLLOW_declarations_in_stat141 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_assignment_in_stat144 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whilestat_in_stat147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifstat_in_stat150 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_returnstat_in_stat153 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_stat156 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_stat158 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_type_num173 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_type_num184 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_type_char207 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_in_type_void224 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_num_in_declarations242 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Id_in_declarations248 = new BitSet(new long[]{0x0000006200000000L});
	public static final BitSet FOLLOW_38_in_declarations251 = new BitSet(new long[]{0x000000001000C800L});
	public static final BitSet FOLLOW_expr_in_declarations257 = new BitSet(new long[]{0x0000002200000000L});
	public static final BitSet FOLLOW_33_in_declarations262 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Id_in_declarations268 = new BitSet(new long[]{0x0000006200000000L});
	public static final BitSet FOLLOW_38_in_declarations271 = new BitSet(new long[]{0x000000001000C800L});
	public static final BitSet FOLLOW_expr_in_declarations277 = new BitSet(new long[]{0x0000002200000000L});
	public static final BitSet FOLLOW_37_in_declarations284 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_char_in_declarations293 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Id_in_declarations299 = new BitSet(new long[]{0x0000006200000000L});
	public static final BitSet FOLLOW_38_in_declarations302 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_declarations304 = new BitSet(new long[]{0x0000FFFFFFFFFFF0L});
	public static final BitSet FOLLOW_39_in_declarations308 = new BitSet(new long[]{0x0000002200000000L});
	public static final BitSet FOLLOW_33_in_declarations313 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Id_in_declarations319 = new BitSet(new long[]{0x0000006200000000L});
	public static final BitSet FOLLOW_38_in_declarations322 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_declarations324 = new BitSet(new long[]{0x0000FFFFFFFFFFF0L});
	public static final BitSet FOLLOW_39_in_declarations328 = new BitSet(new long[]{0x0000002200000000L});
	public static final BitSet FOLLOW_37_in_declarations335 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_num_in_declarations350 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Id_in_declarations352 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_Arr_in_declarations354 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_declarations356 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_45_in_declarations358 = new BitSet(new long[]{0x0000000000004800L});
	public static final BitSet FOLLOW_set_in_declarations360 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_declarations368 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_declarations370 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_num_in_declarations381 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_type_char_in_declarations385 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Id_in_declarations388 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_Arr_in_declarations390 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_declarations392 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Id_in_assignment421 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_assignment423 = new BitSet(new long[]{0x000000001000C800L});
	public static final BitSet FOLLOW_expr_in_assignment425 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_assignment427 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Id_in_assignment436 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_Arr_in_assignment438 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_assignment440 = new BitSet(new long[]{0x000000001000C800L});
	public static final BitSet FOLLOW_expr_in_assignment442 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_assignment444 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_whilestat460 = new BitSet(new long[]{0x000000001000C800L});
	public static final BitSet FOLLOW_expr_in_whilestat462 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_whilestat464 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_45_in_whilestat466 = new BitSet(new long[]{0x00009C001000EC20L});
	public static final BitSet FOLLOW_stats_in_whilestat468 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_whilestat470 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_ifstat495 = new BitSet(new long[]{0x000000001000C800L});
	public static final BitSet FOLLOW_expr_in_ifstat497 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_ifstat499 = new BitSet(new long[]{0x00003C001000EC20L});
	public static final BitSet FOLLOW_stat_in_ifstat504 = new BitSet(new long[]{0x0000030000000002L});
	public static final BitSet FOLLOW_45_in_ifstat509 = new BitSet(new long[]{0x00009C001000EC20L});
	public static final BitSet FOLLOW_stats_in_ifstat511 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_ifstat513 = new BitSet(new long[]{0x0000030000000002L});
	public static final BitSet FOLLOW_40_in_ifstat520 = new BitSet(new long[]{0x000000001000C800L});
	public static final BitSet FOLLOW_expr_in_ifstat522 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_ifstat524 = new BitSet(new long[]{0x00003C001000EC20L});
	public static final BitSet FOLLOW_stat_in_ifstat529 = new BitSet(new long[]{0x0000030000000002L});
	public static final BitSet FOLLOW_45_in_ifstat534 = new BitSet(new long[]{0x00009C001000EC20L});
	public static final BitSet FOLLOW_stats_in_ifstat536 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_ifstat538 = new BitSet(new long[]{0x0000030000000002L});
	public static final BitSet FOLLOW_41_in_ifstat547 = new BitSet(new long[]{0x00003C001200EC20L});
	public static final BitSet FOLLOW_WS_in_ifstat548 = new BitSet(new long[]{0x00003C001200EC20L});
	public static final BitSet FOLLOW_stat_in_ifstat554 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_ifstat559 = new BitSet(new long[]{0x00009C001000EC20L});
	public static final BitSet FOLLOW_stats_in_ifstat561 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_ifstat563 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_43_in_returnstat575 = new BitSet(new long[]{0x000000001000C800L});
	public static final BitSet FOLLOW_expr_in_returnstat577 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_returnstat579 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_operand_in_expr596 = new BitSet(new long[]{0x0000400008000002L});
	public static final BitSet FOLLOW_set_in_expr602 = new BitSet(new long[]{0x000000001000C800L});
	public static final BitSet FOLLOW_operand_in_expr614 = new BitSet(new long[]{0x0000400008000002L});
	public static final BitSet FOLLOW_add_in_operand642 = new BitSet(new long[]{0x0000000000100102L});
	public static final BitSet FOLLOW_COMP_in_operand649 = new BitSet(new long[]{0x000000001000C800L});
	public static final BitSet FOLLOW_add_in_operand656 = new BitSet(new long[]{0x0000000000100102L});
	public static final BitSet FOLLOW_OPER_in_operand665 = new BitSet(new long[]{0x000000001000C800L});
	public static final BitSet FOLLOW_add_in_operand671 = new BitSet(new long[]{0x0000000000100102L});
	public static final BitSet FOLLOW_mult_in_add701 = new BitSet(new long[]{0x0000000480000002L});
	public static final BitSet FOLLOW_31_in_add707 = new BitSet(new long[]{0x000000001000C800L});
	public static final BitSet FOLLOW_mult_in_add713 = new BitSet(new long[]{0x0000000480000002L});
	public static final BitSet FOLLOW_34_in_add722 = new BitSet(new long[]{0x000000001000C800L});
	public static final BitSet FOLLOW_mult_in_add728 = new BitSet(new long[]{0x0000000480000002L});
	public static final BitSet FOLLOW_prior_in_mult764 = new BitSet(new long[]{0x0000001044000002L});
	public static final BitSet FOLLOW_set_in_mult770 = new BitSet(new long[]{0x000000001000C800L});
	public static final BitSet FOLLOW_prior_in_mult786 = new BitSet(new long[]{0x0000001044000002L});
	public static final BitSet FOLLOW_Id_in_prior819 = new BitSet(new long[]{0x0000000900000002L});
	public static final BitSet FOLLOW_INT_NUMBER_in_prior840 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_NUMBER_in_prior850 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_prior860 = new BitSet(new long[]{0x000000001000C800L});
	public static final BitSet FOLLOW_expr_in_prior862 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_prior864 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_num_in_synpred13_myChecker242 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Id_in_synpred13_myChecker248 = new BitSet(new long[]{0x0000006200000000L});
	public static final BitSet FOLLOW_38_in_synpred13_myChecker251 = new BitSet(new long[]{0x000000001000C800L});
	public static final BitSet FOLLOW_expr_in_synpred13_myChecker257 = new BitSet(new long[]{0x0000002200000000L});
	public static final BitSet FOLLOW_33_in_synpred13_myChecker262 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Id_in_synpred13_myChecker268 = new BitSet(new long[]{0x0000006200000000L});
	public static final BitSet FOLLOW_38_in_synpred13_myChecker271 = new BitSet(new long[]{0x000000001000C800L});
	public static final BitSet FOLLOW_expr_in_synpred13_myChecker277 = new BitSet(new long[]{0x0000002200000000L});
	public static final BitSet FOLLOW_37_in_synpred13_myChecker284 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_char_in_synpred17_myChecker293 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Id_in_synpred17_myChecker299 = new BitSet(new long[]{0x0000006200000000L});
	public static final BitSet FOLLOW_38_in_synpred17_myChecker302 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_synpred17_myChecker304 = new BitSet(new long[]{0x0000FFFFFFFFFFF0L});
	public static final BitSet FOLLOW_39_in_synpred17_myChecker308 = new BitSet(new long[]{0x0000002200000000L});
	public static final BitSet FOLLOW_33_in_synpred17_myChecker313 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Id_in_synpred17_myChecker319 = new BitSet(new long[]{0x0000006200000000L});
	public static final BitSet FOLLOW_38_in_synpred17_myChecker322 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_synpred17_myChecker324 = new BitSet(new long[]{0x0000FFFFFFFFFFF0L});
	public static final BitSet FOLLOW_39_in_synpred17_myChecker328 = new BitSet(new long[]{0x0000002200000000L});
	public static final BitSet FOLLOW_37_in_synpred17_myChecker335 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_num_in_synpred19_myChecker350 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_Id_in_synpred19_myChecker352 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_Arr_in_synpred19_myChecker354 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_synpred19_myChecker356 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_45_in_synpred19_myChecker358 = new BitSet(new long[]{0x0000000000004800L});
	public static final BitSet FOLLOW_set_in_synpred19_myChecker360 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_synpred19_myChecker368 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_37_in_synpred19_myChecker370 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_synpred24_myChecker520 = new BitSet(new long[]{0x000000001000C800L});
	public static final BitSet FOLLOW_expr_in_synpred24_myChecker522 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_synpred24_myChecker524 = new BitSet(new long[]{0x00003C001000EC20L});
	public static final BitSet FOLLOW_stat_in_synpred24_myChecker529 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_synpred24_myChecker534 = new BitSet(new long[]{0x00009C001000EC20L});
	public static final BitSet FOLLOW_stats_in_synpred24_myChecker536 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_synpred24_myChecker538 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_synpred27_myChecker547 = new BitSet(new long[]{0x00003C001200EC20L});
	public static final BitSet FOLLOW_WS_in_synpred27_myChecker548 = new BitSet(new long[]{0x00003C001200EC20L});
	public static final BitSet FOLLOW_stat_in_synpred27_myChecker554 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_45_in_synpred27_myChecker559 = new BitSet(new long[]{0x00009C001000EC20L});
	public static final BitSet FOLLOW_stats_in_synpred27_myChecker561 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_synpred27_myChecker563 = new BitSet(new long[]{0x0000000000000002L});
}
