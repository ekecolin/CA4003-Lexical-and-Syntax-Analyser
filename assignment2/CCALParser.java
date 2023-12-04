// Generated from CCAL.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CCALParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VAR=1, CONST=2, RETURN=3, INTEGER=4, BOOLEAN=5, VOID=6, MAIN=7, IF=8, 
		ELSE=9, TRUE=10, FALSE=11, WHILE=12, SKIPS=13, COMMA=14, SEMICOLON=15, 
		COLON=16, EQUAL=17, LCB=18, RCB=19, LB=20, RB=21, PLUS=22, MINUS=23, TILDA=24, 
		OR=25, AND=26, EQUALTO=27, NOTEQUALTO=28, LT=29, GT=30, LTET=31, GTET=32, 
		BV=33, ID=34, INTEG=35, WS=36, NESTEDCOM=37, SINGLINECOM=38;
	public static final int
		RULE_prog = 0, RULE_decl_list = 1, RULE_decl = 2, RULE_var_decl = 3, RULE_const_decl = 4, 
		RULE_function_list = 5, RULE_function = 6, RULE_type = 7, RULE_parameter_list = 8, 
		RULE_nemp_parameter_list = 9, RULE_main = 10, RULE_statement_block = 11, 
		RULE_assignmentStatement = 12, RULE_statement = 13, RULE_expression = 14, 
		RULE_binary_arith_op = 15, RULE_fragm = 16, RULE_condition = 17, RULE_comp_op = 18, 
		RULE_arg_list = 19, RULE_nemp_arg_list = 20, RULE_iFElseStatement = 21, 
		RULE_whileStatement = 22, RULE_functionCallStatement = 23, RULE_functionCallOp = 24, 
		RULE_plusMinus = 25, RULE_fragOp = 26;
	public static final String[] ruleNames = {
		"prog", "decl_list", "decl", "var_decl", "const_decl", "function_list", 
		"function", "type", "parameter_list", "nemp_parameter_list", "main", "statement_block", 
		"assignmentStatement", "statement", "expression", "binary_arith_op", "fragm", 
		"condition", "comp_op", "arg_list", "nemp_arg_list", "iFElseStatement", 
		"whileStatement", "functionCallStatement", "functionCallOp", "plusMinus", 
		"fragOp"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "'skip'", "','", "';'", "':'", "'='", "'{'", "'}'", "'('", "')'", 
		"'+'", "'-'", "'~'", "'||'", "'&&'", "'=='", "'!='", "'<'", "'>'", "'<='", 
		"'>='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "VAR", "CONST", "RETURN", "INTEGER", "BOOLEAN", "VOID", "MAIN", 
		"IF", "ELSE", "TRUE", "FALSE", "WHILE", "SKIPS", "COMMA", "SEMICOLON", 
		"COLON", "EQUAL", "LCB", "RCB", "LB", "RB", "PLUS", "MINUS", "TILDA", 
		"OR", "AND", "EQUALTO", "NOTEQUALTO", "LT", "GT", "LTET", "GTET", "BV", 
		"ID", "INTEG", "WS", "NESTEDCOM", "SINGLINECOM"
	};
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
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CCALListener ) ((CCALListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CCALListener ) ((CCALListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			decl_list();
			setState(55);
			function_list();
			setState(56);
			main();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CCALListener ) ((CCALListener)listener).enterDecl_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CCALListener ) ((CCALListener)listener).exitDecl_list(this);
		}
	}

	public final Decl_listContext decl_list() throws RecognitionException {
		Decl_listContext _localctx = new Decl_listContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decl_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR || _la==CONST) {
				{
				setState(58);
				decl();
				setState(59);
				match(SEMICOLON);
				setState(60);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CCALListener ) ((CCALListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CCALListener ) ((CCALListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl);
		try {
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				var_decl();
				}
				break;
			case CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CCALListener ) ((CCALListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CCALListener ) ((CCALListener)listener).exitVar_decl(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(VAR);
			setState(69);
			match(ID);
			setState(70);
			match(COLON);
			setState(71);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CCALListener ) ((CCALListener)listener).enterConst_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CCALListener ) ((CCALListener)listener).exitConst_decl(this);
		}
	}

	public final Const_declContext const_decl() throws RecognitionException {
		Const_declContext _localctx = new Const_declContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_const_decl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(CONST);
			setState(74);
			match(ID);
			setState(75);
			match(COLON);
			setState(76);
			type();
			setState(77);
			match(EQUAL);
			setState(78);
			expression(0);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CCALListener ) ((CCALListener)listener).enterFunction_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CCALListener ) ((CCALListener)listener).exitFunction_list(this);
		}
	}

	public final Function_listContext function_list() throws RecognitionException {
		Function_listContext _localctx = new Function_listContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_function_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << BOOLEAN) | (1L << VOID))) != 0)) {
				{
				setState(80);
				function();
				setState(81);
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
		public TerminalNode LCB() { return getToken(CCALParser.LCB, 0); }
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CCALListener ) ((CCALListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CCALListener ) ((CCALListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			type();
			setState(86);
			match(ID);
			setState(87);
			match(LB);
			setState(88);
			parameter_list();
			setState(89);
			match(RB);
			setState(90);
			match(LCB);
			setState(91);
			decl_list();
			setState(92);
			statement_block();
			setState(93);
			match(RETURN);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << TRUE) | (1L << FALSE) | (1L << LB) | (1L << MINUS) | (1L << ID) | (1L << INTEG))) != 0)) {
				{
				setState(94);
				expression(0);
				}
			}

			setState(97);
			match(SEMICOLON);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(CCALParser.INTEGER, 0); }
		public TerminalNode BOOLEAN() { return getToken(CCALParser.BOOLEAN, 0); }
		public TerminalNode VOID() { return getToken(CCALParser.VOID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CCALListener ) ((CCALListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CCALListener ) ((CCALListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGER) | (1L << BOOLEAN) | (1L << VOID))) != 0)) ) {
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

	public static class Parameter_listContext extends ParserRuleContext {
		public String id;
        public Nemp_parameter_listContext nemp_parameter_list() {
			return getRuleContext(Nemp_parameter_listContext.class,0);
		}
		public Parameter_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CCALListener ) ((CCALListener)listener).enterParameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CCALListener ) ((CCALListener)listener).exitParameter_list(this);
		}
		public param get(int i) {
			return null;
		}
        public Object size() {
            return null;
        }
		public List<?> accept(EvalVisitor evalVisitor) {
			return null;
		}
	}

	public final Parameter_listContext parameter_list() throws RecognitionException {
		Parameter_listContext _localctx = new Parameter_listContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parameter_list);
		try {
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CCALListener ) ((CCALListener)listener).enterNemp_parameter_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CCALListener ) ((CCALListener)listener).exitNemp_parameter_list(this);
		}
	}

	public final Nemp_parameter_listContext nemp_parameter_list() throws RecognitionException {
		Nemp_parameter_listContext _localctx = new Nemp_parameter_listContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_nemp_parameter_list);
		try {
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				match(ID);
				setState(106);
				match(COLON);
				setState(107);
				type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				match(ID);
				setState(109);
				match(COLON);
				setState(110);
				type();
				setState(111);
				match(COMMA);
				setState(112);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CCALListener ) ((CCALListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CCALListener ) ((CCALListener)listener).exitMain(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(MAIN);
			setState(117);
			match(LCB);
			setState(118);
			decl_list();
			setState(119);
			statement_block();
			setState(120);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CCALListener ) ((CCALListener)listener).enterStatement_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CCALListener ) ((CCALListener)listener).exitStatement_block(this);
		}
	}

	public final Statement_blockContext statement_block() throws RecognitionException {
		Statement_blockContext _localctx = new Statement_blockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statement_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << SKIPS) | (1L << LCB) | (1L << ID))) != 0)) {
				{
				setState(122);
				statement();
				setState(123);
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

	public static class AssignmentStatementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CCALParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(CCALParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CCALParser.SEMICOLON, 0); }
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CCALListener ) ((CCALListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CCALListener ) ((CCALListener)listener).exitAssignmentStatement(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(ID);
			setState(128);
			match(EQUAL);
			setState(129);
			expression(0);
			setState(130);
			match(SEMICOLON);
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

	public static class StatementContext extends ParserRuleContext {
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public TerminalNode ID() { return getToken(CCALParser.ID, 0); }
		public TerminalNode LB() { return getToken(CCALParser.LB, 0); }
		public Arg_listContext arg_list() {
			return getRuleContext(Arg_listContext.class,0);
		}
		public TerminalNode RB() { return getToken(CCALParser.RB, 0); }
		public TerminalNode SEMICOLON() { return getToken(CCALParser.SEMICOLON, 0); }
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CCALListener ) ((CCALListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CCALListener ) ((CCALListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_statement);
		try {
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				assignmentStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				match(ID);
				setState(134);
				match(LB);
				setState(135);
				arg_list();
				setState(136);
				match(RB);
				setState(137);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(139);
				match(LCB);
				setState(140);
				statement_block();
				setState(141);
				match(RCB);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(143);
				match(IF);
				setState(144);
				condition(0);
				setState(145);
				match(LCB);
				setState(146);
				statement_block();
				setState(147);
				match(RCB);
				setState(148);
				match(ELSE);
				setState(149);
				match(LCB);
				setState(150);
				statement_block();
				setState(151);
				match(RCB);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(153);
				match(WHILE);
				setState(154);
				condition(0);
				setState(155);
				match(LCB);
				setState(156);
				statement_block();
				setState(157);
				match(RCB);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(159);
				match(SKIPS);
				setState(160);
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

	public static class ExpressionContext extends ParserRuleContext {
		public FragOpContext fragOp() {
			return getRuleContext(FragOpContext.class,0);
		}
		public TerminalNode LB() { return getToken(CCALParser.LB, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RB() { return getToken(CCALParser.RB, 0); }
		public TerminalNode ID() { return getToken(CCALParser.ID, 0); }
		public Arg_listContext arg_list() {
			return getRuleContext(Arg_listContext.class,0);
		}
		public FragmContext fragm() {
			return getRuleContext(FragmContext.class,0);
		}
		public TerminalNode INTEGER() { return getToken(CCALParser.INTEGER, 0); }
		public TerminalNode TRUE() { return getToken(CCALParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CCALParser.FALSE, 0); }
		public Binary_arith_opContext binary_arith_op() {
			return getRuleContext(Binary_arith_opContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CCALListener ) ((CCALListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CCALListener ) ((CCALListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(164);
				fragOp();
				}
				break;
			case 2:
				{
				setState(165);
				match(LB);
				setState(166);
				expression(0);
				setState(167);
				match(RB);
				}
				break;
			case 3:
				{
				setState(169);
				match(ID);
				setState(170);
				match(LB);
				setState(171);
				arg_list();
				setState(172);
				match(RB);
				}
				break;
			case 4:
				{
				setState(174);
				fragm();
				}
				break;
			case 5:
				{
				setState(175);
				match(INTEGER);
				}
				break;
			case 6:
				{
				setState(176);
				match(TRUE);
				}
				break;
			case 7:
				{
				setState(177);
				match(FALSE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(186);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(180);
					if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
					setState(181);
					binary_arith_op();
					setState(182);
					expression(9);
					}
					} 
				}
				setState(188);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class Binary_arith_opContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(CCALParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CCALParser.MINUS, 0); }
		public Binary_arith_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_arith_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CCALListener ) ((CCALListener)listener).enterBinary_arith_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CCALListener ) ((CCALListener)listener).exitBinary_arith_op(this);
		}
	}

	public final Binary_arith_opContext binary_arith_op() throws RecognitionException {
		Binary_arith_opContext _localctx = new Binary_arith_opContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_binary_arith_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
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

	public static class FragmContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CCALParser.ID, 0); }
		public TerminalNode MINUS() { return getToken(CCALParser.MINUS, 0); }
		public TerminalNode INTEG() { return getToken(CCALParser.INTEG, 0); }
		public TerminalNode TRUE() { return getToken(CCALParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CCALParser.FALSE, 0); }
		public FragmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fragm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CCALListener ) ((CCALListener)listener).enterFragm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CCALListener ) ((CCALListener)listener).exitFragm(this);
		}
	}

	public final FragmContext fragm() throws RecognitionException {
		FragmContext _localctx = new FragmContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_fragm);
		try {
			setState(197);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				match(ID);
				}
				break;
			case MINUS:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				match(MINUS);
				setState(193);
				match(ID);
				}
				break;
			case INTEG:
				enterOuterAlt(_localctx, 3);
				{
				setState(194);
				match(INTEG);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(195);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 5);
				{
				setState(196);
				match(FALSE);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CCALListener ) ((CCALListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CCALListener ) ((CCALListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		return condition(0);
	}

	private ConditionContext condition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionContext _localctx = new ConditionContext(_ctx, _parentState);
		ConditionContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_condition, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(200);
				match(TILDA);
				setState(201);
				condition(4);
				}
				break;
			case 2:
				{
				setState(202);
				match(LB);
				setState(203);
				condition(0);
				setState(204);
				match(RB);
				}
				break;
			case 3:
				{
				setState(206);
				expression(0);
				setState(207);
				comp_op();
				setState(208);
				expression(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(217);
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
					setState(212);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(213);
					_la = _input.LA(1);
					if ( !(_la==OR || _la==AND) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(214);
					condition(2);
					}
					} 
				}
				setState(219);
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

	public static class Comp_opContext extends ParserRuleContext {
		public TerminalNode EQUALTO() { return getToken(CCALParser.EQUALTO, 0); }
		public TerminalNode NOTEQUALTO() { return getToken(CCALParser.NOTEQUALTO, 0); }
		public TerminalNode LT() { return getToken(CCALParser.LT, 0); }
		public TerminalNode GT() { return getToken(CCALParser.GT, 0); }
		public TerminalNode LTET() { return getToken(CCALParser.LTET, 0); }
		public TerminalNode GTET() { return getToken(CCALParser.GTET, 0); }
		public Comp_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CCALListener ) ((CCALListener)listener).enterComp_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CCALListener ) ((CCALListener)listener).exitComp_op(this);
		}
	}

	public final Comp_opContext comp_op() throws RecognitionException {
		Comp_opContext _localctx = new Comp_opContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_comp_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUALTO) | (1L << NOTEQUALTO) | (1L << LT) | (1L << GT) | (1L << LTET) | (1L << GTET))) != 0)) ) {
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

	public static class Arg_listContext extends ParserRuleContext {
		public Nemp_arg_listContext nemp_arg_list() {
			return getRuleContext(Nemp_arg_listContext.class,0);
		}
		public Arg_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arg_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CCALListener ) ((CCALListener)listener).enterArg_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CCALListener ) ((CCALListener)listener).exitArg_list(this);
		}
	}

	public final Arg_listContext arg_list() throws RecognitionException {
		Arg_listContext _localctx = new Arg_listContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_arg_list);
		try {
			setState(224);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CCALListener ) ((CCALListener)listener).enterNemp_arg_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CCALListener ) ((CCALListener)listener).exitNemp_arg_list(this);
		}
	}

	public final Nemp_arg_listContext nemp_arg_list() throws RecognitionException {
		Nemp_arg_listContext _localctx = new Nemp_arg_listContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_nemp_arg_list);
		try {
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				match(ID);
				setState(228);
				match(COMMA);
				setState(229);
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

	public static class IFElseStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(CCALParser.IF, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
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
		public TerminalNode ELSE() { return getToken(CCALParser.ELSE, 0); }
		public IFElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iFElseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CCALListener ) ((CCALListener)listener).enterIFElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CCALListener ) ((CCALListener)listener).exitIFElseStatement(this);
		}
	}

	public final IFElseStatementContext iFElseStatement() throws RecognitionException {
		IFElseStatementContext _localctx = new IFElseStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_iFElseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(IF);
			setState(233);
			condition(0);
			setState(234);
			match(LCB);
			setState(235);
			statement_block();
			setState(236);
			match(RCB);
			setState(237);
			match(ELSE);
			setState(238);
			match(LCB);
			setState(239);
			statement_block();
			setState(240);
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

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(CCALParser.WHILE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode LCB() { return getToken(CCALParser.LCB, 0); }
		public Statement_blockContext statement_block() {
			return getRuleContext(Statement_blockContext.class,0);
		}
		public TerminalNode RCB() { return getToken(CCALParser.RCB, 0); }
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CCALListener ) ((CCALListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CCALListener ) ((CCALListener)listener).exitWhileStatement(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(WHILE);
			setState(243);
			condition(0);
			setState(244);
			match(LCB);
			setState(245);
			statement_block();
			setState(246);
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

	public static class FunctionCallStatementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CCALParser.ID, 0); }
		public TerminalNode LB() { return getToken(CCALParser.LB, 0); }
		public Arg_listContext arg_list() {
			return getRuleContext(Arg_listContext.class,0);
		}
		public TerminalNode RB() { return getToken(CCALParser.RB, 0); }
		public TerminalNode SEMICOLON() { return getToken(CCALParser.SEMICOLON, 0); }
		public FunctionCallStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CCALListener ) ((CCALListener)listener).enterFunctionCallStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CCALListener ) ((CCALListener)listener).exitFunctionCallStatement(this);
		}
	}

	public final FunctionCallStatementContext functionCallStatement() throws RecognitionException {
		FunctionCallStatementContext _localctx = new FunctionCallStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_functionCallStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(ID);
			setState(249);
			match(LB);
			setState(250);
			arg_list();
			setState(251);
			match(RB);
			setState(252);
			match(SEMICOLON);
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

	public static class FunctionCallOpContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CCALParser.ID, 0); }
		public TerminalNode LB() { return getToken(CCALParser.LB, 0); }
		public Arg_listContext arg_list() {
			return getRuleContext(Arg_listContext.class,0);
		}
		public TerminalNode RB() { return getToken(CCALParser.RB, 0); }
		public FunctionCallOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CCALListener ) ((CCALListener)listener).enterFunctionCallOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CCALListener ) ((CCALListener)listener).exitFunctionCallOp(this);
		}
	}

	public final FunctionCallOpContext functionCallOp() throws RecognitionException {
		FunctionCallOpContext _localctx = new FunctionCallOpContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_functionCallOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(ID);
			setState(255);
			match(LB);
			setState(256);
			arg_list();
			setState(257);
			match(RB);
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

	public static class PlusMinusContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(CCALParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CCALParser.MINUS, 0); }
		public PlusMinusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plusMinus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CCALListener ) ((CCALListener)listener).enterPlusMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CCALListener ) ((CCALListener)listener).exitPlusMinus(this);
		}
	}

	public final PlusMinusContext plusMinus() throws RecognitionException {
		PlusMinusContext _localctx = new PlusMinusContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_plusMinus);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			expression(0);
			setState(260);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(261);
			expression(0);
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

	public static class FragOpContext extends ParserRuleContext {
		public FragmContext fragm() {
			return getRuleContext(FragmContext.class,0);
		}
		public FragOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fragOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CCALListener ) ((CCALListener)listener).enterFragOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CCALListener ) ((CCALListener)listener).exitFragOp(this);
		}
	}

	public final FragOpContext fragOp() throws RecognitionException {
		FragOpContext _localctx = new FragOpContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_fragOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			fragm();
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
		case 14:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 17:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u010c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\5\3A\n"+
		"\3\3\4\3\4\5\4E\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\5\7V\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bb\n\b\3"+
		"\b\3\b\3\t\3\t\3\n\3\n\5\nj\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\5\13u\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\5\r\u0080\n\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u00a4\n\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00b5\n\20\3\20\3\20"+
		"\3\20\3\20\7\20\u00bb\n\20\f\20\16\20\u00be\13\20\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\5\22\u00c8\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u00d5\n\23\3\23\3\23\3\23\7\23\u00da\n\23\f"+
		"\23\16\23\u00dd\13\23\3\24\3\24\3\25\3\25\5\25\u00e3\n\25\3\26\3\26\3"+
		"\26\3\26\5\26\u00e9\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\34\2\4\36$\35\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66\2\6\3\2\6\b\3"+
		"\2\30\31\3\2\33\34\3\2\35\"\2\u010c\28\3\2\2\2\4@\3\2\2\2\6D\3\2\2\2\b"+
		"F\3\2\2\2\nK\3\2\2\2\fU\3\2\2\2\16W\3\2\2\2\20e\3\2\2\2\22i\3\2\2\2\24"+
		"t\3\2\2\2\26v\3\2\2\2\30\177\3\2\2\2\32\u0081\3\2\2\2\34\u00a3\3\2\2\2"+
		"\36\u00b4\3\2\2\2 \u00bf\3\2\2\2\"\u00c7\3\2\2\2$\u00d4\3\2\2\2&\u00de"+
		"\3\2\2\2(\u00e2\3\2\2\2*\u00e8\3\2\2\2,\u00ea\3\2\2\2.\u00f4\3\2\2\2\60"+
		"\u00fa\3\2\2\2\62\u0100\3\2\2\2\64\u0105\3\2\2\2\66\u0109\3\2\2\289\5"+
		"\4\3\29:\5\f\7\2:;\5\26\f\2;\3\3\2\2\2<=\5\6\4\2=>\7\21\2\2>?\5\4\3\2"+
		"?A\3\2\2\2@<\3\2\2\2@A\3\2\2\2A\5\3\2\2\2BE\5\b\5\2CE\5\n\6\2DB\3\2\2"+
		"\2DC\3\2\2\2E\7\3\2\2\2FG\7\3\2\2GH\7$\2\2HI\7\22\2\2IJ\5\20\t\2J\t\3"+
		"\2\2\2KL\7\4\2\2LM\7$\2\2MN\7\22\2\2NO\5\20\t\2OP\7\23\2\2PQ\5\36\20\2"+
		"Q\13\3\2\2\2RS\5\16\b\2ST\5\f\7\2TV\3\2\2\2UR\3\2\2\2UV\3\2\2\2V\r\3\2"+
		"\2\2WX\5\20\t\2XY\7$\2\2YZ\7\26\2\2Z[\5\22\n\2[\\\7\27\2\2\\]\7\24\2\2"+
		"]^\5\4\3\2^_\5\30\r\2_a\7\5\2\2`b\5\36\20\2a`\3\2\2\2ab\3\2\2\2bc\3\2"+
		"\2\2cd\7\21\2\2d\17\3\2\2\2ef\t\2\2\2f\21\3\2\2\2gj\5\24\13\2hj\3\2\2"+
		"\2ig\3\2\2\2ih\3\2\2\2j\23\3\2\2\2kl\7$\2\2lm\7\22\2\2mu\5\20\t\2no\7"+
		"$\2\2op\7\22\2\2pq\5\20\t\2qr\7\20\2\2rs\5\24\13\2su\3\2\2\2tk\3\2\2\2"+
		"tn\3\2\2\2u\25\3\2\2\2vw\7\t\2\2wx\7\24\2\2xy\5\4\3\2yz\5\30\r\2z{\7\25"+
		"\2\2{\27\3\2\2\2|}\5\34\17\2}~\5\30\r\2~\u0080\3\2\2\2\177|\3\2\2\2\177"+
		"\u0080\3\2\2\2\u0080\31\3\2\2\2\u0081\u0082\7$\2\2\u0082\u0083\7\23\2"+
		"\2\u0083\u0084\5\36\20\2\u0084\u0085\7\21\2\2\u0085\33\3\2\2\2\u0086\u00a4"+
		"\5\32\16\2\u0087\u0088\7$\2\2\u0088\u0089\7\26\2\2\u0089\u008a\5(\25\2"+
		"\u008a\u008b\7\27\2\2\u008b\u008c\7\21\2\2\u008c\u00a4\3\2\2\2\u008d\u008e"+
		"\7\24\2\2\u008e\u008f\5\30\r\2\u008f\u0090\7\25\2\2\u0090\u00a4\3\2\2"+
		"\2\u0091\u0092\7\n\2\2\u0092\u0093\5$\23\2\u0093\u0094\7\24\2\2\u0094"+
		"\u0095\5\30\r\2\u0095\u0096\7\25\2\2\u0096\u0097\7\13\2\2\u0097\u0098"+
		"\7\24\2\2\u0098\u0099\5\30\r\2\u0099\u009a\7\25\2\2\u009a\u00a4\3\2\2"+
		"\2\u009b\u009c\7\16\2\2\u009c\u009d\5$\23\2\u009d\u009e\7\24\2\2\u009e"+
		"\u009f\5\30\r\2\u009f\u00a0\7\25\2\2\u00a0\u00a4\3\2\2\2\u00a1\u00a2\7"+
		"\17\2\2\u00a2\u00a4\7\21\2\2\u00a3\u0086\3\2\2\2\u00a3\u0087\3\2\2\2\u00a3"+
		"\u008d\3\2\2\2\u00a3\u0091\3\2\2\2\u00a3\u009b\3\2\2\2\u00a3\u00a1\3\2"+
		"\2\2\u00a4\35\3\2\2\2\u00a5\u00a6\b\20\1\2\u00a6\u00b5\5\66\34\2\u00a7"+
		"\u00a8\7\26\2\2\u00a8\u00a9\5\36\20\2\u00a9\u00aa\7\27\2\2\u00aa\u00b5"+
		"\3\2\2\2\u00ab\u00ac\7$\2\2\u00ac\u00ad\7\26\2\2\u00ad\u00ae\5(\25\2\u00ae"+
		"\u00af\7\27\2\2\u00af\u00b5\3\2\2\2\u00b0\u00b5\5\"\22\2\u00b1\u00b5\7"+
		"\6\2\2\u00b2\u00b5\7\f\2\2\u00b3\u00b5\7\r\2\2\u00b4\u00a5\3\2\2\2\u00b4"+
		"\u00a7\3\2\2\2\u00b4\u00ab\3\2\2\2\u00b4\u00b0\3\2\2\2\u00b4\u00b1\3\2"+
		"\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b3\3\2\2\2\u00b5\u00bc\3\2\2\2\u00b6"+
		"\u00b7\f\n\2\2\u00b7\u00b8\5 \21\2\u00b8\u00b9\5\36\20\13\u00b9\u00bb"+
		"\3\2\2\2\u00ba\u00b6\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc"+
		"\u00bd\3\2\2\2\u00bd\37\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c0\t\3\2"+
		"\2\u00c0!\3\2\2\2\u00c1\u00c8\7$\2\2\u00c2\u00c3\7\31\2\2\u00c3\u00c8"+
		"\7$\2\2\u00c4\u00c8\7%\2\2\u00c5\u00c8\7\f\2\2\u00c6\u00c8\7\r\2\2\u00c7"+
		"\u00c1\3\2\2\2\u00c7\u00c2\3\2\2\2\u00c7\u00c4\3\2\2\2\u00c7\u00c5\3\2"+
		"\2\2\u00c7\u00c6\3\2\2\2\u00c8#\3\2\2\2\u00c9\u00ca\b\23\1\2\u00ca\u00cb"+
		"\7\32\2\2\u00cb\u00d5\5$\23\6\u00cc\u00cd\7\26\2\2\u00cd\u00ce\5$\23\2"+
		"\u00ce\u00cf\7\27\2\2\u00cf\u00d5\3\2\2\2\u00d0\u00d1\5\36\20\2\u00d1"+
		"\u00d2\5&\24\2\u00d2\u00d3\5\36\20\2\u00d3\u00d5\3\2\2\2\u00d4\u00c9\3"+
		"\2\2\2\u00d4\u00cc\3\2\2\2\u00d4\u00d0\3\2\2\2\u00d5\u00db\3\2\2\2\u00d6"+
		"\u00d7\f\3\2\2\u00d7\u00d8\t\4\2\2\u00d8\u00da\5$\23\4\u00d9\u00d6\3\2"+
		"\2\2\u00da\u00dd\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc"+
		"%\3\2\2\2\u00dd\u00db\3\2\2\2\u00de\u00df\t\5\2\2\u00df\'\3\2\2\2\u00e0"+
		"\u00e3\5*\26\2\u00e1\u00e3\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e1\3\2"+
		"\2\2\u00e3)\3\2\2\2\u00e4\u00e9\7$\2\2\u00e5\u00e6\7$\2\2\u00e6\u00e7"+
		"\7\20\2\2\u00e7\u00e9\5*\26\2\u00e8\u00e4\3\2\2\2\u00e8\u00e5\3\2\2\2"+
		"\u00e9+\3\2\2\2\u00ea\u00eb\7\n\2\2\u00eb\u00ec\5$\23\2\u00ec\u00ed\7"+
		"\24\2\2\u00ed\u00ee\5\30\r\2\u00ee\u00ef\7\25\2\2\u00ef\u00f0\7\13\2\2"+
		"\u00f0\u00f1\7\24\2\2\u00f1\u00f2\5\30\r\2\u00f2\u00f3\7\25\2\2\u00f3"+
		"-\3\2\2\2\u00f4\u00f5\7\16\2\2\u00f5\u00f6\5$\23\2\u00f6\u00f7\7\24\2"+
		"\2\u00f7\u00f8\5\30\r\2\u00f8\u00f9\7\25\2\2\u00f9/\3\2\2\2\u00fa\u00fb"+
		"\7$\2\2\u00fb\u00fc\7\26\2\2\u00fc\u00fd\5(\25\2\u00fd\u00fe\7\27\2\2"+
		"\u00fe\u00ff\7\21\2\2\u00ff\61\3\2\2\2\u0100\u0101\7$\2\2\u0101\u0102"+
		"\7\26\2\2\u0102\u0103\5(\25\2\u0103\u0104\7\27\2\2\u0104\63\3\2\2\2\u0105"+
		"\u0106\5\36\20\2\u0106\u0107\t\3\2\2\u0107\u0108\5\36\20\2\u0108\65\3"+
		"\2\2\2\u0109\u010a\5\"\22\2\u010a\67\3\2\2\2\21@DUait\177\u00a3\u00b4"+
		"\u00bc\u00c7\u00d4\u00db\u00e2\u00e8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}