// $ANTLR 3.5 myCompiler.g 2017-06-24 21:26:41

		// import packages here.
		import java.util.HashMap;
		import java.util.ArrayList;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class myCompilerParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "CHAR", "COMMENT1", "COMMENT2", 
		"EscapeSequence", "FLOAT", "Floating_point_constant", "IF", "INCLUDE_TYPE", 
		"INT", "IandD_TITLE", "Identifier", "Integer_constant", "LIBARY_ID", "STRING_LITERAL", 
		"VOID", "WS", "'('", "')'", "'*'", "'+'", "','", "'-'", "'/'", "';'", 
		"'<'", "'='", "'>'", "'{'", "'}'"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public myCompilerParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public myCompilerParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return myCompilerParser.tokenNames; }
	@Override public String getGrammarFileName() { return "myCompiler.g"; }


			boolean TRACEON = false;
			HashMap<String,Integer> symtab = new HashMap<String,Integer>();
			int labelCount = 0;

			/*
			   public enum TypeInfo {
			   StringConstant,
			   Integer,
			   Float,
			   Unknown,
			   No_Exist,
			   Error
			   }
			 */

			/* attr_type:
			   1 => integer,
			   2 => float,
			   3 => String constant,
			   -1 => do not exist,
			   -2 => error
			 */

			List<String> DataCode = new ArrayList<String>();
			List<String> TextCode = new ArrayList<String>();

			/*t0 ~ t9*/
			public static register reg = new register(0, 6);

			/*
			 * Output prologue.
			 */
			void prologue(String id)
			{
					TextCode.add("\n\n/* Text section */");
					TextCode.add("\t.section .text");
					TextCode.add("\t.globl " + id);
					TextCode.add("\t.type " + id + ",%function");
					TextCode.add(id + ":");
					TextCode.add("\tmov ip, sp");
					TextCode.add("\tstmfd sp!, {r4-r10, fp, ip, lr, pc}");
					TextCode.add("\tsub fp, ip, #4\n");
			}

			/*
			 * Output epilogue.
			 */
			void epilogue()
			{
					/* handle epilogue */
					TextCode.add("\n\tldmea fp, {r4-r10, fp, sp, pc}");
			}


			/* Generate a new label */
			String newLabel()
			{
					labelCount ++;
					return (new String("L")) + Integer.toString(labelCount);
			}


			public List<String> getDataCode()
			{
					return DataCode;
			}

			public List<String> getTextCode()
			{
					return TextCode;
			}



	// $ANTLR start "program"
	// myCompiler.g:88:1: program : inlib declarations functions ;
	public final void program() throws RecognitionException {
		try {
			// myCompiler.g:89:3: ( inlib declarations functions )
			// myCompiler.g:89:3: inlib declarations functions
			{
			pushFollow(FOLLOW_inlib_in_program37);
			inlib();
			state._fsp--;

			pushFollow(FOLLOW_declarations_in_program39);
			declarations();
			state._fsp--;

			pushFollow(FOLLOW_functions_in_program41);
			functions();
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
	// $ANTLR end "program"



	// $ANTLR start "inlib"
	// myCompiler.g:92:1: inlib : ( INCLUDE_TYPE '<' LIBARY_ID '>' inlib | INCLUDE_TYPE '<' LIBARY_ID '>' );
	public final void inlib() throws RecognitionException {
		try {
			// myCompiler.g:93:3: ( INCLUDE_TYPE '<' LIBARY_ID '>' inlib | INCLUDE_TYPE '<' LIBARY_ID '>' )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==INCLUDE_TYPE) ) {
				int LA1_1 = input.LA(2);
				if ( (LA1_1==28) ) {
					int LA1_2 = input.LA(3);
					if ( (LA1_2==LIBARY_ID) ) {
						int LA1_3 = input.LA(4);
						if ( (LA1_3==30) ) {
							int LA1_4 = input.LA(5);
							if ( (LA1_4==INCLUDE_TYPE) ) {
								alt1=1;
							}
							else if ( (LA1_4==EOF||LA1_4==CHAR||LA1_4==FLOAT||LA1_4==INT||LA1_4==VOID) ) {
								alt1=2;
							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 1, 4, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 1, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 1, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

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
					// myCompiler.g:93:3: INCLUDE_TYPE '<' LIBARY_ID '>' inlib
					{
					match(input,INCLUDE_TYPE,FOLLOW_INCLUDE_TYPE_in_inlib50); 
					match(input,28,FOLLOW_28_in_inlib52); 
					match(input,LIBARY_ID,FOLLOW_LIBARY_ID_in_inlib54); 
					match(input,30,FOLLOW_30_in_inlib56); 
					pushFollow(FOLLOW_inlib_in_inlib58);
					inlib();
					state._fsp--;

					}
					break;
				case 2 :
					// myCompiler.g:94:3: INCLUDE_TYPE '<' LIBARY_ID '>'
					{
					match(input,INCLUDE_TYPE,FOLLOW_INCLUDE_TYPE_in_inlib63); 
					match(input,28,FOLLOW_28_in_inlib65); 
					match(input,LIBARY_ID,FOLLOW_LIBARY_ID_in_inlib67); 
					match(input,30,FOLLOW_30_in_inlib69); 
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
	// $ANTLR end "inlib"



	// $ANTLR start "functions"
	// myCompiler.g:96:1: functions : ( function functions |);
	public final void functions() throws RecognitionException {
		try {
			// myCompiler.g:97:3: ( function functions |)
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==CHAR||LA2_0==FLOAT||LA2_0==INT||LA2_0==VOID) ) {
				alt2=1;
			}
			else if ( (LA2_0==EOF) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// myCompiler.g:97:3: function functions
					{
					pushFollow(FOLLOW_function_in_functions79);
					function();
					state._fsp--;

					pushFollow(FOLLOW_functions_in_functions81);
					functions();
					state._fsp--;

					}
					break;
				case 2 :
					// myCompiler.g:99:1: 
					{
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
	// $ANTLR end "functions"



	// $ANTLR start "function"
	// myCompiler.g:101:1: function : type Identifier '(' ')' '{' l_declarations statements '}' ;
	public final void function() throws RecognitionException {
		Token Identifier1=null;

		try {
			// myCompiler.g:102:3: ( type Identifier '(' ')' '{' l_declarations statements '}' )
			// myCompiler.g:102:3: type Identifier '(' ')' '{' l_declarations statements '}'
			{
			pushFollow(FOLLOW_type_in_function92);
			type();
			state._fsp--;

			Identifier1=(Token)match(input,Identifier,FOLLOW_Identifier_in_function94); 
			match(input,20,FOLLOW_20_in_function96); 
			match(input,21,FOLLOW_21_in_function98); 
			match(input,31,FOLLOW_31_in_function100); 

					/* output function prologue */
					prologue((Identifier1!=null?Identifier1.getText():null));

			pushFollow(FOLLOW_l_declarations_in_function104);
			l_declarations();
			state._fsp--;

			pushFollow(FOLLOW_statements_in_function106);
			statements();
			state._fsp--;

			match(input,32,FOLLOW_32_in_function108); 

					if (TRACEON)
							System.out.println("type Identifier () {declarations statements}");

					/* output function epilogue */
					epilogue();

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
	// $ANTLR end "function"



	// $ANTLR start "declarations"
	// myCompiler.g:119:1: declarations : ( type Identifier ';' declarations |);
	public final void declarations() throws RecognitionException {
		Token Identifier2=null;
		int type3 =0;

		try {
			// myCompiler.g:120:1: ( type Identifier ';' declarations |)
			int alt3=2;
			switch ( input.LA(1) ) {
			case INT:
				{
				int LA3_1 = input.LA(2);
				if ( (LA3_1==Identifier) ) {
					int LA3_6 = input.LA(3);
					if ( (LA3_6==27) ) {
						alt3=1;
					}
					else if ( (LA3_6==20) ) {
						alt3=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 3, 6, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 3, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case FLOAT:
				{
				int LA3_2 = input.LA(2);
				if ( (LA3_2==Identifier) ) {
					int LA3_6 = input.LA(3);
					if ( (LA3_6==27) ) {
						alt3=1;
					}
					else if ( (LA3_6==20) ) {
						alt3=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 3, 6, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 3, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case VOID:
				{
				int LA3_3 = input.LA(2);
				if ( (LA3_3==Identifier) ) {
					int LA3_6 = input.LA(3);
					if ( (LA3_6==27) ) {
						alt3=1;
					}
					else if ( (LA3_6==20) ) {
						alt3=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 3, 6, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 3, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case CHAR:
				{
				int LA3_4 = input.LA(2);
				if ( (LA3_4==Identifier) ) {
					int LA3_6 = input.LA(3);
					if ( (LA3_6==27) ) {
						alt3=1;
					}
					else if ( (LA3_6==20) ) {
						alt3=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 3, 6, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 3, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case EOF:
				{
				alt3=2;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// myCompiler.g:121:1: type Identifier ';' declarations
					{
					pushFollow(FOLLOW_type_in_declarations122);
					type3=type();
					state._fsp--;

					Identifier2=(Token)match(input,Identifier,FOLLOW_Identifier_in_declarations124); 
					match(input,27,FOLLOW_27_in_declarations126); 

							if (TRACEON) System.out.println("declarations: type Identifier : declarations");
							if (symtab.containsKey((Identifier2!=null?Identifier2.getText():null)))
							{
									System.err.println("Type Error: " + Identifier2.getLine() + ": Redeclared identifier.");
							}
							else
							{
									/* Add ID and its attr_type into the symbol table. */
									symtab.put((Identifier2!=null?Identifier2.getText():null), type3);
							}

							/* code generation */
							switch(type3) {
									case 1:
											DataCode.add("\t.type "+ (Identifier2!=null?Identifier2.getText():null) +", %object");
											DataCode.add((Identifier2!=null?Identifier2.getText():null) + ":\n\t.word 0\n");
											break;
									case 2:
											DataCode.add("\t.type "+ (Identifier2!=null?Identifier2.getText():null) +", %object");
											DataCode.add((Identifier2!=null?Identifier2.getText():null) + ":\n\t.double 0\n");
											break;
									default:
							}

					pushFollow(FOLLOW_declarations_in_declarations132);
					declarations();
					state._fsp--;

					}
					break;
				case 2 :
					// myCompiler.g:148:3: 
					{
					 if (TRACEON) System.out.println("declarations: ");
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
	// $ANTLR end "declarations"



	// $ANTLR start "l_declarations"
	// myCompiler.g:152:1: l_declarations : ( type Identifier ';' l_declarations |);
	public final void l_declarations() throws RecognitionException {
		Token Identifier4=null;
		int type5 =0;

		try {
			// myCompiler.g:153:1: ( type Identifier ';' l_declarations |)
			int alt4=2;
			switch ( input.LA(1) ) {
			case INT:
				{
				int LA4_1 = input.LA(2);
				if ( (LA4_1==Identifier) ) {
					int LA4_5 = input.LA(3);
					if ( (LA4_5==27) ) {
						alt4=1;
					}
					else if ( (LA4_5==29) ) {
						alt4=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 4, 5, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case FLOAT:
				{
				int LA4_2 = input.LA(2);
				if ( (LA4_2==Identifier) ) {
					int LA4_5 = input.LA(3);
					if ( (LA4_5==27) ) {
						alt4=1;
					}
					else if ( (LA4_5==29) ) {
						alt4=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 4, 5, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case CHAR:
			case VOID:
				{
				alt4=1;
				}
				break;
			case IF:
			case Identifier:
			case 32:
				{
				alt4=2;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}
			switch (alt4) {
				case 1 :
					// myCompiler.g:154:1: type Identifier ';' l_declarations
					{
					pushFollow(FOLLOW_type_in_l_declarations146);
					type5=type();
					state._fsp--;

					Identifier4=(Token)match(input,Identifier,FOLLOW_Identifier_in_l_declarations148); 
					match(input,27,FOLLOW_27_in_l_declarations150); 

							/* If you want to handle local variables, fix it. */
							if (TRACEON) System.out.println("declarations: type Identifier : declarations");
							if (symtab.containsKey((Identifier4!=null?Identifier4.getText():null)))
							{
									System.err.println("Type Error: " + Identifier4.getLine() + ": Redeclared identifier.");
							}
							else
							{
									/* Add ID and its attr_type into the symbol table. */
									symtab.put((Identifier4!=null?Identifier4.getText():null), type5);
							}
							switch(type5) {
									case 1:
											DataCode.add("\t.type "+ (Identifier4!=null?Identifier4.getText():null) +", %object");
											DataCode.add((Identifier4!=null?Identifier4.getText():null) + ":\n\t.word 0\n");
											break;
									case 2:
											DataCode.add("\t.type "+ (Identifier4!=null?Identifier4.getText():null) +", %object");
											DataCode.add((Identifier4!=null?Identifier4.getText():null) + ":\n\t.double 0\n");
											break;
									default:
							}

					pushFollow(FOLLOW_l_declarations_in_l_declarations156);
					l_declarations();
					state._fsp--;

					}
					break;
				case 2 :
					// myCompiler.g:180:3: 
					{
					 if (TRACEON) System.out.println("declarations: ");
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
	// $ANTLR end "l_declarations"



	// $ANTLR start "type"
	// myCompiler.g:184:1: type returns [int attr_type] : ( INT | FLOAT | VOID | CHAR );
	public final int type() throws RecognitionException {
		int attr_type = 0;


		try {
			// myCompiler.g:185:3: ( INT | FLOAT | VOID | CHAR )
			int alt5=4;
			switch ( input.LA(1) ) {
			case INT:
				{
				alt5=1;
				}
				break;
			case FLOAT:
				{
				alt5=2;
				}
				break;
			case VOID:
				{
				alt5=3;
				}
				break;
			case CHAR:
				{
				alt5=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// myCompiler.g:185:3: INT
					{
					match(input,INT,FOLLOW_INT_in_type174); 
					 if (TRACEON) System.out.println("type: INT");  attr_type =1; 
					}
					break;
				case 2 :
					// myCompiler.g:186:3: FLOAT
					{
					match(input,FLOAT,FOLLOW_FLOAT_in_type182); 
					 if (TRACEON) System.out.println("type: FLOAT");  attr_type =2; 
					}
					break;
				case 3 :
					// myCompiler.g:187:3: VOID
					{
					match(input,VOID,FOLLOW_VOID_in_type188); 
					}
					break;
				case 4 :
					// myCompiler.g:188:3: CHAR
					{
					match(input,CHAR,FOLLOW_CHAR_in_type192); 
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
		return attr_type;
	}
	// $ANTLR end "type"



	// $ANTLR start "statements"
	// myCompiler.g:191:1: statements : ( statement statements |);
	public final void statements() throws RecognitionException {
		try {
			// myCompiler.g:191:11: ( statement statements |)
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==FLOAT||LA6_0==IF||LA6_0==INT||LA6_0==Identifier) ) {
				alt6=1;
			}
			else if ( (LA6_0==32) ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// myCompiler.g:191:13: statement statements
					{
					pushFollow(FOLLOW_statement_in_statements200);
					statement();
					state._fsp--;

					pushFollow(FOLLOW_statements_in_statements202);
					statements();
					state._fsp--;

					}
					break;
				case 2 :
					// myCompiler.g:193:1: 
					{
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
	// $ANTLR end "statements"


	public static class statement_return extends ParserRuleReturnScope {
		public int attr_type;
		public int num_reg;
	};


	// $ANTLR start "statement"
	// myCompiler.g:195:1: statement returns [int attr_type , int num_reg] : ( ( INT | FLOAT )? Identifier '=' arith_expression ';' | IF '(' arith_expression ')' if_then_statements | Identifier func_argument );
	public final myCompilerParser.statement_return statement() throws RecognitionException {
		myCompilerParser.statement_return retval = new myCompilerParser.statement_return();
		retval.start = input.LT(1);

		Token Identifier6=null;
		ParserRuleReturnScope arith_expression7 =null;
		ParserRuleReturnScope func_argument8 =null;

		try {
			// myCompiler.g:196:3: ( ( INT | FLOAT )? Identifier '=' arith_expression ';' | IF '(' arith_expression ')' if_then_statements | Identifier func_argument )
			int alt8=3;
			switch ( input.LA(1) ) {
			case FLOAT:
			case INT:
				{
				alt8=1;
				}
				break;
			case Identifier:
				{
				int LA8_2 = input.LA(2);
				if ( (LA8_2==29) ) {
					alt8=1;
				}
				else if ( (LA8_2==20) ) {
					alt8=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 8, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case IF:
				{
				alt8=2;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}
			switch (alt8) {
				case 1 :
					// myCompiler.g:196:3: ( INT | FLOAT )? Identifier '=' arith_expression ';'
					{
					// myCompiler.g:196:3: ( INT | FLOAT )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==FLOAT||LA7_0==INT) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// myCompiler.g:
							{
							if ( input.LA(1)==FLOAT||input.LA(1)==INT ) {
								input.consume();
								state.errorRecovery=false;
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							}
							break;

					}

					Identifier6=(Token)match(input,Identifier,FOLLOW_Identifier_in_statement227); 
					match(input,29,FOLLOW_29_in_statement229); 
					pushFollow(FOLLOW_arith_expression_in_statement231);
					arith_expression7=arith_expression();
					state._fsp--;

					match(input,27,FOLLOW_27_in_statement233); 

							if (symtab.containsKey((Identifier6!=null?Identifier6.getText():null)))
							{
									retval.attr_type = symtab.get((Identifier6!=null?Identifier6.getText():null));
							}
							else
							{
									/* Add codes to report and handle this error */
									System.err.println("Type Error: " + Identifier6.getLine() + ": Undeclared identifier.");

									retval.attr_type = -2;
							}
							if (retval.attr_type != (arith_expression7!=null?((myCompilerParser.arith_expression_return)arith_expression7).attr_type:0))
							{
									System.err.println("Type Error: " + (arith_expression7!=null?(arith_expression7.start):null).getLine() +	": Type mismatch for the two silde operands in an assignment statement.");
									retval.attr_type = -2;
							}
							else
							{
									if(retval.attr_type == -2 && (arith_expression7!=null?((myCompilerParser.arith_expression_return)arith_expression7).attr_type:0) == -2)
									{
											System.err.println("Type Error: " + (arith_expression7!=null?(arith_expression7.start):null).getLine() + ": Type mismatch for the two silde operands in an assignment statement.");
											retval.attr_type = -2;
									}
							}

							/* code generation */
							retval.num_reg = reg.get();
							TextCode.add("\tldr r" + retval.num_reg + ",=" + (Identifier6!=null?Identifier6.getText():null));
							TextCode.add("\tstr r" + (arith_expression7!=null?((myCompilerParser.arith_expression_return)arith_expression7).reg_num:0) + ",[r" + retval.num_reg + "]");
							reg.set(" " + retval.num_reg );
							reg.set(" " + (arith_expression7!=null?((myCompilerParser.arith_expression_return)arith_expression7).reg_num:0) ); /*new*/

					}
					break;
				case 2 :
					// myCompiler.g:230:3: IF '(' arith_expression ')' if_then_statements
					{
					match(input,IF,FOLLOW_IF_in_statement239); 
					match(input,20,FOLLOW_20_in_statement241); 
					pushFollow(FOLLOW_arith_expression_in_statement243);
					arith_expression();
					state._fsp--;

					match(input,21,FOLLOW_21_in_statement245); 
					pushFollow(FOLLOW_if_then_statements_in_statement247);
					if_then_statements();
					state._fsp--;

					}
					break;
				case 3 :
					// myCompiler.g:231:3: Identifier func_argument
					{
					match(input,Identifier,FOLLOW_Identifier_in_statement251); 
					pushFollow(FOLLOW_func_argument_in_statement253);
					func_argument8=func_argument();
					state._fsp--;


							retval.num_reg = reg.get();
							/* code generation */
							if((func_argument8!=null?((myCompilerParser.func_argument_return)func_argument8).p:0) == 1)
							{
									TextCode.add("\tldr r0,=" + (func_argument8!=null?((myCompilerParser.func_argument_return)func_argument8).label:null));
									TextCode.add("\tmov r" + retval.num_reg + ",r" + (func_argument8!=null?((myCompilerParser.func_argument_return)func_argument8).reg_num:0));
									TextCode.add("\tbl printf");
							}
							else if((func_argument8!=null?((myCompilerParser.func_argument_return)func_argument8).p:0) == 2)
							{
									TextCode.add("\tldr r0,=" + (func_argument8!=null?((myCompilerParser.func_argument_return)func_argument8).label:null));
									TextCode.add("\tmov r" + retval.num_reg + ",r" + (func_argument8!=null?((myCompilerParser.func_argument_return)func_argument8).reg_num:0));
									TextCode.add("\tbl printf");
							}
							//TextCode.add("\tsyscall");

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
		}
		return retval;
	}
	// $ANTLR end "statement"


	public static class func_argument_return extends ParserRuleReturnScope {
		public String label;
		public int p;
		public int attr_type;
		public int reg_num;
	};


	// $ANTLR start "func_argument"
	// myCompiler.g:252:1: func_argument returns [String label, int p, int attr_type , int reg_num] : ( '(' ')' ';' | '(' a= arith_expression ( ',' Identifier )* ')' ';' );
	public final myCompilerParser.func_argument_return func_argument() throws RecognitionException {
		myCompilerParser.func_argument_return retval = new myCompilerParser.func_argument_return();
		retval.start = input.LT(1);

		Token Identifier9=null;
		ParserRuleReturnScope a =null;

		try {
			// myCompiler.g:253:3: ( '(' ')' ';' | '(' a= arith_expression ( ',' Identifier )* ')' ';' )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==20) ) {
				int LA10_1 = input.LA(2);
				if ( (LA10_1==21) ) {
					alt10=1;
				}
				else if ( (LA10_1==Floating_point_constant||(LA10_1 >= Identifier && LA10_1 <= Integer_constant)||LA10_1==STRING_LITERAL||LA10_1==20||LA10_1==25) ) {
					alt10=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 10, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// myCompiler.g:253:3: '(' ')' ';'
					{
					match(input,20,FOLLOW_20_in_func_argument269); 
					match(input,21,FOLLOW_21_in_func_argument271); 
					match(input,27,FOLLOW_27_in_func_argument273); 

							/* handle function calls here. */

					}
					break;
				case 2 :
					// myCompiler.g:257:3: '(' a= arith_expression ( ',' Identifier )* ')' ';'
					{
					match(input,20,FOLLOW_20_in_func_argument279); 
					pushFollow(FOLLOW_arith_expression_in_func_argument285);
					a=arith_expression();
					state._fsp--;


							retval.p = 1;
							/* handle function calls here. */

							if((a!=null?((myCompilerParser.arith_expression_return)a).attr_type:0) == 3)
							{ // handle string type.
									retval.label = newLabel();
									DataCode.add(retval.label + ":");
									DataCode.add("\t.ascii " + (a!=null?((myCompilerParser.arith_expression_return)a).str:null));
							}

					// myCompiler.g:269:2: ( ',' Identifier )*
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( (LA9_0==24) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// myCompiler.g:270:2: ',' Identifier
							{
							match(input,24,FOLLOW_24_in_func_argument292); 
							Identifier9=(Token)match(input,Identifier,FOLLOW_Identifier_in_func_argument294); 

							 		 retval.p = 2;
							 		 if(symtab.containsKey((Identifier9!=null?Identifier9.getText():null)))
									 {
									 		 retval.attr_type = symtab.get((Identifier9!=null?Identifier9.getText():null));
									 }
									 else
									 {
									 		 retval.attr_type = -2;
									 		 System.err.println("Type Error: " + Identifier9.getLine() + ": Undeclared identifier.");
									 }

									 //retval.reg_num = reg.get();
									 //TextCode.add("\tldr r" + retval.reg_num + ",=" + (Identifier9!=null?Identifier9.getText():null) + " haha");
									 //TextCode.add("\tstr " + "r" + (a!=null?((myCompilerParser.arith_expression_return)a).reg_num:0) + ",[r" + retval.reg_num + "]");
									 //reg.set(" " + retval.reg_num);
							 
							}
							break;

						default :
							break loop9;
						}
					}

					match(input,21,FOLLOW_21_in_func_argument305); 
					match(input,27,FOLLOW_27_in_func_argument307); 
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
		}
		return retval;
	}
	// $ANTLR end "func_argument"


	public static class arith_expression_return extends ParserRuleReturnScope {
		public int attr_type;
		public int reg_num;
		public String str;
	};


	// $ANTLR start "arith_expression"
	// myCompiler.g:294:1: arith_expression returns [int attr_type, int reg_num, String str] : a= multExpr ( '+' b= multExpr | '-' c= multExpr )* ;
	public final myCompilerParser.arith_expression_return arith_expression() throws RecognitionException {
		myCompilerParser.arith_expression_return retval = new myCompilerParser.arith_expression_return();
		retval.start = input.LT(1);

		ParserRuleReturnScope a =null;
		ParserRuleReturnScope b =null;
		ParserRuleReturnScope c =null;

		try {
			// myCompiler.g:295:3: (a= multExpr ( '+' b= multExpr | '-' c= multExpr )* )
			// myCompiler.g:295:3: a= multExpr ( '+' b= multExpr | '-' c= multExpr )*
			{
			pushFollow(FOLLOW_multExpr_in_arith_expression325);
			a=multExpr();
			state._fsp--;


					retval.attr_type = (a!=null?((myCompilerParser.multExpr_return)a).attr_type:0);
					retval.reg_num = (a!=null?((myCompilerParser.multExpr_return)a).reg_num:0);
					retval.str = (a!=null?((myCompilerParser.multExpr_return)a).str:null);

			// myCompiler.g:301:3: ( '+' b= multExpr | '-' c= multExpr )*
			loop11:
			while (true) {
				int alt11=3;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==23) ) {
					alt11=1;
				}
				else if ( (LA11_0==25) ) {
					alt11=2;
				}

				switch (alt11) {
				case 1 :
					// myCompiler.g:301:3: '+' b= multExpr
					{
					match(input,23,FOLLOW_23_in_arith_expression331); 
					pushFollow(FOLLOW_multExpr_in_arith_expression337);
					b=multExpr();
					state._fsp--;


					  if ((a!=null?((myCompilerParser.multExpr_return)a).attr_type:0) != (b!=null?((myCompilerParser.multExpr_return)b).attr_type:0))
					  {
					  		System.err.println("Type Error: " + (a!=null?(a.start):null).getLine() + ": Type mismatch for the operator + in an expression.");
					  		retval.attr_type = -2;
					  }
					  else
					  {
					  		  if((a!=null?((myCompilerParser.multExpr_return)a).attr_type:0) == -2 && (b!=null?((myCompilerParser.multExpr_return)b).attr_type:0) == -2)
							  {
							  		  System.err.println("Type Error: " + (a!=null?(a.start):null).getLine() +": Type mismatch for the operator + in an expression.");
							  		  retval.attr_type = -2;
							  }
					  }

					  /* code generation */
						TextCode.add("\tadd r" + retval.reg_num + ",r" + (b!=null?((myCompilerParser.multExpr_return)b).reg_num:0) + ",r" + retval.reg_num);
						reg.set(" " + (b!=null?((myCompilerParser.multExpr_return)b).reg_num:0)); /*new*/

					}
					break;
				case 2 :
					// myCompiler.g:321:3: '-' c= multExpr
					{
					match(input,25,FOLLOW_25_in_arith_expression343); 
					pushFollow(FOLLOW_multExpr_in_arith_expression349);
					c=multExpr();
					state._fsp--;


							if ((a!=null?((myCompilerParser.multExpr_return)a).attr_type:0) != (c!=null?((myCompilerParser.multExpr_return)c).attr_type:0))
							{
									System.err.println("Type Error: " + (a!=null?(a.start):null).getLine() + ": Type mismatch for the operator - in an expression.");
									retval.attr_type = -2;
							}
							else
							{
									if((a!=null?((myCompilerParser.multExpr_return)a).attr_type:0) == -2 && (c!=null?((myCompilerParser.multExpr_return)c).attr_type:0) == -2)
									{
											System.err.println("Type Error: " + (a!=null?(a.start):null).getLine() +": Type mismatch for the operator - in an expression.");
											retval.attr_type = -2;
									}
							}
							TextCode.add("\tsub r" + retval.reg_num + ",r" + retval.reg_num + ",r" + (c!=null?((myCompilerParser.multExpr_return)c).reg_num:0));
							reg.set(" " + retval.reg_num); /*new*/
							reg.set(" " + (c!=null?((myCompilerParser.multExpr_return)c).reg_num:0)); /*new*/

					}
					break;

				default :
					break loop11;
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
		}
		return retval;
	}
	// $ANTLR end "arith_expression"


	public static class multExpr_return extends ParserRuleReturnScope {
		public int attr_type;
		public int reg_num;
		public String str;
	};


	// $ANTLR start "multExpr"
	// myCompiler.g:344:1: multExpr returns [int attr_type, int reg_num, String str] : a= signExpr ( '*' b= signExpr | '/' c= signExpr )* ;
	public final myCompilerParser.multExpr_return multExpr() throws RecognitionException {
		myCompilerParser.multExpr_return retval = new myCompilerParser.multExpr_return();
		retval.start = input.LT(1);

		ParserRuleReturnScope a =null;
		ParserRuleReturnScope b =null;
		ParserRuleReturnScope c =null;

		try {
			// myCompiler.g:345:3: (a= signExpr ( '*' b= signExpr | '/' c= signExpr )* )
			// myCompiler.g:345:3: a= signExpr ( '*' b= signExpr | '/' c= signExpr )*
			{
			pushFollow(FOLLOW_signExpr_in_multExpr372);
			a=signExpr();
			state._fsp--;


					retval.attr_type = (a!=null?((myCompilerParser.signExpr_return)a).attr_type:0);
					retval.reg_num = (a!=null?((myCompilerParser.signExpr_return)a).reg_num:0);
					retval.str = (a!=null?((myCompilerParser.signExpr_return)a).str:null);

			// myCompiler.g:351:3: ( '*' b= signExpr | '/' c= signExpr )*
			loop12:
			while (true) {
				int alt12=3;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==22) ) {
					alt12=1;
				}
				else if ( (LA12_0==26) ) {
					alt12=2;
				}

				switch (alt12) {
				case 1 :
					// myCompiler.g:351:3: '*' b= signExpr
					{
					match(input,22,FOLLOW_22_in_multExpr378); 
					pushFollow(FOLLOW_signExpr_in_multExpr384);
					b=signExpr();
					state._fsp--;


							if((a!=null?((myCompilerParser.signExpr_return)a).attr_type:0) != (b!=null?((myCompilerParser.signExpr_return)b).attr_type:0))
							{
									System.err.println("Type Error: " + (a!=null?(a.start):null).getLine() +": Type mismatch for the operator * in an expression.");
									retval.attr_type = -2;
							}
							else
							{
									if((a!=null?((myCompilerParser.signExpr_return)a).attr_type:0) == -2 && (b!=null?((myCompilerParser.signExpr_return)b).attr_type:0) == -2)
									{
											System.err.println("Type Error: " + (a!=null?(a.start):null).getLine() +": Type mismatch for the operator * in an expression.");
											retval.attr_type = -2;
									}
							}
							TextCode.add("\tmul r" + retval.reg_num + ",r" + retval.reg_num + ",r" + (b!=null?((myCompilerParser.signExpr_return)b).reg_num:0));
							reg.set(" " + retval.reg_num);
							reg.set(" " + (b!=null?((myCompilerParser.signExpr_return)b).reg_num:0)); /*new*/


					}
					break;
				case 2 :
					// myCompiler.g:371:3: '/' c= signExpr
					{
					match(input,26,FOLLOW_26_in_multExpr390); 
					pushFollow(FOLLOW_signExpr_in_multExpr396);
					c=signExpr();
					state._fsp--;


							if((a!=null?((myCompilerParser.signExpr_return)a).attr_type:0) != (c!=null?((myCompilerParser.signExpr_return)c).attr_type:0))
							{
									System.err.println("Type Error: " + (a!=null?(a.start):null).getLine() +": Type mismatch for the operator / in an expression.");
									retval.attr_type = -2;
							}
							else
							{
									if((a!=null?((myCompilerParser.signExpr_return)a).attr_type:0) == -2 && (c!=null?((myCompilerParser.signExpr_return)c).attr_type:0) == -2)
									{
											System.err.println("Type Error: " + (a!=null?(a.start):null).getLine() +": Type mismatch for the operator / in an expression.");
											retval.attr_type = -2;
									}
							}
							TextCode.add("\tdiv r" + retval.reg_num + ",r" + retval.reg_num + ",r" + (c!=null?((myCompilerParser.signExpr_return)c).reg_num:0));
							reg.set(" " + retval.reg_num);
							reg.set(" " + (c!=null?((myCompilerParser.signExpr_return)c).reg_num:0));


					}
					break;

				default :
					break loop12;
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
		}
		return retval;
	}
	// $ANTLR end "multExpr"


	public static class signExpr_return extends ParserRuleReturnScope {
		public int attr_type;
		public int reg_num;
		public String str;
	};


	// $ANTLR start "signExpr"
	// myCompiler.g:394:1: signExpr returns [int attr_type, int reg_num, String str] : ( primaryExpr | '-' primaryExpr );
	public final myCompilerParser.signExpr_return signExpr() throws RecognitionException {
		myCompilerParser.signExpr_return retval = new myCompilerParser.signExpr_return();
		retval.start = input.LT(1);

		ParserRuleReturnScope primaryExpr10 =null;

		try {
			// myCompiler.g:395:3: ( primaryExpr | '-' primaryExpr )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0==Floating_point_constant||(LA13_0 >= Identifier && LA13_0 <= Integer_constant)||LA13_0==STRING_LITERAL||LA13_0==20) ) {
				alt13=1;
			}
			else if ( (LA13_0==25) ) {
				alt13=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// myCompiler.g:395:3: primaryExpr
					{
					pushFollow(FOLLOW_primaryExpr_in_signExpr416);
					primaryExpr10=primaryExpr();
					state._fsp--;


							retval.attr_type = (primaryExpr10!=null?((myCompilerParser.primaryExpr_return)primaryExpr10).attr_type:0);
							retval.reg_num = (primaryExpr10!=null?((myCompilerParser.primaryExpr_return)primaryExpr10).reg_num:0);
							retval.str = (primaryExpr10!=null?((myCompilerParser.primaryExpr_return)primaryExpr10).str:null);

					}
					break;
				case 2 :
					// myCompiler.g:401:3: '-' primaryExpr
					{
					match(input,25,FOLLOW_25_in_signExpr422); 
					pushFollow(FOLLOW_primaryExpr_in_signExpr424);
					primaryExpr();
					state._fsp--;

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
		}
		return retval;
	}
	// $ANTLR end "signExpr"


	public static class primaryExpr_return extends ParserRuleReturnScope {
		public int attr_type;
		public int reg_num;
		public String str;
		public int reg_num2;
	};


	// $ANTLR start "primaryExpr"
	// myCompiler.g:405:1: primaryExpr returns [int attr_type, int reg_num, String str , int reg_num2] : ( Integer_constant | Floating_point_constant | STRING_LITERAL | Identifier | '(' arith_expression ')' );
	public final myCompilerParser.primaryExpr_return primaryExpr() throws RecognitionException {
		myCompilerParser.primaryExpr_return retval = new myCompilerParser.primaryExpr_return();
		retval.start = input.LT(1);

		Token Integer_constant11=null;
		Token STRING_LITERAL12=null;
		Token Identifier13=null;
		ParserRuleReturnScope arith_expression14 =null;

		try {
			// myCompiler.g:406:3: ( Integer_constant | Floating_point_constant | STRING_LITERAL | Identifier | '(' arith_expression ')' )
			int alt14=5;
			switch ( input.LA(1) ) {
			case Integer_constant:
				{
				alt14=1;
				}
				break;
			case Floating_point_constant:
				{
				alt14=2;
				}
				break;
			case STRING_LITERAL:
				{
				alt14=3;
				}
				break;
			case Identifier:
				{
				alt14=4;
				}
				break;
			case 20:
				{
				alt14=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}
			switch (alt14) {
				case 1 :
					// myCompiler.g:406:3: Integer_constant
					{
					Integer_constant11=(Token)match(input,Integer_constant,FOLLOW_Integer_constant_in_primaryExpr438); 

							retval.attr_type = 1;
							retval.str = null;

							/* code generation */
							retval.reg_num = reg.get();  /* get an register */
							TextCode.add("\tmov r" + retval.reg_num + ", #" + (Integer_constant11!=null?Integer_constant11.getText():null));


					}
					break;
				case 2 :
					// myCompiler.g:416:3: Floating_point_constant
					{
					match(input,Floating_point_constant,FOLLOW_Floating_point_constant_in_primaryExpr444); 

							retval.attr_type = 2;
							retval.str = null;

							/* code generation */

					}
					break;
				case 3 :
					// myCompiler.g:423:3: STRING_LITERAL
					{
					STRING_LITERAL12=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_primaryExpr450); 

							retval.attr_type = 3;
							retval.str = (STRING_LITERAL12!=null?STRING_LITERAL12.getText():null);


					}
					break;
				case 4 :
					// myCompiler.g:429:3: Identifier
					{
					Identifier13=(Token)match(input,Identifier,FOLLOW_Identifier_in_primaryExpr456); 

					//		retval.attr_type = symtab.get((Identifier13!=null?Identifier13.getText():null));
							if(symtab.containsKey((Identifier13!=null?Identifier13.getText():null)))
							{
									retval.attr_type = symtab.get((Identifier13!=null?Identifier13.getText():null));
							}
							else
							{
									System.err.println("Type Error: " + Identifier13.getLine() + ": Undeclared identifier.");
									retval.attr_type = -2;
							}
							//         retval.str = null;
							retval.str = (Identifier13!=null?Identifier13.getText():null); /*new*/

							/* code generation */
							retval.reg_num = reg.get(); /* get an register */
							retval.reg_num2 = reg.get();
							TextCode.add("\tldr r" + retval.reg_num + ",=" +(Identifier13!=null?Identifier13.getText():null));
							TextCode.add("\tstr r" + retval.reg_num2 + ",[r" + retval.reg_num + "]");

					}
					break;
				case 5 :
					// myCompiler.g:450:3: '(' arith_expression ')'
					{
					match(input,20,FOLLOW_20_in_primaryExpr462); 
					pushFollow(FOLLOW_arith_expression_in_primaryExpr464);
					arith_expression14=arith_expression();
					state._fsp--;

					match(input,21,FOLLOW_21_in_primaryExpr466); 
					 retval.attr_type = (arith_expression14!=null?((myCompilerParser.arith_expression_return)arith_expression14).attr_type:0); 
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
		}
		return retval;
	}
	// $ANTLR end "primaryExpr"



	// $ANTLR start "if_then_statements"
	// myCompiler.g:454:1: if_then_statements : ( statement | '{' statements '}' );
	public final void if_then_statements() throws RecognitionException {
		try {
			// myCompiler.g:455:3: ( statement | '{' statements '}' )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==FLOAT||LA15_0==IF||LA15_0==INT||LA15_0==Identifier) ) {
				alt15=1;
			}
			else if ( (LA15_0==31) ) {
				alt15=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// myCompiler.g:455:3: statement
					{
					pushFollow(FOLLOW_statement_in_if_then_statements478);
					statement();
					state._fsp--;

					}
					break;
				case 2 :
					// myCompiler.g:456:3: '{' statements '}'
					{
					match(input,31,FOLLOW_31_in_if_then_statements482); 
					pushFollow(FOLLOW_statements_in_if_then_statements484);
					statements();
					state._fsp--;

					match(input,32,FOLLOW_32_in_if_then_statements486); 
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
	// $ANTLR end "if_then_statements"

	// Delegated rules



	public static final BitSet FOLLOW_inlib_in_program37 = new BitSet(new long[]{0x0000000000041110L});
	public static final BitSet FOLLOW_declarations_in_program39 = new BitSet(new long[]{0x0000000000041110L});
	public static final BitSet FOLLOW_functions_in_program41 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INCLUDE_TYPE_in_inlib50 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_inlib52 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_LIBARY_ID_in_inlib54 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_inlib56 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_inlib_in_inlib58 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INCLUDE_TYPE_in_inlib63 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_28_in_inlib65 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_LIBARY_ID_in_inlib67 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_30_in_inlib69 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_function_in_functions79 = new BitSet(new long[]{0x0000000000041110L});
	public static final BitSet FOLLOW_functions_in_functions81 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_function92 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_Identifier_in_function94 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_function96 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_function98 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_31_in_function100 = new BitSet(new long[]{0x0000000100045510L});
	public static final BitSet FOLLOW_l_declarations_in_function104 = new BitSet(new long[]{0x0000000100005500L});
	public static final BitSet FOLLOW_statements_in_function106 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_function108 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_declarations122 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_Identifier_in_declarations124 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_declarations126 = new BitSet(new long[]{0x0000000000041110L});
	public static final BitSet FOLLOW_declarations_in_declarations132 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_l_declarations146 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_Identifier_in_l_declarations148 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_l_declarations150 = new BitSet(new long[]{0x0000000000041110L});
	public static final BitSet FOLLOW_l_declarations_in_l_declarations156 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_type174 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_type182 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VOID_in_type188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CHAR_in_type192 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statements200 = new BitSet(new long[]{0x0000000000005500L});
	public static final BitSet FOLLOW_statements_in_statements202 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_statement227 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_29_in_statement229 = new BitSet(new long[]{0x000000000212C200L});
	public static final BitSet FOLLOW_arith_expression_in_statement231 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_statement233 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_statement239 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_20_in_statement241 = new BitSet(new long[]{0x000000000212C200L});
	public static final BitSet FOLLOW_arith_expression_in_statement243 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_statement245 = new BitSet(new long[]{0x0000000080005500L});
	public static final BitSet FOLLOW_if_then_statements_in_statement247 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_statement251 = new BitSet(new long[]{0x0000000000100000L});
	public static final BitSet FOLLOW_func_argument_in_statement253 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_func_argument269 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_func_argument271 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_func_argument273 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_func_argument279 = new BitSet(new long[]{0x000000000212C200L});
	public static final BitSet FOLLOW_arith_expression_in_func_argument285 = new BitSet(new long[]{0x0000000001200000L});
	public static final BitSet FOLLOW_24_in_func_argument292 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_Identifier_in_func_argument294 = new BitSet(new long[]{0x0000000001200000L});
	public static final BitSet FOLLOW_21_in_func_argument305 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_27_in_func_argument307 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression325 = new BitSet(new long[]{0x0000000002800002L});
	public static final BitSet FOLLOW_23_in_arith_expression331 = new BitSet(new long[]{0x000000000212C200L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression337 = new BitSet(new long[]{0x0000000002800002L});
	public static final BitSet FOLLOW_25_in_arith_expression343 = new BitSet(new long[]{0x000000000212C200L});
	public static final BitSet FOLLOW_multExpr_in_arith_expression349 = new BitSet(new long[]{0x0000000002800002L});
	public static final BitSet FOLLOW_signExpr_in_multExpr372 = new BitSet(new long[]{0x0000000004400002L});
	public static final BitSet FOLLOW_22_in_multExpr378 = new BitSet(new long[]{0x000000000212C200L});
	public static final BitSet FOLLOW_signExpr_in_multExpr384 = new BitSet(new long[]{0x0000000004400002L});
	public static final BitSet FOLLOW_26_in_multExpr390 = new BitSet(new long[]{0x000000000212C200L});
	public static final BitSet FOLLOW_signExpr_in_multExpr396 = new BitSet(new long[]{0x0000000004400002L});
	public static final BitSet FOLLOW_primaryExpr_in_signExpr416 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_25_in_signExpr422 = new BitSet(new long[]{0x000000000012C200L});
	public static final BitSet FOLLOW_primaryExpr_in_signExpr424 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Integer_constant_in_primaryExpr438 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Floating_point_constant_in_primaryExpr444 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_LITERAL_in_primaryExpr450 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_primaryExpr456 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_primaryExpr462 = new BitSet(new long[]{0x000000000212C200L});
	public static final BitSet FOLLOW_arith_expression_in_primaryExpr464 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_primaryExpr466 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_if_then_statements478 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_31_in_if_then_statements482 = new BitSet(new long[]{0x0000000100005500L});
	public static final BitSet FOLLOW_statements_in_if_then_statements484 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_32_in_if_then_statements486 = new BitSet(new long[]{0x0000000000000002L});
}
