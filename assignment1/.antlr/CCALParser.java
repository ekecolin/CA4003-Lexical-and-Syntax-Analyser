// Generated from c://Users//Ekeco//Documents//antlr4//assignment1//CCAL.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CCALParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MAIN=1, VAR=2, CONST=3, TRUE=4, FALSE=5, NUMBERER=6, BOOLEAN=7, VOID=8, 
		IF=9, ELSE=10, WHILE=11, RETURN=12, SKIPS=13, EQUAL=14, PLUS=15, MINUS=16, 
		TILDA=17, OR=18, AND=19, EQUALTO=20, NOTEQUALTO=21, LT=22, GT=23, LTE=24, 
		GTE=25, COMMA=26, SEMICOLON=27, COLON=28, LCB=29, RCB=30, LB=31, RB=32, 
		BOOLVAL=33, ID=34, NUMBER=35, WS=36, NESTEDCOMMENTS=37, SINGLINECOMMENT=38;
	public static final int
		RULE_prog = 0, RULE_decl_list = 1, RULE_decl = 2, RULE_var_decl = 3, RULE_const_decl = 4, 
		RULE_function_list = 5, RULE_function = 6, RULE_type = 7, RULE_parameter_list = 8, 
		RULE_nemp_parameter_list = 9, RULE_main = 10, RULE_statement_block = 11, 
		RULE_statement = 12, RULE_expression = 13, RULE_binary_arith_op = 14, 
		RULE_fragm = 15, RULE_condition = 16, RULE_comp_op = 17, RULE_arg_list = 18, 
		RULE_nemp_arg_list = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "decl_list", "decl", "var_decl", "const_decl", "function_list", 
			"function", "type", "parameter_list", "nemp_parameter_list", "main", 
			"statement_block", "statement", "expression", "binary_arith_op", "fragm", 
			"condition", "comp_op", "arg_list", "nemp_arg_list"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "'skip'", "'='", "'+'", "'-'", "'~'", "'||'", "'&&'", "'=='", "'!='", 
			"'<'", "'>'", "'<='", "'>='", "','", "';'", "':'", "'{'", "'}'", "'('", 
			"')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MAIN", "VAR", "CONST", "TRUE", "FALSE", "NUMBERER", "BOOLEAN", 
			"VOID", "IF", "ELSE", "WHILE", "RETURN", "SKIPS", "EQUAL", "PLUS", "MINUS", 
			"TILDA", "OR", "AND", "EQUALTO", "NOTEQUALTO", "LT", "GT", "LTE", "GTE", 
			"COMMA", "SEMICOLON", "COLON", "LCB", "RCB", "LB", "RB", "BOOLVAL", "ID", 
			"NUMBER", "WS", "NESTEDCOMMENTS", "SINGLINECOMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "CCAL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CCALParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public Decl_listContext decl_list() {
			return getRuleContext(Decl_listContext.class,0);
		}
		public Function_listContext function_list() {
			return getRuleContext(Function_listContext.class,0);
		}
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CCALParser.EOF, 0); }
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			setState(45);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAIN:
			case VAR:
			case CONST:
			case NUMBERER:
			case BOOLEAN:
			case VOID:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(40);
				decl_list();
				setState(41);
				function_list();
				setState(42);
				main();
				}
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				match(EOF);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Decl_listContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CCALParser.SEMICOLON, 0); }
		public Decl_listContext decl_list() {
			return getRuleContext(Decl_listContext.class,0);
		}
		public Decl_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_list; }
	}

	public final Decl_listContext decl_list() throws RecognitionException {
		Decl_listContext _localctx = new Decl_listContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decl_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR || _la==CONST) {
				{
				setState(47);
				decl();
				setState(48);
				match(SEMICOLON);
				setState(49);
				decl_list();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclContext extends ParserRuleContext {
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public Const_declContext const_decl() {
			return getRuleContext(Const_declContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl);
		try {
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				var_decl();
				}
				break;
			case CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				const_decl();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Var_declContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(CCALParser.VAR, 0); }
		public TerminalNode ID() { return getToken(CCALParser.ID, 0); }
		public TerminalNode COLON() { return getToken(CCALParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(VAR);
			setState(58);
			match(ID);
			setState(59);
			match(COLON);
			setState(60);
			type();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Const_declContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(CCALParser.CONST, 0); }
		public TerminalNode ID() { return getToken(CCALParser.ID, 0); }
		public TerminalNode COLON() { return getToken(CCALParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(CCALParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Const_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_decl; }
	}

	public final Const_declContext const_decl() throws RecognitionException {
		Const_declContext _localctx = new Const_declContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_const_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(CONST);
			setState(63);
			match(ID);
			setState(64);
			match(COLON);
			setState(65);
			type();
			setState(66);
			match(EQUAL);
			setState(67);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_listContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public Function_listContext function_list() {
			return getRuleContext(Function_listContext.class,0);
		}
		public Function_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_list; }
	}

	public final Function_listContext function_list() throws RecognitionException {
		Function_listContext _localctx = new Function_listContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_function_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 448L) != 0)) {
				{
				setState(69);
				function();
				setState(70);
				function_list();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CCALParser.ID, 0); }
		public TerminalNode LB() { return getToken(CCALParser.LB, 0); }
		public Parameter_listContext parameter_list() {
			return getRuleContext(Parameter_listContext.class,0);
		}
		public TerminalNode RB() { return getToken(CCALParser.RB, 0); }
		public List<TerminalNode> LCB() { return getTokens(CCALParser.LCB); }
		public TerminalNode LCB(int i) {
			return getToken(CCALParser.LCB, i);
		}
		public Decl_listContext decl_list() {
			return getRuleContext(Decl_listContext.class,0);
		}
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(CCALParser.RETURN, 0); }
		public TerminalNode SEMICOLON() { return getToken(CCALParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			type();
			setState(75);
			match(ID);
			setState(76);
			match(LB);
			setState(77);
			parameter_list();
			setState(78);
			match(RB);
			setState(79);
			match(LCB);
			setState(80);
			decl_list();
			setState(81);
			statement_block();
			setState(82);
			match(RETURN);
			setState(84);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 53687156784L) != 0)) {
				{
				setState(83);
				expression();
				}
			}

			setState(86);
			match(SEMICOLON);
			setState(87);
			match(LCB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode NUMBERER() { return getToken(CCALParser.NUMBERER, 0); }
		public TerminalNode BOOLEAN() { return getToken(CCALParser.BOOLEAN, 0); }
		public TerminalNode VOID() { return getToken(CCALParser.VOID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 448L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Parameter_listContext extends ParserRuleContext {
		public Nemp_parameter_listContext nemp_parameter_list() {
			return getRuleContext(Nemp_parameter_listContext.class,0);
		}
		public Parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_list; }
	}

	public final Parameter_listContext parameter_list() throws RecognitionException {
		Parameter_listContext _localctx = new Parameter_listContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parameter_list);
		try {
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				nemp_parameter_list();
				}
				break;
			case RB:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Nemp_parameter_listContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CCALParser.ID, 0); }
		public TerminalNode COLON() { return getToken(CCALParser.COLON, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(CCALParser.COMMA, 0); }
		public Nemp_parameter_listContext nemp_parameter_list() {
			return getRuleContext(Nemp_parameter_listContext.class,0);
		}
		public Nemp_parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nemp_parameter_list; }
	}

	public final Nemp_parameter_listContext nemp_parameter_list() throws RecognitionException {
		Nemp_parameter_listContext _localctx = new Nemp_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_nemp_parameter_list);
		try {
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				match(ID);
				setState(96);
				match(COLON);
				setState(97);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				match(ID);
				setState(99);
				match(COLON);
				setState(100);
				type();
				setState(101);
				match(COMMA);
				setState(102);
				nemp_parameter_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MainContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(CCALParser.MAIN, 0); }
		public TerminalNode LCB() { return getToken(CCALParser.LCB, 0); }
		public Decl_listContext decl_list() {
			return getRuleContext(Decl_listContext.class,0);
		}
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public TerminalNode RCB() { return getToken(CCALParser.RCB, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(MAIN);
			setState(107);
			match(LCB);
			setState(108);
			decl_list();
			setState(109);
			statement_block();
			setState(110);
			match(RCB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Statement_blockContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public Statement_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_block; }
	}

	public final Statement_blockContext statement_block() throws RecognitionException {
		Statement_blockContext _localctx = new Statement_blockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statement_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17716750848L) != 0)) {
				{
				setState(112);
				statement();
				setState(113);
				statement_block();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CCALParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(CCALParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CCALParser.SEMICOLON, 0); }
		public TerminalNode LB() { return getToken(CCALParser.LB, 0); }
		public Arg_listContext arg_list() {
			return getRuleContext(Arg_listContext.class,0);
		}
		public TerminalNode RB() { return getToken(CCALParser.RB, 0); }
		public List<TerminalNode> LCB() { return getTokens(CCALParser.LCB); }
		public TerminalNode LCB(int i) {
			return getToken(CCALParser.LCB, i);
		}
		public List<Statement_blockContext> statement_block() {
			return getRuleContexts(Statement_blockContext.class);
		}
		public Statement_blockContext statement_block(int i) {
			return getRuleContext(Statement_blockContext.class,i);
		}
		public List<TerminalNode> RCB() { return getTokens(CCALParser.RCB); }
		public TerminalNode RCB(int i) {
			return getToken(CCALParser.RCB, i);
		}
		public TerminalNode IF() { return getToken(CCALParser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(CCALParser.ELSE, 0); }
		public TerminalNode WHILE() { return getToken(CCALParser.WHILE, 0); }
		public TerminalNode SKIPS() { return getToken(CCALParser.SKIPS, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_statement);
		try {
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				match(ID);
				setState(118);
				match(EQUAL);
				setState(119);
				expression();
				setState(120);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				match(ID);
				setState(123);
				match(LB);
				setState(124);
				arg_list();
				setState(125);
				match(RB);
				setState(126);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(128);
				match(LCB);
				setState(129);
				statement_block();
				setState(130);
				match(RCB);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(132);
				match(IF);
				setState(133);
				condition(0);
				setState(134);
				match(LCB);
				setState(135);
				statement_block();
				setState(136);
				match(RCB);
				setState(137);
				match(ELSE);
				setState(138);
				match(LCB);
				setState(139);
				statement_block();
				setState(140);
				match(RCB);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(142);
				match(WHILE);
				setState(143);
				condition(0);
				setState(144);
				match(LCB);
				setState(145);
				statement_block();
				setState(146);
				match(RCB);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(148);
				match(SKIPS);
				setState(149);
				match(SEMICOLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public List<FragmContext> fragm() {
			return getRuleContexts(FragmContext.class);
		}
		public FragmContext fragm(int i) {
			return getRuleContext(FragmContext.class,i);
		}
		public Binary_arith_opContext binary_arith_op() {
			return getRuleContext(Binary_arith_opContext.class,0);
		}
		public TerminalNode LB() { return getToken(CCALParser.LB, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RB() { return getToken(CCALParser.RB, 0); }
		public TerminalNode ID() { return getToken(CCALParser.ID, 0); }
		public Arg_listContext arg_list() {
			return getRuleContext(Arg_listContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expression);
		try {
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				fragm();
				setState(153);
				binary_arith_op();
				setState(154);
				fragm();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				match(LB);
				setState(157);
				expression();
				setState(158);
				match(RB);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(160);
				match(ID);
				setState(161);
				match(LB);
				setState(162);
				arg_list();
				setState(163);
				match(RB);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(165);
				fragm();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Binary_arith_opContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(CCALParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CCALParser.MINUS, 0); }
		public Binary_arith_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_arith_op; }
	}

	public final Binary_arith_opContext binary_arith_op() throws RecognitionException {
		Binary_arith_opContext _localctx = new Binary_arith_opContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_binary_arith_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FragmContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CCALParser.ID, 0); }
		public TerminalNode MINUS() { return getToken(CCALParser.MINUS, 0); }
		public TerminalNode NUMBER() { return getToken(CCALParser.NUMBER, 0); }
		public TerminalNode TRUE() { return getToken(CCALParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CCALParser.FALSE, 0); }
		public TerminalNode LB() { return getToken(CCALParser.LB, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RB() { return getToken(CCALParser.RB, 0); }
		public FragmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fragm; }
	}

	public final FragmContext fragm() throws RecognitionException {
		FragmContext _localctx = new FragmContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_fragm);
		try {
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				match(ID);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				match(MINUS);
				setState(172);
				match(ID);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(173);
				match(NUMBER);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(174);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 5);
				{
				setState(175);
				match(FALSE);
				}
				break;
			case LB:
				enterOuterAlt(_localctx, 6);
				{
				setState(176);
				match(LB);
				setState(177);
				expression();
				setState(178);
				match(RB);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode TILDA() { return getToken(CCALParser.TILDA, 0); }
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public TerminalNode LB() { return getToken(CCALParser.LB, 0); }
		public TerminalNode RB() { return getToken(CCALParser.RB, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Comp_opContext comp_op() {
			return getRuleContext(Comp_opContext.class,0);
		}
		public TerminalNode OR() { return getToken(CCALParser.OR, 0); }
		public TerminalNode AND() { return getToken(CCALParser.AND, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	}

	public final ConditionContext condition() throws RecognitionException {
		return condition(0);
	}

	private ConditionContext condition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionContext _localctx = new ConditionContext(_ctx, _parentState);
		ConditionContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_condition, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(183);
				match(TILDA);
				setState(184);
				condition(4);
				}
				break;
			case 2:
				{
				setState(185);
				match(LB);
				setState(186);
				condition(0);
				setState(187);
				match(RB);
				}
				break;
			case 3:
				{
				setState(189);
				expression();
				setState(190);
				comp_op();
				setState(191);
				expression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(200);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_condition);
					setState(195);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(196);
					_la = _input.LA(1);
					if ( !(_la==OR || _la==AND) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(197);
					condition(2);
					}
					} 
				}
				setState(202);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Comp_opContext extends ParserRuleContext {
		public TerminalNode EQUALTO() { return getToken(CCALParser.EQUALTO, 0); }
		public TerminalNode NOTEQUALTO() { return getToken(CCALParser.NOTEQUALTO, 0); }
		public TerminalNode LT() { return getToken(CCALParser.LT, 0); }
		public TerminalNode GT() { return getToken(CCALParser.GT, 0); }
		public TerminalNode LTE() { return getToken(CCALParser.LTE, 0); }
		public TerminalNode GTE() { return getToken(CCALParser.GTE, 0); }
		public Comp_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_op; }
	}

	public final Comp_opContext comp_op() throws RecognitionException {
		Comp_opContext _localctx = new Comp_opContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_comp_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 66060288L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Arg_listContext extends ParserRuleContext {
		public Nemp_arg_listContext nemp_arg_list() {
			return getRuleContext(Nemp_arg_listContext.class,0);
		}
		public Arg_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg_list; }
	}

	public final Arg_listContext arg_list() throws RecognitionException {
		Arg_listContext _localctx = new Arg_listContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_arg_list);
		try {
			setState(207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				nemp_arg_list();
				}
				break;
			case RB:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Nemp_arg_listContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CCALParser.ID, 0); }
		public TerminalNode COMMA() { return getToken(CCALParser.COMMA, 0); }
		public Nemp_arg_listContext nemp_arg_list() {
			return getRuleContext(Nemp_arg_listContext.class,0);
		}
		public Nemp_arg_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nemp_arg_list; }
	}

	public final Nemp_arg_listContext nemp_arg_list() throws RecognitionException {
		Nemp_arg_listContext _localctx = new Nemp_arg_listContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_nemp_arg_list);
		try {
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				match(ID);
				setState(211);
				match(COMMA);
				setState(212);
				nemp_arg_list();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 16:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001&\u00d8\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0003\u0000.\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u00014\b\u0001\u0001\u0002\u0001\u0002\u0003\u0002"+
		"8\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005I\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006U\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0003\b^\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\ti\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000bt\b\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0097\b\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0003\r\u00a7\b\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00b5\b\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00c2"+
		"\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u00c7\b\u0010"+
		"\n\u0010\f\u0010\u00ca\t\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u00d0\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u00d6\b\u0013\u0001\u0013\u0000\u0001 \u0014\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&\u0000\u0004\u0001\u0000\u0006\b\u0001\u0000\u000f\u0010\u0001"+
		"\u0000\u0012\u0013\u0001\u0000\u0014\u0019\u00dd\u0000-\u0001\u0000\u0000"+
		"\u0000\u00023\u0001\u0000\u0000\u0000\u00047\u0001\u0000\u0000\u0000\u0006"+
		"9\u0001\u0000\u0000\u0000\b>\u0001\u0000\u0000\u0000\nH\u0001\u0000\u0000"+
		"\u0000\fJ\u0001\u0000\u0000\u0000\u000eY\u0001\u0000\u0000\u0000\u0010"+
		"]\u0001\u0000\u0000\u0000\u0012h\u0001\u0000\u0000\u0000\u0014j\u0001"+
		"\u0000\u0000\u0000\u0016s\u0001\u0000\u0000\u0000\u0018\u0096\u0001\u0000"+
		"\u0000\u0000\u001a\u00a6\u0001\u0000\u0000\u0000\u001c\u00a8\u0001\u0000"+
		"\u0000\u0000\u001e\u00b4\u0001\u0000\u0000\u0000 \u00c1\u0001\u0000\u0000"+
		"\u0000\"\u00cb\u0001\u0000\u0000\u0000$\u00cf\u0001\u0000\u0000\u0000"+
		"&\u00d5\u0001\u0000\u0000\u0000()\u0003\u0002\u0001\u0000)*\u0003\n\u0005"+
		"\u0000*+\u0003\u0014\n\u0000+.\u0001\u0000\u0000\u0000,.\u0005\u0000\u0000"+
		"\u0001-(\u0001\u0000\u0000\u0000-,\u0001\u0000\u0000\u0000.\u0001\u0001"+
		"\u0000\u0000\u0000/0\u0003\u0004\u0002\u000001\u0005\u001b\u0000\u0000"+
		"12\u0003\u0002\u0001\u000024\u0001\u0000\u0000\u00003/\u0001\u0000\u0000"+
		"\u000034\u0001\u0000\u0000\u00004\u0003\u0001\u0000\u0000\u000058\u0003"+
		"\u0006\u0003\u000068\u0003\b\u0004\u000075\u0001\u0000\u0000\u000076\u0001"+
		"\u0000\u0000\u00008\u0005\u0001\u0000\u0000\u00009:\u0005\u0002\u0000"+
		"\u0000:;\u0005\"\u0000\u0000;<\u0005\u001c\u0000\u0000<=\u0003\u000e\u0007"+
		"\u0000=\u0007\u0001\u0000\u0000\u0000>?\u0005\u0003\u0000\u0000?@\u0005"+
		"\"\u0000\u0000@A\u0005\u001c\u0000\u0000AB\u0003\u000e\u0007\u0000BC\u0005"+
		"\u000e\u0000\u0000CD\u0003\u001a\r\u0000D\t\u0001\u0000\u0000\u0000EF"+
		"\u0003\f\u0006\u0000FG\u0003\n\u0005\u0000GI\u0001\u0000\u0000\u0000H"+
		"E\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000I\u000b\u0001\u0000"+
		"\u0000\u0000JK\u0003\u000e\u0007\u0000KL\u0005\"\u0000\u0000LM\u0005\u001f"+
		"\u0000\u0000MN\u0003\u0010\b\u0000NO\u0005 \u0000\u0000OP\u0005\u001d"+
		"\u0000\u0000PQ\u0003\u0002\u0001\u0000QR\u0003\u0016\u000b\u0000RT\u0005"+
		"\f\u0000\u0000SU\u0003\u001a\r\u0000TS\u0001\u0000\u0000\u0000TU\u0001"+
		"\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VW\u0005\u001b\u0000\u0000"+
		"WX\u0005\u001d\u0000\u0000X\r\u0001\u0000\u0000\u0000YZ\u0007\u0000\u0000"+
		"\u0000Z\u000f\u0001\u0000\u0000\u0000[^\u0003\u0012\t\u0000\\^\u0001\u0000"+
		"\u0000\u0000][\u0001\u0000\u0000\u0000]\\\u0001\u0000\u0000\u0000^\u0011"+
		"\u0001\u0000\u0000\u0000_`\u0005\"\u0000\u0000`a\u0005\u001c\u0000\u0000"+
		"ai\u0003\u000e\u0007\u0000bc\u0005\"\u0000\u0000cd\u0005\u001c\u0000\u0000"+
		"de\u0003\u000e\u0007\u0000ef\u0005\u001a\u0000\u0000fg\u0003\u0012\t\u0000"+
		"gi\u0001\u0000\u0000\u0000h_\u0001\u0000\u0000\u0000hb\u0001\u0000\u0000"+
		"\u0000i\u0013\u0001\u0000\u0000\u0000jk\u0005\u0001\u0000\u0000kl\u0005"+
		"\u001d\u0000\u0000lm\u0003\u0002\u0001\u0000mn\u0003\u0016\u000b\u0000"+
		"no\u0005\u001e\u0000\u0000o\u0015\u0001\u0000\u0000\u0000pq\u0003\u0018"+
		"\f\u0000qr\u0003\u0016\u000b\u0000rt\u0001\u0000\u0000\u0000sp\u0001\u0000"+
		"\u0000\u0000st\u0001\u0000\u0000\u0000t\u0017\u0001\u0000\u0000\u0000"+
		"uv\u0005\"\u0000\u0000vw\u0005\u000e\u0000\u0000wx\u0003\u001a\r\u0000"+
		"xy\u0005\u001b\u0000\u0000y\u0097\u0001\u0000\u0000\u0000z{\u0005\"\u0000"+
		"\u0000{|\u0005\u001f\u0000\u0000|}\u0003$\u0012\u0000}~\u0005 \u0000\u0000"+
		"~\u007f\u0005\u001b\u0000\u0000\u007f\u0097\u0001\u0000\u0000\u0000\u0080"+
		"\u0081\u0005\u001d\u0000\u0000\u0081\u0082\u0003\u0016\u000b\u0000\u0082"+
		"\u0083\u0005\u001e\u0000\u0000\u0083\u0097\u0001\u0000\u0000\u0000\u0084"+
		"\u0085\u0005\t\u0000\u0000\u0085\u0086\u0003 \u0010\u0000\u0086\u0087"+
		"\u0005\u001d\u0000\u0000\u0087\u0088\u0003\u0016\u000b\u0000\u0088\u0089"+
		"\u0005\u001e\u0000\u0000\u0089\u008a\u0005\n\u0000\u0000\u008a\u008b\u0005"+
		"\u001d\u0000\u0000\u008b\u008c\u0003\u0016\u000b\u0000\u008c\u008d\u0005"+
		"\u001e\u0000\u0000\u008d\u0097\u0001\u0000\u0000\u0000\u008e\u008f\u0005"+
		"\u000b\u0000\u0000\u008f\u0090\u0003 \u0010\u0000\u0090\u0091\u0005\u001d"+
		"\u0000\u0000\u0091\u0092\u0003\u0016\u000b\u0000\u0092\u0093\u0005\u001e"+
		"\u0000\u0000\u0093\u0097\u0001\u0000\u0000\u0000\u0094\u0095\u0005\r\u0000"+
		"\u0000\u0095\u0097\u0005\u001b\u0000\u0000\u0096u\u0001\u0000\u0000\u0000"+
		"\u0096z\u0001\u0000\u0000\u0000\u0096\u0080\u0001\u0000\u0000\u0000\u0096"+
		"\u0084\u0001\u0000\u0000\u0000\u0096\u008e\u0001\u0000\u0000\u0000\u0096"+
		"\u0094\u0001\u0000\u0000\u0000\u0097\u0019\u0001\u0000\u0000\u0000\u0098"+
		"\u0099\u0003\u001e\u000f\u0000\u0099\u009a\u0003\u001c\u000e\u0000\u009a"+
		"\u009b\u0003\u001e\u000f\u0000\u009b\u00a7\u0001\u0000\u0000\u0000\u009c"+
		"\u009d\u0005\u001f\u0000\u0000\u009d\u009e\u0003\u001a\r\u0000\u009e\u009f"+
		"\u0005 \u0000\u0000\u009f\u00a7\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005"+
		"\"\u0000\u0000\u00a1\u00a2\u0005\u001f\u0000\u0000\u00a2\u00a3\u0003$"+
		"\u0012\u0000\u00a3\u00a4\u0005 \u0000\u0000\u00a4\u00a7\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a7\u0003\u001e\u000f\u0000\u00a6\u0098\u0001\u0000\u0000"+
		"\u0000\u00a6\u009c\u0001\u0000\u0000\u0000\u00a6\u00a0\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a5\u0001\u0000\u0000\u0000\u00a7\u001b\u0001\u0000\u0000"+
		"\u0000\u00a8\u00a9\u0007\u0001\u0000\u0000\u00a9\u001d\u0001\u0000\u0000"+
		"\u0000\u00aa\u00b5\u0005\"\u0000\u0000\u00ab\u00ac\u0005\u0010\u0000\u0000"+
		"\u00ac\u00b5\u0005\"\u0000\u0000\u00ad\u00b5\u0005#\u0000\u0000\u00ae"+
		"\u00b5\u0005\u0004\u0000\u0000\u00af\u00b5\u0005\u0005\u0000\u0000\u00b0"+
		"\u00b1\u0005\u001f\u0000\u0000\u00b1\u00b2\u0003\u001a\r\u0000\u00b2\u00b3"+
		"\u0005 \u0000\u0000\u00b3\u00b5\u0001\u0000\u0000\u0000\u00b4\u00aa\u0001"+
		"\u0000\u0000\u0000\u00b4\u00ab\u0001\u0000\u0000\u0000\u00b4\u00ad\u0001"+
		"\u0000\u0000\u0000\u00b4\u00ae\u0001\u0000\u0000\u0000\u00b4\u00af\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b0\u0001\u0000\u0000\u0000\u00b5\u001f\u0001"+
		"\u0000\u0000\u0000\u00b6\u00b7\u0006\u0010\uffff\uffff\u0000\u00b7\u00b8"+
		"\u0005\u0011\u0000\u0000\u00b8\u00c2\u0003 \u0010\u0004\u00b9\u00ba\u0005"+
		"\u001f\u0000\u0000\u00ba\u00bb\u0003 \u0010\u0000\u00bb\u00bc\u0005 \u0000"+
		"\u0000\u00bc\u00c2\u0001\u0000\u0000\u0000\u00bd\u00be\u0003\u001a\r\u0000"+
		"\u00be\u00bf\u0003\"\u0011\u0000\u00bf\u00c0\u0003\u001a\r\u0000\u00c0"+
		"\u00c2\u0001\u0000\u0000\u0000\u00c1\u00b6\u0001\u0000\u0000\u0000\u00c1"+
		"\u00b9\u0001\u0000\u0000\u0000\u00c1\u00bd\u0001\u0000\u0000\u0000\u00c2"+
		"\u00c8\u0001\u0000\u0000\u0000\u00c3\u00c4\n\u0001\u0000\u0000\u00c4\u00c5"+
		"\u0007\u0002\u0000\u0000\u00c5\u00c7\u0003 \u0010\u0002\u00c6\u00c3\u0001"+
		"\u0000\u0000\u0000\u00c7\u00ca\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001"+
		"\u0000\u0000\u0000\u00c8\u00c9\u0001\u0000\u0000\u0000\u00c9!\u0001\u0000"+
		"\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00cb\u00cc\u0007\u0003"+
		"\u0000\u0000\u00cc#\u0001\u0000\u0000\u0000\u00cd\u00d0\u0003&\u0013\u0000"+
		"\u00ce\u00d0\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000"+
		"\u00cf\u00ce\u0001\u0000\u0000\u0000\u00d0%\u0001\u0000\u0000\u0000\u00d1"+
		"\u00d6\u0005\"\u0000\u0000\u00d2\u00d3\u0005\"\u0000\u0000\u00d3\u00d4"+
		"\u0005\u001a\u0000\u0000\u00d4\u00d6\u0003&\u0013\u0000\u00d5\u00d1\u0001"+
		"\u0000\u0000\u0000\u00d5\u00d2\u0001\u0000\u0000\u0000\u00d6\'\u0001\u0000"+
		"\u0000\u0000\u000f-37HT]hs\u0096\u00a6\u00b4\u00c1\u00c8\u00cf\u00d5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}