// $ANTLR 3.5.2 myparser.g 2017-05-12 20:43:21

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class myparserParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARRAY", "COMMENT1", "COMMENT2", 
		"DIGIT", "ID", "LETTER", "LINE_COMMAND", "Number", "WS", "'!='", "'%'", 
		"'%='", "'&&'", "'('", "')'", "'*'", "'*='", "'+'", "'+='", "','", "'-'", 
		"'-='", "'/'", "'/='", "';'", "'<'", "'<='", "'='", "'=='", "'>'", "'>='", 
		"'char'", "'double'", "'else if('", "'else'", "'float'", "'for('", "'if('", 
		"'int'", "'main()'", "'return'", "'void'", "'while('", "'{'", "'||'", 
		"'}'"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public myparserParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public myparserParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
		this.state.ruleMemo = new HashMap[83+1];


	}

	@Override public String[] getTokenNames() { return myparserParser.tokenNames; }
	@Override public String getGrammarFileName() { return "myparser.g"; }



	// $ANTLR start "parse"
	// myparser.g:7:1: parse : ( function )* type 'main()' ( WS )* '{' ( stat )* '}' ( function )* ;
	public final void parse() throws RecognitionException {
		int parse_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return; }

			// myparser.g:8:2: ( ( function )* type 'main()' ( WS )* '{' ( stat )* '}' ( function )* )
			// myparser.g:8:4: ( function )* type 'main()' ( WS )* '{' ( stat )* '}' ( function )*
			{
			// myparser.g:8:4: ( function )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= 35 && LA1_0 <= 36)||LA1_0==39||LA1_0==42||LA1_0==45) ) {
					int LA1_1 = input.LA(2);
					if ( (LA1_1==ID) ) {
						alt1=1;
					}

				}

				switch (alt1) {
				case 1 :
					// myparser.g:8:4: function
					{
					pushFollow(FOLLOW_function_in_parse41);
					function();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop1;
				}
			}

			pushFollow(FOLLOW_type_in_parse46);
			type();
			state._fsp--;
			if (state.failed) return;
			match(input,43,FOLLOW_43_in_parse48); if (state.failed) return;
			// myparser.g:9:16: ( WS )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==WS) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// myparser.g:9:16: WS
					{
					match(input,WS,FOLLOW_WS_in_parse49); if (state.failed) return;
					}
					break;

				default :
					break loop2;
				}
			}

			match(input,47,FOLLOW_47_in_parse54); if (state.failed) return;
			// myparser.g:11:3: ( stat )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==ARRAY||LA3_0==ID||LA3_0==Number||LA3_0==17||(LA3_0 >= 35 && LA3_0 <= 36)||(LA3_0 >= 39 && LA3_0 <= 42)||(LA3_0 >= 44 && LA3_0 <= 46)) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// myparser.g:11:3: stat
					{
					pushFollow(FOLLOW_stat_in_parse58);
					stat();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop3;
				}
			}

			match(input,49,FOLLOW_49_in_parse63); if (state.failed) return;
			// myparser.g:13:3: ( function )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= 35 && LA4_0 <= 36)||LA4_0==39||LA4_0==42||LA4_0==45) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// myparser.g:13:3: function
					{
					pushFollow(FOLLOW_function_in_parse67);
					function();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop4;
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
			if ( state.backtracking>0 ) { memoize(input, 1, parse_StartIndex); }

		}
	}
	// $ANTLR end "parse"



	// $ANTLR start "type"
	// myparser.g:16:1: type : ( 'int' | 'void' | 'double' | 'float' | 'char' );
	public final void type() throws RecognitionException {
		int type_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return; }

			// myparser.g:17:2: ( 'int' | 'void' | 'double' | 'float' | 'char' )
			// myparser.g:
			{
			if ( (input.LA(1) >= 35 && input.LA(1) <= 36)||input.LA(1)==39||input.LA(1)==42||input.LA(1)==45 ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 2, type_StartIndex); }

		}
	}
	// $ANTLR end "type"



	// $ANTLR start "stat"
	// myparser.g:24:1: stat : ( assignstat | exprList | ifstat | forstat | whilestat | procedstat | declstat | retstat );
	public final void stat() throws RecognitionException {
		int stat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return; }

			// myparser.g:25:2: ( assignstat | exprList | ifstat | forstat | whilestat | procedstat | declstat | retstat )
			int alt5=8;
			switch ( input.LA(1) ) {
			case ID:
				{
				switch ( input.LA(2) ) {
				case 31:
					{
					int LA5_10 = input.LA(3);
					if ( (synpred9_myparser()) ) {
						alt5=1;
					}
					else if ( (synpred10_myparser()) ) {
						alt5=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 5, 10, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case 17:
					{
					alt5=6;
					}
					break;
				case 13:
				case 14:
				case 15:
				case 16:
				case 19:
				case 20:
				case 21:
				case 22:
				case 23:
				case 24:
				case 25:
				case 26:
				case 27:
				case 28:
				case 29:
				case 30:
				case 32:
				case 33:
				case 34:
				case 48:
					{
					alt5=2;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 5, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case ARRAY:
			case Number:
			case 17:
				{
				alt5=2;
				}
				break;
			case 41:
				{
				alt5=3;
				}
				break;
			case 40:
				{
				alt5=4;
				}
				break;
			case 46:
				{
				alt5=5;
				}
				break;
			case 35:
			case 36:
			case 39:
			case 42:
			case 45:
				{
				alt5=7;
				}
				break;
			case 44:
				{
				alt5=8;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// myparser.g:25:4: assignstat
					{
					pushFollow(FOLLOW_assignstat_in_stat110);
					assignstat();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// myparser.g:26:4: exprList
					{
					pushFollow(FOLLOW_exprList_in_stat115);
					exprList();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 3 :
					// myparser.g:27:4: ifstat
					{
					pushFollow(FOLLOW_ifstat_in_stat121);
					ifstat();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 4 :
					// myparser.g:28:4: forstat
					{
					pushFollow(FOLLOW_forstat_in_stat126);
					forstat();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 5 :
					// myparser.g:29:4: whilestat
					{
					pushFollow(FOLLOW_whilestat_in_stat131);
					whilestat();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 6 :
					// myparser.g:30:4: procedstat
					{
					pushFollow(FOLLOW_procedstat_in_stat136);
					procedstat();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 7 :
					// myparser.g:31:4: declstat
					{
					pushFollow(FOLLOW_declstat_in_stat141);
					declstat();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 8 :
					// myparser.g:32:4: retstat
					{
					pushFollow(FOLLOW_retstat_in_stat146);
					retstat();
					state._fsp--;
					if (state.failed) return;
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



	// $ANTLR start "assignstat"
	// myparser.g:35:1: assignstat : ( ID '=' expr ';' | ID '=' procedstat );
	public final void assignstat() throws RecognitionException {
		int assignstat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return; }

			// myparser.g:36:2: ( ID '=' expr ';' | ID '=' procedstat )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==ID) ) {
				int LA6_1 = input.LA(2);
				if ( (LA6_1==31) ) {
					int LA6_2 = input.LA(3);
					if ( (synpred16_myparser()) ) {
						alt6=1;
					}
					else if ( (true) ) {
						alt6=2;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// myparser.g:36:4: ID '=' expr ';'
					{
					match(input,ID,FOLLOW_ID_in_assignstat157); if (state.failed) return;
					match(input,31,FOLLOW_31_in_assignstat159); if (state.failed) return;
					pushFollow(FOLLOW_expr_in_assignstat161);
					expr();
					state._fsp--;
					if (state.failed) return;
					match(input,28,FOLLOW_28_in_assignstat163); if (state.failed) return;
					}
					break;
				case 2 :
					// myparser.g:37:4: ID '=' procedstat
					{
					match(input,ID,FOLLOW_ID_in_assignstat168); if (state.failed) return;
					match(input,31,FOLLOW_31_in_assignstat170); if (state.failed) return;
					pushFollow(FOLLOW_procedstat_in_assignstat172);
					procedstat();
					state._fsp--;
					if (state.failed) return;
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
			if ( state.backtracking>0 ) { memoize(input, 4, assignstat_StartIndex); }

		}
	}
	// $ANTLR end "assignstat"



	// $ANTLR start "exprList"
	// myparser.g:40:1: exprList : expr ( ',' expr )* ';' ;
	public final void exprList() throws RecognitionException {
		int exprList_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return; }

			// myparser.g:41:2: ( expr ( ',' expr )* ';' )
			// myparser.g:41:4: expr ( ',' expr )* ';'
			{
			pushFollow(FOLLOW_expr_in_exprList184);
			expr();
			state._fsp--;
			if (state.failed) return;
			// myparser.g:41:9: ( ',' expr )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==23) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// myparser.g:41:10: ',' expr
					{
					match(input,23,FOLLOW_23_in_exprList187); if (state.failed) return;
					pushFollow(FOLLOW_expr_in_exprList189);
					expr();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop7;
				}
			}

			match(input,28,FOLLOW_28_in_exprList193); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 5, exprList_StartIndex); }

		}
	}
	// $ANTLR end "exprList"



	// $ANTLR start "procedstat"
	// myparser.g:44:1: procedstat : ID '(' ( trparam )? ')' ';' ;
	public final void procedstat() throws RecognitionException {
		int procedstat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return; }

			// myparser.g:45:2: ( ID '(' ( trparam )? ')' ';' )
			// myparser.g:45:4: ID '(' ( trparam )? ')' ';'
			{
			match(input,ID,FOLLOW_ID_in_procedstat204); if (state.failed) return;
			match(input,17,FOLLOW_17_in_procedstat206); if (state.failed) return;
			// myparser.g:45:11: ( trparam )?
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==ARRAY||LA8_0==ID||LA8_0==Number||LA8_0==17) ) {
				alt8=1;
			}
			switch (alt8) {
				case 1 :
					// myparser.g:45:11: trparam
					{
					pushFollow(FOLLOW_trparam_in_procedstat208);
					trparam();
					state._fsp--;
					if (state.failed) return;
					}
					break;

			}

			match(input,18,FOLLOW_18_in_procedstat211); if (state.failed) return;
			match(input,28,FOLLOW_28_in_procedstat213); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 6, procedstat_StartIndex); }

		}
	}
	// $ANTLR end "procedstat"



	// $ANTLR start "trparam"
	// myparser.g:48:1: trparam : expr ( ',' expr )* ;
	public final void trparam() throws RecognitionException {
		int trparam_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return; }

			// myparser.g:49:2: ( expr ( ',' expr )* )
			// myparser.g:49:4: expr ( ',' expr )*
			{
			pushFollow(FOLLOW_expr_in_trparam225);
			expr();
			state._fsp--;
			if (state.failed) return;
			// myparser.g:49:9: ( ',' expr )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==23) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// myparser.g:49:10: ',' expr
					{
					match(input,23,FOLLOW_23_in_trparam228); if (state.failed) return;
					pushFollow(FOLLOW_expr_in_trparam230);
					expr();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop9;
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
			if ( state.backtracking>0 ) { memoize(input, 7, trparam_StartIndex); }

		}
	}
	// $ANTLR end "trparam"



	// $ANTLR start "forstat"
	// myparser.g:52:1: forstat : ( 'for(' ( expr )+ ';' ( expr )* ';' ( expr )+ ')' '{' ( stat )* '}' | 'for(' ( expr )+ ';' ( expr )* ';' ( expr )+ ')' ( ';' )? );
	public final void forstat() throws RecognitionException {
		int forstat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return; }

			// myparser.g:53:2: ( 'for(' ( expr )+ ';' ( expr )* ';' ( expr )+ ')' '{' ( stat )* '}' | 'for(' ( expr )+ ';' ( expr )* ';' ( expr )+ ')' ( ';' )? )
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==40) ) {
				switch ( input.LA(2) ) {
				case Number:
					{
					int LA18_2 = input.LA(3);
					if ( (synpred24_myparser()) ) {
						alt18=1;
					}
					else if ( (true) ) {
						alt18=2;
					}

					}
					break;
				case 17:
					{
					int LA18_3 = input.LA(3);
					if ( (synpred24_myparser()) ) {
						alt18=1;
					}
					else if ( (true) ) {
						alt18=2;
					}

					}
					break;
				case ID:
					{
					int LA18_4 = input.LA(3);
					if ( (synpred24_myparser()) ) {
						alt18=1;
					}
					else if ( (true) ) {
						alt18=2;
					}

					}
					break;
				case ARRAY:
					{
					int LA18_5 = input.LA(3);
					if ( (synpred24_myparser()) ) {
						alt18=1;
					}
					else if ( (true) ) {
						alt18=2;
					}

					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 18, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// myparser.g:53:4: 'for(' ( expr )+ ';' ( expr )* ';' ( expr )+ ')' '{' ( stat )* '}'
					{
					match(input,40,FOLLOW_40_in_forstat243); if (state.failed) return;
					// myparser.g:53:11: ( expr )+
					int cnt10=0;
					loop10:
					while (true) {
						int alt10=2;
						int LA10_0 = input.LA(1);
						if ( (LA10_0==ARRAY||LA10_0==ID||LA10_0==Number||LA10_0==17) ) {
							alt10=1;
						}

						switch (alt10) {
						case 1 :
							// myparser.g:53:11: expr
							{
							pushFollow(FOLLOW_expr_in_forstat245);
							expr();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							if ( cnt10 >= 1 ) break loop10;
							if (state.backtracking>0) {state.failed=true; return;}
							EarlyExitException eee = new EarlyExitException(10, input);
							throw eee;
						}
						cnt10++;
					}

					match(input,28,FOLLOW_28_in_forstat248); if (state.failed) return;
					// myparser.g:53:21: ( expr )*
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( (LA11_0==ARRAY||LA11_0==ID||LA11_0==Number||LA11_0==17) ) {
							alt11=1;
						}

						switch (alt11) {
						case 1 :
							// myparser.g:53:21: expr
							{
							pushFollow(FOLLOW_expr_in_forstat250);
							expr();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop11;
						}
					}

					match(input,28,FOLLOW_28_in_forstat253); if (state.failed) return;
					// myparser.g:53:31: ( expr )+
					int cnt12=0;
					loop12:
					while (true) {
						int alt12=2;
						int LA12_0 = input.LA(1);
						if ( (LA12_0==ARRAY||LA12_0==ID||LA12_0==Number||LA12_0==17) ) {
							alt12=1;
						}

						switch (alt12) {
						case 1 :
							// myparser.g:53:31: expr
							{
							pushFollow(FOLLOW_expr_in_forstat255);
							expr();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							if ( cnt12 >= 1 ) break loop12;
							if (state.backtracking>0) {state.failed=true; return;}
							EarlyExitException eee = new EarlyExitException(12, input);
							throw eee;
						}
						cnt12++;
					}

					match(input,18,FOLLOW_18_in_forstat258); if (state.failed) return;
					match(input,47,FOLLOW_47_in_forstat262); if (state.failed) return;
					// myparser.g:54:7: ( stat )*
					loop13:
					while (true) {
						int alt13=2;
						int LA13_0 = input.LA(1);
						if ( (LA13_0==ARRAY||LA13_0==ID||LA13_0==Number||LA13_0==17||(LA13_0 >= 35 && LA13_0 <= 36)||(LA13_0 >= 39 && LA13_0 <= 42)||(LA13_0 >= 44 && LA13_0 <= 46)) ) {
							alt13=1;
						}

						switch (alt13) {
						case 1 :
							// myparser.g:54:7: stat
							{
							pushFollow(FOLLOW_stat_in_forstat264);
							stat();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop13;
						}
					}

					match(input,49,FOLLOW_49_in_forstat267); if (state.failed) return;
					}
					break;
				case 2 :
					// myparser.g:55:4: 'for(' ( expr )+ ';' ( expr )* ';' ( expr )+ ')' ( ';' )?
					{
					match(input,40,FOLLOW_40_in_forstat273); if (state.failed) return;
					// myparser.g:55:11: ( expr )+
					int cnt14=0;
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( (LA14_0==ARRAY||LA14_0==ID||LA14_0==Number||LA14_0==17) ) {
							alt14=1;
						}

						switch (alt14) {
						case 1 :
							// myparser.g:55:11: expr
							{
							pushFollow(FOLLOW_expr_in_forstat275);
							expr();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							if ( cnt14 >= 1 ) break loop14;
							if (state.backtracking>0) {state.failed=true; return;}
							EarlyExitException eee = new EarlyExitException(14, input);
							throw eee;
						}
						cnt14++;
					}

					match(input,28,FOLLOW_28_in_forstat278); if (state.failed) return;
					// myparser.g:55:21: ( expr )*
					loop15:
					while (true) {
						int alt15=2;
						int LA15_0 = input.LA(1);
						if ( (LA15_0==ARRAY||LA15_0==ID||LA15_0==Number||LA15_0==17) ) {
							alt15=1;
						}

						switch (alt15) {
						case 1 :
							// myparser.g:55:21: expr
							{
							pushFollow(FOLLOW_expr_in_forstat280);
							expr();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop15;
						}
					}

					match(input,28,FOLLOW_28_in_forstat283); if (state.failed) return;
					// myparser.g:55:31: ( expr )+
					int cnt16=0;
					loop16:
					while (true) {
						int alt16=2;
						int LA16_0 = input.LA(1);
						if ( (LA16_0==ARRAY||LA16_0==ID||LA16_0==Number||LA16_0==17) ) {
							alt16=1;
						}

						switch (alt16) {
						case 1 :
							// myparser.g:55:31: expr
							{
							pushFollow(FOLLOW_expr_in_forstat285);
							expr();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							if ( cnt16 >= 1 ) break loop16;
							if (state.backtracking>0) {state.failed=true; return;}
							EarlyExitException eee = new EarlyExitException(16, input);
							throw eee;
						}
						cnt16++;
					}

					match(input,18,FOLLOW_18_in_forstat288); if (state.failed) return;
					// myparser.g:55:40: ( ';' )?
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0==28) ) {
						alt17=1;
					}
					switch (alt17) {
						case 1 :
							// myparser.g:55:41: ';'
							{
							match(input,28,FOLLOW_28_in_forstat290); if (state.failed) return;
							}
							break;

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
			if ( state.backtracking>0 ) { memoize(input, 8, forstat_StartIndex); }

		}
	}
	// $ANTLR end "forstat"



	// $ANTLR start "ifstat"
	// myparser.g:58:1: ifstat : 'if(' expr ')' '{' ( stat )* '}' ( 'else if(' expr ')' '{' ( stat )* '}' )* ( 'else' '{' ( stat )* '}' )? ;
	public final void ifstat() throws RecognitionException {
		int ifstat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return; }

			// myparser.g:59:2: ( 'if(' expr ')' '{' ( stat )* '}' ( 'else if(' expr ')' '{' ( stat )* '}' )* ( 'else' '{' ( stat )* '}' )? )
			// myparser.g:59:4: 'if(' expr ')' '{' ( stat )* '}' ( 'else if(' expr ')' '{' ( stat )* '}' )* ( 'else' '{' ( stat )* '}' )?
			{
			match(input,41,FOLLOW_41_in_ifstat305); if (state.failed) return;
			pushFollow(FOLLOW_expr_in_ifstat307);
			expr();
			state._fsp--;
			if (state.failed) return;
			match(input,18,FOLLOW_18_in_ifstat309); if (state.failed) return;
			match(input,47,FOLLOW_47_in_ifstat313); if (state.failed) return;
			// myparser.g:60:7: ( stat )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==ARRAY||LA19_0==ID||LA19_0==Number||LA19_0==17||(LA19_0 >= 35 && LA19_0 <= 36)||(LA19_0 >= 39 && LA19_0 <= 42)||(LA19_0 >= 44 && LA19_0 <= 46)) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// myparser.g:60:7: stat
					{
					pushFollow(FOLLOW_stat_in_ifstat315);
					stat();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop19;
				}
			}

			match(input,49,FOLLOW_49_in_ifstat318); if (state.failed) return;
			// myparser.g:61:3: ( 'else if(' expr ')' '{' ( stat )* '}' )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==37) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// myparser.g:61:4: 'else if(' expr ')' '{' ( stat )* '}'
					{
					match(input,37,FOLLOW_37_in_ifstat323); if (state.failed) return;
					pushFollow(FOLLOW_expr_in_ifstat325);
					expr();
					state._fsp--;
					if (state.failed) return;
					match(input,18,FOLLOW_18_in_ifstat327); if (state.failed) return;
					match(input,47,FOLLOW_47_in_ifstat331); if (state.failed) return;
					// myparser.g:62:7: ( stat )*
					loop20:
					while (true) {
						int alt20=2;
						int LA20_0 = input.LA(1);
						if ( (LA20_0==ARRAY||LA20_0==ID||LA20_0==Number||LA20_0==17||(LA20_0 >= 35 && LA20_0 <= 36)||(LA20_0 >= 39 && LA20_0 <= 42)||(LA20_0 >= 44 && LA20_0 <= 46)) ) {
							alt20=1;
						}

						switch (alt20) {
						case 1 :
							// myparser.g:62:7: stat
							{
							pushFollow(FOLLOW_stat_in_ifstat333);
							stat();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop20;
						}
					}

					match(input,49,FOLLOW_49_in_ifstat336); if (state.failed) return;
					}
					break;

				default :
					break loop21;
				}
			}

			// myparser.g:63:3: ( 'else' '{' ( stat )* '}' )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==38) ) {
				alt23=1;
			}
			switch (alt23) {
				case 1 :
					// myparser.g:63:4: 'else' '{' ( stat )* '}'
					{
					match(input,38,FOLLOW_38_in_ifstat343); if (state.failed) return;
					match(input,47,FOLLOW_47_in_ifstat347); if (state.failed) return;
					// myparser.g:64:7: ( stat )*
					loop22:
					while (true) {
						int alt22=2;
						int LA22_0 = input.LA(1);
						if ( (LA22_0==ARRAY||LA22_0==ID||LA22_0==Number||LA22_0==17||(LA22_0 >= 35 && LA22_0 <= 36)||(LA22_0 >= 39 && LA22_0 <= 42)||(LA22_0 >= 44 && LA22_0 <= 46)) ) {
							alt22=1;
						}

						switch (alt22) {
						case 1 :
							// myparser.g:64:7: stat
							{
							pushFollow(FOLLOW_stat_in_ifstat349);
							stat();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop22;
						}
					}

					match(input,49,FOLLOW_49_in_ifstat352); if (state.failed) return;
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
			if ( state.backtracking>0 ) { memoize(input, 9, ifstat_StartIndex); }

		}
	}
	// $ANTLR end "ifstat"



	// $ANTLR start "whilestat"
	// myparser.g:68:1: whilestat : 'while(' expr ')' '{' ( stat )* '}' ;
	public final void whilestat() throws RecognitionException {
		int whilestat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return; }

			// myparser.g:69:2: ( 'while(' expr ')' '{' ( stat )* '}' )
			// myparser.g:69:4: 'while(' expr ')' '{' ( stat )* '}'
			{
			match(input,46,FOLLOW_46_in_whilestat368); if (state.failed) return;
			pushFollow(FOLLOW_expr_in_whilestat370);
			expr();
			state._fsp--;
			if (state.failed) return;
			match(input,18,FOLLOW_18_in_whilestat372); if (state.failed) return;
			match(input,47,FOLLOW_47_in_whilestat376); if (state.failed) return;
			// myparser.g:70:7: ( stat )*
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==ARRAY||LA24_0==ID||LA24_0==Number||LA24_0==17||(LA24_0 >= 35 && LA24_0 <= 36)||(LA24_0 >= 39 && LA24_0 <= 42)||(LA24_0 >= 44 && LA24_0 <= 46)) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// myparser.g:70:7: stat
					{
					pushFollow(FOLLOW_stat_in_whilestat378);
					stat();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop24;
				}
			}

			match(input,49,FOLLOW_49_in_whilestat381); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 10, whilestat_StartIndex); }

		}
	}
	// $ANTLR end "whilestat"



	// $ANTLR start "declstat"
	// myparser.g:73:1: declstat : type exprList ;
	public final void declstat() throws RecognitionException {
		int declstat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return; }

			// myparser.g:74:2: ( type exprList )
			// myparser.g:74:4: type exprList
			{
			pushFollow(FOLLOW_type_in_declstat392);
			type();
			state._fsp--;
			if (state.failed) return;
			pushFollow(FOLLOW_exprList_in_declstat394);
			exprList();
			state._fsp--;
			if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 11, declstat_StartIndex); }

		}
	}
	// $ANTLR end "declstat"



	// $ANTLR start "retstat"
	// myparser.g:77:1: retstat : 'return' expr ';' ;
	public final void retstat() throws RecognitionException {
		int retstat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return; }

			// myparser.g:78:2: ( 'return' expr ';' )
			// myparser.g:78:4: 'return' expr ';'
			{
			match(input,44,FOLLOW_44_in_retstat405); if (state.failed) return;
			pushFollow(FOLLOW_expr_in_retstat407);
			expr();
			state._fsp--;
			if (state.failed) return;
			match(input,28,FOLLOW_28_in_retstat409); if (state.failed) return;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 12, retstat_StartIndex); }

		}
	}
	// $ANTLR end "retstat"



	// $ANTLR start "function"
	// myparser.g:81:1: function : ( type ID '(' ( params )? ')' ( WS )* '{' ( stat )* '}' | type ID '(' ( params )? ')' ';' );
	public final void function() throws RecognitionException {
		int function_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return; }

			// myparser.g:82:2: ( type ID '(' ( params )? ')' ( WS )* '{' ( stat )* '}' | type ID '(' ( params )? ')' ';' )
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( ((LA29_0 >= 35 && LA29_0 <= 36)||LA29_0==39||LA29_0==42||LA29_0==45) ) {
				int LA29_1 = input.LA(2);
				if ( (LA29_1==ID) ) {
					int LA29_2 = input.LA(3);
					if ( (synpred38_myparser()) ) {
						alt29=1;
					}
					else if ( (true) ) {
						alt29=2;
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 29, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 29, 0, input);
				throw nvae;
			}

			switch (alt29) {
				case 1 :
					// myparser.g:82:4: type ID '(' ( params )? ')' ( WS )* '{' ( stat )* '}'
					{
					pushFollow(FOLLOW_type_in_function420);
					type();
					state._fsp--;
					if (state.failed) return;
					match(input,ID,FOLLOW_ID_in_function422); if (state.failed) return;
					match(input,17,FOLLOW_17_in_function424); if (state.failed) return;
					// myparser.g:82:16: ( params )?
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( ((LA25_0 >= 35 && LA25_0 <= 36)||LA25_0==39||LA25_0==42||LA25_0==45) ) {
						alt25=1;
					}
					switch (alt25) {
						case 1 :
							// myparser.g:82:16: params
							{
							pushFollow(FOLLOW_params_in_function426);
							params();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,18,FOLLOW_18_in_function429); if (state.failed) return;
					// myparser.g:82:27: ( WS )*
					loop26:
					while (true) {
						int alt26=2;
						int LA26_0 = input.LA(1);
						if ( (LA26_0==WS) ) {
							alt26=1;
						}

						switch (alt26) {
						case 1 :
							// myparser.g:82:27: WS
							{
							match(input,WS,FOLLOW_WS_in_function430); if (state.failed) return;
							}
							break;

						default :
							break loop26;
						}
					}

					match(input,47,FOLLOW_47_in_function435); if (state.failed) return;
					// myparser.g:83:7: ( stat )*
					loop27:
					while (true) {
						int alt27=2;
						int LA27_0 = input.LA(1);
						if ( (LA27_0==ARRAY||LA27_0==ID||LA27_0==Number||LA27_0==17||(LA27_0 >= 35 && LA27_0 <= 36)||(LA27_0 >= 39 && LA27_0 <= 42)||(LA27_0 >= 44 && LA27_0 <= 46)) ) {
							alt27=1;
						}

						switch (alt27) {
						case 1 :
							// myparser.g:83:7: stat
							{
							pushFollow(FOLLOW_stat_in_function437);
							stat();
							state._fsp--;
							if (state.failed) return;
							}
							break;

						default :
							break loop27;
						}
					}

					match(input,49,FOLLOW_49_in_function440); if (state.failed) return;
					}
					break;
				case 2 :
					// myparser.g:84:4: type ID '(' ( params )? ')' ';'
					{
					pushFollow(FOLLOW_type_in_function445);
					type();
					state._fsp--;
					if (state.failed) return;
					match(input,ID,FOLLOW_ID_in_function447); if (state.failed) return;
					match(input,17,FOLLOW_17_in_function449); if (state.failed) return;
					// myparser.g:84:16: ( params )?
					int alt28=2;
					int LA28_0 = input.LA(1);
					if ( ((LA28_0 >= 35 && LA28_0 <= 36)||LA28_0==39||LA28_0==42||LA28_0==45) ) {
						alt28=1;
					}
					switch (alt28) {
						case 1 :
							// myparser.g:84:16: params
							{
							pushFollow(FOLLOW_params_in_function451);
							params();
							state._fsp--;
							if (state.failed) return;
							}
							break;

					}

					match(input,18,FOLLOW_18_in_function454); if (state.failed) return;
					match(input,28,FOLLOW_28_in_function455); if (state.failed) return;
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
			if ( state.backtracking>0 ) { memoize(input, 13, function_StartIndex); }

		}
	}
	// $ANTLR end "function"



	// $ANTLR start "params"
	// myparser.g:87:1: params : param ( ',' param )* ;
	public final void params() throws RecognitionException {
		int params_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return; }

			// myparser.g:88:2: ( param ( ',' param )* )
			// myparser.g:88:4: param ( ',' param )*
			{
			pushFollow(FOLLOW_param_in_params468);
			param();
			state._fsp--;
			if (state.failed) return;
			// myparser.g:88:10: ( ',' param )*
			loop30:
			while (true) {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( (LA30_0==23) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// myparser.g:88:11: ',' param
					{
					match(input,23,FOLLOW_23_in_params471); if (state.failed) return;
					pushFollow(FOLLOW_param_in_params473);
					param();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop30;
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
			if ( state.backtracking>0 ) { memoize(input, 14, params_StartIndex); }

		}
	}
	// $ANTLR end "params"



	// $ANTLR start "param"
	// myparser.g:91:1: param : ( type | type expr );
	public final void param() throws RecognitionException {
		int param_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return; }

			// myparser.g:92:2: ( type | type expr )
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( ((LA31_0 >= 35 && LA31_0 <= 36)||LA31_0==39||LA31_0==42||LA31_0==45) ) {
				int LA31_1 = input.LA(2);
				if ( (LA31_1==EOF||LA31_1==18||LA31_1==23) ) {
					alt31=1;
				}
				else if ( (LA31_1==ARRAY||LA31_1==ID||LA31_1==Number||LA31_1==17) ) {
					alt31=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 31, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 31, 0, input);
				throw nvae;
			}

			switch (alt31) {
				case 1 :
					// myparser.g:92:4: type
					{
					pushFollow(FOLLOW_type_in_param487);
					type();
					state._fsp--;
					if (state.failed) return;
					}
					break;
				case 2 :
					// myparser.g:93:4: type expr
					{
					pushFollow(FOLLOW_type_in_param493);
					type();
					state._fsp--;
					if (state.failed) return;
					pushFollow(FOLLOW_expr_in_param495);
					expr();
					state._fsp--;
					if (state.failed) return;
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
			if ( state.backtracking>0 ) { memoize(input, 15, param_StartIndex); }

		}
	}
	// $ANTLR end "param"



	// $ANTLR start "expr"
	// myparser.g:96:1: expr : opstat ( ( '&&' | '||' ) opstat )* ;
	public final void expr() throws RecognitionException {
		int expr_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return; }

			// myparser.g:97:2: ( opstat ( ( '&&' | '||' ) opstat )* )
			// myparser.g:97:4: opstat ( ( '&&' | '||' ) opstat )*
			{
			pushFollow(FOLLOW_opstat_in_expr506);
			opstat();
			state._fsp--;
			if (state.failed) return;
			// myparser.g:97:11: ( ( '&&' | '||' ) opstat )*
			loop32:
			while (true) {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==16||LA32_0==48) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// myparser.g:97:12: ( '&&' | '||' ) opstat
					{
					if ( input.LA(1)==16||input.LA(1)==48 ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_opstat_in_expr517);
					opstat();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop32;
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
			if ( state.backtracking>0 ) { memoize(input, 16, expr_StartIndex); }

		}
	}
	// $ANTLR end "expr"



	// $ANTLR start "atom"
	// myparser.g:100:1: atom : ( Number | '(' expr ')' | ID | ARRAY );
	public final void atom() throws RecognitionException {
		int atom_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return; }

			// myparser.g:101:2: ( Number | '(' expr ')' | ID | ARRAY )
			int alt33=4;
			switch ( input.LA(1) ) {
			case Number:
				{
				alt33=1;
				}
				break;
			case 17:
				{
				alt33=2;
				}
				break;
			case ID:
				{
				alt33=3;
				}
				break;
			case ARRAY:
				{
				alt33=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return;}
				NoViableAltException nvae =
					new NoViableAltException("", 33, 0, input);
				throw nvae;
			}
			switch (alt33) {
				case 1 :
					// myparser.g:101:4: Number
					{
					match(input,Number,FOLLOW_Number_in_atom530); if (state.failed) return;
					}
					break;
				case 2 :
					// myparser.g:102:4: '(' expr ')'
					{
					match(input,17,FOLLOW_17_in_atom535); if (state.failed) return;
					pushFollow(FOLLOW_expr_in_atom537);
					expr();
					state._fsp--;
					if (state.failed) return;
					match(input,18,FOLLOW_18_in_atom539); if (state.failed) return;
					}
					break;
				case 3 :
					// myparser.g:103:4: ID
					{
					match(input,ID,FOLLOW_ID_in_atom545); if (state.failed) return;
					}
					break;
				case 4 :
					// myparser.g:104:4: ARRAY
					{
					match(input,ARRAY,FOLLOW_ARRAY_in_atom550); if (state.failed) return;
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
			if ( state.backtracking>0 ) { memoize(input, 17, atom_StartIndex); }

		}
	}
	// $ANTLR end "atom"



	// $ANTLR start "add"
	// myparser.g:108:1: add : mult ( ( '+' | '-' ) mult )* ;
	public final void add() throws RecognitionException {
		int add_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return; }

			// myparser.g:109:2: ( mult ( ( '+' | '-' ) mult )* )
			// myparser.g:109:4: mult ( ( '+' | '-' ) mult )*
			{
			pushFollow(FOLLOW_mult_in_add563);
			mult();
			state._fsp--;
			if (state.failed) return;
			// myparser.g:109:9: ( ( '+' | '-' ) mult )*
			loop34:
			while (true) {
				int alt34=2;
				int LA34_0 = input.LA(1);
				if ( (LA34_0==21||LA34_0==24) ) {
					alt34=1;
				}

				switch (alt34) {
				case 1 :
					// myparser.g:109:10: ( '+' | '-' ) mult
					{
					if ( input.LA(1)==21||input.LA(1)==24 ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_mult_in_add574);
					mult();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop34;
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
			if ( state.backtracking>0 ) { memoize(input, 18, add_StartIndex); }

		}
	}
	// $ANTLR end "add"



	// $ANTLR start "mult"
	// myparser.g:112:1: mult : atom ( ( '*' | '/' | '%' ) atom )* ;
	public final void mult() throws RecognitionException {
		int mult_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return; }

			// myparser.g:113:2: ( atom ( ( '*' | '/' | '%' ) atom )* )
			// myparser.g:113:4: atom ( ( '*' | '/' | '%' ) atom )*
			{
			pushFollow(FOLLOW_atom_in_mult588);
			atom();
			state._fsp--;
			if (state.failed) return;
			// myparser.g:113:9: ( ( '*' | '/' | '%' ) atom )*
			loop35:
			while (true) {
				int alt35=2;
				int LA35_0 = input.LA(1);
				if ( (LA35_0==14||LA35_0==19||LA35_0==26) ) {
					alt35=1;
				}

				switch (alt35) {
				case 1 :
					// myparser.g:113:10: ( '*' | '/' | '%' ) atom
					{
					if ( input.LA(1)==14||input.LA(1)==19||input.LA(1)==26 ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_atom_in_mult603);
					atom();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop35;
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
			if ( state.backtracking>0 ) { memoize(input, 19, mult_StartIndex); }

		}
	}
	// $ANTLR end "mult"



	// $ANTLR start "opstat"
	// myparser.g:116:1: opstat : add ( ( '<' | '<=' | '>=' | '>' | '==' | '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '!=' ) add )* ;
	public final void opstat() throws RecognitionException {
		int opstat_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return; }

			// myparser.g:117:2: ( add ( ( '<' | '<=' | '>=' | '>' | '==' | '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '!=' ) add )* )
			// myparser.g:117:4: add ( ( '<' | '<=' | '>=' | '>' | '==' | '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '!=' ) add )*
			{
			pushFollow(FOLLOW_add_in_opstat616);
			add();
			state._fsp--;
			if (state.failed) return;
			// myparser.g:117:8: ( ( '<' | '<=' | '>=' | '>' | '==' | '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '!=' ) add )*
			loop36:
			while (true) {
				int alt36=2;
				int LA36_0 = input.LA(1);
				if ( (LA36_0==13||LA36_0==15||LA36_0==20||LA36_0==22||LA36_0==25||LA36_0==27||(LA36_0 >= 29 && LA36_0 <= 34)) ) {
					alt36=1;
				}

				switch (alt36) {
				case 1 :
					// myparser.g:117:9: ( '<' | '<=' | '>=' | '>' | '==' | '=' | '*=' | '/=' | '%=' | '+=' | '-=' | '!=' ) add
					{
					if ( input.LA(1)==13||input.LA(1)==15||input.LA(1)==20||input.LA(1)==22||input.LA(1)==25||input.LA(1)==27||(input.LA(1) >= 29 && input.LA(1) <= 34) ) {
						input.consume();
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_add_in_opstat670);
					add();
					state._fsp--;
					if (state.failed) return;
					}
					break;

				default :
					break loop36;
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
			if ( state.backtracking>0 ) { memoize(input, 20, opstat_StartIndex); }

		}
	}
	// $ANTLR end "opstat"

	// $ANTLR start synpred9_myparser
	public final void synpred9_myparser_fragment() throws RecognitionException {
		// myparser.g:25:4: ( assignstat )
		// myparser.g:25:4: assignstat
		{
		pushFollow(FOLLOW_assignstat_in_synpred9_myparser110);
		assignstat();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred9_myparser

	// $ANTLR start synpred10_myparser
	public final void synpred10_myparser_fragment() throws RecognitionException {
		// myparser.g:26:4: ( exprList )
		// myparser.g:26:4: exprList
		{
		pushFollow(FOLLOW_exprList_in_synpred10_myparser115);
		exprList();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred10_myparser

	// $ANTLR start synpred16_myparser
	public final void synpred16_myparser_fragment() throws RecognitionException {
		// myparser.g:36:4: ( ID '=' expr ';' )
		// myparser.g:36:4: ID '=' expr ';'
		{
		match(input,ID,FOLLOW_ID_in_synpred16_myparser157); if (state.failed) return;
		match(input,31,FOLLOW_31_in_synpred16_myparser159); if (state.failed) return;
		pushFollow(FOLLOW_expr_in_synpred16_myparser161);
		expr();
		state._fsp--;
		if (state.failed) return;
		match(input,28,FOLLOW_28_in_synpred16_myparser163); if (state.failed) return;
		}

	}
	// $ANTLR end synpred16_myparser

	// $ANTLR start synpred24_myparser
	public final void synpred24_myparser_fragment() throws RecognitionException {
		// myparser.g:53:4: ( 'for(' ( expr )+ ';' ( expr )* ';' ( expr )+ ')' '{' ( stat )* '}' )
		// myparser.g:53:4: 'for(' ( expr )+ ';' ( expr )* ';' ( expr )+ ')' '{' ( stat )* '}'
		{
		match(input,40,FOLLOW_40_in_synpred24_myparser243); if (state.failed) return;
		// myparser.g:53:11: ( expr )+
		int cnt37=0;
		loop37:
		while (true) {
			int alt37=2;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==ARRAY||LA37_0==ID||LA37_0==Number||LA37_0==17) ) {
				alt37=1;
			}

			switch (alt37) {
			case 1 :
				// myparser.g:53:11: expr
				{
				pushFollow(FOLLOW_expr_in_synpred24_myparser245);
				expr();
				state._fsp--;
				if (state.failed) return;
				}
				break;

			default :
				if ( cnt37 >= 1 ) break loop37;
				if (state.backtracking>0) {state.failed=true; return;}
				EarlyExitException eee = new EarlyExitException(37, input);
				throw eee;
			}
			cnt37++;
		}

		match(input,28,FOLLOW_28_in_synpred24_myparser248); if (state.failed) return;
		// myparser.g:53:21: ( expr )*
		loop38:
		while (true) {
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( (LA38_0==ARRAY||LA38_0==ID||LA38_0==Number||LA38_0==17) ) {
				alt38=1;
			}

			switch (alt38) {
			case 1 :
				// myparser.g:53:21: expr
				{
				pushFollow(FOLLOW_expr_in_synpred24_myparser250);
				expr();
				state._fsp--;
				if (state.failed) return;
				}
				break;

			default :
				break loop38;
			}
		}

		match(input,28,FOLLOW_28_in_synpred24_myparser253); if (state.failed) return;
		// myparser.g:53:31: ( expr )+
		int cnt39=0;
		loop39:
		while (true) {
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==ARRAY||LA39_0==ID||LA39_0==Number||LA39_0==17) ) {
				alt39=1;
			}

			switch (alt39) {
			case 1 :
				// myparser.g:53:31: expr
				{
				pushFollow(FOLLOW_expr_in_synpred24_myparser255);
				expr();
				state._fsp--;
				if (state.failed) return;
				}
				break;

			default :
				if ( cnt39 >= 1 ) break loop39;
				if (state.backtracking>0) {state.failed=true; return;}
				EarlyExitException eee = new EarlyExitException(39, input);
				throw eee;
			}
			cnt39++;
		}

		match(input,18,FOLLOW_18_in_synpred24_myparser258); if (state.failed) return;
		match(input,47,FOLLOW_47_in_synpred24_myparser262); if (state.failed) return;
		// myparser.g:54:7: ( stat )*
		loop40:
		while (true) {
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( (LA40_0==ARRAY||LA40_0==ID||LA40_0==Number||LA40_0==17||(LA40_0 >= 35 && LA40_0 <= 36)||(LA40_0 >= 39 && LA40_0 <= 42)||(LA40_0 >= 44 && LA40_0 <= 46)) ) {
				alt40=1;
			}

			switch (alt40) {
			case 1 :
				// myparser.g:54:7: stat
				{
				pushFollow(FOLLOW_stat_in_synpred24_myparser264);
				stat();
				state._fsp--;
				if (state.failed) return;
				}
				break;

			default :
				break loop40;
			}
		}

		match(input,49,FOLLOW_49_in_synpred24_myparser267); if (state.failed) return;
		}

	}
	// $ANTLR end synpred24_myparser

	// $ANTLR start synpred38_myparser
	public final void synpred38_myparser_fragment() throws RecognitionException {
		// myparser.g:82:4: ( type ID '(' ( params )? ')' ( WS )* '{' ( stat )* '}' )
		// myparser.g:82:4: type ID '(' ( params )? ')' ( WS )* '{' ( stat )* '}'
		{
		pushFollow(FOLLOW_type_in_synpred38_myparser420);
		type();
		state._fsp--;
		if (state.failed) return;
		match(input,ID,FOLLOW_ID_in_synpred38_myparser422); if (state.failed) return;
		match(input,17,FOLLOW_17_in_synpred38_myparser424); if (state.failed) return;
		// myparser.g:82:16: ( params )?
		int alt43=2;
		int LA43_0 = input.LA(1);
		if ( ((LA43_0 >= 35 && LA43_0 <= 36)||LA43_0==39||LA43_0==42||LA43_0==45) ) {
			alt43=1;
		}
		switch (alt43) {
			case 1 :
				// myparser.g:82:16: params
				{
				pushFollow(FOLLOW_params_in_synpred38_myparser426);
				params();
				state._fsp--;
				if (state.failed) return;
				}
				break;

		}

		match(input,18,FOLLOW_18_in_synpred38_myparser429); if (state.failed) return;
		// myparser.g:82:27: ( WS )*
		loop44:
		while (true) {
			int alt44=2;
			int LA44_0 = input.LA(1);
			if ( (LA44_0==WS) ) {
				alt44=1;
			}

			switch (alt44) {
			case 1 :
				// myparser.g:82:27: WS
				{
				match(input,WS,FOLLOW_WS_in_synpred38_myparser430); if (state.failed) return;
				}
				break;

			default :
				break loop44;
			}
		}

		match(input,47,FOLLOW_47_in_synpred38_myparser435); if (state.failed) return;
		// myparser.g:83:7: ( stat )*
		loop45:
		while (true) {
			int alt45=2;
			int LA45_0 = input.LA(1);
			if ( (LA45_0==ARRAY||LA45_0==ID||LA45_0==Number||LA45_0==17||(LA45_0 >= 35 && LA45_0 <= 36)||(LA45_0 >= 39 && LA45_0 <= 42)||(LA45_0 >= 44 && LA45_0 <= 46)) ) {
				alt45=1;
			}

			switch (alt45) {
			case 1 :
				// myparser.g:83:7: stat
				{
				pushFollow(FOLLOW_stat_in_synpred38_myparser437);
				stat();
				state._fsp--;
				if (state.failed) return;
				}
				break;

			default :
				break loop45;
			}
		}

		match(input,49,FOLLOW_49_in_synpred38_myparser440); if (state.failed) return;
		}

	}
	// $ANTLR end synpred38_myparser

	// Delegated rules

	public final boolean synpred16_myparser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred16_myparser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred24_myparser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred24_myparser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred38_myparser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred38_myparser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred10_myparser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred10_myparser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred9_myparser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred9_myparser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_function_in_parse41 = new BitSet(new long[]{0x0000249800000000L});
	public static final BitSet FOLLOW_type_in_parse46 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_43_in_parse48 = new BitSet(new long[]{0x0000800000001000L});
	public static final BitSet FOLLOW_WS_in_parse49 = new BitSet(new long[]{0x0000800000001000L});
	public static final BitSet FOLLOW_47_in_parse54 = new BitSet(new long[]{0x0002779800020910L});
	public static final BitSet FOLLOW_stat_in_parse58 = new BitSet(new long[]{0x0002779800020910L});
	public static final BitSet FOLLOW_49_in_parse63 = new BitSet(new long[]{0x0000249800000002L});
	public static final BitSet FOLLOW_function_in_parse67 = new BitSet(new long[]{0x0000249800000002L});
	public static final BitSet FOLLOW_assignstat_in_stat110 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprList_in_stat115 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ifstat_in_stat121 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_forstat_in_stat126 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_whilestat_in_stat131 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_procedstat_in_stat136 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_declstat_in_stat141 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_retstat_in_stat146 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_assignstat157 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_assignstat159 = new BitSet(new long[]{0x0000000000020910L});
	public static final BitSet FOLLOW_expr_in_assignstat161 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_assignstat163 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_assignstat168 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_assignstat170 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_procedstat_in_assignstat172 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_exprList184 = new BitSet(new long[]{0x0000000010800000L});
	public static final BitSet FOLLOW_23_in_exprList187 = new BitSet(new long[]{0x0000000000020910L});
	public static final BitSet FOLLOW_expr_in_exprList189 = new BitSet(new long[]{0x0000000010800000L});
	public static final BitSet FOLLOW_28_in_exprList193 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_procedstat204 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_procedstat206 = new BitSet(new long[]{0x0000000000060910L});
	public static final BitSet FOLLOW_trparam_in_procedstat208 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_procedstat211 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_procedstat213 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_trparam225 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_23_in_trparam228 = new BitSet(new long[]{0x0000000000020910L});
	public static final BitSet FOLLOW_expr_in_trparam230 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_40_in_forstat243 = new BitSet(new long[]{0x0000000000020910L});
	public static final BitSet FOLLOW_expr_in_forstat245 = new BitSet(new long[]{0x0000000010020910L});
	public static final BitSet FOLLOW_28_in_forstat248 = new BitSet(new long[]{0x0000000010020910L});
	public static final BitSet FOLLOW_expr_in_forstat250 = new BitSet(new long[]{0x0000000010020910L});
	public static final BitSet FOLLOW_28_in_forstat253 = new BitSet(new long[]{0x0000000000020910L});
	public static final BitSet FOLLOW_expr_in_forstat255 = new BitSet(new long[]{0x0000000000060910L});
	public static final BitSet FOLLOW_18_in_forstat258 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_forstat262 = new BitSet(new long[]{0x0002779800020910L});
	public static final BitSet FOLLOW_stat_in_forstat264 = new BitSet(new long[]{0x0002779800020910L});
	public static final BitSet FOLLOW_49_in_forstat267 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_forstat273 = new BitSet(new long[]{0x0000000000020910L});
	public static final BitSet FOLLOW_expr_in_forstat275 = new BitSet(new long[]{0x0000000010020910L});
	public static final BitSet FOLLOW_28_in_forstat278 = new BitSet(new long[]{0x0000000010020910L});
	public static final BitSet FOLLOW_expr_in_forstat280 = new BitSet(new long[]{0x0000000010020910L});
	public static final BitSet FOLLOW_28_in_forstat283 = new BitSet(new long[]{0x0000000000020910L});
	public static final BitSet FOLLOW_expr_in_forstat285 = new BitSet(new long[]{0x0000000000060910L});
	public static final BitSet FOLLOW_18_in_forstat288 = new BitSet(new long[]{0x0000000010000002L});
	public static final BitSet FOLLOW_28_in_forstat290 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_41_in_ifstat305 = new BitSet(new long[]{0x0000000000020910L});
	public static final BitSet FOLLOW_expr_in_ifstat307 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_ifstat309 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_ifstat313 = new BitSet(new long[]{0x0002779800020910L});
	public static final BitSet FOLLOW_stat_in_ifstat315 = new BitSet(new long[]{0x0002779800020910L});
	public static final BitSet FOLLOW_49_in_ifstat318 = new BitSet(new long[]{0x0000006000000002L});
	public static final BitSet FOLLOW_37_in_ifstat323 = new BitSet(new long[]{0x0000000000020910L});
	public static final BitSet FOLLOW_expr_in_ifstat325 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_ifstat327 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_ifstat331 = new BitSet(new long[]{0x0002779800020910L});
	public static final BitSet FOLLOW_stat_in_ifstat333 = new BitSet(new long[]{0x0002779800020910L});
	public static final BitSet FOLLOW_49_in_ifstat336 = new BitSet(new long[]{0x0000006000000002L});
	public static final BitSet FOLLOW_38_in_ifstat343 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_ifstat347 = new BitSet(new long[]{0x0002779800020910L});
	public static final BitSet FOLLOW_stat_in_ifstat349 = new BitSet(new long[]{0x0002779800020910L});
	public static final BitSet FOLLOW_49_in_ifstat352 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_46_in_whilestat368 = new BitSet(new long[]{0x0000000000020910L});
	public static final BitSet FOLLOW_expr_in_whilestat370 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_whilestat372 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_whilestat376 = new BitSet(new long[]{0x0002779800020910L});
	public static final BitSet FOLLOW_stat_in_whilestat378 = new BitSet(new long[]{0x0002779800020910L});
	public static final BitSet FOLLOW_49_in_whilestat381 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_declstat392 = new BitSet(new long[]{0x0000000000020910L});
	public static final BitSet FOLLOW_exprList_in_declstat394 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_retstat405 = new BitSet(new long[]{0x0000000000020910L});
	public static final BitSet FOLLOW_expr_in_retstat407 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_retstat409 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_function420 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_function422 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_function424 = new BitSet(new long[]{0x0000249800040000L});
	public static final BitSet FOLLOW_params_in_function426 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_function429 = new BitSet(new long[]{0x0000800000001000L});
	public static final BitSet FOLLOW_WS_in_function430 = new BitSet(new long[]{0x0000800000001000L});
	public static final BitSet FOLLOW_47_in_function435 = new BitSet(new long[]{0x0002779800020910L});
	public static final BitSet FOLLOW_stat_in_function437 = new BitSet(new long[]{0x0002779800020910L});
	public static final BitSet FOLLOW_49_in_function440 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_function445 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_function447 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_function449 = new BitSet(new long[]{0x0000249800040000L});
	public static final BitSet FOLLOW_params_in_function451 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_function454 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_function455 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_param_in_params468 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_23_in_params471 = new BitSet(new long[]{0x0000249800000000L});
	public static final BitSet FOLLOW_param_in_params473 = new BitSet(new long[]{0x0000000000800002L});
	public static final BitSet FOLLOW_type_in_param487 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_param493 = new BitSet(new long[]{0x0000000000020910L});
	public static final BitSet FOLLOW_expr_in_param495 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_opstat_in_expr506 = new BitSet(new long[]{0x0001000000010002L});
	public static final BitSet FOLLOW_set_in_expr509 = new BitSet(new long[]{0x0000000000020910L});
	public static final BitSet FOLLOW_opstat_in_expr517 = new BitSet(new long[]{0x0001000000010002L});
	public static final BitSet FOLLOW_Number_in_atom530 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_atom535 = new BitSet(new long[]{0x0000000000020910L});
	public static final BitSet FOLLOW_expr_in_atom537 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_atom539 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_atom545 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARRAY_in_atom550 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_mult_in_add563 = new BitSet(new long[]{0x0000000001200002L});
	public static final BitSet FOLLOW_set_in_add566 = new BitSet(new long[]{0x0000000000020910L});
	public static final BitSet FOLLOW_mult_in_add574 = new BitSet(new long[]{0x0000000001200002L});
	public static final BitSet FOLLOW_atom_in_mult588 = new BitSet(new long[]{0x0000000004084002L});
	public static final BitSet FOLLOW_set_in_mult591 = new BitSet(new long[]{0x0000000000020910L});
	public static final BitSet FOLLOW_atom_in_mult603 = new BitSet(new long[]{0x0000000004084002L});
	public static final BitSet FOLLOW_add_in_opstat616 = new BitSet(new long[]{0x00000007EA50A002L});
	public static final BitSet FOLLOW_set_in_opstat619 = new BitSet(new long[]{0x0000000000020910L});
	public static final BitSet FOLLOW_add_in_opstat670 = new BitSet(new long[]{0x00000007EA50A002L});
	public static final BitSet FOLLOW_assignstat_in_synpred9_myparser110 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exprList_in_synpred10_myparser115 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_synpred16_myparser157 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_synpred16_myparser159 = new BitSet(new long[]{0x0000000000020910L});
	public static final BitSet FOLLOW_expr_in_synpred16_myparser161 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_synpred16_myparser163 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_synpred24_myparser243 = new BitSet(new long[]{0x0000000000020910L});
	public static final BitSet FOLLOW_expr_in_synpred24_myparser245 = new BitSet(new long[]{0x0000000010020910L});
	public static final BitSet FOLLOW_28_in_synpred24_myparser248 = new BitSet(new long[]{0x0000000010020910L});
	public static final BitSet FOLLOW_expr_in_synpred24_myparser250 = new BitSet(new long[]{0x0000000010020910L});
	public static final BitSet FOLLOW_28_in_synpred24_myparser253 = new BitSet(new long[]{0x0000000000020910L});
	public static final BitSet FOLLOW_expr_in_synpred24_myparser255 = new BitSet(new long[]{0x0000000000060910L});
	public static final BitSet FOLLOW_18_in_synpred24_myparser258 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_47_in_synpred24_myparser262 = new BitSet(new long[]{0x0002779800020910L});
	public static final BitSet FOLLOW_stat_in_synpred24_myparser264 = new BitSet(new long[]{0x0002779800020910L});
	public static final BitSet FOLLOW_49_in_synpred24_myparser267 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_synpred38_myparser420 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_ID_in_synpred38_myparser422 = new BitSet(new long[]{0x0000000000020000L});
	public static final BitSet FOLLOW_17_in_synpred38_myparser424 = new BitSet(new long[]{0x0000249800040000L});
	public static final BitSet FOLLOW_params_in_synpred38_myparser426 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_18_in_synpred38_myparser429 = new BitSet(new long[]{0x0000800000001000L});
	public static final BitSet FOLLOW_WS_in_synpred38_myparser430 = new BitSet(new long[]{0x0000800000001000L});
	public static final BitSet FOLLOW_47_in_synpred38_myparser435 = new BitSet(new long[]{0x0002779800020910L});
	public static final BitSet FOLLOW_stat_in_synpred38_myparser437 = new BitSet(new long[]{0x0002779800020910L});
	public static final BitSet FOLLOW_49_in_synpred38_myparser440 = new BitSet(new long[]{0x0000000000000002L});
}
