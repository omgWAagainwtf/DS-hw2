// $ANTLR 3.5.2 myparser.g 2017-05-12 15:27:42

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class myparserParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ASSIGN", "CBRACE", "CHAR_TYPE", 
		"COMMA", "COMMENT1", "COMMENT2", "CPAR", "DEC_NUM", "DIGIT", "DIV", "ELSE", 
		"EQ_OP", "FALSE", "FLOAT_NUM", "FLOAT_NUM1", "FLOAT_NUM2", "FLOAT_NUM3", 
		"FLOAT_TYPE", "FOR", "GE_OP", "GT_OP", "ID", "IF", "INT_TYPE", "LETTER", 
		"LE_BR", "LE_OP", "LSHIFT_OP", "LT_OP", "MINUS", "MM_OP", "MOD", "MULT", 
		"NEW_LINE", "NE_OP", "NOT", "OBRACE", "OPAR", "OR", "PLUS", "PP_OP", "RE_BR", 
		"RSHIFT_OP", "SCOL", "STRING", "SYSTEM", "TRUE", "VOID_TYPE", "WHILE_", 
		"WS", "'*='", "'+='", "'-='", "'/='", "'else if('", "'expr'", "'if('"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public myparserParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public myparserParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return myparserParser.tokenNames; }
	@Override public String getGrammarFileName() { return "myparser.g"; }



	// $ANTLR start "parse"
	// myparser.g:6:1: parse : block EOF ;
	public final void parse() throws RecognitionException {
		try {
			// myparser.g:7:2: ( block EOF )
			// myparser.g:7:4: block EOF
			{
			pushFollow(FOLLOW_block_in_parse24);
			block();
			state._fsp--;

			match(input,EOF,FOLLOW_EOF_in_parse26); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "parse"



	// $ANTLR start "block"
	// myparser.g:10:1: block : ( stat )* ;
	public final void block() throws RecognitionException {
		try {
			// myparser.g:11:3: ( ( stat )* )
			// myparser.g:11:3: ( stat )*
			{
			// myparser.g:11:3: ( stat )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==ID||LA1_0==WHILE_||LA1_0==61) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// myparser.g:11:3: stat
					{
					pushFollow(FOLLOW_stat_in_block35);
					stat();
					state._fsp--;

					}
					break;

				default :
					break loop1;
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
		}
	}
	// $ANTLR end "block"



	// $ANTLR start "stat"
	// myparser.g:14:1: stat : ( assignment | if_stat | while_stat );
	public final void stat() throws RecognitionException {
		try {
			// myparser.g:15:3: ( assignment | if_stat | while_stat )
			int alt2=3;
			switch ( input.LA(1) ) {
			case ID:
				{
				alt2=1;
				}
				break;
			case 61:
				{
				alt2=2;
				}
				break;
			case WHILE_:
				{
				alt2=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// myparser.g:15:3: assignment
					{
					pushFollow(FOLLOW_assignment_in_stat45);
					assignment();
					state._fsp--;

					}
					break;
				case 2 :
					// myparser.g:16:3: if_stat
					{
					pushFollow(FOLLOW_if_stat_in_stat49);
					if_stat();
					state._fsp--;

					}
					break;
				case 3 :
					// myparser.g:17:3: while_stat
					{
					pushFollow(FOLLOW_while_stat_in_stat53);
					while_stat();
					state._fsp--;

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
		}
	}
	// $ANTLR end "stat"



	// $ANTLR start "assignment"
	// myparser.g:20:1: assignment : ID ASSIGN expr SCOL ;
	public final void assignment() throws RecognitionException {
		try {
			// myparser.g:21:3: ( ID ASSIGN expr SCOL )
			// myparser.g:21:3: ID ASSIGN expr SCOL
			{
			match(input,ID,FOLLOW_ID_in_assignment62); 
			match(input,ASSIGN,FOLLOW_ASSIGN_in_assignment64); 
			pushFollow(FOLLOW_expr_in_assignment66);
			expr();
			state._fsp--;

			match(input,SCOL,FOLLOW_SCOL_in_assignment68); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "assignment"



	// $ANTLR start "if_stat"
	// myparser.g:24:1: if_stat : 'if(' expr ')' '{' ( stat )* '}' ( 'else if(' expr ')' '{' ( stat )* '}' )* ( 'else' '{' ( stat )* '}' )? ;
	public final void if_stat() throws RecognitionException {
		try {
			// myparser.g:25:3: ( 'if(' expr ')' '{' ( stat )* '}' ( 'else if(' expr ')' '{' ( stat )* '}' )* ( 'else' '{' ( stat )* '}' )? )
			// myparser.g:25:3: 'if(' expr ')' '{' ( stat )* '}' ( 'else if(' expr ')' '{' ( stat )* '}' )* ( 'else' '{' ( stat )* '}' )?
			{
			match(input,61,FOLLOW_61_in_if_stat77); 
			pushFollow(FOLLOW_expr_in_if_stat78);
			expr();
			state._fsp--;

			match(input,CPAR,FOLLOW_CPAR_in_if_stat79); 
			match(input,OBRACE,FOLLOW_OBRACE_in_if_stat81); 
			// myparser.g:26:4: ( stat )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==ID||LA3_0==WHILE_||LA3_0==61) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// myparser.g:26:4: stat
					{
					pushFollow(FOLLOW_stat_in_if_stat82);
					stat();
					state._fsp--;

					}
					break;

				default :
					break loop3;
				}
			}

			match(input,CBRACE,FOLLOW_CBRACE_in_if_stat85); 
			// myparser.g:27:2: ( 'else if(' expr ')' '{' ( stat )* '}' )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==59) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// myparser.g:27:2: 'else if(' expr ')' '{' ( stat )* '}'
					{
					match(input,59,FOLLOW_59_in_if_stat88); 
					pushFollow(FOLLOW_expr_in_if_stat89);
					expr();
					state._fsp--;

					match(input,CPAR,FOLLOW_CPAR_in_if_stat90); 
					match(input,OBRACE,FOLLOW_OBRACE_in_if_stat92); 
					// myparser.g:28:4: ( stat )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( (LA4_0==ID||LA4_0==WHILE_||LA4_0==61) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// myparser.g:28:4: stat
							{
							pushFollow(FOLLOW_stat_in_if_stat93);
							stat();
							state._fsp--;

							}
							break;

						default :
							break loop4;
						}
					}

					match(input,CBRACE,FOLLOW_CBRACE_in_if_stat96); 
					}
					break;

				default :
					break loop5;
				}
			}

			// myparser.g:29:2: ( 'else' '{' ( stat )* '}' )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==ELSE) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// myparser.g:29:2: 'else' '{' ( stat )* '}'
					{
					match(input,ELSE,FOLLOW_ELSE_in_if_stat101); 
					match(input,OBRACE,FOLLOW_OBRACE_in_if_stat103); 
					// myparser.g:30:4: ( stat )*
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( (LA6_0==ID||LA6_0==WHILE_||LA6_0==61) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// myparser.g:30:4: stat
							{
							pushFollow(FOLLOW_stat_in_if_stat104);
							stat();
							state._fsp--;

							}
							break;

						default :
							break loop6;
						}
					}

					match(input,CBRACE,FOLLOW_CBRACE_in_if_stat106); 
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
		}
	}
	// $ANTLR end "if_stat"



	// $ANTLR start "condition_block"
	// myparser.g:33:1: condition_block : expr stat_block ;
	public final void condition_block() throws RecognitionException {
		try {
			// myparser.g:34:3: ( expr stat_block )
			// myparser.g:34:3: expr stat_block
			{
			pushFollow(FOLLOW_expr_in_condition_block117);
			expr();
			state._fsp--;

			pushFollow(FOLLOW_stat_block_in_condition_block119);
			stat_block();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "condition_block"



	// $ANTLR start "stat_block"
	// myparser.g:37:1: stat_block : ( OBRACE block CBRACE | stat );
	public final void stat_block() throws RecognitionException {
		try {
			// myparser.g:38:3: ( OBRACE block CBRACE | stat )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==OBRACE) ) {
				alt8=1;
			}
			else if ( (LA8_0==ID||LA8_0==WHILE_||LA8_0==61) ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// myparser.g:38:3: OBRACE block CBRACE
					{
					match(input,OBRACE,FOLLOW_OBRACE_in_stat_block128); 
					pushFollow(FOLLOW_block_in_stat_block130);
					block();
					state._fsp--;

					match(input,CBRACE,FOLLOW_CBRACE_in_stat_block132); 
					}
					break;
				case 2 :
					// myparser.g:39:3: stat
					{
					pushFollow(FOLLOW_stat_in_stat_block136);
					stat();
					state._fsp--;

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
		}
	}
	// $ANTLR end "stat_block"



	// $ANTLR start "while_stat"
	// myparser.g:42:1: while_stat : WHILE_ '(' 'expr' ')' expr stat_block ;
	public final void while_stat() throws RecognitionException {
		try {
			// myparser.g:43:3: ( WHILE_ '(' 'expr' ')' expr stat_block )
			// myparser.g:43:3: WHILE_ '(' 'expr' ')' expr stat_block
			{
			match(input,WHILE_,FOLLOW_WHILE__in_while_stat145); 
			match(input,OPAR,FOLLOW_OPAR_in_while_stat146); 
			match(input,60,FOLLOW_60_in_while_stat148); 
			match(input,CPAR,FOLLOW_CPAR_in_while_stat150); 
			pushFollow(FOLLOW_expr_in_while_stat152);
			expr();
			state._fsp--;

			pushFollow(FOLLOW_stat_block_in_while_stat154);
			stat_block();
			state._fsp--;

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "while_stat"



	// $ANTLR start "expr"
	// myparser.g:46:1: expr : opstat ( AND | OR opstat )* ;
	public final void expr() throws RecognitionException {
		try {
			// myparser.g:47:2: ( opstat ( AND | OR opstat )* )
			// myparser.g:47:4: opstat ( AND | OR opstat )*
			{
			pushFollow(FOLLOW_opstat_in_expr164);
			opstat();
			state._fsp--;

			// myparser.g:47:11: ( AND | OR opstat )*
			loop9:
			while (true) {
				int alt9=3;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==AND) ) {
					alt9=1;
				}
				else if ( (LA9_0==OR) ) {
					alt9=2;
				}

				switch (alt9) {
				case 1 :
					// myparser.g:47:12: AND
					{
					match(input,AND,FOLLOW_AND_in_expr167); 
					}
					break;
				case 2 :
					// myparser.g:47:18: OR opstat
					{
					match(input,OR,FOLLOW_OR_in_expr171); 
					pushFollow(FOLLOW_opstat_in_expr173);
					opstat();
					state._fsp--;

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
		}
	}
	// $ANTLR end "expr"



	// $ANTLR start "opstat"
	// myparser.g:50:1: opstat : addexpr ( ( GT_OP | GE_OP | LT_OP | LE_OP | EQ_OP | NE_OP | '+=' | '*=' | '/=' | '-=' | '=' ) addexpr )* ;
	public final void opstat() throws RecognitionException {
		try {
			// myparser.g:51:2: ( addexpr ( ( GT_OP | GE_OP | LT_OP | LE_OP | EQ_OP | NE_OP | '+=' | '*=' | '/=' | '-=' | '=' ) addexpr )* )
			// myparser.g:51:4: addexpr ( ( GT_OP | GE_OP | LT_OP | LE_OP | EQ_OP | NE_OP | '+=' | '*=' | '/=' | '-=' | '=' ) addexpr )*
			{
			pushFollow(FOLLOW_addexpr_in_opstat185);
			addexpr();
			state._fsp--;

			// myparser.g:51:11: ( ( GT_OP | GE_OP | LT_OP | LE_OP | EQ_OP | NE_OP | '+=' | '*=' | '/=' | '-=' | '=' ) addexpr )*
			loop10:
			while (true) {
				int alt10=2;
				int LA10_0 = input.LA(1);
				if ( (LA10_0==ASSIGN||LA10_0==EQ_OP||(LA10_0 >= GE_OP && LA10_0 <= GT_OP)||LA10_0==LE_OP||LA10_0==LT_OP||LA10_0==NE_OP||(LA10_0 >= 55 && LA10_0 <= 58)) ) {
					alt10=1;
				}

				switch (alt10) {
				case 1 :
					// myparser.g:51:12: ( GT_OP | GE_OP | LT_OP | LE_OP | EQ_OP | NE_OP | '+=' | '*=' | '/=' | '-=' | '=' ) addexpr
					{
					if ( input.LA(1)==ASSIGN||input.LA(1)==EQ_OP||(input.LA(1) >= GE_OP && input.LA(1) <= GT_OP)||input.LA(1)==LE_OP||input.LA(1)==LT_OP||input.LA(1)==NE_OP||(input.LA(1) >= 55 && input.LA(1) <= 58) ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_addexpr_in_opstat233);
					addexpr();
					state._fsp--;

					}
					break;

				default :
					break loop10;
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
		}
	}
	// $ANTLR end "opstat"



	// $ANTLR start "addexpr"
	// myparser.g:55:1: addexpr : multiexp ( '+' multiexp | '-' multiexp )* ;
	public final void addexpr() throws RecognitionException {
		try {
			// myparser.g:56:3: ( multiexp ( '+' multiexp | '-' multiexp )* )
			// myparser.g:56:3: multiexp ( '+' multiexp | '-' multiexp )*
			{
			pushFollow(FOLLOW_multiexp_in_addexpr246);
			multiexp();
			state._fsp--;

			// myparser.g:57:3: ( '+' multiexp | '-' multiexp )*
			loop11:
			while (true) {
				int alt11=3;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==PLUS) ) {
					alt11=1;
				}
				else if ( (LA11_0==MINUS) ) {
					alt11=2;
				}

				switch (alt11) {
				case 1 :
					// myparser.g:57:3: '+' multiexp
					{
					match(input,PLUS,FOLLOW_PLUS_in_addexpr250); 
					pushFollow(FOLLOW_multiexp_in_addexpr252);
					multiexp();
					state._fsp--;

					}
					break;
				case 2 :
					// myparser.g:58:3: '-' multiexp
					{
					match(input,MINUS,FOLLOW_MINUS_in_addexpr256); 
					pushFollow(FOLLOW_multiexp_in_addexpr258);
					multiexp();
					state._fsp--;

					}
					break;

				default :
					break loop11;
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
		}
	}
	// $ANTLR end "addexpr"



	// $ANTLR start "multiexp"
	// myparser.g:62:1: multiexp : ( '*' atom | '/' atom )* ;
	public final void multiexp() throws RecognitionException {
		try {
			// myparser.g:63:1: ( ( '*' atom | '/' atom )* )
			// myparser.g:64:1: ( '*' atom | '/' atom )*
			{
			// myparser.g:64:1: ( '*' atom | '/' atom )*
			loop12:
			while (true) {
				int alt12=3;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==MULT) ) {
					alt12=1;
				}
				else if ( (LA12_0==DIV) ) {
					alt12=2;
				}

				switch (alt12) {
				case 1 :
					// myparser.g:65:1: '*' atom
					{
					match(input,MULT,FOLLOW_MULT_in_multiexp272); 
					pushFollow(FOLLOW_atom_in_multiexp274);
					atom();
					state._fsp--;

					}
					break;
				case 2 :
					// myparser.g:66:2: '/' atom
					{
					match(input,DIV,FOLLOW_DIV_in_multiexp277); 
					pushFollow(FOLLOW_atom_in_multiexp279);
					atom();
					state._fsp--;

					}
					break;

				default :
					break loop12;
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
		}
	}
	// $ANTLR end "multiexp"



	// $ANTLR start "atom"
	// myparser.g:71:1: atom : ( OPAR expr CPAR | ( DEC_NUM | FLOAT_NUM ) | ( TRUE | FALSE ) | ID | STRING );
	public final void atom() throws RecognitionException {
		try {
			// myparser.g:72:3: ( OPAR expr CPAR | ( DEC_NUM | FLOAT_NUM ) | ( TRUE | FALSE ) | ID | STRING )
			int alt13=5;
			switch ( input.LA(1) ) {
			case OPAR:
				{
				alt13=1;
				}
				break;
			case DEC_NUM:
			case FLOAT_NUM:
				{
				alt13=2;
				}
				break;
			case FALSE:
			case TRUE:
				{
				alt13=3;
				}
				break;
			case ID:
				{
				alt13=4;
				}
				break;
			case STRING:
				{
				alt13=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}
			switch (alt13) {
				case 1 :
					// myparser.g:72:3: OPAR expr CPAR
					{
					match(input,OPAR,FOLLOW_OPAR_in_atom292); 
					pushFollow(FOLLOW_expr_in_atom294);
					expr();
					state._fsp--;

					match(input,CPAR,FOLLOW_CPAR_in_atom296); 
					}
					break;
				case 2 :
					// myparser.g:73:3: ( DEC_NUM | FLOAT_NUM )
					{
					if ( input.LA(1)==DEC_NUM||input.LA(1)==FLOAT_NUM ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;
				case 3 :
					// myparser.g:74:3: ( TRUE | FALSE )
					{
					if ( input.LA(1)==FALSE||input.LA(1)==TRUE ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;
				case 4 :
					// myparser.g:75:3: ID
					{
					match(input,ID,FOLLOW_ID_in_atom324); 
					}
					break;
				case 5 :
					// myparser.g:76:3: STRING
					{
					match(input,STRING,FOLLOW_STRING_in_atom341); 
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
		}
	}
	// $ANTLR end "atom"

	// Delegated rules



	public static final BitSet FOLLOW_block_in_parse24 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_parse26 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stat_in_block35 = new BitSet(new long[]{0x2020000004000002L});
	public static final BitSet FOLLOW_assignment_in_stat45 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_if_stat_in_stat49 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_while_stat_in_stat53 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_assignment62 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ASSIGN_in_assignment64 = new BitSet(new long[]{0x0000102400004000L});
	public static final BitSet FOLLOW_expr_in_assignment66 = new BitSet(new long[]{0x0001000000000000L});
	public static final BitSet FOLLOW_SCOL_in_assignment68 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_61_in_if_stat77 = new BitSet(new long[]{0x0000102400004000L});
	public static final BitSet FOLLOW_expr_in_if_stat78 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CPAR_in_if_stat79 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_OBRACE_in_if_stat81 = new BitSet(new long[]{0x2020000004000040L});
	public static final BitSet FOLLOW_stat_in_if_stat82 = new BitSet(new long[]{0x2020000004000040L});
	public static final BitSet FOLLOW_CBRACE_in_if_stat85 = new BitSet(new long[]{0x0800000000008002L});
	public static final BitSet FOLLOW_59_in_if_stat88 = new BitSet(new long[]{0x0000102400004000L});
	public static final BitSet FOLLOW_expr_in_if_stat89 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CPAR_in_if_stat90 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_OBRACE_in_if_stat92 = new BitSet(new long[]{0x2020000004000040L});
	public static final BitSet FOLLOW_stat_in_if_stat93 = new BitSet(new long[]{0x2020000004000040L});
	public static final BitSet FOLLOW_CBRACE_in_if_stat96 = new BitSet(new long[]{0x0800000000008002L});
	public static final BitSet FOLLOW_ELSE_in_if_stat101 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_OBRACE_in_if_stat103 = new BitSet(new long[]{0x2020000004000040L});
	public static final BitSet FOLLOW_stat_in_if_stat104 = new BitSet(new long[]{0x2020000004000040L});
	public static final BitSet FOLLOW_CBRACE_in_if_stat106 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expr_in_condition_block117 = new BitSet(new long[]{0x2020020004000000L});
	public static final BitSet FOLLOW_stat_block_in_condition_block119 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OBRACE_in_stat_block128 = new BitSet(new long[]{0x2020000004000040L});
	public static final BitSet FOLLOW_block_in_stat_block130 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_CBRACE_in_stat_block132 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_stat_in_stat_block136 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE__in_while_stat145 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_OPAR_in_while_stat146 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_60_in_while_stat148 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CPAR_in_while_stat150 = new BitSet(new long[]{0x0000102400004000L});
	public static final BitSet FOLLOW_expr_in_while_stat152 = new BitSet(new long[]{0x2020020004000000L});
	public static final BitSet FOLLOW_stat_block_in_while_stat154 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_opstat_in_expr164 = new BitSet(new long[]{0x0000080000000012L});
	public static final BitSet FOLLOW_AND_in_expr167 = new BitSet(new long[]{0x0000080000000012L});
	public static final BitSet FOLLOW_OR_in_expr171 = new BitSet(new long[]{0x0000102400004000L});
	public static final BitSet FOLLOW_opstat_in_expr173 = new BitSet(new long[]{0x0000080000000012L});
	public static final BitSet FOLLOW_addexpr_in_opstat185 = new BitSet(new long[]{0x0780008283010022L});
	public static final BitSet FOLLOW_set_in_opstat187 = new BitSet(new long[]{0x0000102400004000L});
	public static final BitSet FOLLOW_addexpr_in_opstat233 = new BitSet(new long[]{0x0780008283010022L});
	public static final BitSet FOLLOW_multiexp_in_addexpr246 = new BitSet(new long[]{0x0000100400000002L});
	public static final BitSet FOLLOW_PLUS_in_addexpr250 = new BitSet(new long[]{0x0000102400004000L});
	public static final BitSet FOLLOW_multiexp_in_addexpr252 = new BitSet(new long[]{0x0000100400000002L});
	public static final BitSet FOLLOW_MINUS_in_addexpr256 = new BitSet(new long[]{0x0000102400004000L});
	public static final BitSet FOLLOW_multiexp_in_addexpr258 = new BitSet(new long[]{0x0000100400000002L});
	public static final BitSet FOLLOW_MULT_in_multiexp272 = new BitSet(new long[]{0x000A040004061000L});
	public static final BitSet FOLLOW_atom_in_multiexp274 = new BitSet(new long[]{0x0000002000004002L});
	public static final BitSet FOLLOW_DIV_in_multiexp277 = new BitSet(new long[]{0x000A040004061000L});
	public static final BitSet FOLLOW_atom_in_multiexp279 = new BitSet(new long[]{0x0000002000004002L});
	public static final BitSet FOLLOW_OPAR_in_atom292 = new BitSet(new long[]{0x0000102400004000L});
	public static final BitSet FOLLOW_expr_in_atom294 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CPAR_in_atom296 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_atom301 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_atom313 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_atom324 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_atom341 = new BitSet(new long[]{0x0000000000000002L});
}
