// Generated from C:/Users/Lenovo/Desktop/ReactProject66/ReactProject74/src/antlr/ReactParser.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ReactParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		REACTDOM=1, CREATEROOT=2, STRICT=3, APP=4, RENDER=5, DOCUMENT=6, GET=7, 
		ROOT=8, ARROW=9, DOT=10, SINGLE_QUOTE=11, DOUBLE_QUOTE=12, FORWARD_SLASH=13, 
		BACKSLASH=14, IMPORT=15, FROM=16, React=17, USEStateT=18, STRING_LITERAL=19, 
		CONST=20, USEFFECT=21, USEREF=22, CURRENT=23, FOCUS=24, FUNCTION=25, RETURN=26, 
		EXPORT=27, DEFAULT=28, JSX=29, MAPCALL=30, CREATE_ELEMENT=31, ELEMENTID=32, 
		ELEMENTURL=33, ELEMENTTITLE=34, ELEMENTDESCRIPTION=35, RDC=36, DDG=37, 
		RDS=38, ELEMENTONCLICK=39, CONSOLE_LOG=40, ELEMENT=41, DIVO=42, CNAME=43, 
		DIVC=44, ONCLICK=45, PARAGRAPH=46, H2=47, MAP=48, IMG=49, SRC=50, KEY=51, 
		ALT=52, LET=53, For=54, While=55, Do=56, If=57, ELSEIF=58, Else=59, TRUE=60, 
		FALSE=61, Switch=62, Case=63, Break=64, Instanceof=65, Typeof=66, New=67, 
		Var=68, Catch=69, Finally=70, Void=71, Continue=72, Debugger=73, This=74, 
		With=75, Throw=76, Delete=77, In=78, Try=79, As=80, NULL=81, Class=82, 
		Enum=83, Extends=84, Super=85, Async=86, Await=87, Implements=88, Private=89, 
		Public=90, Interface=91, Package=92, Protected=93, Static=94, Yield=95, 
		DISPLAY=96, JS=97, FLEX=98, SA=99, WIDTH=100, HEIGHT=101, MARGIN=102, 
		PX=103, COLUMN=104, FLEXDIRECTION=105, DOCTYPE=106, HTML_START=107, LANG_ATTRIBUTE=108, 
		HEAD_START=109, META_CHARSET=110, LINK_ICON=111, META_VIEWPORT=112, TITLE_START=113, 
		HTML_END=114, HEAD_END=115, BODY_START=116, BODY_END=117, DIV_ROOT=118, 
		SCRIPT_START=119, SCRIPT_SRC=120, ID=121, STRING=122, PATH=123, VARIABLE=124, 
		LETTER=125, NUMBER=126, INT=127, BOOLEAN=128, WS=129, COMMENT=130, LINE_COMMENT=131, 
		SEMI_COLON=132, OPEN_PAREN=133, CLOSE_PAREN=134, OPEN_CURLY=135, CLOSE_CURLY=136, 
		OPEN_BRACKET=137, CLOSE_BRACKET=138, OPENANGLEBRACKET=139, CLOSEANGLEBRACKET=140, 
		EQUAL=141, NOTEQUAL=142, COLON=143, COMMA=144, DASH=145, QuestionMark=146, 
		Ellipsis=147, PlusPlus=148, MinusMinus=149, Plus=150, BitNot=151, Not=152, 
		Multiply=153, Modulus=154, Power=155, NullCoalesce=156, Hashtag=157, LessThanEquals=158, 
		GreaterThanEquals=159, Equals_=160, IdentityEquals=161, IdentityNotEquals=162, 
		BitAnd=163, BitXOr=164, BitOr=165, And=166, Or=167, MultiplyAssign=168, 
		DivideAssign=169, ModulusAssign=170, PlusAssign=171, MinusAssign=172, 
		LeftShiftArithmeticAssign=173, RightShiftArithmeticAssign=174, RightShiftLogicalAssign=175, 
		BitAndAssign=176, BitXorAssign=177, BitOrAssign=178, PowerAssign=179, 
		MARKS=180;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_importFromPath = 2, RULE_importPackage = 3, 
		RULE_importhooks = 4, RULE_hooks = 5, RULE_property = 6, RULE_constDeclaration = 7, 
		RULE_arrayLiteral = 8, RULE_objectLiteral = 9, RULE_value = 10, RULE_arrayElement = 11, 
		RULE_params = 12, RULE_usestate = 13, RULE_arrowclick = 14, RULE_functionCall = 15, 
		RULE_elementProperties = 16, RULE_imageElements = 17, RULE_elementSecond = 18, 
		RULE_elementThird = 19, RULE_createImageElements = 20, RULE_returnImageElements = 21, 
		RULE_key = 22, RULE_src = 23, RULE_alt = 24, RULE_onClick = 25, RULE_image = 26, 
		RULE_imageProperty = 27, RULE_title = 28, RULE_heading = 29, RULE_description = 30, 
		RULE_paragraph = 31, RULE_ll = 32, RULE_container = 33, RULE_div = 34, 
		RULE_divBody = 35, RULE_props = 36, RULE_propsReturn = 37, RULE_propsElements = 38, 
		RULE_propsBody = 39, RULE_propsFunction = 40, RULE_function = 41, RULE_functionArrow = 42, 
		RULE_functionReturnValue = 43, RULE_defaultStatement = 44, RULE_useEffect = 45, 
		RULE_callback = 46, RULE_anonymous = 47, RULE_anonymousbody = 48, RULE_dependencies = 49, 
		RULE_empty = 50, RULE_existent = 51, RULE_parameter = 52, RULE_one = 53, 
		RULE_many = 54, RULE_useRef = 55, RULE_declarationStatement = 56, RULE_constStatement = 57, 
		RULE_printvalue = 58, RULE_consoleLogStatement = 59, RULE_variableValueAssignment = 60, 
		RULE_conditionOrLoop = 61, RULE_for = 62, RULE_forCondition = 63, RULE_forBody = 64, 
		RULE_while = 65, RULE_whileCondition = 66, RULE_whileConditionFunction = 67, 
		RULE_whileBody = 68, RULE_whileBodyFunction = 69, RULE_do = 70, RULE_if = 71, 
		RULE_ifCondition = 72, RULE_ifBody = 73, RULE_elseIf = 74, RULE_else = 75, 
		RULE_width = 76, RULE_height = 77, RULE_margin = 78, RULE_bodyImage = 79, 
		RULE_flexDirection = 80, RULE_display = 81, RULE_justify = 82, RULE_cssBody = 83, 
		RULE_css = 84, RULE_cssImg = 85, RULE_cssprogram = 86, RULE_content = 87, 
		RULE_html = 88, RULE_app = 89, RULE_node = 90, RULE_expression = 91, RULE_logicalOrExpression = 92, 
		RULE_logicalAndExpression = 93, RULE_equalityExpression = 94, RULE_relationalExpression = 95, 
		RULE_additiveExpression = 96, RULE_multiplicativeExpression = 97, RULE_unaryExpression = 98, 
		RULE_primaryExpression = 99;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "importFromPath", "importPackage", "importhooks", 
			"hooks", "property", "constDeclaration", "arrayLiteral", "objectLiteral", 
			"value", "arrayElement", "params", "usestate", "arrowclick", "functionCall", 
			"elementProperties", "imageElements", "elementSecond", "elementThird", 
			"createImageElements", "returnImageElements", "key", "src", "alt", "onClick", 
			"image", "imageProperty", "title", "heading", "description", "paragraph", 
			"ll", "container", "div", "divBody", "props", "propsReturn", "propsElements", 
			"propsBody", "propsFunction", "function", "functionArrow", "functionReturnValue", 
			"defaultStatement", "useEffect", "callback", "anonymous", "anonymousbody", 
			"dependencies", "empty", "existent", "parameter", "one", "many", "useRef", 
			"declarationStatement", "constStatement", "printvalue", "consoleLogStatement", 
			"variableValueAssignment", "conditionOrLoop", "for", "forCondition", 
			"forBody", "while", "whileCondition", "whileConditionFunction", "whileBody", 
			"whileBodyFunction", "do", "if", "ifCondition", "ifBody", "elseIf", "else", 
			"width", "height", "margin", "bodyImage", "flexDirection", "display", 
			"justify", "cssBody", "css", "cssImg", "cssprogram", "content", "html", 
			"app", "node", "expression", "logicalOrExpression", "logicalAndExpression", 
			"equalityExpression", "relationalExpression", "additiveExpression", "multiplicativeExpression", 
			"unaryExpression", "primaryExpression"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'ReactDOM'", "'createRoot'", "'StrictMode'", "'App'", "'render'", 
			"'document'", "'getElementById'", null, "'=>'", "'.'", "'''", "'\"'", 
			"'/'", "'\\'", "'import'", "'from'", "'React'", "'useState'", null, "'const'", 
			"'useEffect'", "'useRef'", "'current'", "'focus'", "'function'", "'return'", 
			"'export'", "'default'", "'jsx'", null, "'React.createElement'", null, 
			null, null, null, null, null, null, null, "'console.log'", null, "'div'", 
			"'className'", "'/div'", "'onClick'", "'p'", "'h2'", "'map'", "'img'", 
			"'src'", "'key'", "'alt'", "'let'", "'for'", "'while'", "'do'", "'if'", 
			"'else if'", "'else'", "'true'", "'false'", "'switch'", "'case'", "'break'", 
			"'instanceof'", "'typeof'", "'new'", "'var'", "'catch'", "'finally'", 
			"'void'", "'continue'", "'debugger'", "'this'", "'with'", "'throw'", 
			"'delete'", "'in'", "'try'", "'as'", "'null'", "'class'", "'enum'", "'extends'", 
			"'super'", "'async'", "'await'", "'implements'", "'private'", "'public'", 
			"'interface'", "'package'", "'protected'", "'static'", "'yield'", "'display'", 
			"'justify-content'", "'flex'", "'space-around'", "'width'", "'height'", 
			"'margin-bottom'", "'px'", "'column'", "'flex-direction'", "'<!doctype html>'", 
			"'<html'", null, "'<head>'", null, null, null, null, "'</html>'", "'</head>'", 
			"'<body>'", "'</body>'", null, null, "'src=\"/src/main.jsx\"></script>'", 
			null, null, null, null, null, null, null, null, null, null, null, "';'", 
			"'('", "')'", "'{'", "'}'", "'['", "']'", "'<'", "'>'", "'='", "'!='", 
			"':'", "','", "'-'", "'?'", "'...'", "'++'", "'--'", "'+'", "'~'", "'!'", 
			"'*'", "'%'", "'**'", "'??'", "'#'", "'<='", "'>='", "'=='", "'==='", 
			"'!=='", "'&'", "'^'", "'|'", "'&&'", "'||'", "'*='", "'/='", "'%='", 
			"'+='", "'-='", "'<<='", "'>>='", "'>>>='", "'&='", "'^='", "'|='", "'**='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "REACTDOM", "CREATEROOT", "STRICT", "APP", "RENDER", "DOCUMENT", 
			"GET", "ROOT", "ARROW", "DOT", "SINGLE_QUOTE", "DOUBLE_QUOTE", "FORWARD_SLASH", 
			"BACKSLASH", "IMPORT", "FROM", "React", "USEStateT", "STRING_LITERAL", 
			"CONST", "USEFFECT", "USEREF", "CURRENT", "FOCUS", "FUNCTION", "RETURN", 
			"EXPORT", "DEFAULT", "JSX", "MAPCALL", "CREATE_ELEMENT", "ELEMENTID", 
			"ELEMENTURL", "ELEMENTTITLE", "ELEMENTDESCRIPTION", "RDC", "DDG", "RDS", 
			"ELEMENTONCLICK", "CONSOLE_LOG", "ELEMENT", "DIVO", "CNAME", "DIVC", 
			"ONCLICK", "PARAGRAPH", "H2", "MAP", "IMG", "SRC", "KEY", "ALT", "LET", 
			"For", "While", "Do", "If", "ELSEIF", "Else", "TRUE", "FALSE", "Switch", 
			"Case", "Break", "Instanceof", "Typeof", "New", "Var", "Catch", "Finally", 
			"Void", "Continue", "Debugger", "This", "With", "Throw", "Delete", "In", 
			"Try", "As", "NULL", "Class", "Enum", "Extends", "Super", "Async", "Await", 
			"Implements", "Private", "Public", "Interface", "Package", "Protected", 
			"Static", "Yield", "DISPLAY", "JS", "FLEX", "SA", "WIDTH", "HEIGHT", 
			"MARGIN", "PX", "COLUMN", "FLEXDIRECTION", "DOCTYPE", "HTML_START", "LANG_ATTRIBUTE", 
			"HEAD_START", "META_CHARSET", "LINK_ICON", "META_VIEWPORT", "TITLE_START", 
			"HTML_END", "HEAD_END", "BODY_START", "BODY_END", "DIV_ROOT", "SCRIPT_START", 
			"SCRIPT_SRC", "ID", "STRING", "PATH", "VARIABLE", "LETTER", "NUMBER", 
			"INT", "BOOLEAN", "WS", "COMMENT", "LINE_COMMENT", "SEMI_COLON", "OPEN_PAREN", 
			"CLOSE_PAREN", "OPEN_CURLY", "CLOSE_CURLY", "OPEN_BRACKET", "CLOSE_BRACKET", 
			"OPENANGLEBRACKET", "CLOSEANGLEBRACKET", "EQUAL", "NOTEQUAL", "COLON", 
			"COMMA", "DASH", "QuestionMark", "Ellipsis", "PlusPlus", "MinusMinus", 
			"Plus", "BitNot", "Not", "Multiply", "Modulus", "Power", "NullCoalesce", 
			"Hashtag", "LessThanEquals", "GreaterThanEquals", "Equals_", "IdentityEquals", 
			"IdentityNotEquals", "BitAnd", "BitXOr", "BitOr", "And", "Or", "MultiplyAssign", 
			"DivideAssign", "ModulusAssign", "PlusAssign", "MinusAssign", "LeftShiftArithmeticAssign", 
			"RightShiftArithmeticAssign", "RightShiftLogicalAssign", "BitAndAssign", 
			"BitXorAssign", "BitOrAssign", "PowerAssign", "MARKS"
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
	public String getGrammarFileName() { return "ReactParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ReactParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ReactParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & 288503056178381857L) != 0) || ((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & 123706467713025L) != 0)) {
				{
				{
				setState(200);
				statement();
				}
				}
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(206);
			match(EOF);
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
		public ImportPackageContext importPackage() {
			return getRuleContext(ImportPackageContext.class,0);
		}
		public ImportFromPathContext importFromPath() {
			return getRuleContext(ImportFromPathContext.class,0);
		}
		public ImporthooksContext importhooks() {
			return getRuleContext(ImporthooksContext.class,0);
		}
		public ConstDeclarationContext constDeclaration() {
			return getRuleContext(ConstDeclarationContext.class,0);
		}
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ObjectLiteralContext objectLiteral() {
			return getRuleContext(ObjectLiteralContext.class,0);
		}
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public ArrowclickContext arrowclick() {
			return getRuleContext(ArrowclickContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public FunctionArrowContext functionArrow() {
			return getRuleContext(FunctionArrowContext.class,0);
		}
		public FunctionReturnValueContext functionReturnValue() {
			return getRuleContext(FunctionReturnValueContext.class,0);
		}
		public DivBodyContext divBody() {
			return getRuleContext(DivBodyContext.class,0);
		}
		public DivContext div() {
			return getRuleContext(DivContext.class,0);
		}
		public ConsoleLogStatementContext consoleLogStatement() {
			return getRuleContext(ConsoleLogStatementContext.class,0);
		}
		public DeclarationStatementContext declarationStatement() {
			return getRuleContext(DeclarationStatementContext.class,0);
		}
		public ConstStatementContext constStatement() {
			return getRuleContext(ConstStatementContext.class,0);
		}
		public VariableValueAssignmentContext variableValueAssignment() {
			return getRuleContext(VariableValueAssignmentContext.class,0);
		}
		public ImageElementsContext imageElements() {
			return getRuleContext(ImageElementsContext.class,0);
		}
		public ReturnImageElementsContext returnImageElements() {
			return getRuleContext(ReturnImageElementsContext.class,0);
		}
		public PropsFunctionContext propsFunction() {
			return getRuleContext(PropsFunctionContext.class,0);
		}
		public ConditionOrLoopContext conditionOrLoop() {
			return getRuleContext(ConditionOrLoopContext.class,0);
		}
		public CssprogramContext cssprogram() {
			return getRuleContext(CssprogramContext.class,0);
		}
		public HtmlContext html() {
			return getRuleContext(HtmlContext.class,0);
		}
		public NodeContext node() {
			return getRuleContext(NodeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(208);
				importPackage();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				importFromPath();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(210);
				importhooks();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(211);
				constDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(212);
				arrayLiteral();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(213);
				objectLiteral();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(214);
				property();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(215);
				arrowclick();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(216);
				function();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(217);
				functionArrow();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(218);
				functionReturnValue();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(219);
				divBody();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(220);
				div();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(221);
				consoleLogStatement();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(222);
				declarationStatement();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(223);
				constStatement();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(224);
				variableValueAssignment();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(225);
				imageElements();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(226);
				returnImageElements();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(227);
				propsFunction();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(228);
				conditionOrLoop();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(229);
				cssprogram();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(230);
				html();
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(231);
				node();
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(232);
				expression();
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
	public static class ImportFromPathContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(ReactParser.IMPORT, 0); }
		public TerminalNode STRING() { return getToken(ReactParser.STRING, 0); }
		public TerminalNode SEMI_COLON() { return getToken(ReactParser.SEMI_COLON, 0); }
		public ImportFromPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importFromPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterImportFromPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitImportFromPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitImportFromPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportFromPathContext importFromPath() throws RecognitionException {
		ImportFromPathContext _localctx = new ImportFromPathContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importFromPath);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(IMPORT);
			setState(236);
			match(STRING);
			setState(237);
			match(SEMI_COLON);
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
	public static class ImportPackageContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(ReactParser.IMPORT, 0); }
		public TerminalNode OPEN_CURLY() { return getToken(ReactParser.OPEN_CURLY, 0); }
		public TerminalNode ID() { return getToken(ReactParser.ID, 0); }
		public TerminalNode CLOSE_CURLY() { return getToken(ReactParser.CLOSE_CURLY, 0); }
		public TerminalNode FROM() { return getToken(ReactParser.FROM, 0); }
		public TerminalNode STRING() { return getToken(ReactParser.STRING, 0); }
		public List<TerminalNode> SEMI_COLON() { return getTokens(ReactParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(ReactParser.SEMI_COLON, i);
		}
		public ImportPackageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importPackage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterImportPackage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitImportPackage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitImportPackage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportPackageContext importPackage() throws RecognitionException {
		ImportPackageContext _localctx = new ImportPackageContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_importPackage);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(IMPORT);
			setState(240);
			match(OPEN_CURLY);
			setState(241);
			match(ID);
			setState(242);
			match(CLOSE_CURLY);
			setState(243);
			match(FROM);
			setState(244);
			match(STRING);
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI_COLON) {
				{
				{
				setState(245);
				match(SEMI_COLON);
				}
				}
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class ImporthooksContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(ReactParser.IMPORT, 0); }
		public TerminalNode OPEN_CURLY() { return getToken(ReactParser.OPEN_CURLY, 0); }
		public TerminalNode CLOSE_CURLY() { return getToken(ReactParser.CLOSE_CURLY, 0); }
		public TerminalNode FROM() { return getToken(ReactParser.FROM, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(ReactParser.STRING_LITERAL, 0); }
		public TerminalNode React() { return getToken(ReactParser.React, 0); }
		public TerminalNode COMMA() { return getToken(ReactParser.COMMA, 0); }
		public List<HooksContext> hooks() {
			return getRuleContexts(HooksContext.class);
		}
		public HooksContext hooks(int i) {
			return getRuleContext(HooksContext.class,i);
		}
		public List<TerminalNode> SEMI_COLON() { return getTokens(ReactParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(ReactParser.SEMI_COLON, i);
		}
		public ImporthooksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importhooks; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterImporthooks(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitImporthooks(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitImporthooks(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImporthooksContext importhooks() throws RecognitionException {
		ImporthooksContext _localctx = new ImporthooksContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_importhooks);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(IMPORT);
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==React) {
				{
				setState(252);
				match(React);
				}
			}

			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(255);
				match(COMMA);
				}
			}

			setState(258);
			match(OPEN_CURLY);
			setState(260); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(259);
				hooks();
				}
				}
				setState(262); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 6553600L) != 0) );
			setState(264);
			match(CLOSE_CURLY);
			setState(265);
			match(FROM);
			setState(266);
			match(STRING_LITERAL);
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI_COLON) {
				{
				{
				setState(267);
				match(SEMI_COLON);
				}
				}
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class HooksContext extends ParserRuleContext {
		public TerminalNode USEStateT() { return getToken(ReactParser.USEStateT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ReactParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ReactParser.COMMA, i);
		}
		public TerminalNode USEREF() { return getToken(ReactParser.USEREF, 0); }
		public TerminalNode USEFFECT() { return getToken(ReactParser.USEFFECT, 0); }
		public HooksContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hooks; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterHooks(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitHooks(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitHooks(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HooksContext hooks() throws RecognitionException {
		HooksContext _localctx = new HooksContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_hooks);
		int _la;
		try {
			setState(294);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case USEStateT:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				match(USEStateT);
				setState(277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(274);
					match(COMMA);
					}
					}
					setState(279);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case USEREF:
				enterOuterAlt(_localctx, 2);
				{
				setState(280);
				match(USEREF);
				setState(284);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(281);
					match(COMMA);
					}
					}
					setState(286);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case USEFFECT:
				enterOuterAlt(_localctx, 3);
				{
				setState(287);
				match(USEFFECT);
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(288);
					match(COMMA);
					}
					}
					setState(293);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
	public static class PropertyContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ReactParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ReactParser.ID, i);
		}
		public TerminalNode COLON() { return getToken(ReactParser.COLON, 0); }
		public TerminalNode STRING() { return getToken(ReactParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(ReactParser.NUMBER, 0); }
		public TerminalNode PATH() { return getToken(ReactParser.PATH, 0); }
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_property);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(ID);
			setState(297);
			match(COLON);
			setState(298);
			_la = _input.LA(1);
			if ( !(((((_la - 121)) & ~0x3f) == 0 && ((1L << (_la - 121)) & 39L) != 0)) ) {
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
	public static class ConstDeclarationContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(ReactParser.CONST, 0); }
		public TerminalNode ID() { return getToken(ReactParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(ReactParser.EQUAL, 0); }
		public TerminalNode SEMI_COLON() { return getToken(ReactParser.SEMI_COLON, 0); }
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ConstDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterConstDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitConstDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitConstDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstDeclarationContext constDeclaration() throws RecognitionException {
		ConstDeclarationContext _localctx = new ConstDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_constDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(300);
			match(CONST);
			setState(301);
			match(ID);
			setState(302);
			match(EQUAL);
			{
			setState(303);
			arrayLiteral();
			}
			setState(304);
			match(SEMI_COLON);
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
	public static class ArrayLiteralContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(ReactParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(ReactParser.CLOSE_BRACKET, 0); }
		public List<ObjectLiteralContext> objectLiteral() {
			return getRuleContexts(ObjectLiteralContext.class);
		}
		public ObjectLiteralContext objectLiteral(int i) {
			return getRuleContext(ObjectLiteralContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ReactParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ReactParser.COMMA, i);
		}
		public ArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterArrayLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitArrayLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitArrayLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayLiteralContext arrayLiteral() throws RecognitionException {
		ArrayLiteralContext _localctx = new ArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_arrayLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(OPEN_BRACKET);
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_CURLY) {
				{
				setState(307);
				objectLiteral();
				setState(316);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(309); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(308);
							match(COMMA);
							}
							}
							setState(311); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==COMMA );
						setState(313);
						objectLiteral();
						}
						} 
					}
					setState(318);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(319);
					match(COMMA);
					}
					}
					setState(324);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(327);
			match(CLOSE_BRACKET);
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
	public static class ObjectLiteralContext extends ParserRuleContext {
		public TerminalNode OPEN_CURLY() { return getToken(ReactParser.OPEN_CURLY, 0); }
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public TerminalNode CLOSE_CURLY() { return getToken(ReactParser.CLOSE_CURLY, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ReactParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ReactParser.COMMA, i);
		}
		public ObjectLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterObjectLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitObjectLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitObjectLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectLiteralContext objectLiteral() throws RecognitionException {
		ObjectLiteralContext _localctx = new ObjectLiteralContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_objectLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(329);
			match(OPEN_CURLY);
			setState(330);
			property();
			setState(335);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(331);
					match(COMMA);
					setState(332);
					property();
					}
					} 
				}
				setState(337);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(338);
				match(COMMA);
				}
			}

			setState(341);
			match(CLOSE_CURLY);
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
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(ReactParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(ReactParser.STRING, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==NUMBER) ) {
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
	public static class ArrayElementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ReactParser.ID, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(ReactParser.OPEN_BRACKET, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(ReactParser.CLOSE_BRACKET, 0); }
		public ArrayElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterArrayElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitArrayElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitArrayElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayElementContext arrayElement() throws RecognitionException {
		ArrayElementContext _localctx = new ArrayElementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_arrayElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(ID);
			setState(346);
			match(OPEN_BRACKET);
			setState(347);
			value();
			setState(348);
			match(CLOSE_BRACKET);
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
	public static class ParamsContext extends ParserRuleContext {
		public ArrayElementContext arrayElement() {
			return getRuleContext(ArrayElementContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode ID() { return getToken(ReactParser.ID, 0); }
		public TerminalNode COMMA() { return getToken(ReactParser.COMMA, 0); }
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(350);
				arrayElement();
				}
				break;
			case 2:
				{
				setState(351);
				value();
				}
				break;
			case 3:
				{
				setState(352);
				match(ID);
				}
				break;
			}
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(355);
				match(COMMA);
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
	public static class UsestateContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(ReactParser.CONST, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(ReactParser.OPEN_BRACKET, 0); }
		public List<TerminalNode> ID() { return getTokens(ReactParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ReactParser.ID, i);
		}
		public TerminalNode COMMA() { return getToken(ReactParser.COMMA, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(ReactParser.CLOSE_BRACKET, 0); }
		public TerminalNode EQUAL() { return getToken(ReactParser.EQUAL, 0); }
		public TerminalNode USEStateT() { return getToken(ReactParser.USEStateT, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ReactParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ReactParser.CLOSE_PAREN, 0); }
		public TerminalNode SEMI_COLON() { return getToken(ReactParser.SEMI_COLON, 0); }
		public List<ParamsContext> params() {
			return getRuleContexts(ParamsContext.class);
		}
		public ParamsContext params(int i) {
			return getRuleContext(ParamsContext.class,i);
		}
		public UsestateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_usestate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterUsestate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitUsestate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitUsestate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsestateContext usestate() throws RecognitionException {
		UsestateContext _localctx = new UsestateContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_usestate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(CONST);
			setState(359);
			match(OPEN_BRACKET);
			setState(360);
			match(ID);
			setState(361);
			match(COMMA);
			setState(362);
			match(ID);
			setState(363);
			match(CLOSE_BRACKET);
			setState(364);
			match(EQUAL);
			setState(365);
			match(USEStateT);
			setState(366);
			match(OPEN_PAREN);
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 121)) & ~0x3f) == 0 && ((1L << (_la - 121)) & 35L) != 0)) {
				{
				{
				setState(367);
				params();
				}
				}
				setState(372);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(373);
			match(CLOSE_PAREN);
			setState(374);
			match(SEMI_COLON);
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
	public static class ArrowclickContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(ReactParser.CONST, 0); }
		public List<TerminalNode> ID() { return getTokens(ReactParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ReactParser.ID, i);
		}
		public TerminalNode EQUAL() { return getToken(ReactParser.EQUAL, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ReactParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ReactParser.CLOSE_PAREN, 0); }
		public TerminalNode ARROW() { return getToken(ReactParser.ARROW, 0); }
		public TerminalNode OPEN_CURLY() { return getToken(ReactParser.OPEN_CURLY, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode CLOSE_CURLY() { return getToken(ReactParser.CLOSE_CURLY, 0); }
		public List<TerminalNode> SEMI_COLON() { return getTokens(ReactParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(ReactParser.SEMI_COLON, i);
		}
		public ArrowclickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowclick; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterArrowclick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitArrowclick(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitArrowclick(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrowclickContext arrowclick() throws RecognitionException {
		ArrowclickContext _localctx = new ArrowclickContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_arrowclick);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			match(CONST);
			setState(377);
			match(ID);
			setState(378);
			match(EQUAL);
			setState(379);
			match(OPEN_PAREN);
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(380);
				match(ID);
				}
			}

			setState(383);
			match(CLOSE_PAREN);
			setState(384);
			match(ARROW);
			setState(385);
			match(OPEN_CURLY);
			setState(386);
			functionCall();
			setState(387);
			match(CLOSE_CURLY);
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI_COLON) {
				{
				{
				setState(388);
				match(SEMI_COLON);
				}
				}
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ReactParser.ID, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ReactParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ReactParser.CLOSE_PAREN, 0); }
		public TerminalNode SEMI_COLON() { return getToken(ReactParser.SEMI_COLON, 0); }
		public List<ParamsContext> params() {
			return getRuleContexts(ParamsContext.class);
		}
		public ParamsContext params(int i) {
			return getRuleContext(ParamsContext.class,i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			match(ID);
			setState(395);
			match(OPEN_PAREN);
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 121)) & ~0x3f) == 0 && ((1L << (_la - 121)) & 35L) != 0)) {
				{
				{
				setState(396);
				params();
				}
				}
				setState(401);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(402);
			match(CLOSE_PAREN);
			setState(403);
			match(SEMI_COLON);
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
	public static class ElementPropertiesContext extends ParserRuleContext {
		public TerminalNode KEY() { return getToken(ReactParser.KEY, 0); }
		public TerminalNode COLON() { return getToken(ReactParser.COLON, 0); }
		public TerminalNode ELEMENTID() { return getToken(ReactParser.ELEMENTID, 0); }
		public TerminalNode COMMA() { return getToken(ReactParser.COMMA, 0); }
		public TerminalNode SRC() { return getToken(ReactParser.SRC, 0); }
		public TerminalNode ELEMENTURL() { return getToken(ReactParser.ELEMENTURL, 0); }
		public TerminalNode ALT() { return getToken(ReactParser.ALT, 0); }
		public TerminalNode ELEMENTTITLE() { return getToken(ReactParser.ELEMENTTITLE, 0); }
		public ElementPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementProperties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterElementProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitElementProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitElementProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementPropertiesContext elementProperties() throws RecognitionException {
		ElementPropertiesContext _localctx = new ElementPropertiesContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_elementProperties);
		int _la;
		try {
			setState(419);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KEY:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(405);
				match(KEY);
				setState(406);
				match(COLON);
				setState(407);
				match(ELEMENTID);
				setState(409);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(408);
					match(COMMA);
					}
				}

				}
				}
				break;
			case SRC:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(411);
				match(SRC);
				setState(412);
				match(COLON);
				setState(413);
				match(ELEMENTURL);
				setState(414);
				match(COMMA);
				}
				}
				break;
			case ALT:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(415);
				match(ALT);
				setState(416);
				match(COLON);
				setState(417);
				match(ELEMENTTITLE);
				setState(418);
				match(COMMA);
				}
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
	public static class ImageElementsContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(ReactParser.CONST, 0); }
		public List<TerminalNode> ID() { return getTokens(ReactParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ReactParser.ID, i);
		}
		public TerminalNode EQUAL() { return getToken(ReactParser.EQUAL, 0); }
		public TerminalNode MAPCALL() { return getToken(ReactParser.MAPCALL, 0); }
		public List<TerminalNode> OPEN_PAREN() { return getTokens(ReactParser.OPEN_PAREN); }
		public TerminalNode OPEN_PAREN(int i) {
			return getToken(ReactParser.OPEN_PAREN, i);
		}
		public List<TerminalNode> CLOSE_PAREN() { return getTokens(ReactParser.CLOSE_PAREN); }
		public TerminalNode CLOSE_PAREN(int i) {
			return getToken(ReactParser.CLOSE_PAREN, i);
		}
		public List<TerminalNode> ARROW() { return getTokens(ReactParser.ARROW); }
		public TerminalNode ARROW(int i) {
			return getToken(ReactParser.ARROW, i);
		}
		public TerminalNode CREATE_ELEMENT() { return getToken(ReactParser.CREATE_ELEMENT, 0); }
		public TerminalNode STRING() { return getToken(ReactParser.STRING, 0); }
		public TerminalNode COMMA() { return getToken(ReactParser.COMMA, 0); }
		public TerminalNode OPEN_CURLY() { return getToken(ReactParser.OPEN_CURLY, 0); }
		public TerminalNode CLOSE_CURLY() { return getToken(ReactParser.CLOSE_CURLY, 0); }
		public TerminalNode SEMI_COLON() { return getToken(ReactParser.SEMI_COLON, 0); }
		public List<ElementPropertiesContext> elementProperties() {
			return getRuleContexts(ElementPropertiesContext.class);
		}
		public ElementPropertiesContext elementProperties(int i) {
			return getRuleContext(ElementPropertiesContext.class,i);
		}
		public TerminalNode ONCLICK() { return getToken(ReactParser.ONCLICK, 0); }
		public TerminalNode COLON() { return getToken(ReactParser.COLON, 0); }
		public ImageElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imageElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterImageElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitImageElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitImageElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImageElementsContext imageElements() throws RecognitionException {
		ImageElementsContext _localctx = new ImageElementsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_imageElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			match(CONST);
			setState(422);
			match(ID);
			setState(423);
			match(EQUAL);
			setState(424);
			match(MAPCALL);
			setState(425);
			match(OPEN_PAREN);
			setState(426);
			match(OPEN_PAREN);
			setState(427);
			match(ID);
			setState(428);
			match(CLOSE_PAREN);
			setState(429);
			match(ARROW);
			setState(430);
			match(OPEN_PAREN);
			setState(431);
			match(CREATE_ELEMENT);
			setState(432);
			match(OPEN_PAREN);
			setState(433);
			match(STRING);
			setState(434);
			match(COMMA);
			setState(435);
			match(OPEN_CURLY);
			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7881299347898368L) != 0)) {
				{
				{
				setState(436);
				elementProperties();
				}
				}
				setState(441);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ONCLICK) {
				{
				setState(442);
				match(ONCLICK);
				setState(443);
				match(COLON);
				setState(444);
				match(OPEN_PAREN);
				setState(445);
				match(CLOSE_PAREN);
				setState(446);
				match(ARROW);
				setState(447);
				match(ID);
				setState(448);
				match(OPEN_PAREN);
				setState(449);
				match(ID);
				setState(450);
				match(CLOSE_PAREN);
				}
			}

			setState(453);
			match(CLOSE_CURLY);
			setState(454);
			match(CLOSE_PAREN);
			setState(455);
			match(CLOSE_PAREN);
			setState(456);
			match(CLOSE_PAREN);
			setState(457);
			match(SEMI_COLON);
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
	public static class ElementSecondContext extends ParserRuleContext {
		public TerminalNode OPEN_CURLY() { return getToken(ReactParser.OPEN_CURLY, 0); }
		public TerminalNode CLOSE_CURLY() { return getToken(ReactParser.CLOSE_CURLY, 0); }
		public TerminalNode CNAME() { return getToken(ReactParser.CNAME, 0); }
		public List<TerminalNode> COLON() { return getTokens(ReactParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(ReactParser.COLON, i);
		}
		public TerminalNode STRING() { return getToken(ReactParser.STRING, 0); }
		public List<TerminalNode> KEY() { return getTokens(ReactParser.KEY); }
		public TerminalNode KEY(int i) {
			return getToken(ReactParser.KEY, i);
		}
		public List<TerminalNode> SRC() { return getTokens(ReactParser.SRC); }
		public TerminalNode SRC(int i) {
			return getToken(ReactParser.SRC, i);
		}
		public List<TerminalNode> ALT() { return getTokens(ReactParser.ALT); }
		public TerminalNode ALT(int i) {
			return getToken(ReactParser.ALT, i);
		}
		public List<TerminalNode> ELEMENTID() { return getTokens(ReactParser.ELEMENTID); }
		public TerminalNode ELEMENTID(int i) {
			return getToken(ReactParser.ELEMENTID, i);
		}
		public List<TerminalNode> ELEMENTURL() { return getTokens(ReactParser.ELEMENTURL); }
		public TerminalNode ELEMENTURL(int i) {
			return getToken(ReactParser.ELEMENTURL, i);
		}
		public List<TerminalNode> ELEMENTTITLE() { return getTokens(ReactParser.ELEMENTTITLE); }
		public TerminalNode ELEMENTTITLE(int i) {
			return getToken(ReactParser.ELEMENTTITLE, i);
		}
		public List<TerminalNode> ELEMENTDESCRIPTION() { return getTokens(ReactParser.ELEMENTDESCRIPTION); }
		public TerminalNode ELEMENTDESCRIPTION(int i) {
			return getToken(ReactParser.ELEMENTDESCRIPTION, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ReactParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ReactParser.COMMA, i);
		}
		public TerminalNode ID() { return getToken(ReactParser.ID, 0); }
		public TerminalNode NULL() { return getToken(ReactParser.NULL, 0); }
		public ElementSecondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementSecond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterElementSecond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitElementSecond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitElementSecond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementSecondContext elementSecond() throws RecognitionException {
		ElementSecondContext _localctx = new ElementSecondContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_elementSecond);
		int _la;
		try {
			setState(479);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_CURLY:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(459);
				match(OPEN_CURLY);
				setState(474);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CNAME:
					{
					{
					setState(460);
					match(CNAME);
					setState(461);
					match(COLON);
					setState(462);
					match(STRING);
					}
					}
					break;
				case SRC:
				case KEY:
				case ALT:
				case CLOSE_CURLY:
					{
					setState(471);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7881299347898368L) != 0)) {
						{
						{
						setState(463);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7881299347898368L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(464);
						match(COLON);
						setState(465);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 64424509440L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(467);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==COMMA) {
							{
							setState(466);
							match(COMMA);
							}
						}

						}
						}
						setState(473);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(476);
				match(CLOSE_CURLY);
				}
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(477);
				match(ID);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 3);
				{
				setState(478);
				match(NULL);
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
	public static class ElementThirdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ReactParser.ID, 0); }
		public TerminalNode ELEMENTID() { return getToken(ReactParser.ELEMENTID, 0); }
		public TerminalNode ELEMENTURL() { return getToken(ReactParser.ELEMENTURL, 0); }
		public TerminalNode ELEMENTTITLE() { return getToken(ReactParser.ELEMENTTITLE, 0); }
		public TerminalNode ELEMENTDESCRIPTION() { return getToken(ReactParser.ELEMENTDESCRIPTION, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ReactParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ReactParser.COMMA, i);
		}
		public List<CreateImageElementsContext> createImageElements() {
			return getRuleContexts(CreateImageElementsContext.class);
		}
		public CreateImageElementsContext createImageElements(int i) {
			return getRuleContext(CreateImageElementsContext.class,i);
		}
		public ElementThirdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementThird; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterElementThird(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitElementThird(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitElementThird(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementThirdContext elementThird() throws RecognitionException {
		ElementThirdContext _localctx = new ElementThirdContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_elementThird);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(481);
				match(ID);
				}
				break;
			case CREATE_ELEMENT:
			case CLOSE_PAREN:
			case COMMA:
				{
				setState(487);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CREATE_ELEMENT) {
					{
					{
					setState(482);
					createImageElements();
					setState(483);
					match(COMMA);
					}
					}
					setState(489);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case ELEMENTID:
				{
				setState(490);
				match(ELEMENTID);
				}
				break;
			case ELEMENTURL:
				{
				setState(491);
				match(ELEMENTURL);
				}
				break;
			case ELEMENTTITLE:
				{
				setState(492);
				match(ELEMENTTITLE);
				}
				break;
			case ELEMENTDESCRIPTION:
				{
				setState(493);
				match(ELEMENTDESCRIPTION);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(497);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(496);
				match(COMMA);
				}
				break;
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
	public static class CreateImageElementsContext extends ParserRuleContext {
		public TerminalNode CREATE_ELEMENT() { return getToken(ReactParser.CREATE_ELEMENT, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ReactParser.OPEN_PAREN, 0); }
		public TerminalNode STRING() { return getToken(ReactParser.STRING, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ReactParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ReactParser.COMMA, i);
		}
		public ElementSecondContext elementSecond() {
			return getRuleContext(ElementSecondContext.class,0);
		}
		public ElementThirdContext elementThird() {
			return getRuleContext(ElementThirdContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(ReactParser.CLOSE_PAREN, 0); }
		public CreateImageElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createImageElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterCreateImageElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitCreateImageElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitCreateImageElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateImageElementsContext createImageElements() throws RecognitionException {
		CreateImageElementsContext _localctx = new CreateImageElementsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_createImageElements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			match(CREATE_ELEMENT);
			setState(500);
			match(OPEN_PAREN);
			setState(501);
			match(STRING);
			setState(502);
			match(COMMA);
			setState(503);
			elementSecond();
			setState(504);
			match(COMMA);
			setState(505);
			elementThird();
			setState(507);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(506);
				match(CLOSE_PAREN);
				}
				break;
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
	public static class ReturnImageElementsContext extends ParserRuleContext {
		public CreateImageElementsContext createImageElements() {
			return getRuleContext(CreateImageElementsContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(ReactParser.CLOSE_PAREN, 0); }
		public TerminalNode SEMI_COLON() { return getToken(ReactParser.SEMI_COLON, 0); }
		public ReturnImageElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnImageElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterReturnImageElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitReturnImageElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitReturnImageElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnImageElementsContext returnImageElements() throws RecognitionException {
		ReturnImageElementsContext _localctx = new ReturnImageElementsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_returnImageElements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			createImageElements();
			setState(510);
			match(CLOSE_PAREN);
			setState(511);
			match(SEMI_COLON);
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
	public static class KeyContext extends ParserRuleContext {
		public TerminalNode KEY() { return getToken(ReactParser.KEY, 0); }
		public TerminalNode EQUAL() { return getToken(ReactParser.EQUAL, 0); }
		public TerminalNode OPEN_CURLY() { return getToken(ReactParser.OPEN_CURLY, 0); }
		public TerminalNode ELEMENTID() { return getToken(ReactParser.ELEMENTID, 0); }
		public TerminalNode CLOSE_CURLY() { return getToken(ReactParser.CLOSE_CURLY, 0); }
		public KeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyContext key() throws RecognitionException {
		KeyContext _localctx = new KeyContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			match(KEY);
			setState(514);
			match(EQUAL);
			setState(515);
			match(OPEN_CURLY);
			setState(516);
			match(ELEMENTID);
			setState(517);
			match(CLOSE_CURLY);
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
	public static class SrcContext extends ParserRuleContext {
		public TerminalNode SRC() { return getToken(ReactParser.SRC, 0); }
		public TerminalNode EQUAL() { return getToken(ReactParser.EQUAL, 0); }
		public TerminalNode OPEN_CURLY() { return getToken(ReactParser.OPEN_CURLY, 0); }
		public TerminalNode ELEMENTURL() { return getToken(ReactParser.ELEMENTURL, 0); }
		public TerminalNode CLOSE_CURLY() { return getToken(ReactParser.CLOSE_CURLY, 0); }
		public SrcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_src; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterSrc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitSrc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitSrc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SrcContext src() throws RecognitionException {
		SrcContext _localctx = new SrcContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_src);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			match(SRC);
			setState(520);
			match(EQUAL);
			setState(521);
			match(OPEN_CURLY);
			setState(522);
			match(ELEMENTURL);
			setState(523);
			match(CLOSE_CURLY);
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
	public static class AltContext extends ParserRuleContext {
		public TerminalNode ALT() { return getToken(ReactParser.ALT, 0); }
		public TerminalNode EQUAL() { return getToken(ReactParser.EQUAL, 0); }
		public TerminalNode OPEN_CURLY() { return getToken(ReactParser.OPEN_CURLY, 0); }
		public TerminalNode ELEMENTTITLE() { return getToken(ReactParser.ELEMENTTITLE, 0); }
		public TerminalNode CLOSE_CURLY() { return getToken(ReactParser.CLOSE_CURLY, 0); }
		public AltContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterAlt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitAlt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitAlt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AltContext alt() throws RecognitionException {
		AltContext _localctx = new AltContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_alt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			match(ALT);
			setState(526);
			match(EQUAL);
			setState(527);
			match(OPEN_CURLY);
			setState(528);
			match(ELEMENTTITLE);
			setState(529);
			match(CLOSE_CURLY);
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
	public static class OnClickContext extends ParserRuleContext {
		public List<TerminalNode> ONCLICK() { return getTokens(ReactParser.ONCLICK); }
		public TerminalNode ONCLICK(int i) {
			return getToken(ReactParser.ONCLICK, i);
		}
		public TerminalNode EQUAL() { return getToken(ReactParser.EQUAL, 0); }
		public TerminalNode OPEN_CURLY() { return getToken(ReactParser.OPEN_CURLY, 0); }
		public List<TerminalNode> OPEN_PAREN() { return getTokens(ReactParser.OPEN_PAREN); }
		public TerminalNode OPEN_PAREN(int i) {
			return getToken(ReactParser.OPEN_PAREN, i);
		}
		public List<TerminalNode> CLOSE_PAREN() { return getTokens(ReactParser.CLOSE_PAREN); }
		public TerminalNode CLOSE_PAREN(int i) {
			return getToken(ReactParser.CLOSE_PAREN, i);
		}
		public TerminalNode ARROW() { return getToken(ReactParser.ARROW, 0); }
		public List<TerminalNode> ID() { return getTokens(ReactParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ReactParser.ID, i);
		}
		public TerminalNode CLOSE_CURLY() { return getToken(ReactParser.CLOSE_CURLY, 0); }
		public OnClickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onClick; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterOnClick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitOnClick(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitOnClick(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnClickContext onClick() throws RecognitionException {
		OnClickContext _localctx = new OnClickContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_onClick);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			match(ONCLICK);
			setState(532);
			match(EQUAL);
			setState(533);
			match(OPEN_CURLY);
			setState(534);
			match(OPEN_PAREN);
			setState(535);
			match(CLOSE_PAREN);
			setState(536);
			match(ARROW);
			setState(537);
			_la = _input.LA(1);
			if ( !(_la==ONCLICK || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(538);
			match(OPEN_PAREN);
			setState(539);
			match(ID);
			setState(540);
			match(CLOSE_PAREN);
			setState(541);
			match(CLOSE_CURLY);
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
	public static class ImageContext extends ParserRuleContext {
		public TerminalNode OPENANGLEBRACKET() { return getToken(ReactParser.OPENANGLEBRACKET, 0); }
		public TerminalNode FORWARD_SLASH() { return getToken(ReactParser.FORWARD_SLASH, 0); }
		public TerminalNode CLOSEANGLEBRACKET() { return getToken(ReactParser.CLOSEANGLEBRACKET, 0); }
		public TerminalNode IMG() { return getToken(ReactParser.IMG, 0); }
		public SrcContext src() {
			return getRuleContext(SrcContext.class,0);
		}
		public AltContext alt() {
			return getRuleContext(AltContext.class,0);
		}
		public TerminalNode ID() { return getToken(ReactParser.ID, 0); }
		public KeyContext key() {
			return getRuleContext(KeyContext.class,0);
		}
		public OnClickContext onClick() {
			return getRuleContext(OnClickContext.class,0);
		}
		public List<ImagePropertyContext> imageProperty() {
			return getRuleContexts(ImagePropertyContext.class);
		}
		public ImagePropertyContext imageProperty(int i) {
			return getRuleContext(ImagePropertyContext.class,i);
		}
		public ImageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_image; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterImage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitImage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitImage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImageContext image() throws RecognitionException {
		ImageContext _localctx = new ImageContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_image);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
			match(OPENANGLEBRACKET);
			setState(560);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMG:
				{
				{
				setState(544);
				match(IMG);
				setState(546);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KEY) {
					{
					setState(545);
					key();
					}
				}

				setState(548);
				src();
				setState(549);
				alt();
				setState(551);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ONCLICK) {
					{
					setState(550);
					onClick();
					}
				}

				}
				}
				break;
			case ID:
				{
				{
				setState(553);
				match(ID);
				setState(557);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 5664683906301952L) != 0) || _la==ID) {
					{
					{
					setState(554);
					imageProperty();
					}
					}
					setState(559);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(562);
			match(FORWARD_SLASH);
			setState(563);
			match(CLOSEANGLEBRACKET);
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
	public static class ImagePropertyContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(ReactParser.EQUAL, 0); }
		public TerminalNode OPEN_CURLY() { return getToken(ReactParser.OPEN_CURLY, 0); }
		public TerminalNode CLOSE_CURLY() { return getToken(ReactParser.CLOSE_CURLY, 0); }
		public List<TerminalNode> ID() { return getTokens(ReactParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ReactParser.ID, i);
		}
		public TerminalNode ALT() { return getToken(ReactParser.ALT, 0); }
		public TerminalNode SRC() { return getToken(ReactParser.SRC, 0); }
		public TerminalNode ONCLICK() { return getToken(ReactParser.ONCLICK, 0); }
		public ImagePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imageProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterImageProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitImageProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitImageProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImagePropertyContext imageProperty() throws RecognitionException {
		ImagePropertyContext _localctx = new ImagePropertyContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_imageProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(565);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 5664683906301952L) != 0) || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(566);
			match(EQUAL);
			setState(567);
			match(OPEN_CURLY);
			{
			setState(568);
			match(ID);
			}
			setState(569);
			match(CLOSE_CURLY);
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
	public static class TitleContext extends ParserRuleContext {
		public TerminalNode OPEN_CURLY() { return getToken(ReactParser.OPEN_CURLY, 0); }
		public TerminalNode ELEMENTTITLE() { return getToken(ReactParser.ELEMENTTITLE, 0); }
		public TerminalNode CLOSE_CURLY() { return getToken(ReactParser.CLOSE_CURLY, 0); }
		public TitleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_title; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterTitle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitTitle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitTitle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TitleContext title() throws RecognitionException {
		TitleContext _localctx = new TitleContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_title);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			match(OPEN_CURLY);
			setState(572);
			match(ELEMENTTITLE);
			setState(573);
			match(CLOSE_CURLY);
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
	public static class HeadingContext extends ParserRuleContext {
		public List<TerminalNode> OPENANGLEBRACKET() { return getTokens(ReactParser.OPENANGLEBRACKET); }
		public TerminalNode OPENANGLEBRACKET(int i) {
			return getToken(ReactParser.OPENANGLEBRACKET, i);
		}
		public List<TerminalNode> H2() { return getTokens(ReactParser.H2); }
		public TerminalNode H2(int i) {
			return getToken(ReactParser.H2, i);
		}
		public List<TerminalNode> CLOSEANGLEBRACKET() { return getTokens(ReactParser.CLOSEANGLEBRACKET); }
		public TerminalNode CLOSEANGLEBRACKET(int i) {
			return getToken(ReactParser.CLOSEANGLEBRACKET, i);
		}
		public TitleContext title() {
			return getRuleContext(TitleContext.class,0);
		}
		public TerminalNode FORWARD_SLASH() { return getToken(ReactParser.FORWARD_SLASH, 0); }
		public HeadingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_heading; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterHeading(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitHeading(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitHeading(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeadingContext heading() throws RecognitionException {
		HeadingContext _localctx = new HeadingContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_heading);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(575);
			match(OPENANGLEBRACKET);
			setState(576);
			match(H2);
			setState(577);
			match(CLOSEANGLEBRACKET);
			setState(578);
			title();
			setState(579);
			match(OPENANGLEBRACKET);
			setState(580);
			match(FORWARD_SLASH);
			setState(581);
			match(H2);
			setState(582);
			match(CLOSEANGLEBRACKET);
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
	public static class DescriptionContext extends ParserRuleContext {
		public TerminalNode OPEN_CURLY() { return getToken(ReactParser.OPEN_CURLY, 0); }
		public TerminalNode ELEMENTDESCRIPTION() { return getToken(ReactParser.ELEMENTDESCRIPTION, 0); }
		public TerminalNode CLOSE_CURLY() { return getToken(ReactParser.CLOSE_CURLY, 0); }
		public DescriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_description; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterDescription(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitDescription(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitDescription(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescriptionContext description() throws RecognitionException {
		DescriptionContext _localctx = new DescriptionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_description);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			match(OPEN_CURLY);
			setState(585);
			match(ELEMENTDESCRIPTION);
			setState(586);
			match(CLOSE_CURLY);
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
	public static class ParagraphContext extends ParserRuleContext {
		public List<TerminalNode> OPENANGLEBRACKET() { return getTokens(ReactParser.OPENANGLEBRACKET); }
		public TerminalNode OPENANGLEBRACKET(int i) {
			return getToken(ReactParser.OPENANGLEBRACKET, i);
		}
		public List<TerminalNode> PARAGRAPH() { return getTokens(ReactParser.PARAGRAPH); }
		public TerminalNode PARAGRAPH(int i) {
			return getToken(ReactParser.PARAGRAPH, i);
		}
		public List<TerminalNode> CLOSEANGLEBRACKET() { return getTokens(ReactParser.CLOSEANGLEBRACKET); }
		public TerminalNode CLOSEANGLEBRACKET(int i) {
			return getToken(ReactParser.CLOSEANGLEBRACKET, i);
		}
		public DescriptionContext description() {
			return getRuleContext(DescriptionContext.class,0);
		}
		public TerminalNode FORWARD_SLASH() { return getToken(ReactParser.FORWARD_SLASH, 0); }
		public ParagraphContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paragraph; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterParagraph(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitParagraph(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitParagraph(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParagraphContext paragraph() throws RecognitionException {
		ParagraphContext _localctx = new ParagraphContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_paragraph);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			match(OPENANGLEBRACKET);
			setState(589);
			match(PARAGRAPH);
			setState(590);
			match(CLOSEANGLEBRACKET);
			setState(591);
			description();
			setState(592);
			match(OPENANGLEBRACKET);
			setState(593);
			match(FORWARD_SLASH);
			setState(594);
			match(PARAGRAPH);
			setState(595);
			match(CLOSEANGLEBRACKET);
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
	public static class LlContext extends ParserRuleContext {
		public TerminalNode OPEN_CURLY() { return getToken(ReactParser.OPEN_CURLY, 0); }
		public TerminalNode MAPCALL() { return getToken(ReactParser.MAPCALL, 0); }
		public List<TerminalNode> OPEN_PAREN() { return getTokens(ReactParser.OPEN_PAREN); }
		public TerminalNode OPEN_PAREN(int i) {
			return getToken(ReactParser.OPEN_PAREN, i);
		}
		public TerminalNode ID() { return getToken(ReactParser.ID, 0); }
		public List<TerminalNode> CLOSE_PAREN() { return getTokens(ReactParser.CLOSE_PAREN); }
		public TerminalNode CLOSE_PAREN(int i) {
			return getToken(ReactParser.CLOSE_PAREN, i);
		}
		public TerminalNode ARROW() { return getToken(ReactParser.ARROW, 0); }
		public ImageContext image() {
			return getRuleContext(ImageContext.class,0);
		}
		public TerminalNode CLOSE_CURLY() { return getToken(ReactParser.CLOSE_CURLY, 0); }
		public LlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ll; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterLl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitLl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitLl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LlContext ll() throws RecognitionException {
		LlContext _localctx = new LlContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_ll);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			match(OPEN_CURLY);
			setState(598);
			match(MAPCALL);
			setState(599);
			match(OPEN_PAREN);
			setState(600);
			match(OPEN_PAREN);
			setState(601);
			match(ID);
			setState(602);
			match(CLOSE_PAREN);
			setState(603);
			match(ARROW);
			setState(604);
			match(OPEN_PAREN);
			setState(605);
			image();
			setState(606);
			match(CLOSE_PAREN);
			setState(607);
			match(CLOSE_PAREN);
			setState(608);
			match(CLOSE_CURLY);
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
	public static class ContainerContext extends ParserRuleContext {
		public DivBodyContext divBody() {
			return getRuleContext(DivBodyContext.class,0);
		}
		public LlContext ll() {
			return getRuleContext(LlContext.class,0);
		}
		public ImageContext image() {
			return getRuleContext(ImageContext.class,0);
		}
		public HeadingContext heading() {
			return getRuleContext(HeadingContext.class,0);
		}
		public ParagraphContext paragraph() {
			return getRuleContext(ParagraphContext.class,0);
		}
		public ContainerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_container; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterContainer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitContainer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitContainer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContainerContext container() throws RecognitionException {
		ContainerContext _localctx = new ContainerContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_container);
		try {
			setState(615);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(610);
				divBody();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(611);
				ll();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(612);
				image();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(613);
				heading();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(614);
				paragraph();
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
	public static class DivContext extends ParserRuleContext {
		public DivBodyContext divBody() {
			return getRuleContext(DivBodyContext.class,0);
		}
		public DivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_div; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DivContext div() throws RecognitionException {
		DivContext _localctx = new DivContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_div);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(617);
			divBody();
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
	public static class DivBodyContext extends ParserRuleContext {
		public List<TerminalNode> OPENANGLEBRACKET() { return getTokens(ReactParser.OPENANGLEBRACKET); }
		public TerminalNode OPENANGLEBRACKET(int i) {
			return getToken(ReactParser.OPENANGLEBRACKET, i);
		}
		public TerminalNode DIVO() { return getToken(ReactParser.DIVO, 0); }
		public TerminalNode CNAME() { return getToken(ReactParser.CNAME, 0); }
		public TerminalNode EQUAL() { return getToken(ReactParser.EQUAL, 0); }
		public TerminalNode STRING() { return getToken(ReactParser.STRING, 0); }
		public List<TerminalNode> CLOSEANGLEBRACKET() { return getTokens(ReactParser.CLOSEANGLEBRACKET); }
		public TerminalNode CLOSEANGLEBRACKET(int i) {
			return getToken(ReactParser.CLOSEANGLEBRACKET, i);
		}
		public TerminalNode DIVC() { return getToken(ReactParser.DIVC, 0); }
		public List<ContainerContext> container() {
			return getRuleContexts(ContainerContext.class);
		}
		public ContainerContext container(int i) {
			return getRuleContext(ContainerContext.class,i);
		}
		public DivBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_divBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterDivBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitDivBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitDivBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DivBodyContext divBody() throws RecognitionException {
		DivBodyContext _localctx = new DivBodyContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_divBody);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			match(OPENANGLEBRACKET);
			setState(620);
			match(DIVO);
			setState(621);
			match(CNAME);
			setState(622);
			match(EQUAL);
			setState(623);
			match(STRING);
			setState(624);
			match(CLOSEANGLEBRACKET);
			setState(628);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(625);
					container();
					}
					} 
				}
				setState(630);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			}
			setState(631);
			match(OPENANGLEBRACKET);
			setState(632);
			match(DIVC);
			setState(633);
			match(CLOSEANGLEBRACKET);
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
	public static class PropsContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(ReactParser.CONST, 0); }
		public TerminalNode OPEN_CURLY() { return getToken(ReactParser.OPEN_CURLY, 0); }
		public List<TerminalNode> ID() { return getTokens(ReactParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ReactParser.ID, i);
		}
		public TerminalNode COMMA() { return getToken(ReactParser.COMMA, 0); }
		public TerminalNode CLOSE_CURLY() { return getToken(ReactParser.CLOSE_CURLY, 0); }
		public TerminalNode EQUAL() { return getToken(ReactParser.EQUAL, 0); }
		public TerminalNode SEMI_COLON() { return getToken(ReactParser.SEMI_COLON, 0); }
		public TerminalNode ONCLICK() { return getToken(ReactParser.ONCLICK, 0); }
		public PropsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_props; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterProps(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitProps(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitProps(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropsContext props() throws RecognitionException {
		PropsContext _localctx = new PropsContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_props);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
			match(CONST);
			setState(636);
			match(OPEN_CURLY);
			setState(637);
			match(ID);
			setState(638);
			match(COMMA);
			setState(639);
			_la = _input.LA(1);
			if ( !(_la==ONCLICK || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(640);
			match(CLOSE_CURLY);
			setState(641);
			match(EQUAL);
			setState(642);
			match(ID);
			setState(643);
			match(SEMI_COLON);
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
	public static class PropsReturnContext extends ParserRuleContext {
		public TerminalNode OPENANGLEBRACKET() { return getToken(ReactParser.OPENANGLEBRACKET, 0); }
		public TerminalNode IMG() { return getToken(ReactParser.IMG, 0); }
		public TerminalNode FORWARD_SLASH() { return getToken(ReactParser.FORWARD_SLASH, 0); }
		public TerminalNode CLOSEANGLEBRACKET() { return getToken(ReactParser.CLOSEANGLEBRACKET, 0); }
		public List<PropsElementsContext> propsElements() {
			return getRuleContexts(PropsElementsContext.class);
		}
		public PropsElementsContext propsElements(int i) {
			return getRuleContext(PropsElementsContext.class,i);
		}
		public OnClickContext onClick() {
			return getRuleContext(OnClickContext.class,0);
		}
		public PropsReturnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propsReturn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterPropsReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitPropsReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitPropsReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropsReturnContext propsReturn() throws RecognitionException {
		PropsReturnContext _localctx = new PropsReturnContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_propsReturn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
			match(OPENANGLEBRACKET);
			setState(646);
			match(IMG);
			setState(650);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SRC || _la==ALT || _la==ID) {
				{
				{
				setState(647);
				propsElements();
				}
				}
				setState(652);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(654);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ONCLICK) {
				{
				setState(653);
				onClick();
				}
			}

			setState(656);
			match(FORWARD_SLASH);
			setState(657);
			match(CLOSEANGLEBRACKET);
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
	public static class PropsElementsContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(ReactParser.EQUAL, 0); }
		public TerminalNode OPEN_CURLY() { return getToken(ReactParser.OPEN_CURLY, 0); }
		public TerminalNode CLOSE_CURLY() { return getToken(ReactParser.CLOSE_CURLY, 0); }
		public TerminalNode ID() { return getToken(ReactParser.ID, 0); }
		public TerminalNode SRC() { return getToken(ReactParser.SRC, 0); }
		public TerminalNode ALT() { return getToken(ReactParser.ALT, 0); }
		public TerminalNode ELEMENTID() { return getToken(ReactParser.ELEMENTID, 0); }
		public TerminalNode ELEMENTURL() { return getToken(ReactParser.ELEMENTURL, 0); }
		public TerminalNode ELEMENTTITLE() { return getToken(ReactParser.ELEMENTTITLE, 0); }
		public PropsElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propsElements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterPropsElements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitPropsElements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitPropsElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropsElementsContext propsElements() throws RecognitionException {
		PropsElementsContext _localctx = new PropsElementsContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_propsElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(659);
			_la = _input.LA(1);
			if ( !(_la==SRC || _la==ALT || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(660);
			match(EQUAL);
			setState(661);
			match(OPEN_CURLY);
			setState(662);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 30064771072L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(663);
			match(CLOSE_CURLY);
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
	public static class PropsBodyContext extends ParserRuleContext {
		public PropsContext props() {
			return getRuleContext(PropsContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(ReactParser.RETURN, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ReactParser.OPEN_PAREN, 0); }
		public PropsReturnContext propsReturn() {
			return getRuleContext(PropsReturnContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(ReactParser.CLOSE_PAREN, 0); }
		public TerminalNode SEMI_COLON() { return getToken(ReactParser.SEMI_COLON, 0); }
		public PropsBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propsBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterPropsBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitPropsBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitPropsBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropsBodyContext propsBody() throws RecognitionException {
		PropsBodyContext _localctx = new PropsBodyContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_propsBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			props();
			setState(666);
			match(RETURN);
			setState(667);
			match(OPEN_PAREN);
			setState(668);
			propsReturn();
			setState(669);
			match(CLOSE_PAREN);
			setState(670);
			match(SEMI_COLON);
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
	public static class PropsFunctionContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(ReactParser.FUNCTION, 0); }
		public List<TerminalNode> ID() { return getTokens(ReactParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ReactParser.ID, i);
		}
		public TerminalNode OPEN_PAREN() { return getToken(ReactParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ReactParser.CLOSE_PAREN, 0); }
		public TerminalNode OPEN_CURLY() { return getToken(ReactParser.OPEN_CURLY, 0); }
		public PropsBodyContext propsBody() {
			return getRuleContext(PropsBodyContext.class,0);
		}
		public TerminalNode CLOSE_CURLY() { return getToken(ReactParser.CLOSE_CURLY, 0); }
		public PropsFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propsFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterPropsFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitPropsFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitPropsFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropsFunctionContext propsFunction() throws RecognitionException {
		PropsFunctionContext _localctx = new PropsFunctionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_propsFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(672);
			match(FUNCTION);
			setState(673);
			match(ID);
			setState(674);
			match(OPEN_PAREN);
			setState(675);
			match(ID);
			setState(676);
			match(CLOSE_PAREN);
			setState(677);
			match(OPEN_CURLY);
			setState(678);
			propsBody();
			setState(679);
			match(CLOSE_CURLY);
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
		public TerminalNode FUNCTION() { return getToken(ReactParser.FUNCTION, 0); }
		public List<TerminalNode> OPEN_PAREN() { return getTokens(ReactParser.OPEN_PAREN); }
		public TerminalNode OPEN_PAREN(int i) {
			return getToken(ReactParser.OPEN_PAREN, i);
		}
		public List<TerminalNode> CLOSE_PAREN() { return getTokens(ReactParser.CLOSE_PAREN); }
		public TerminalNode CLOSE_PAREN(int i) {
			return getToken(ReactParser.CLOSE_PAREN, i);
		}
		public TerminalNode OPEN_CURLY() { return getToken(ReactParser.OPEN_CURLY, 0); }
		public TerminalNode RETURN() { return getToken(ReactParser.RETURN, 0); }
		public TerminalNode CLOSE_CURLY() { return getToken(ReactParser.CLOSE_CURLY, 0); }
		public TerminalNode ID() { return getToken(ReactParser.ID, 0); }
		public TerminalNode APP() { return getToken(ReactParser.APP, 0); }
		public ReturnImageElementsContext returnImageElements() {
			return getRuleContext(ReturnImageElementsContext.class,0);
		}
		public List<UsestateContext> usestate() {
			return getRuleContexts(UsestateContext.class);
		}
		public UsestateContext usestate(int i) {
			return getRuleContext(UsestateContext.class,i);
		}
		public List<UseRefContext> useRef() {
			return getRuleContexts(UseRefContext.class);
		}
		public UseRefContext useRef(int i) {
			return getRuleContext(UseRefContext.class,i);
		}
		public List<UseEffectContext> useEffect() {
			return getRuleContexts(UseEffectContext.class);
		}
		public UseEffectContext useEffect(int i) {
			return getRuleContext(UseEffectContext.class,i);
		}
		public List<ArrowclickContext> arrowclick() {
			return getRuleContexts(ArrowclickContext.class);
		}
		public ArrowclickContext arrowclick(int i) {
			return getRuleContext(ArrowclickContext.class,i);
		}
		public ImageElementsContext imageElements() {
			return getRuleContext(ImageElementsContext.class,0);
		}
		public List<DeclarationStatementContext> declarationStatement() {
			return getRuleContexts(DeclarationStatementContext.class);
		}
		public DeclarationStatementContext declarationStatement(int i) {
			return getRuleContext(DeclarationStatementContext.class,i);
		}
		public List<ConstStatementContext> constStatement() {
			return getRuleContexts(ConstStatementContext.class);
		}
		public ConstStatementContext constStatement(int i) {
			return getRuleContext(ConstStatementContext.class,i);
		}
		public List<ConsoleLogStatementContext> consoleLogStatement() {
			return getRuleContexts(ConsoleLogStatementContext.class);
		}
		public ConsoleLogStatementContext consoleLogStatement(int i) {
			return getRuleContext(ConsoleLogStatementContext.class,i);
		}
		public List<VariableValueAssignmentContext> variableValueAssignment() {
			return getRuleContexts(VariableValueAssignmentContext.class);
		}
		public VariableValueAssignmentContext variableValueAssignment(int i) {
			return getRuleContext(VariableValueAssignmentContext.class,i);
		}
		public DefaultStatementContext defaultStatement() {
			return getRuleContext(DefaultStatementContext.class,0);
		}
		public DivContext div() {
			return getRuleContext(DivContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(ReactParser.SEMI_COLON, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_function);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(681);
			match(FUNCTION);
			setState(682);
			_la = _input.LA(1);
			if ( !(_la==APP || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(683);
			match(OPEN_PAREN);
			setState(684);
			match(CLOSE_PAREN);
			setState(685);
			match(OPEN_CURLY);
			setState(691);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(689);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
					case 1:
						{
						setState(686);
						usestate();
						}
						break;
					case 2:
						{
						setState(687);
						useRef();
						}
						break;
					case 3:
						{
						setState(688);
						useEffect();
						}
						break;
					}
					} 
				}
				setState(693);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			}
			setState(697);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(694);
					arrowclick();
					}
					} 
				}
				setState(699);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			}
			setState(701);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(700);
				imageElements();
				}
				break;
			}
			setState(709);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9008298767417344L) != 0) || _la==Var || _la==ID) {
				{
				setState(707);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LET:
				case Var:
					{
					setState(703);
					declarationStatement();
					}
					break;
				case CONST:
					{
					setState(704);
					constStatement();
					}
					break;
				case CONSOLE_LOG:
					{
					setState(705);
					consoleLogStatement();
					}
					break;
				case ID:
					{
					setState(706);
					variableValueAssignment();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(711);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(712);
			match(RETURN);
			setState(720);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAREN:
				{
				{
				setState(713);
				match(OPEN_PAREN);
				setState(714);
				div();
				setState(715);
				match(CLOSE_PAREN);
				setState(717);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI_COLON) {
					{
					setState(716);
					match(SEMI_COLON);
					}
				}

				}
				}
				break;
			case CREATE_ELEMENT:
				{
				setState(719);
				returnImageElements();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(722);
			match(CLOSE_CURLY);
			setState(724);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(723);
				defaultStatement();
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
	public static class FunctionArrowContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(ReactParser.CONST, 0); }
		public TerminalNode EQUAL() { return getToken(ReactParser.EQUAL, 0); }
		public List<TerminalNode> OPEN_PAREN() { return getTokens(ReactParser.OPEN_PAREN); }
		public TerminalNode OPEN_PAREN(int i) {
			return getToken(ReactParser.OPEN_PAREN, i);
		}
		public List<TerminalNode> CLOSE_PAREN() { return getTokens(ReactParser.CLOSE_PAREN); }
		public TerminalNode CLOSE_PAREN(int i) {
			return getToken(ReactParser.CLOSE_PAREN, i);
		}
		public TerminalNode ARROW() { return getToken(ReactParser.ARROW, 0); }
		public TerminalNode OPEN_CURLY() { return getToken(ReactParser.OPEN_CURLY, 0); }
		public TerminalNode RETURN() { return getToken(ReactParser.RETURN, 0); }
		public TerminalNode CLOSE_CURLY() { return getToken(ReactParser.CLOSE_CURLY, 0); }
		public TerminalNode ID() { return getToken(ReactParser.ID, 0); }
		public TerminalNode APP() { return getToken(ReactParser.APP, 0); }
		public ReturnImageElementsContext returnImageElements() {
			return getRuleContext(ReturnImageElementsContext.class,0);
		}
		public List<UsestateContext> usestate() {
			return getRuleContexts(UsestateContext.class);
		}
		public UsestateContext usestate(int i) {
			return getRuleContext(UsestateContext.class,i);
		}
		public List<UseRefContext> useRef() {
			return getRuleContexts(UseRefContext.class);
		}
		public UseRefContext useRef(int i) {
			return getRuleContext(UseRefContext.class,i);
		}
		public List<UseEffectContext> useEffect() {
			return getRuleContexts(UseEffectContext.class);
		}
		public UseEffectContext useEffect(int i) {
			return getRuleContext(UseEffectContext.class,i);
		}
		public List<ArrowclickContext> arrowclick() {
			return getRuleContexts(ArrowclickContext.class);
		}
		public ArrowclickContext arrowclick(int i) {
			return getRuleContext(ArrowclickContext.class,i);
		}
		public ImageElementsContext imageElements() {
			return getRuleContext(ImageElementsContext.class,0);
		}
		public List<DeclarationStatementContext> declarationStatement() {
			return getRuleContexts(DeclarationStatementContext.class);
		}
		public DeclarationStatementContext declarationStatement(int i) {
			return getRuleContext(DeclarationStatementContext.class,i);
		}
		public List<ConstStatementContext> constStatement() {
			return getRuleContexts(ConstStatementContext.class);
		}
		public ConstStatementContext constStatement(int i) {
			return getRuleContext(ConstStatementContext.class,i);
		}
		public DefaultStatementContext defaultStatement() {
			return getRuleContext(DefaultStatementContext.class,0);
		}
		public DivContext div() {
			return getRuleContext(DivContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(ReactParser.SEMI_COLON, 0); }
		public FunctionArrowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArrow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterFunctionArrow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitFunctionArrow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitFunctionArrow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionArrowContext functionArrow() throws RecognitionException {
		FunctionArrowContext _localctx = new FunctionArrowContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_functionArrow);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(726);
			match(CONST);
			setState(727);
			_la = _input.LA(1);
			if ( !(_la==APP || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(728);
			match(EQUAL);
			setState(729);
			match(OPEN_PAREN);
			setState(730);
			match(CLOSE_PAREN);
			setState(731);
			match(ARROW);
			setState(732);
			match(OPEN_CURLY);
			setState(738);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(736);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
					case 1:
						{
						setState(733);
						usestate();
						}
						break;
					case 2:
						{
						setState(734);
						useRef();
						}
						break;
					case 3:
						{
						setState(735);
						useEffect();
						}
						break;
					}
					} 
				}
				setState(740);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			setState(744);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(741);
					arrowclick();
					}
					} 
				}
				setState(746);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			}
			setState(748);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(747);
				imageElements();
				}
				break;
			}
			setState(754);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & 281483566645249L) != 0)) {
				{
				setState(752);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LET:
				case Var:
					{
					setState(750);
					declarationStatement();
					}
					break;
				case CONST:
					{
					setState(751);
					constStatement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(756);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(757);
			match(RETURN);
			setState(765);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAREN:
				{
				{
				setState(758);
				match(OPEN_PAREN);
				setState(759);
				div();
				setState(760);
				match(CLOSE_PAREN);
				setState(762);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI_COLON) {
					{
					setState(761);
					match(SEMI_COLON);
					}
				}

				}
				}
				break;
			case CREATE_ELEMENT:
				{
				setState(764);
				returnImageElements();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(767);
			match(CLOSE_CURLY);
			setState(769);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXPORT) {
				{
				setState(768);
				defaultStatement();
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
	public static class FunctionReturnValueContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(ReactParser.FUNCTION, 0); }
		public List<TerminalNode> ID() { return getTokens(ReactParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ReactParser.ID, i);
		}
		public TerminalNode OPEN_PAREN() { return getToken(ReactParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ReactParser.CLOSE_PAREN, 0); }
		public TerminalNode OPEN_CURLY() { return getToken(ReactParser.OPEN_CURLY, 0); }
		public TerminalNode CLOSE_CURLY() { return getToken(ReactParser.CLOSE_CURLY, 0); }
		public List<FunctionReturnValueContext> functionReturnValue() {
			return getRuleContexts(FunctionReturnValueContext.class);
		}
		public FunctionReturnValueContext functionReturnValue(int i) {
			return getRuleContext(FunctionReturnValueContext.class,i);
		}
		public List<DeclarationStatementContext> declarationStatement() {
			return getRuleContexts(DeclarationStatementContext.class);
		}
		public DeclarationStatementContext declarationStatement(int i) {
			return getRuleContext(DeclarationStatementContext.class,i);
		}
		public List<ConstStatementContext> constStatement() {
			return getRuleContexts(ConstStatementContext.class);
		}
		public ConstStatementContext constStatement(int i) {
			return getRuleContext(ConstStatementContext.class,i);
		}
		public List<ConsoleLogStatementContext> consoleLogStatement() {
			return getRuleContexts(ConsoleLogStatementContext.class);
		}
		public ConsoleLogStatementContext consoleLogStatement(int i) {
			return getRuleContext(ConsoleLogStatementContext.class,i);
		}
		public List<VariableValueAssignmentContext> variableValueAssignment() {
			return getRuleContexts(VariableValueAssignmentContext.class);
		}
		public VariableValueAssignmentContext variableValueAssignment(int i) {
			return getRuleContext(VariableValueAssignmentContext.class,i);
		}
		public List<TerminalNode> RETURN() { return getTokens(ReactParser.RETURN); }
		public TerminalNode RETURN(int i) {
			return getToken(ReactParser.RETURN, i);
		}
		public List<TerminalNode> SEMI_COLON() { return getTokens(ReactParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(ReactParser.SEMI_COLON, i);
		}
		public FunctionReturnValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionReturnValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterFunctionReturnValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitFunctionReturnValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitFunctionReturnValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionReturnValueContext functionReturnValue() throws RecognitionException {
		FunctionReturnValueContext _localctx = new FunctionReturnValueContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_functionReturnValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(771);
			match(FUNCTION);
			setState(772);
			match(ID);
			setState(773);
			match(OPEN_PAREN);
			setState(777);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(774);
				match(ID);
				}
				}
				setState(779);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(780);
			match(CLOSE_PAREN);
			setState(781);
			match(OPEN_CURLY);
			setState(789);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9008298800971776L) != 0) || _la==Var || _la==ID) {
				{
				setState(787);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case FUNCTION:
					{
					setState(782);
					functionReturnValue();
					}
					break;
				case LET:
				case Var:
					{
					setState(783);
					declarationStatement();
					}
					break;
				case CONST:
					{
					setState(784);
					constStatement();
					}
					break;
				case CONSOLE_LOG:
					{
					setState(785);
					consoleLogStatement();
					}
					break;
				case ID:
					{
					setState(786);
					variableValueAssignment();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(791);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(797);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RETURN) {
				{
				{
				setState(792);
				match(RETURN);
				setState(793);
				match(ID);
				setState(794);
				match(SEMI_COLON);
				}
				}
				setState(799);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(800);
			match(CLOSE_CURLY);
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
	public static class DefaultStatementContext extends ParserRuleContext {
		public TerminalNode EXPORT() { return getToken(ReactParser.EXPORT, 0); }
		public TerminalNode DEFAULT() { return getToken(ReactParser.DEFAULT, 0); }
		public TerminalNode SEMI_COLON() { return getToken(ReactParser.SEMI_COLON, 0); }
		public TerminalNode ID() { return getToken(ReactParser.ID, 0); }
		public TerminalNode APP() { return getToken(ReactParser.APP, 0); }
		public DefaultStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterDefaultStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitDefaultStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitDefaultStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultStatementContext defaultStatement() throws RecognitionException {
		DefaultStatementContext _localctx = new DefaultStatementContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_defaultStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(802);
			match(EXPORT);
			setState(803);
			match(DEFAULT);
			setState(804);
			_la = _input.LA(1);
			if ( !(_la==APP || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(805);
			match(SEMI_COLON);
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
	public static class UseEffectContext extends ParserRuleContext {
		public TerminalNode USEFFECT() { return getToken(ReactParser.USEFFECT, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ReactParser.OPEN_PAREN, 0); }
		public CallbackContext callback() {
			return getRuleContext(CallbackContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(ReactParser.CLOSE_PAREN, 0); }
		public TerminalNode SEMI_COLON() { return getToken(ReactParser.SEMI_COLON, 0); }
		public UseEffectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useEffect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterUseEffect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitUseEffect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitUseEffect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseEffectContext useEffect() throws RecognitionException {
		UseEffectContext _localctx = new UseEffectContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_useEffect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(807);
			match(USEFFECT);
			setState(808);
			match(OPEN_PAREN);
			setState(809);
			callback();
			setState(810);
			match(CLOSE_PAREN);
			setState(811);
			match(SEMI_COLON);
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
	public static class CallbackContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ReactParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ReactParser.ID, i);
		}
		public DependenciesContext dependencies() {
			return getRuleContext(DependenciesContext.class,0);
		}
		public AnonymousContext anonymous() {
			return getRuleContext(AnonymousContext.class,0);
		}
		public CallbackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callback; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterCallback(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitCallback(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitCallback(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallbackContext callback() throws RecognitionException {
		CallbackContext _localctx = new CallbackContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_callback);
		int _la;
		try {
			setState(828);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(814); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(813);
					match(ID);
					}
					}
					setState(816); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(819); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(818);
					match(ID);
					}
					}
					setState(821); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				setState(823);
				dependencies();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(824);
				anonymous();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(825);
				anonymous();
				setState(826);
				dependencies();
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
	public static class AnonymousContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(ReactParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ReactParser.CLOSE_PAREN, 0); }
		public TerminalNode ARROW() { return getToken(ReactParser.ARROW, 0); }
		public TerminalNode OPEN_CURLY() { return getToken(ReactParser.OPEN_CURLY, 0); }
		public TerminalNode CLOSE_CURLY() { return getToken(ReactParser.CLOSE_CURLY, 0); }
		public List<AnonymousbodyContext> anonymousbody() {
			return getRuleContexts(AnonymousbodyContext.class);
		}
		public AnonymousbodyContext anonymousbody(int i) {
			return getRuleContext(AnonymousbodyContext.class,i);
		}
		public AnonymousContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymous; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterAnonymous(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitAnonymous(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitAnonymous(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnonymousContext anonymous() throws RecognitionException {
		AnonymousContext _localctx = new AnonymousContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_anonymous);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(830);
			match(OPEN_PAREN);
			setState(831);
			match(CLOSE_PAREN);
			setState(832);
			match(ARROW);
			setState(833);
			match(OPEN_CURLY);
			setState(837);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 20)) & ~0x3f) == 0 && ((1L << (_la - 20)) & 281741265731585L) != 0)) {
				{
				{
				setState(834);
				anonymousbody();
				}
				}
				setState(839);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(840);
			match(CLOSE_CURLY);
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
	public static class AnonymousbodyContext extends ParserRuleContext {
		public ConsoleLogStatementContext consoleLogStatement() {
			return getRuleContext(ConsoleLogStatementContext.class,0);
		}
		public ForContext for_() {
			return getRuleContext(ForContext.class,0);
		}
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
		}
		public WhileContext while_() {
			return getRuleContext(WhileContext.class,0);
		}
		public DoContext do_() {
			return getRuleContext(DoContext.class,0);
		}
		public DeclarationStatementContext declarationStatement() {
			return getRuleContext(DeclarationStatementContext.class,0);
		}
		public ConstStatementContext constStatement() {
			return getRuleContext(ConstStatementContext.class,0);
		}
		public AnonymousbodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymousbody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterAnonymousbody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitAnonymousbody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitAnonymousbody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnonymousbodyContext anonymousbody() throws RecognitionException {
		AnonymousbodyContext _localctx = new AnonymousbodyContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_anonymousbody);
		try {
			setState(849);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONSOLE_LOG:
				enterOuterAlt(_localctx, 1);
				{
				setState(842);
				consoleLogStatement();
				}
				break;
			case For:
				enterOuterAlt(_localctx, 2);
				{
				setState(843);
				for_();
				}
				break;
			case If:
				enterOuterAlt(_localctx, 3);
				{
				setState(844);
				if_();
				}
				break;
			case While:
				enterOuterAlt(_localctx, 4);
				{
				setState(845);
				while_();
				}
				break;
			case Do:
				enterOuterAlt(_localctx, 5);
				{
				setState(846);
				do_();
				}
				break;
			case LET:
			case Var:
				enterOuterAlt(_localctx, 6);
				{
				setState(847);
				declarationStatement();
				}
				break;
			case CONST:
				enterOuterAlt(_localctx, 7);
				{
				setState(848);
				constStatement();
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
	public static class DependenciesContext extends ParserRuleContext {
		public EmptyContext empty() {
			return getRuleContext(EmptyContext.class,0);
		}
		public ExistentContext existent() {
			return getRuleContext(ExistentContext.class,0);
		}
		public DependenciesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dependencies; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterDependencies(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitDependencies(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitDependencies(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DependenciesContext dependencies() throws RecognitionException {
		DependenciesContext _localctx = new DependenciesContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_dependencies);
		try {
			setState(853);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(851);
				empty();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(852);
				existent();
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
	public static class EmptyContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(ReactParser.COMMA, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(ReactParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(ReactParser.CLOSE_BRACKET, 0); }
		public EmptyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_empty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitEmpty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitEmpty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmptyContext empty() throws RecognitionException {
		EmptyContext _localctx = new EmptyContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_empty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(855);
			match(COMMA);
			setState(856);
			match(OPEN_BRACKET);
			setState(857);
			match(CLOSE_BRACKET);
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
	public static class ExistentContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(ReactParser.COMMA, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(ReactParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(ReactParser.CLOSE_BRACKET, 0); }
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ExistentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_existent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterExistent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitExistent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitExistent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExistentContext existent() throws RecognitionException {
		ExistentContext _localctx = new ExistentContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_existent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(859);
			match(COMMA);
			setState(860);
			match(OPEN_BRACKET);
			setState(864);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(861);
				parameter();
				}
				}
				setState(866);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(867);
			match(CLOSE_BRACKET);
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
	public static class ParameterContext extends ParserRuleContext {
		public OneContext one() {
			return getRuleContext(OneContext.class,0);
		}
		public ManyContext many() {
			return getRuleContext(ManyContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_parameter);
		try {
			setState(871);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(869);
				one();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(870);
				many();
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
	public static class OneContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ReactParser.ID, 0); }
		public ArrayElementContext arrayElement() {
			return getRuleContext(ArrayElementContext.class,0);
		}
		public OneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_one; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterOne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitOne(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitOne(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OneContext one() throws RecognitionException {
		OneContext _localctx = new OneContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_one);
		try {
			setState(875);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(873);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(874);
				arrayElement();
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
	public static class ManyContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ReactParser.ID, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ReactParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ReactParser.COMMA, i);
		}
		public ManyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_many; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterMany(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitMany(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitMany(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ManyContext many() throws RecognitionException {
		ManyContext _localctx = new ManyContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_many);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(877);
			match(ID);
			setState(881);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(878);
				match(COMMA);
				}
				}
				setState(883);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class UseRefContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(ReactParser.CONST, 0); }
		public TerminalNode VARIABLE() { return getToken(ReactParser.VARIABLE, 0); }
		public TerminalNode EQUAL() { return getToken(ReactParser.EQUAL, 0); }
		public TerminalNode USEREF() { return getToken(ReactParser.USEREF, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ReactParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ReactParser.CLOSE_PAREN, 0); }
		public TerminalNode SEMI_COLON() { return getToken(ReactParser.SEMI_COLON, 0); }
		public TerminalNode ID() { return getToken(ReactParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(ReactParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(ReactParser.STRING, 0); }
		public UseRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_useRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterUseRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitUseRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitUseRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UseRefContext useRef() throws RecognitionException {
		UseRefContext _localctx = new UseRefContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_useRef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(884);
			match(CONST);
			setState(885);
			match(VARIABLE);
			setState(886);
			match(EQUAL);
			setState(887);
			match(USEREF);
			setState(888);
			match(OPEN_PAREN);
			setState(889);
			_la = _input.LA(1);
			if ( !(((((_la - 121)) & ~0x3f) == 0 && ((1L << (_la - 121)) & 35L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(890);
			match(CLOSE_PAREN);
			setState(891);
			match(SEMI_COLON);
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
	public static class DeclarationStatementContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ReactParser.ID, 0); }
		public TerminalNode SEMI_COLON() { return getToken(ReactParser.SEMI_COLON, 0); }
		public TerminalNode LET() { return getToken(ReactParser.LET, 0); }
		public TerminalNode Var() { return getToken(ReactParser.Var, 0); }
		public TerminalNode EQUAL() { return getToken(ReactParser.EQUAL, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public DeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitDeclarationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationStatementContext declarationStatement() throws RecognitionException {
		DeclarationStatementContext _localctx = new DeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_declarationStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(893);
			_la = _input.LA(1);
			if ( !(_la==LET || _la==Var) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(894);
			match(ID);
			setState(896);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUAL) {
				{
				setState(895);
				match(EQUAL);
				}
			}

			setState(899);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING || _la==NUMBER) {
				{
				setState(898);
				value();
				}
			}

			setState(901);
			match(SEMI_COLON);
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
	public static class ConstStatementContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(ReactParser.CONST, 0); }
		public TerminalNode ID() { return getToken(ReactParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(ReactParser.EQUAL, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(ReactParser.SEMI_COLON, 0); }
		public ConstStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterConstStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitConstStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitConstStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstStatementContext constStatement() throws RecognitionException {
		ConstStatementContext _localctx = new ConstStatementContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_constStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(903);
			match(CONST);
			setState(904);
			match(ID);
			setState(905);
			match(EQUAL);
			setState(906);
			value();
			setState(907);
			match(SEMI_COLON);
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
	public static class PrintvalueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(ReactParser.STRING, 0); }
		public TerminalNode ID() { return getToken(ReactParser.ID, 0); }
		public ConsoleLogStatementContext consoleLogStatement() {
			return getRuleContext(ConsoleLogStatementContext.class,0);
		}
		public PrintvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterPrintvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitPrintvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitPrintvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintvalueContext printvalue() throws RecognitionException {
		PrintvalueContext _localctx = new PrintvalueContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_printvalue);
		try {
			setState(912);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(909);
				match(STRING);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(910);
				match(ID);
				}
				break;
			case CONSOLE_LOG:
				enterOuterAlt(_localctx, 3);
				{
				setState(911);
				consoleLogStatement();
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
	public static class ConsoleLogStatementContext extends ParserRuleContext {
		public TerminalNode CONSOLE_LOG() { return getToken(ReactParser.CONSOLE_LOG, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(ReactParser.OPEN_PAREN, 0); }
		public PrintvalueContext printvalue() {
			return getRuleContext(PrintvalueContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(ReactParser.CLOSE_PAREN, 0); }
		public TerminalNode SEMI_COLON() { return getToken(ReactParser.SEMI_COLON, 0); }
		public ConsoleLogStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consoleLogStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterConsoleLogStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitConsoleLogStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitConsoleLogStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConsoleLogStatementContext consoleLogStatement() throws RecognitionException {
		ConsoleLogStatementContext _localctx = new ConsoleLogStatementContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_consoleLogStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(914);
			match(CONSOLE_LOG);
			setState(915);
			match(OPEN_PAREN);
			setState(916);
			printvalue();
			setState(917);
			match(CLOSE_PAREN);
			setState(918);
			match(SEMI_COLON);
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
	public static class VariableValueAssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ReactParser.ID, 0); }
		public TerminalNode EQUAL() { return getToken(ReactParser.EQUAL, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode SEMI_COLON() { return getToken(ReactParser.SEMI_COLON, 0); }
		public VariableValueAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableValueAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterVariableValueAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitVariableValueAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitVariableValueAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableValueAssignmentContext variableValueAssignment() throws RecognitionException {
		VariableValueAssignmentContext _localctx = new VariableValueAssignmentContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_variableValueAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(920);
			match(ID);
			setState(921);
			match(EQUAL);
			setState(922);
			value();
			setState(923);
			match(SEMI_COLON);
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
	public static class ConditionOrLoopContext extends ParserRuleContext {
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
		}
		public ForContext for_() {
			return getRuleContext(ForContext.class,0);
		}
		public WhileContext while_() {
			return getRuleContext(WhileContext.class,0);
		}
		public DoContext do_() {
			return getRuleContext(DoContext.class,0);
		}
		public ConditionOrLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionOrLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterConditionOrLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitConditionOrLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitConditionOrLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionOrLoopContext conditionOrLoop() throws RecognitionException {
		ConditionOrLoopContext _localctx = new ConditionOrLoopContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_conditionOrLoop);
		try {
			setState(929);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case If:
				enterOuterAlt(_localctx, 1);
				{
				setState(925);
				if_();
				}
				break;
			case For:
				enterOuterAlt(_localctx, 2);
				{
				setState(926);
				for_();
				}
				break;
			case While:
				enterOuterAlt(_localctx, 3);
				{
				setState(927);
				while_();
				}
				break;
			case Do:
				enterOuterAlt(_localctx, 4);
				{
				setState(928);
				do_();
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
	public static class ForContext extends ParserRuleContext {
		public TerminalNode For() { return getToken(ReactParser.For, 0); }
		public ForConditionContext forCondition() {
			return getRuleContext(ForConditionContext.class,0);
		}
		public ForBodyContext forBody() {
			return getRuleContext(ForBodyContext.class,0);
		}
		public ForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForContext for_() throws RecognitionException {
		ForContext _localctx = new ForContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(931);
			match(For);
			setState(932);
			forCondition();
			setState(933);
			forBody();
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
	public static class ForConditionContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(ReactParser.OPEN_PAREN, 0); }
		public List<TerminalNode> ID() { return getTokens(ReactParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ReactParser.ID, i);
		}
		public TerminalNode SEMI_COLON() { return getToken(ReactParser.SEMI_COLON, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ReactParser.CLOSE_PAREN, 0); }
		public TerminalNode OPENANGLEBRACKET() { return getToken(ReactParser.OPENANGLEBRACKET, 0); }
		public TerminalNode CLOSEANGLEBRACKET() { return getToken(ReactParser.CLOSEANGLEBRACKET, 0); }
		public TerminalNode GreaterThanEquals() { return getToken(ReactParser.GreaterThanEquals, 0); }
		public TerminalNode LessThanEquals() { return getToken(ReactParser.LessThanEquals, 0); }
		public TerminalNode NUMBER() { return getToken(ReactParser.NUMBER, 0); }
		public TerminalNode MinusMinus() { return getToken(ReactParser.MinusMinus, 0); }
		public TerminalNode PlusPlus() { return getToken(ReactParser.PlusPlus, 0); }
		public DeclarationStatementContext declarationStatement() {
			return getRuleContext(DeclarationStatementContext.class,0);
		}
		public ConstStatementContext constStatement() {
			return getRuleContext(ConstStatementContext.class,0);
		}
		public ForConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterForCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitForCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitForCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForConditionContext forCondition() throws RecognitionException {
		ForConditionContext _localctx = new ForConditionContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_forCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(935);
			match(OPEN_PAREN);
			setState(938);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LET:
			case Var:
				{
				setState(936);
				declarationStatement();
				}
				break;
			case CONST:
				{
				setState(937);
				constStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(940);
			match(ID);
			setState(941);
			_la = _input.LA(1);
			if ( !(((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & 1572867L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(942);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(943);
			match(SEMI_COLON);
			setState(944);
			match(ID);
			setState(945);
			_la = _input.LA(1);
			if ( !(_la==PlusPlus || _la==MinusMinus) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(946);
			match(CLOSE_PAREN);
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
	public static class ForBodyContext extends ParserRuleContext {
		public TerminalNode OPEN_CURLY() { return getToken(ReactParser.OPEN_CURLY, 0); }
		public TerminalNode CLOSE_CURLY() { return getToken(ReactParser.CLOSE_CURLY, 0); }
		public TerminalNode ID() { return getToken(ReactParser.ID, 0); }
		public PrintvalueContext printvalue() {
			return getRuleContext(PrintvalueContext.class,0);
		}
		public ForBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterForBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitForBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitForBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForBodyContext forBody() throws RecognitionException {
		ForBodyContext _localctx = new ForBodyContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_forBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(948);
			match(OPEN_CURLY);
			setState(951);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(949);
				match(ID);
				}
				break;
			case 2:
				{
				setState(950);
				printvalue();
				}
				break;
			}
			setState(953);
			match(CLOSE_CURLY);
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
	public static class WhileContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(ReactParser.While, 0); }
		public WhileConditionContext whileCondition() {
			return getRuleContext(WhileConditionContext.class,0);
		}
		public WhileBodyContext whileBody() {
			return getRuleContext(WhileBodyContext.class,0);
		}
		public WhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileContext while_() throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(955);
			match(While);
			setState(956);
			whileCondition();
			setState(957);
			whileBody();
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
	public static class WhileConditionContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(ReactParser.OPEN_PAREN, 0); }
		public WhileConditionFunctionContext whileConditionFunction() {
			return getRuleContext(WhileConditionFunctionContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(ReactParser.CLOSE_PAREN, 0); }
		public List<TerminalNode> SEMI_COLON() { return getTokens(ReactParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(ReactParser.SEMI_COLON, i);
		}
		public WhileConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterWhileCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitWhileCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitWhileCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileConditionContext whileCondition() throws RecognitionException {
		WhileConditionContext _localctx = new WhileConditionContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_whileCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(959);
			match(OPEN_PAREN);
			setState(960);
			whileConditionFunction();
			setState(961);
			match(CLOSE_PAREN);
			setState(965);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMI_COLON) {
				{
				{
				setState(962);
				match(SEMI_COLON);
				}
				}
				setState(967);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class WhileConditionFunctionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(ReactParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ReactParser.ID, i);
		}
		public TerminalNode TRUE() { return getToken(ReactParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(ReactParser.FALSE, 0); }
		public TerminalNode OPENANGLEBRACKET() { return getToken(ReactParser.OPENANGLEBRACKET, 0); }
		public TerminalNode CLOSEANGLEBRACKET() { return getToken(ReactParser.CLOSEANGLEBRACKET, 0); }
		public TerminalNode GreaterThanEquals() { return getToken(ReactParser.GreaterThanEquals, 0); }
		public TerminalNode LessThanEquals() { return getToken(ReactParser.LessThanEquals, 0); }
		public TerminalNode EQUAL() { return getToken(ReactParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(ReactParser.NOTEQUAL, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(ReactParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ReactParser.NUMBER, i);
		}
		public List<TerminalNode> Not() { return getTokens(ReactParser.Not); }
		public TerminalNode Not(int i) {
			return getToken(ReactParser.Not, i);
		}
		public WhileConditionFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileConditionFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterWhileConditionFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitWhileConditionFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitWhileConditionFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileConditionFunctionContext whileConditionFunction() throws RecognitionException {
		WhileConditionFunctionContext _localctx = new WhileConditionFunctionContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_whileConditionFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(996);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(971);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(968);
					match(ID);
					}
					}
					setState(973);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(974);
				_la = _input.LA(1);
				if ( !(((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & 1572879L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(978);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NUMBER) {
					{
					{
					setState(975);
					match(NUMBER);
					}
					}
					setState(980);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(981);
				match(ID);
				}
				break;
			case 3:
				{
				setState(985);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Not) {
					{
					{
					setState(982);
					match(Not);
					}
					}
					setState(987);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(988);
				match(TRUE);
				}
				break;
			case 4:
				{
				setState(992);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Not) {
					{
					{
					setState(989);
					match(Not);
					}
					}
					setState(994);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(995);
				match(FALSE);
				}
				break;
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
	public static class WhileBodyContext extends ParserRuleContext {
		public TerminalNode OPEN_CURLY() { return getToken(ReactParser.OPEN_CURLY, 0); }
		public TerminalNode CLOSE_CURLY() { return getToken(ReactParser.CLOSE_CURLY, 0); }
		public TerminalNode ID() { return getToken(ReactParser.ID, 0); }
		public PrintvalueContext printvalue() {
			return getRuleContext(PrintvalueContext.class,0);
		}
		public List<WhileBodyFunctionContext> whileBodyFunction() {
			return getRuleContexts(WhileBodyFunctionContext.class);
		}
		public WhileBodyFunctionContext whileBodyFunction(int i) {
			return getRuleContext(WhileBodyFunctionContext.class,i);
		}
		public WhileBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterWhileBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitWhileBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitWhileBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileBodyContext whileBody() throws RecognitionException {
		WhileBodyContext _localctx = new WhileBodyContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_whileBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(998);
			match(OPEN_CURLY);
			setState(1001);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(999);
				match(ID);
				}
				break;
			case 2:
				{
				setState(1000);
				printvalue();
				}
				break;
			}
			setState(1006);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID) {
				{
				{
				setState(1003);
				whileBodyFunction();
				}
				}
				setState(1008);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1009);
			match(CLOSE_CURLY);
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
	public static class WhileBodyFunctionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ReactParser.ID, 0); }
		public TerminalNode SEMI_COLON() { return getToken(ReactParser.SEMI_COLON, 0); }
		public TerminalNode PlusPlus() { return getToken(ReactParser.PlusPlus, 0); }
		public TerminalNode MinusMinus() { return getToken(ReactParser.MinusMinus, 0); }
		public WhileBodyFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileBodyFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterWhileBodyFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitWhileBodyFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitWhileBodyFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileBodyFunctionContext whileBodyFunction() throws RecognitionException {
		WhileBodyFunctionContext _localctx = new WhileBodyFunctionContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_whileBodyFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1011);
			match(ID);
			setState(1012);
			_la = _input.LA(1);
			if ( !(_la==PlusPlus || _la==MinusMinus) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1013);
			match(SEMI_COLON);
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
	public static class DoContext extends ParserRuleContext {
		public TerminalNode Do() { return getToken(ReactParser.Do, 0); }
		public WhileBodyContext whileBody() {
			return getRuleContext(WhileBodyContext.class,0);
		}
		public TerminalNode While() { return getToken(ReactParser.While, 0); }
		public WhileConditionContext whileCondition() {
			return getRuleContext(WhileConditionContext.class,0);
		}
		public DoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterDo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitDo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitDo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoContext do_() throws RecognitionException {
		DoContext _localctx = new DoContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_do);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1015);
			match(Do);
			setState(1016);
			whileBody();
			setState(1017);
			match(While);
			setState(1018);
			whileCondition();
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
	public static class IfContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(ReactParser.If, 0); }
		public IfConditionContext ifCondition() {
			return getRuleContext(IfConditionContext.class,0);
		}
		public IfBodyContext ifBody() {
			return getRuleContext(IfBodyContext.class,0);
		}
		public List<ElseIfContext> elseIf() {
			return getRuleContexts(ElseIfContext.class);
		}
		public ElseIfContext elseIf(int i) {
			return getRuleContext(ElseIfContext.class,i);
		}
		public List<ElseContext> else_() {
			return getRuleContexts(ElseContext.class);
		}
		public ElseContext else_(int i) {
			return getRuleContext(ElseContext.class,i);
		}
		public IfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfContext if_() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1020);
			match(If);
			setState(1021);
			ifCondition();
			setState(1022);
			ifBody();
			setState(1026);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSEIF) {
				{
				{
				setState(1023);
				elseIf();
				}
				}
				setState(1028);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1032);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Else) {
				{
				{
				setState(1029);
				else_();
				}
				}
				setState(1034);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class IfConditionContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(ReactParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(ReactParser.CLOSE_PAREN, 0); }
		public TerminalNode OPENANGLEBRACKET() { return getToken(ReactParser.OPENANGLEBRACKET, 0); }
		public TerminalNode CLOSEANGLEBRACKET() { return getToken(ReactParser.CLOSEANGLEBRACKET, 0); }
		public TerminalNode GreaterThanEquals() { return getToken(ReactParser.GreaterThanEquals, 0); }
		public TerminalNode LessThanEquals() { return getToken(ReactParser.LessThanEquals, 0); }
		public TerminalNode EQUAL() { return getToken(ReactParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(ReactParser.NOTEQUAL, 0); }
		public TerminalNode Equals_() { return getToken(ReactParser.Equals_, 0); }
		public List<TerminalNode> ID() { return getTokens(ReactParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ReactParser.ID, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(ReactParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ReactParser.NUMBER, i);
		}
		public IfConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterIfCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitIfCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitIfCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfConditionContext ifCondition() throws RecognitionException {
		IfConditionContext _localctx = new IfConditionContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_ifCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1035);
			match(OPEN_PAREN);
			{
			setState(1039);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID || _la==NUMBER) {
				{
				{
				setState(1036);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==NUMBER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1041);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(1042);
			_la = _input.LA(1);
			if ( !(((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & 3670031L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1046);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ID || _la==NUMBER) {
				{
				{
				setState(1043);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==NUMBER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(1048);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1049);
			match(CLOSE_PAREN);
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
	public static class IfBodyContext extends ParserRuleContext {
		public TerminalNode OPEN_CURLY() { return getToken(ReactParser.OPEN_CURLY, 0); }
		public TerminalNode CLOSE_CURLY() { return getToken(ReactParser.CLOSE_CURLY, 0); }
		public TerminalNode ID() { return getToken(ReactParser.ID, 0); }
		public PrintvalueContext printvalue() {
			return getRuleContext(PrintvalueContext.class,0);
		}
		public IfBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterIfBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitIfBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitIfBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBodyContext ifBody() throws RecognitionException {
		IfBodyContext _localctx = new IfBodyContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_ifBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1051);
			match(OPEN_CURLY);
			setState(1054);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				{
				setState(1052);
				match(ID);
				}
				break;
			case 2:
				{
				setState(1053);
				printvalue();
				}
				break;
			}
			setState(1056);
			match(CLOSE_CURLY);
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
	public static class ElseIfContext extends ParserRuleContext {
		public TerminalNode ELSEIF() { return getToken(ReactParser.ELSEIF, 0); }
		public IfConditionContext ifCondition() {
			return getRuleContext(IfConditionContext.class,0);
		}
		public IfBodyContext ifBody() {
			return getRuleContext(IfBodyContext.class,0);
		}
		public ElseIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterElseIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitElseIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitElseIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseIfContext elseIf() throws RecognitionException {
		ElseIfContext _localctx = new ElseIfContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_elseIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1058);
			match(ELSEIF);
			setState(1059);
			ifCondition();
			setState(1060);
			ifBody();
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
	public static class ElseContext extends ParserRuleContext {
		public TerminalNode Else() { return getToken(ReactParser.Else, 0); }
		public IfBodyContext ifBody() {
			return getRuleContext(IfBodyContext.class,0);
		}
		public ElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseContext else_() throws RecognitionException {
		ElseContext _localctx = new ElseContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1062);
			match(Else);
			setState(1063);
			ifBody();
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
	public static class WidthContext extends ParserRuleContext {
		public TerminalNode WIDTH() { return getToken(ReactParser.WIDTH, 0); }
		public TerminalNode COLON() { return getToken(ReactParser.COLON, 0); }
		public TerminalNode PX() { return getToken(ReactParser.PX, 0); }
		public TerminalNode SEMI_COLON() { return getToken(ReactParser.SEMI_COLON, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(ReactParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ReactParser.NUMBER, i);
		}
		public WidthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_width; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterWidth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitWidth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitWidth(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WidthContext width() throws RecognitionException {
		WidthContext _localctx = new WidthContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_width);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1065);
			match(WIDTH);
			setState(1066);
			match(COLON);
			setState(1068); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1067);
				match(NUMBER);
				}
				}
				setState(1070); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
			setState(1072);
			match(PX);
			setState(1073);
			match(SEMI_COLON);
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
	public static class HeightContext extends ParserRuleContext {
		public TerminalNode HEIGHT() { return getToken(ReactParser.HEIGHT, 0); }
		public TerminalNode COLON() { return getToken(ReactParser.COLON, 0); }
		public TerminalNode PX() { return getToken(ReactParser.PX, 0); }
		public TerminalNode SEMI_COLON() { return getToken(ReactParser.SEMI_COLON, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(ReactParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ReactParser.NUMBER, i);
		}
		public HeightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_height; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterHeight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitHeight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitHeight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeightContext height() throws RecognitionException {
		HeightContext _localctx = new HeightContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_height);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1075);
			match(HEIGHT);
			setState(1076);
			match(COLON);
			setState(1078); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1077);
				match(NUMBER);
				}
				}
				setState(1080); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
			setState(1082);
			match(PX);
			setState(1083);
			match(SEMI_COLON);
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
	public static class MarginContext extends ParserRuleContext {
		public TerminalNode MARGIN() { return getToken(ReactParser.MARGIN, 0); }
		public TerminalNode COLON() { return getToken(ReactParser.COLON, 0); }
		public TerminalNode PX() { return getToken(ReactParser.PX, 0); }
		public TerminalNode SEMI_COLON() { return getToken(ReactParser.SEMI_COLON, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(ReactParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(ReactParser.NUMBER, i);
		}
		public MarginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_margin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterMargin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitMargin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitMargin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MarginContext margin() throws RecognitionException {
		MarginContext _localctx = new MarginContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_margin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1085);
			match(MARGIN);
			setState(1086);
			match(COLON);
			setState(1088); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1087);
				match(NUMBER);
				}
				}
				setState(1090); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUMBER );
			setState(1092);
			match(PX);
			setState(1093);
			match(SEMI_COLON);
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
	public static class BodyImageContext extends ParserRuleContext {
		public WidthContext width() {
			return getRuleContext(WidthContext.class,0);
		}
		public HeightContext height() {
			return getRuleContext(HeightContext.class,0);
		}
		public MarginContext margin() {
			return getRuleContext(MarginContext.class,0);
		}
		public BodyImageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodyImage; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterBodyImage(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitBodyImage(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitBodyImage(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyImageContext bodyImage() throws RecognitionException {
		BodyImageContext _localctx = new BodyImageContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_bodyImage);
		try {
			setState(1098);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WIDTH:
				enterOuterAlt(_localctx, 1);
				{
				setState(1095);
				width();
				}
				break;
			case HEIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1096);
				height();
				}
				break;
			case MARGIN:
				enterOuterAlt(_localctx, 3);
				{
				setState(1097);
				margin();
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
	public static class FlexDirectionContext extends ParserRuleContext {
		public TerminalNode FLEXDIRECTION() { return getToken(ReactParser.FLEXDIRECTION, 0); }
		public TerminalNode COLON() { return getToken(ReactParser.COLON, 0); }
		public TerminalNode COLUMN() { return getToken(ReactParser.COLUMN, 0); }
		public TerminalNode SEMI_COLON() { return getToken(ReactParser.SEMI_COLON, 0); }
		public FlexDirectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flexDirection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterFlexDirection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitFlexDirection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitFlexDirection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FlexDirectionContext flexDirection() throws RecognitionException {
		FlexDirectionContext _localctx = new FlexDirectionContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_flexDirection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1100);
			match(FLEXDIRECTION);
			setState(1101);
			match(COLON);
			setState(1102);
			match(COLUMN);
			setState(1103);
			match(SEMI_COLON);
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
	public static class DisplayContext extends ParserRuleContext {
		public TerminalNode DISPLAY() { return getToken(ReactParser.DISPLAY, 0); }
		public TerminalNode COLON() { return getToken(ReactParser.COLON, 0); }
		public TerminalNode FLEX() { return getToken(ReactParser.FLEX, 0); }
		public TerminalNode SEMI_COLON() { return getToken(ReactParser.SEMI_COLON, 0); }
		public DisplayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_display; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterDisplay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitDisplay(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitDisplay(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DisplayContext display() throws RecognitionException {
		DisplayContext _localctx = new DisplayContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_display);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1105);
			match(DISPLAY);
			setState(1106);
			match(COLON);
			setState(1107);
			match(FLEX);
			setState(1108);
			match(SEMI_COLON);
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
	public static class JustifyContext extends ParserRuleContext {
		public TerminalNode JS() { return getToken(ReactParser.JS, 0); }
		public TerminalNode COLON() { return getToken(ReactParser.COLON, 0); }
		public TerminalNode SA() { return getToken(ReactParser.SA, 0); }
		public TerminalNode SEMI_COLON() { return getToken(ReactParser.SEMI_COLON, 0); }
		public JustifyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_justify; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJustify(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJustify(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJustify(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JustifyContext justify() throws RecognitionException {
		JustifyContext _localctx = new JustifyContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_justify);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1110);
			match(JS);
			setState(1111);
			match(COLON);
			setState(1112);
			match(SA);
			setState(1113);
			match(SEMI_COLON);
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
	public static class CssBodyContext extends ParserRuleContext {
		public DisplayContext display() {
			return getRuleContext(DisplayContext.class,0);
		}
		public JustifyContext justify() {
			return getRuleContext(JustifyContext.class,0);
		}
		public FlexDirectionContext flexDirection() {
			return getRuleContext(FlexDirectionContext.class,0);
		}
		public CssBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterCssBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitCssBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitCssBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssBodyContext cssBody() throws RecognitionException {
		CssBodyContext _localctx = new CssBodyContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_cssBody);
		try {
			setState(1118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DISPLAY:
				enterOuterAlt(_localctx, 1);
				{
				setState(1115);
				display();
				}
				break;
			case JS:
				enterOuterAlt(_localctx, 2);
				{
				setState(1116);
				justify();
				}
				break;
			case FLEXDIRECTION:
				enterOuterAlt(_localctx, 3);
				{
				setState(1117);
				flexDirection();
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
	public static class CssContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(ReactParser.DOT, 0); }
		public TerminalNode OPEN_CURLY() { return getToken(ReactParser.OPEN_CURLY, 0); }
		public TerminalNode CLOSE_CURLY() { return getToken(ReactParser.CLOSE_CURLY, 0); }
		public TerminalNode ID() { return getToken(ReactParser.ID, 0); }
		public TerminalNode VARIABLE() { return getToken(ReactParser.VARIABLE, 0); }
		public TerminalNode APP() { return getToken(ReactParser.APP, 0); }
		public List<CssBodyContext> cssBody() {
			return getRuleContexts(CssBodyContext.class);
		}
		public CssBodyContext cssBody(int i) {
			return getRuleContext(CssBodyContext.class,i);
		}
		public CssContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_css; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterCss(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitCss(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitCss(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssContext css() throws RecognitionException {
		CssContext _localctx = new CssContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_css);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1120);
			match(DOT);
			setState(1121);
			_la = _input.LA(1);
			if ( !(_la==APP || _la==ID || _la==VARIABLE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1122);
			match(OPEN_CURLY);
			setState(1126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 515L) != 0)) {
				{
				{
				setState(1123);
				cssBody();
				}
				}
				setState(1128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1129);
			match(CLOSE_CURLY);
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
	public static class CssImgContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(ReactParser.DOT, 0); }
		public TerminalNode IMG() { return getToken(ReactParser.IMG, 0); }
		public TerminalNode OPEN_CURLY() { return getToken(ReactParser.OPEN_CURLY, 0); }
		public TerminalNode CLOSE_CURLY() { return getToken(ReactParser.CLOSE_CURLY, 0); }
		public TerminalNode ID() { return getToken(ReactParser.ID, 0); }
		public TerminalNode VARIABLE() { return getToken(ReactParser.VARIABLE, 0); }
		public TerminalNode APP() { return getToken(ReactParser.APP, 0); }
		public List<BodyImageContext> bodyImage() {
			return getRuleContexts(BodyImageContext.class);
		}
		public BodyImageContext bodyImage(int i) {
			return getRuleContext(BodyImageContext.class,i);
		}
		public CssImgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssImg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterCssImg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitCssImg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitCssImg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssImgContext cssImg() throws RecognitionException {
		CssImgContext _localctx = new CssImgContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_cssImg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1131);
			match(DOT);
			setState(1132);
			_la = _input.LA(1);
			if ( !(_la==APP || _la==ID || _la==VARIABLE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1133);
			match(IMG);
			setState(1134);
			match(OPEN_CURLY);
			setState(1138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 100)) & ~0x3f) == 0 && ((1L << (_la - 100)) & 7L) != 0)) {
				{
				{
				setState(1135);
				bodyImage();
				}
				}
				setState(1140);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1141);
			match(CLOSE_CURLY);
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
	public static class CssprogramContext extends ParserRuleContext {
		public List<CssContext> css() {
			return getRuleContexts(CssContext.class);
		}
		public CssContext css(int i) {
			return getRuleContext(CssContext.class,i);
		}
		public List<CssImgContext> cssImg() {
			return getRuleContexts(CssImgContext.class);
		}
		public CssImgContext cssImg(int i) {
			return getRuleContext(CssImgContext.class,i);
		}
		public CssprogramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssprogram; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterCssprogram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitCssprogram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitCssprogram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssprogramContext cssprogram() throws RecognitionException {
		CssprogramContext _localctx = new CssprogramContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_cssprogram);
		try {
			int _alt;
			setState(1153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1144); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1143);
						css();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1146); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1149); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1148);
						cssImg();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1151); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class ContentContext extends ParserRuleContext {
		public TerminalNode DIV_ROOT() { return getToken(ReactParser.DIV_ROOT, 0); }
		public TerminalNode SCRIPT_START() { return getToken(ReactParser.SCRIPT_START, 0); }
		public TerminalNode SCRIPT_SRC() { return getToken(ReactParser.SCRIPT_SRC, 0); }
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_content);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1155);
			match(DIV_ROOT);
			setState(1156);
			match(SCRIPT_START);
			setState(1157);
			match(SCRIPT_SRC);
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
	public static class HtmlContext extends ParserRuleContext {
		public TerminalNode DOCTYPE() { return getToken(ReactParser.DOCTYPE, 0); }
		public TerminalNode HTML_START() { return getToken(ReactParser.HTML_START, 0); }
		public TerminalNode LANG_ATTRIBUTE() { return getToken(ReactParser.LANG_ATTRIBUTE, 0); }
		public TerminalNode HEAD_START() { return getToken(ReactParser.HEAD_START, 0); }
		public TerminalNode BODY_START() { return getToken(ReactParser.BODY_START, 0); }
		public ContentContext content() {
			return getRuleContext(ContentContext.class,0);
		}
		public TerminalNode BODY_END() { return getToken(ReactParser.BODY_END, 0); }
		public TerminalNode HTML_END() { return getToken(ReactParser.HTML_END, 0); }
		public TerminalNode META_CHARSET() { return getToken(ReactParser.META_CHARSET, 0); }
		public TerminalNode LINK_ICON() { return getToken(ReactParser.LINK_ICON, 0); }
		public TerminalNode META_VIEWPORT() { return getToken(ReactParser.META_VIEWPORT, 0); }
		public TerminalNode TITLE_START() { return getToken(ReactParser.TITLE_START, 0); }
		public TerminalNode HEAD_END() { return getToken(ReactParser.HEAD_END, 0); }
		public HtmlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_html; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterHtml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitHtml(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitHtml(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HtmlContext html() throws RecognitionException {
		HtmlContext _localctx = new HtmlContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_html);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1159);
			match(DOCTYPE);
			setState(1160);
			match(HTML_START);
			setState(1161);
			match(LANG_ATTRIBUTE);
			setState(1162);
			match(HEAD_START);
			setState(1168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==META_CHARSET) {
				{
				setState(1163);
				match(META_CHARSET);
				setState(1164);
				match(LINK_ICON);
				setState(1165);
				match(META_VIEWPORT);
				setState(1166);
				match(TITLE_START);
				setState(1167);
				match(HEAD_END);
				}
			}

			setState(1170);
			match(BODY_START);
			setState(1171);
			content();
			setState(1172);
			match(BODY_END);
			setState(1173);
			match(HTML_END);
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
	public static class AppContext extends ParserRuleContext {
		public TerminalNode OPENANGLEBRACKET() { return getToken(ReactParser.OPENANGLEBRACKET, 0); }
		public TerminalNode APP() { return getToken(ReactParser.APP, 0); }
		public TerminalNode FORWARD_SLASH() { return getToken(ReactParser.FORWARD_SLASH, 0); }
		public TerminalNode CLOSEANGLEBRACKET() { return getToken(ReactParser.CLOSEANGLEBRACKET, 0); }
		public AppContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_app; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterApp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitApp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitApp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AppContext app() throws RecognitionException {
		AppContext _localctx = new AppContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_app);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1175);
			match(OPENANGLEBRACKET);
			setState(1176);
			match(APP);
			setState(1177);
			match(FORWARD_SLASH);
			setState(1178);
			match(CLOSEANGLEBRACKET);
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
	public static class NodeContext extends ParserRuleContext {
		public TerminalNode RDC() { return getToken(ReactParser.RDC, 0); }
		public List<TerminalNode> OPEN_PAREN() { return getTokens(ReactParser.OPEN_PAREN); }
		public TerminalNode OPEN_PAREN(int i) {
			return getToken(ReactParser.OPEN_PAREN, i);
		}
		public TerminalNode DDG() { return getToken(ReactParser.DDG, 0); }
		public TerminalNode ROOT() { return getToken(ReactParser.ROOT, 0); }
		public List<TerminalNode> CLOSE_PAREN() { return getTokens(ReactParser.CLOSE_PAREN); }
		public TerminalNode CLOSE_PAREN(int i) {
			return getToken(ReactParser.CLOSE_PAREN, i);
		}
		public TerminalNode DOT() { return getToken(ReactParser.DOT, 0); }
		public TerminalNode RENDER() { return getToken(ReactParser.RENDER, 0); }
		public List<TerminalNode> OPENANGLEBRACKET() { return getTokens(ReactParser.OPENANGLEBRACKET); }
		public TerminalNode OPENANGLEBRACKET(int i) {
			return getToken(ReactParser.OPENANGLEBRACKET, i);
		}
		public List<TerminalNode> RDS() { return getTokens(ReactParser.RDS); }
		public TerminalNode RDS(int i) {
			return getToken(ReactParser.RDS, i);
		}
		public List<TerminalNode> CLOSEANGLEBRACKET() { return getTokens(ReactParser.CLOSEANGLEBRACKET); }
		public TerminalNode CLOSEANGLEBRACKET(int i) {
			return getToken(ReactParser.CLOSEANGLEBRACKET, i);
		}
		public AppContext app() {
			return getRuleContext(AppContext.class,0);
		}
		public TerminalNode FORWARD_SLASH() { return getToken(ReactParser.FORWARD_SLASH, 0); }
		public TerminalNode COMMA() { return getToken(ReactParser.COMMA, 0); }
		public NodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_node; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitNode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NodeContext node() throws RecognitionException {
		NodeContext _localctx = new NodeContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_node);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1180);
			match(RDC);
			setState(1181);
			match(OPEN_PAREN);
			setState(1182);
			match(DDG);
			setState(1183);
			match(OPEN_PAREN);
			setState(1184);
			match(ROOT);
			setState(1185);
			match(CLOSE_PAREN);
			setState(1186);
			match(CLOSE_PAREN);
			setState(1187);
			match(DOT);
			setState(1188);
			match(RENDER);
			setState(1189);
			match(OPEN_PAREN);
			setState(1190);
			match(OPENANGLEBRACKET);
			setState(1191);
			match(RDS);
			setState(1192);
			match(CLOSEANGLEBRACKET);
			setState(1193);
			app();
			setState(1194);
			match(OPENANGLEBRACKET);
			setState(1195);
			match(FORWARD_SLASH);
			setState(1196);
			match(RDS);
			setState(1197);
			match(CLOSEANGLEBRACKET);
			setState(1198);
			match(COMMA);
			setState(1199);
			match(CLOSE_PAREN);
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
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1201);
			logicalOrExpression();
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
	public static class LogicalOrExpressionContext extends ParserRuleContext {
		public List<LogicalAndExpressionContext> logicalAndExpression() {
			return getRuleContexts(LogicalAndExpressionContext.class);
		}
		public LogicalAndExpressionContext logicalAndExpression(int i) {
			return getRuleContext(LogicalAndExpressionContext.class,i);
		}
		public List<TerminalNode> Or() { return getTokens(ReactParser.Or); }
		public TerminalNode Or(int i) {
			return getToken(ReactParser.Or, i);
		}
		public LogicalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterLogicalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitLogicalOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitLogicalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOrExpressionContext logicalOrExpression() throws RecognitionException {
		LogicalOrExpressionContext _localctx = new LogicalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_logicalOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1203);
			logicalAndExpression();
			setState(1208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Or) {
				{
				{
				setState(1204);
				match(Or);
				setState(1205);
				logicalAndExpression();
				}
				}
				setState(1210);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class LogicalAndExpressionContext extends ParserRuleContext {
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public List<TerminalNode> And() { return getTokens(ReactParser.And); }
		public TerminalNode And(int i) {
			return getToken(ReactParser.And, i);
		}
		public LogicalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterLogicalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitLogicalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitLogicalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalAndExpressionContext logicalAndExpression() throws RecognitionException {
		LogicalAndExpressionContext _localctx = new LogicalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_logicalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1211);
			equalityExpression();
			setState(1216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==And) {
				{
				{
				setState(1212);
				match(And);
				setState(1213);
				equalityExpression();
				}
				}
				setState(1218);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class EqualityExpressionContext extends ParserRuleContext {
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public List<TerminalNode> Equals_() { return getTokens(ReactParser.Equals_); }
		public TerminalNode Equals_(int i) {
			return getToken(ReactParser.Equals_, i);
		}
		public List<TerminalNode> NOTEQUAL() { return getTokens(ReactParser.NOTEQUAL); }
		public TerminalNode NOTEQUAL(int i) {
			return getToken(ReactParser.NOTEQUAL, i);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1219);
			relationalExpression();
			setState(1224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NOTEQUAL || _la==Equals_) {
				{
				{
				setState(1220);
				_la = _input.LA(1);
				if ( !(_la==NOTEQUAL || _la==Equals_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1221);
				relationalExpression();
				}
				}
				setState(1226);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class RelationalExpressionContext extends ParserRuleContext {
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<TerminalNode> OPENANGLEBRACKET() { return getTokens(ReactParser.OPENANGLEBRACKET); }
		public TerminalNode OPENANGLEBRACKET(int i) {
			return getToken(ReactParser.OPENANGLEBRACKET, i);
		}
		public List<TerminalNode> CLOSEANGLEBRACKET() { return getTokens(ReactParser.CLOSEANGLEBRACKET); }
		public TerminalNode CLOSEANGLEBRACKET(int i) {
			return getToken(ReactParser.CLOSEANGLEBRACKET, i);
		}
		public List<TerminalNode> LessThanEquals() { return getTokens(ReactParser.LessThanEquals); }
		public TerminalNode LessThanEquals(int i) {
			return getToken(ReactParser.LessThanEquals, i);
		}
		public List<TerminalNode> GreaterThanEquals() { return getTokens(ReactParser.GreaterThanEquals); }
		public TerminalNode GreaterThanEquals(int i) {
			return getToken(ReactParser.GreaterThanEquals, i);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_relationalExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1227);
			additiveExpression();
			setState(1232);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1228);
					_la = _input.LA(1);
					if ( !(((((_la - 139)) & ~0x3f) == 0 && ((1L << (_la - 139)) & 1572867L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1229);
					additiveExpression();
					}
					} 
				}
				setState(1234);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
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
	public static class AdditiveExpressionContext extends ParserRuleContext {
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> Plus() { return getTokens(ReactParser.Plus); }
		public TerminalNode Plus(int i) {
			return getToken(ReactParser.Plus, i);
		}
		public List<TerminalNode> DASH() { return getTokens(ReactParser.DASH); }
		public TerminalNode DASH(int i) {
			return getToken(ReactParser.DASH, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_additiveExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1235);
			multiplicativeExpression();
			setState(1240);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1236);
					_la = _input.LA(1);
					if ( !(_la==DASH || _la==Plus) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1237);
					multiplicativeExpression();
					}
					} 
				}
				setState(1242);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
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
	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public List<UnaryExpressionContext> unaryExpression() {
			return getRuleContexts(UnaryExpressionContext.class);
		}
		public UnaryExpressionContext unaryExpression(int i) {
			return getRuleContext(UnaryExpressionContext.class,i);
		}
		public List<TerminalNode> Multiply() { return getTokens(ReactParser.Multiply); }
		public TerminalNode Multiply(int i) {
			return getToken(ReactParser.Multiply, i);
		}
		public List<TerminalNode> FORWARD_SLASH() { return getTokens(ReactParser.FORWARD_SLASH); }
		public TerminalNode FORWARD_SLASH(int i) {
			return getToken(ReactParser.FORWARD_SLASH, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1243);
			unaryExpression();
			setState(1248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FORWARD_SLASH || _la==Multiply) {
				{
				{
				setState(1244);
				_la = _input.LA(1);
				if ( !(_la==FORWARD_SLASH || _la==Multiply) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1245);
				unaryExpression();
				}
				}
				setState(1250);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class UnaryExpressionContext extends ParserRuleContext {
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode Plus() { return getToken(ReactParser.Plus, 0); }
		public TerminalNode DASH() { return getToken(ReactParser.DASH, 0); }
		public TerminalNode Not() { return getToken(ReactParser.Not, 0); }
		public TerminalNode BitNot() { return getToken(ReactParser.BitNot, 0); }
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_unaryExpression);
		int _la;
		try {
			setState(1254);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DASH:
			case Plus:
			case BitNot:
			case Not:
				enterOuterAlt(_localctx, 1);
				{
				setState(1251);
				_la = _input.LA(1);
				if ( !(((((_la - 145)) & ~0x3f) == 0 && ((1L << (_la - 145)) & 225L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1252);
				unaryExpression();
				}
				break;
			case ID:
			case NUMBER:
			case OPEN_PAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1253);
				primaryExpression();
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
	public static class PrimaryExpressionContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(ReactParser.OPEN_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(ReactParser.CLOSE_PAREN, 0); }
		public TerminalNode ID() { return getToken(ReactParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(ReactParser.NUMBER, 0); }
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitPrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_primaryExpression);
		try {
			setState(1262);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1256);
				match(OPEN_PAREN);
				setState(1257);
				expression();
				setState(1258);
				match(CLOSE_PAREN);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(1260);
				match(ID);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 3);
				{
				setState(1261);
				match(NUMBER);
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

	public static final String _serializedATN =
		"\u0004\u0001\u00b4\u04f1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"+
		"O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007"+
		"T\u0002U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007"+
		"Y\u0002Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007"+
		"^\u0002_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007"+
		"c\u0001\u0000\u0005\u0000\u00ca\b\u0000\n\u0000\f\u0000\u00cd\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u00ea\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u00f7\b\u0003"+
		"\n\u0003\f\u0003\u00fa\t\u0003\u0001\u0004\u0001\u0004\u0003\u0004\u00fe"+
		"\b\u0004\u0001\u0004\u0003\u0004\u0101\b\u0004\u0001\u0004\u0001\u0004"+
		"\u0004\u0004\u0105\b\u0004\u000b\u0004\f\u0004\u0106\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u010d\b\u0004\n\u0004\f\u0004"+
		"\u0110\t\u0004\u0001\u0005\u0001\u0005\u0005\u0005\u0114\b\u0005\n\u0005"+
		"\f\u0005\u0117\t\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u011b\b\u0005"+
		"\n\u0005\f\u0005\u011e\t\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u0122"+
		"\b\u0005\n\u0005\f\u0005\u0125\t\u0005\u0003\u0005\u0127\b\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0004"+
		"\b\u0136\b\b\u000b\b\f\b\u0137\u0001\b\u0005\b\u013b\b\b\n\b\f\b\u013e"+
		"\t\b\u0001\b\u0005\b\u0141\b\b\n\b\f\b\u0144\t\b\u0003\b\u0146\b\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u014e\b\t\n\t\f\t\u0151"+
		"\t\t\u0001\t\u0003\t\u0154\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0003\f\u0162\b\f\u0001\f\u0003\f\u0165\b\f\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u0171"+
		"\b\r\n\r\f\r\u0174\t\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u017e\b\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e"+
		"\u0186\b\u000e\n\u000e\f\u000e\u0189\t\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0005\u000f\u018e\b\u000f\n\u000f\f\u000f\u0191\t\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u019a\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u01a4\b\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u01b6\b\u0011"+
		"\n\u0011\f\u0011\u01b9\t\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u01c4\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u01d4\b\u0012\u0005"+
		"\u0012\u01d6\b\u0012\n\u0012\f\u0012\u01d9\t\u0012\u0003\u0012\u01db\b"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u01e0\b\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u01e6\b\u0013\n"+
		"\u0013\f\u0013\u01e9\t\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0003\u0013\u01ef\b\u0013\u0001\u0013\u0003\u0013\u01f2\b\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0003\u0014\u01fc\b\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a"+
		"\u0223\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0228\b"+
		"\u001a\u0001\u001a\u0001\u001a\u0005\u001a\u022c\b\u001a\n\u001a\f\u001a"+
		"\u022f\t\u001a\u0003\u001a\u0231\b\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0003!\u0268\b!\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0005#\u0273\b#\n#\f#\u0276\t#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001%\u0001%\u0001%\u0005%\u0289\b%\n%\f%\u028c\t%\u0001%\u0003"+
		"%\u028f\b%\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0005)\u02b2\b)\n)\f)\u02b5\t)\u0001"+
		")\u0005)\u02b8\b)\n)\f)\u02bb\t)\u0001)\u0003)\u02be\b)\u0001)\u0001)"+
		"\u0001)\u0001)\u0005)\u02c4\b)\n)\f)\u02c7\t)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0003)\u02ce\b)\u0001)\u0003)\u02d1\b)\u0001)\u0001)\u0003)\u02d5"+
		"\b)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0005*\u02e1\b*\n*\f*\u02e4\t*\u0001*\u0005*\u02e7\b*\n*\f*\u02ea\t"+
		"*\u0001*\u0003*\u02ed\b*\u0001*\u0001*\u0005*\u02f1\b*\n*\f*\u02f4\t*"+
		"\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u02fb\b*\u0001*\u0003*\u02fe"+
		"\b*\u0001*\u0001*\u0003*\u0302\b*\u0001+\u0001+\u0001+\u0001+\u0005+\u0308"+
		"\b+\n+\f+\u030b\t+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0005"+
		"+\u0314\b+\n+\f+\u0317\t+\u0001+\u0001+\u0001+\u0005+\u031c\b+\n+\f+\u031f"+
		"\t+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001,\u0001,\u0001-\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001.\u0004.\u032f\b.\u000b.\f.\u0330\u0001.\u0004"+
		".\u0334\b.\u000b.\f.\u0335\u0001.\u0001.\u0001.\u0001.\u0001.\u0003.\u033d"+
		"\b.\u0001/\u0001/\u0001/\u0001/\u0001/\u0005/\u0344\b/\n/\f/\u0347\t/"+
		"\u0001/\u0001/\u00010\u00010\u00010\u00010\u00010\u00010\u00010\u0003"+
		"0\u0352\b0\u00011\u00011\u00031\u0356\b1\u00012\u00012\u00012\u00012\u0001"+
		"3\u00013\u00013\u00053\u035f\b3\n3\f3\u0362\t3\u00013\u00013\u00014\u0001"+
		"4\u00034\u0368\b4\u00015\u00015\u00035\u036c\b5\u00016\u00016\u00056\u0370"+
		"\b6\n6\f6\u0373\t6\u00017\u00017\u00017\u00017\u00017\u00017\u00017\u0001"+
		"7\u00017\u00018\u00018\u00018\u00038\u0381\b8\u00018\u00038\u0384\b8\u0001"+
		"8\u00018\u00019\u00019\u00019\u00019\u00019\u00019\u0001:\u0001:\u0001"+
		":\u0003:\u0391\b:\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001<\u0001"+
		"<\u0001<\u0001<\u0001<\u0001=\u0001=\u0001=\u0001=\u0003=\u03a2\b=\u0001"+
		">\u0001>\u0001>\u0001>\u0001?\u0001?\u0001?\u0003?\u03ab\b?\u0001?\u0001"+
		"?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001?\u0001@\u0001@\u0001@\u0003"+
		"@\u03b8\b@\u0001@\u0001@\u0001A\u0001A\u0001A\u0001A\u0001B\u0001B\u0001"+
		"B\u0001B\u0005B\u03c4\bB\nB\fB\u03c7\tB\u0001C\u0005C\u03ca\bC\nC\fC\u03cd"+
		"\tC\u0001C\u0001C\u0005C\u03d1\bC\nC\fC\u03d4\tC\u0001C\u0001C\u0005C"+
		"\u03d8\bC\nC\fC\u03db\tC\u0001C\u0001C\u0005C\u03df\bC\nC\fC\u03e2\tC"+
		"\u0001C\u0003C\u03e5\bC\u0001D\u0001D\u0001D\u0003D\u03ea\bD\u0001D\u0005"+
		"D\u03ed\bD\nD\fD\u03f0\tD\u0001D\u0001D\u0001E\u0001E\u0001E\u0001E\u0001"+
		"F\u0001F\u0001F\u0001F\u0001F\u0001G\u0001G\u0001G\u0001G\u0005G\u0401"+
		"\bG\nG\fG\u0404\tG\u0001G\u0005G\u0407\bG\nG\fG\u040a\tG\u0001H\u0001"+
		"H\u0005H\u040e\bH\nH\fH\u0411\tH\u0001H\u0001H\u0005H\u0415\bH\nH\fH\u0418"+
		"\tH\u0001H\u0001H\u0001I\u0001I\u0001I\u0003I\u041f\bI\u0001I\u0001I\u0001"+
		"J\u0001J\u0001J\u0001J\u0001K\u0001K\u0001K\u0001L\u0001L\u0001L\u0004"+
		"L\u042d\bL\u000bL\fL\u042e\u0001L\u0001L\u0001L\u0001M\u0001M\u0001M\u0004"+
		"M\u0437\bM\u000bM\fM\u0438\u0001M\u0001M\u0001M\u0001N\u0001N\u0001N\u0004"+
		"N\u0441\bN\u000bN\fN\u0442\u0001N\u0001N\u0001N\u0001O\u0001O\u0001O\u0003"+
		"O\u044b\bO\u0001P\u0001P\u0001P\u0001P\u0001P\u0001Q\u0001Q\u0001Q\u0001"+
		"Q\u0001Q\u0001R\u0001R\u0001R\u0001R\u0001R\u0001S\u0001S\u0001S\u0003"+
		"S\u045f\bS\u0001T\u0001T\u0001T\u0001T\u0005T\u0465\bT\nT\fT\u0468\tT"+
		"\u0001T\u0001T\u0001U\u0001U\u0001U\u0001U\u0001U\u0005U\u0471\bU\nU\f"+
		"U\u0474\tU\u0001U\u0001U\u0001V\u0004V\u0479\bV\u000bV\fV\u047a\u0001"+
		"V\u0004V\u047e\bV\u000bV\fV\u047f\u0003V\u0482\bV\u0001W\u0001W\u0001"+
		"W\u0001W\u0001X\u0001X\u0001X\u0001X\u0001X\u0001X\u0001X\u0001X\u0001"+
		"X\u0003X\u0491\bX\u0001X\u0001X\u0001X\u0001X\u0001X\u0001Y\u0001Y\u0001"+
		"Y\u0001Y\u0001Y\u0001Z\u0001Z\u0001Z\u0001Z\u0001Z\u0001Z\u0001Z\u0001"+
		"Z\u0001Z\u0001Z\u0001Z\u0001Z\u0001Z\u0001Z\u0001Z\u0001Z\u0001Z\u0001"+
		"Z\u0001Z\u0001Z\u0001Z\u0001[\u0001[\u0001\\\u0001\\\u0001\\\u0005\\\u04b7"+
		"\b\\\n\\\f\\\u04ba\t\\\u0001]\u0001]\u0001]\u0005]\u04bf\b]\n]\f]\u04c2"+
		"\t]\u0001^\u0001^\u0001^\u0005^\u04c7\b^\n^\f^\u04ca\t^\u0001_\u0001_"+
		"\u0001_\u0005_\u04cf\b_\n_\f_\u04d2\t_\u0001`\u0001`\u0001`\u0005`\u04d7"+
		"\b`\n`\f`\u04da\t`\u0001a\u0001a\u0001a\u0005a\u04df\ba\na\fa\u04e2\t"+
		"a\u0001b\u0001b\u0001b\u0003b\u04e7\bb\u0001c\u0001c\u0001c\u0001c\u0001"+
		"c\u0001c\u0003c\u04ef\bc\u0001c\u0000\u0000d\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02"+
		"468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0"+
		"\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8"+
		"\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u0000\u0015\u0002\u0000y{~"+
		"~\u0002\u0000zz~~\u0001\u000024\u0001\u0000 #\u0002\u0000--yy\u0004\u0000"+
		"--2244yy\u0003\u00002244yy\u0001\u0000 \"\u0002\u0000\u0004\u0004yy\u0002"+
		"\u0000yz~~\u0002\u000055DD\u0002\u0000\u008b\u008c\u009e\u009f\u0002\u0000"+
		"yy~~\u0001\u0000\u0094\u0095\u0002\u0000\u008b\u008e\u009e\u009f\u0002"+
		"\u0000\u008b\u008e\u009e\u00a0\u0003\u0000\u0004\u0004yy||\u0002\u0000"+
		"\u008e\u008e\u00a0\u00a0\u0002\u0000\u0091\u0091\u0096\u0096\u0002\u0000"+
		"\r\r\u0099\u0099\u0002\u0000\u0091\u0091\u0096\u0098\u0535\u0000\u00cb"+
		"\u0001\u0000\u0000\u0000\u0002\u00e9\u0001\u0000\u0000\u0000\u0004\u00eb"+
		"\u0001\u0000\u0000\u0000\u0006\u00ef\u0001\u0000\u0000\u0000\b\u00fb\u0001"+
		"\u0000\u0000\u0000\n\u0126\u0001\u0000\u0000\u0000\f\u0128\u0001\u0000"+
		"\u0000\u0000\u000e\u012c\u0001\u0000\u0000\u0000\u0010\u0132\u0001\u0000"+
		"\u0000\u0000\u0012\u0149\u0001\u0000\u0000\u0000\u0014\u0157\u0001\u0000"+
		"\u0000\u0000\u0016\u0159\u0001\u0000\u0000\u0000\u0018\u0161\u0001\u0000"+
		"\u0000\u0000\u001a\u0166\u0001\u0000\u0000\u0000\u001c\u0178\u0001\u0000"+
		"\u0000\u0000\u001e\u018a\u0001\u0000\u0000\u0000 \u01a3\u0001\u0000\u0000"+
		"\u0000\"\u01a5\u0001\u0000\u0000\u0000$\u01df\u0001\u0000\u0000\u0000"+
		"&\u01ee\u0001\u0000\u0000\u0000(\u01f3\u0001\u0000\u0000\u0000*\u01fd"+
		"\u0001\u0000\u0000\u0000,\u0201\u0001\u0000\u0000\u0000.\u0207\u0001\u0000"+
		"\u0000\u00000\u020d\u0001\u0000\u0000\u00002\u0213\u0001\u0000\u0000\u0000"+
		"4\u021f\u0001\u0000\u0000\u00006\u0235\u0001\u0000\u0000\u00008\u023b"+
		"\u0001\u0000\u0000\u0000:\u023f\u0001\u0000\u0000\u0000<\u0248\u0001\u0000"+
		"\u0000\u0000>\u024c\u0001\u0000\u0000\u0000@\u0255\u0001\u0000\u0000\u0000"+
		"B\u0267\u0001\u0000\u0000\u0000D\u0269\u0001\u0000\u0000\u0000F\u026b"+
		"\u0001\u0000\u0000\u0000H\u027b\u0001\u0000\u0000\u0000J\u0285\u0001\u0000"+
		"\u0000\u0000L\u0293\u0001\u0000\u0000\u0000N\u0299\u0001\u0000\u0000\u0000"+
		"P\u02a0\u0001\u0000\u0000\u0000R\u02a9\u0001\u0000\u0000\u0000T\u02d6"+
		"\u0001\u0000\u0000\u0000V\u0303\u0001\u0000\u0000\u0000X\u0322\u0001\u0000"+
		"\u0000\u0000Z\u0327\u0001\u0000\u0000\u0000\\\u033c\u0001\u0000\u0000"+
		"\u0000^\u033e\u0001\u0000\u0000\u0000`\u0351\u0001\u0000\u0000\u0000b"+
		"\u0355\u0001\u0000\u0000\u0000d\u0357\u0001\u0000\u0000\u0000f\u035b\u0001"+
		"\u0000\u0000\u0000h\u0367\u0001\u0000\u0000\u0000j\u036b\u0001\u0000\u0000"+
		"\u0000l\u036d\u0001\u0000\u0000\u0000n\u0374\u0001\u0000\u0000\u0000p"+
		"\u037d\u0001\u0000\u0000\u0000r\u0387\u0001\u0000\u0000\u0000t\u0390\u0001"+
		"\u0000\u0000\u0000v\u0392\u0001\u0000\u0000\u0000x\u0398\u0001\u0000\u0000"+
		"\u0000z\u03a1\u0001\u0000\u0000\u0000|\u03a3\u0001\u0000\u0000\u0000~"+
		"\u03a7\u0001\u0000\u0000\u0000\u0080\u03b4\u0001\u0000\u0000\u0000\u0082"+
		"\u03bb\u0001\u0000\u0000\u0000\u0084\u03bf\u0001\u0000\u0000\u0000\u0086"+
		"\u03e4\u0001\u0000\u0000\u0000\u0088\u03e6\u0001\u0000\u0000\u0000\u008a"+
		"\u03f3\u0001\u0000\u0000\u0000\u008c\u03f7\u0001\u0000\u0000\u0000\u008e"+
		"\u03fc\u0001\u0000\u0000\u0000\u0090\u040b\u0001\u0000\u0000\u0000\u0092"+
		"\u041b\u0001\u0000\u0000\u0000\u0094\u0422\u0001\u0000\u0000\u0000\u0096"+
		"\u0426\u0001\u0000\u0000\u0000\u0098\u0429\u0001\u0000\u0000\u0000\u009a"+
		"\u0433\u0001\u0000\u0000\u0000\u009c\u043d\u0001\u0000\u0000\u0000\u009e"+
		"\u044a\u0001\u0000\u0000\u0000\u00a0\u044c\u0001\u0000\u0000\u0000\u00a2"+
		"\u0451\u0001\u0000\u0000\u0000\u00a4\u0456\u0001\u0000\u0000\u0000\u00a6"+
		"\u045e\u0001\u0000\u0000\u0000\u00a8\u0460\u0001\u0000\u0000\u0000\u00aa"+
		"\u046b\u0001\u0000\u0000\u0000\u00ac\u0481\u0001\u0000\u0000\u0000\u00ae"+
		"\u0483\u0001\u0000\u0000\u0000\u00b0\u0487\u0001\u0000\u0000\u0000\u00b2"+
		"\u0497\u0001\u0000\u0000\u0000\u00b4\u049c\u0001\u0000\u0000\u0000\u00b6"+
		"\u04b1\u0001\u0000\u0000\u0000\u00b8\u04b3\u0001\u0000\u0000\u0000\u00ba"+
		"\u04bb\u0001\u0000\u0000\u0000\u00bc\u04c3\u0001\u0000\u0000\u0000\u00be"+
		"\u04cb\u0001\u0000\u0000\u0000\u00c0\u04d3\u0001\u0000\u0000\u0000\u00c2"+
		"\u04db\u0001\u0000\u0000\u0000\u00c4\u04e6\u0001\u0000\u0000\u0000\u00c6"+
		"\u04ee\u0001\u0000\u0000\u0000\u00c8\u00ca\u0003\u0002\u0001\u0000\u00c9"+
		"\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cd\u0001\u0000\u0000\u0000\u00cb"+
		"\u00c9\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc"+
		"\u00ce\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00ce"+
		"\u00cf\u0005\u0000\u0000\u0001\u00cf\u0001\u0001\u0000\u0000\u0000\u00d0"+
		"\u00ea\u0003\u0006\u0003\u0000\u00d1\u00ea\u0003\u0004\u0002\u0000\u00d2"+
		"\u00ea\u0003\b\u0004\u0000\u00d3\u00ea\u0003\u000e\u0007\u0000\u00d4\u00ea"+
		"\u0003\u0010\b\u0000\u00d5\u00ea\u0003\u0012\t\u0000\u00d6\u00ea\u0003"+
		"\f\u0006\u0000\u00d7\u00ea\u0003\u001c\u000e\u0000\u00d8\u00ea\u0003R"+
		")\u0000\u00d9\u00ea\u0003T*\u0000\u00da\u00ea\u0003V+\u0000\u00db\u00ea"+
		"\u0003F#\u0000\u00dc\u00ea\u0003D\"\u0000\u00dd\u00ea\u0003v;\u0000\u00de"+
		"\u00ea\u0003p8\u0000\u00df\u00ea\u0003r9\u0000\u00e0\u00ea\u0003x<\u0000"+
		"\u00e1\u00ea\u0003\"\u0011\u0000\u00e2\u00ea\u0003*\u0015\u0000\u00e3"+
		"\u00ea\u0003P(\u0000\u00e4\u00ea\u0003z=\u0000\u00e5\u00ea\u0003\u00ac"+
		"V\u0000\u00e6\u00ea\u0003\u00b0X\u0000\u00e7\u00ea\u0003\u00b4Z\u0000"+
		"\u00e8\u00ea\u0003\u00b6[\u0000\u00e9\u00d0\u0001\u0000\u0000\u0000\u00e9"+
		"\u00d1\u0001\u0000\u0000\u0000\u00e9\u00d2\u0001\u0000\u0000\u0000\u00e9"+
		"\u00d3\u0001\u0000\u0000\u0000\u00e9\u00d4\u0001\u0000\u0000\u0000\u00e9"+
		"\u00d5\u0001\u0000\u0000\u0000\u00e9\u00d6\u0001\u0000\u0000\u0000\u00e9"+
		"\u00d7\u0001\u0000\u0000\u0000\u00e9\u00d8\u0001\u0000\u0000\u0000\u00e9"+
		"\u00d9\u0001\u0000\u0000\u0000\u00e9\u00da\u0001\u0000\u0000\u0000\u00e9"+
		"\u00db\u0001\u0000\u0000\u0000\u00e9\u00dc\u0001\u0000\u0000\u0000\u00e9"+
		"\u00dd\u0001\u0000\u0000\u0000\u00e9\u00de\u0001\u0000\u0000\u0000\u00e9"+
		"\u00df\u0001\u0000\u0000\u0000\u00e9\u00e0\u0001\u0000\u0000\u0000\u00e9"+
		"\u00e1\u0001\u0000\u0000\u0000\u00e9\u00e2\u0001\u0000\u0000\u0000\u00e9"+
		"\u00e3\u0001\u0000\u0000\u0000\u00e9\u00e4\u0001\u0000\u0000\u0000\u00e9"+
		"\u00e5\u0001\u0000\u0000\u0000\u00e9\u00e6\u0001\u0000\u0000\u0000\u00e9"+
		"\u00e7\u0001\u0000\u0000\u0000\u00e9\u00e8\u0001\u0000\u0000\u0000\u00ea"+
		"\u0003\u0001\u0000\u0000\u0000\u00eb\u00ec\u0005\u000f\u0000\u0000\u00ec"+
		"\u00ed\u0005z\u0000\u0000\u00ed\u00ee\u0005\u0084\u0000\u0000\u00ee\u0005"+
		"\u0001\u0000\u0000\u0000\u00ef\u00f0\u0005\u000f\u0000\u0000\u00f0\u00f1"+
		"\u0005\u0087\u0000\u0000\u00f1\u00f2\u0005y\u0000\u0000\u00f2\u00f3\u0005"+
		"\u0088\u0000\u0000\u00f3\u00f4\u0005\u0010\u0000\u0000\u00f4\u00f8\u0005"+
		"z\u0000\u0000\u00f5\u00f7\u0005\u0084\u0000\u0000\u00f6\u00f5\u0001\u0000"+
		"\u0000\u0000\u00f7\u00fa\u0001\u0000\u0000\u0000\u00f8\u00f6\u0001\u0000"+
		"\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9\u0007\u0001\u0000"+
		"\u0000\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fb\u00fd\u0005\u000f"+
		"\u0000\u0000\u00fc\u00fe\u0005\u0011\u0000\u0000\u00fd\u00fc\u0001\u0000"+
		"\u0000\u0000\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\u0100\u0001\u0000"+
		"\u0000\u0000\u00ff\u0101\u0005\u0090\u0000\u0000\u0100\u00ff\u0001\u0000"+
		"\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000\u0101\u0102\u0001\u0000"+
		"\u0000\u0000\u0102\u0104\u0005\u0087\u0000\u0000\u0103\u0105\u0003\n\u0005"+
		"\u0000\u0104\u0103\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000"+
		"\u0000\u0106\u0104\u0001\u0000\u0000\u0000\u0106\u0107\u0001\u0000\u0000"+
		"\u0000\u0107\u0108\u0001\u0000\u0000\u0000\u0108\u0109\u0005\u0088\u0000"+
		"\u0000\u0109\u010a\u0005\u0010\u0000\u0000\u010a\u010e\u0005\u0013\u0000"+
		"\u0000\u010b\u010d\u0005\u0084\u0000\u0000\u010c\u010b\u0001\u0000\u0000"+
		"\u0000\u010d\u0110\u0001\u0000\u0000\u0000\u010e\u010c\u0001\u0000\u0000"+
		"\u0000\u010e\u010f\u0001\u0000\u0000\u0000\u010f\t\u0001\u0000\u0000\u0000"+
		"\u0110\u010e\u0001\u0000\u0000\u0000\u0111\u0115\u0005\u0012\u0000\u0000"+
		"\u0112\u0114\u0005\u0090\u0000\u0000\u0113\u0112\u0001\u0000\u0000\u0000"+
		"\u0114\u0117\u0001\u0000\u0000\u0000\u0115\u0113\u0001\u0000\u0000\u0000"+
		"\u0115\u0116\u0001\u0000\u0000\u0000\u0116\u0127\u0001\u0000\u0000\u0000"+
		"\u0117\u0115\u0001\u0000\u0000\u0000\u0118\u011c\u0005\u0016\u0000\u0000"+
		"\u0119\u011b\u0005\u0090\u0000\u0000\u011a\u0119\u0001\u0000\u0000\u0000"+
		"\u011b\u011e\u0001\u0000\u0000\u0000\u011c\u011a\u0001\u0000\u0000\u0000"+
		"\u011c\u011d\u0001\u0000\u0000\u0000\u011d\u0127\u0001\u0000\u0000\u0000"+
		"\u011e\u011c\u0001\u0000\u0000\u0000\u011f\u0123\u0005\u0015\u0000\u0000"+
		"\u0120\u0122\u0005\u0090\u0000\u0000\u0121\u0120\u0001\u0000\u0000\u0000"+
		"\u0122\u0125\u0001\u0000\u0000\u0000\u0123\u0121\u0001\u0000\u0000\u0000"+
		"\u0123\u0124\u0001\u0000\u0000\u0000\u0124\u0127\u0001\u0000\u0000\u0000"+
		"\u0125\u0123\u0001\u0000\u0000\u0000\u0126\u0111\u0001\u0000\u0000\u0000"+
		"\u0126\u0118\u0001\u0000\u0000\u0000\u0126\u011f\u0001\u0000\u0000\u0000"+
		"\u0127\u000b\u0001\u0000\u0000\u0000\u0128\u0129\u0005y\u0000\u0000\u0129"+
		"\u012a\u0005\u008f\u0000\u0000\u012a\u012b\u0007\u0000\u0000\u0000\u012b"+
		"\r\u0001\u0000\u0000\u0000\u012c\u012d\u0005\u0014\u0000\u0000\u012d\u012e"+
		"\u0005y\u0000\u0000\u012e\u012f\u0005\u008d\u0000\u0000\u012f\u0130\u0003"+
		"\u0010\b\u0000\u0130\u0131\u0005\u0084\u0000\u0000\u0131\u000f\u0001\u0000"+
		"\u0000\u0000\u0132\u0145\u0005\u0089\u0000\u0000\u0133\u013c\u0003\u0012"+
		"\t\u0000\u0134\u0136\u0005\u0090\u0000\u0000\u0135\u0134\u0001\u0000\u0000"+
		"\u0000\u0136\u0137\u0001\u0000\u0000\u0000\u0137\u0135\u0001\u0000\u0000"+
		"\u0000\u0137\u0138\u0001\u0000\u0000\u0000\u0138\u0139\u0001\u0000\u0000"+
		"\u0000\u0139\u013b\u0003\u0012\t\u0000\u013a\u0135\u0001\u0000\u0000\u0000"+
		"\u013b\u013e\u0001\u0000\u0000\u0000\u013c\u013a\u0001\u0000\u0000\u0000"+
		"\u013c\u013d\u0001\u0000\u0000\u0000\u013d\u0142\u0001\u0000\u0000\u0000"+
		"\u013e\u013c\u0001\u0000\u0000\u0000\u013f\u0141\u0005\u0090\u0000\u0000"+
		"\u0140\u013f\u0001\u0000\u0000\u0000\u0141\u0144\u0001\u0000\u0000\u0000"+
		"\u0142\u0140\u0001\u0000\u0000\u0000\u0142\u0143\u0001\u0000\u0000\u0000"+
		"\u0143\u0146\u0001\u0000\u0000\u0000\u0144\u0142\u0001\u0000\u0000\u0000"+
		"\u0145\u0133\u0001\u0000\u0000\u0000\u0145\u0146\u0001\u0000\u0000\u0000"+
		"\u0146\u0147\u0001\u0000\u0000\u0000\u0147\u0148\u0005\u008a\u0000\u0000"+
		"\u0148\u0011\u0001\u0000\u0000\u0000\u0149\u014a\u0005\u0087\u0000\u0000"+
		"\u014a\u014f\u0003\f\u0006\u0000\u014b\u014c\u0005\u0090\u0000\u0000\u014c"+
		"\u014e\u0003\f\u0006\u0000\u014d\u014b\u0001\u0000\u0000\u0000\u014e\u0151"+
		"\u0001\u0000\u0000\u0000\u014f\u014d\u0001\u0000\u0000\u0000\u014f\u0150"+
		"\u0001\u0000\u0000\u0000\u0150\u0153\u0001\u0000\u0000\u0000\u0151\u014f"+
		"\u0001\u0000\u0000\u0000\u0152\u0154\u0005\u0090\u0000\u0000\u0153\u0152"+
		"\u0001\u0000\u0000\u0000\u0153\u0154\u0001\u0000\u0000\u0000\u0154\u0155"+
		"\u0001\u0000\u0000\u0000\u0155\u0156\u0005\u0088\u0000\u0000\u0156\u0013"+
		"\u0001\u0000\u0000\u0000\u0157\u0158\u0007\u0001\u0000\u0000\u0158\u0015"+
		"\u0001\u0000\u0000\u0000\u0159\u015a\u0005y\u0000\u0000\u015a\u015b\u0005"+
		"\u0089\u0000\u0000\u015b\u015c\u0003\u0014\n\u0000\u015c\u015d\u0005\u008a"+
		"\u0000\u0000\u015d\u0017\u0001\u0000\u0000\u0000\u015e\u0162\u0003\u0016"+
		"\u000b\u0000\u015f\u0162\u0003\u0014\n\u0000\u0160\u0162\u0005y\u0000"+
		"\u0000\u0161\u015e\u0001\u0000\u0000\u0000\u0161\u015f\u0001\u0000\u0000"+
		"\u0000\u0161\u0160\u0001\u0000\u0000\u0000\u0162\u0164\u0001\u0000\u0000"+
		"\u0000\u0163\u0165\u0005\u0090\u0000\u0000\u0164\u0163\u0001\u0000\u0000"+
		"\u0000\u0164\u0165\u0001\u0000\u0000\u0000\u0165\u0019\u0001\u0000\u0000"+
		"\u0000\u0166\u0167\u0005\u0014\u0000\u0000\u0167\u0168\u0005\u0089\u0000"+
		"\u0000\u0168\u0169\u0005y\u0000\u0000\u0169\u016a\u0005\u0090\u0000\u0000"+
		"\u016a\u016b\u0005y\u0000\u0000\u016b\u016c\u0005\u008a\u0000\u0000\u016c"+
		"\u016d\u0005\u008d\u0000\u0000\u016d\u016e\u0005\u0012\u0000\u0000\u016e"+
		"\u0172\u0005\u0085\u0000\u0000\u016f\u0171\u0003\u0018\f\u0000\u0170\u016f"+
		"\u0001\u0000\u0000\u0000\u0171\u0174\u0001\u0000\u0000\u0000\u0172\u0170"+
		"\u0001\u0000\u0000\u0000\u0172\u0173\u0001\u0000\u0000\u0000\u0173\u0175"+
		"\u0001\u0000\u0000\u0000\u0174\u0172\u0001\u0000\u0000\u0000\u0175\u0176"+
		"\u0005\u0086\u0000\u0000\u0176\u0177\u0005\u0084\u0000\u0000\u0177\u001b"+
		"\u0001\u0000\u0000\u0000\u0178\u0179\u0005\u0014\u0000\u0000\u0179\u017a"+
		"\u0005y\u0000\u0000\u017a\u017b\u0005\u008d\u0000\u0000\u017b\u017d\u0005"+
		"\u0085\u0000\u0000\u017c\u017e\u0005y\u0000\u0000\u017d\u017c\u0001\u0000"+
		"\u0000\u0000\u017d\u017e\u0001\u0000\u0000\u0000\u017e\u017f\u0001\u0000"+
		"\u0000\u0000\u017f\u0180\u0005\u0086\u0000\u0000\u0180\u0181\u0005\t\u0000"+
		"\u0000\u0181\u0182\u0005\u0087\u0000\u0000\u0182\u0183\u0003\u001e\u000f"+
		"\u0000\u0183\u0187\u0005\u0088\u0000\u0000\u0184\u0186\u0005\u0084\u0000"+
		"\u0000\u0185\u0184\u0001\u0000\u0000\u0000\u0186\u0189\u0001\u0000\u0000"+
		"\u0000\u0187\u0185\u0001\u0000\u0000\u0000\u0187\u0188\u0001\u0000\u0000"+
		"\u0000\u0188\u001d\u0001\u0000\u0000\u0000\u0189\u0187\u0001\u0000\u0000"+
		"\u0000\u018a\u018b\u0005y\u0000\u0000\u018b\u018f\u0005\u0085\u0000\u0000"+
		"\u018c\u018e\u0003\u0018\f\u0000\u018d\u018c\u0001\u0000\u0000\u0000\u018e"+
		"\u0191\u0001\u0000\u0000\u0000\u018f\u018d\u0001\u0000\u0000\u0000\u018f"+
		"\u0190\u0001\u0000\u0000\u0000\u0190\u0192\u0001\u0000\u0000\u0000\u0191"+
		"\u018f\u0001\u0000\u0000\u0000\u0192\u0193\u0005\u0086\u0000\u0000\u0193"+
		"\u0194\u0005\u0084\u0000\u0000\u0194\u001f\u0001\u0000\u0000\u0000\u0195"+
		"\u0196\u00053\u0000\u0000\u0196\u0197\u0005\u008f\u0000\u0000\u0197\u0199"+
		"\u0005 \u0000\u0000\u0198\u019a\u0005\u0090\u0000\u0000\u0199\u0198\u0001"+
		"\u0000\u0000\u0000\u0199\u019a\u0001\u0000\u0000\u0000\u019a\u01a4\u0001"+
		"\u0000\u0000\u0000\u019b\u019c\u00052\u0000\u0000\u019c\u019d\u0005\u008f"+
		"\u0000\u0000\u019d\u019e\u0005!\u0000\u0000\u019e\u01a4\u0005\u0090\u0000"+
		"\u0000\u019f\u01a0\u00054\u0000\u0000\u01a0\u01a1\u0005\u008f\u0000\u0000"+
		"\u01a1\u01a2\u0005\"\u0000\u0000\u01a2\u01a4\u0005\u0090\u0000\u0000\u01a3"+
		"\u0195\u0001\u0000\u0000\u0000\u01a3\u019b\u0001\u0000\u0000\u0000\u01a3"+
		"\u019f\u0001\u0000\u0000\u0000\u01a4!\u0001\u0000\u0000\u0000\u01a5\u01a6"+
		"\u0005\u0014\u0000\u0000\u01a6\u01a7\u0005y\u0000\u0000\u01a7\u01a8\u0005"+
		"\u008d\u0000\u0000\u01a8\u01a9\u0005\u001e\u0000\u0000\u01a9\u01aa\u0005"+
		"\u0085\u0000\u0000\u01aa\u01ab\u0005\u0085\u0000\u0000\u01ab\u01ac\u0005"+
		"y\u0000\u0000\u01ac\u01ad\u0005\u0086\u0000\u0000\u01ad\u01ae\u0005\t"+
		"\u0000\u0000\u01ae\u01af\u0005\u0085\u0000\u0000\u01af\u01b0\u0005\u001f"+
		"\u0000\u0000\u01b0\u01b1\u0005\u0085\u0000\u0000\u01b1\u01b2\u0005z\u0000"+
		"\u0000\u01b2\u01b3\u0005\u0090\u0000\u0000\u01b3\u01b7\u0005\u0087\u0000"+
		"\u0000\u01b4\u01b6\u0003 \u0010\u0000\u01b5\u01b4\u0001\u0000\u0000\u0000"+
		"\u01b6\u01b9\u0001\u0000\u0000\u0000\u01b7\u01b5\u0001\u0000\u0000\u0000"+
		"\u01b7\u01b8\u0001\u0000\u0000\u0000\u01b8\u01c3\u0001\u0000\u0000\u0000"+
		"\u01b9\u01b7\u0001\u0000\u0000\u0000\u01ba\u01bb\u0005-\u0000\u0000\u01bb"+
		"\u01bc\u0005\u008f\u0000\u0000\u01bc\u01bd\u0005\u0085\u0000\u0000\u01bd"+
		"\u01be\u0005\u0086\u0000\u0000\u01be\u01bf\u0005\t\u0000\u0000\u01bf\u01c0"+
		"\u0005y\u0000\u0000\u01c0\u01c1\u0005\u0085\u0000\u0000\u01c1\u01c2\u0005"+
		"y\u0000\u0000\u01c2\u01c4\u0005\u0086\u0000\u0000\u01c3\u01ba\u0001\u0000"+
		"\u0000\u0000\u01c3\u01c4\u0001\u0000\u0000\u0000\u01c4\u01c5\u0001\u0000"+
		"\u0000\u0000\u01c5\u01c6\u0005\u0088\u0000\u0000\u01c6\u01c7\u0005\u0086"+
		"\u0000\u0000\u01c7\u01c8\u0005\u0086\u0000\u0000\u01c8\u01c9\u0005\u0086"+
		"\u0000\u0000\u01c9\u01ca\u0005\u0084\u0000\u0000\u01ca#\u0001\u0000\u0000"+
		"\u0000\u01cb\u01da\u0005\u0087\u0000\u0000\u01cc\u01cd\u0005+\u0000\u0000"+
		"\u01cd\u01ce\u0005\u008f\u0000\u0000\u01ce\u01db\u0005z\u0000\u0000\u01cf"+
		"\u01d0\u0007\u0002\u0000\u0000\u01d0\u01d1\u0005\u008f\u0000\u0000\u01d1"+
		"\u01d3\u0007\u0003\u0000\u0000\u01d2\u01d4\u0005\u0090\u0000\u0000\u01d3"+
		"\u01d2\u0001\u0000\u0000\u0000\u01d3\u01d4\u0001\u0000\u0000\u0000\u01d4"+
		"\u01d6\u0001\u0000\u0000\u0000\u01d5\u01cf\u0001\u0000\u0000\u0000\u01d6"+
		"\u01d9\u0001\u0000\u0000\u0000\u01d7\u01d5\u0001\u0000\u0000\u0000\u01d7"+
		"\u01d8\u0001\u0000\u0000\u0000\u01d8\u01db\u0001\u0000\u0000\u0000\u01d9"+
		"\u01d7\u0001\u0000\u0000\u0000\u01da\u01cc\u0001\u0000\u0000\u0000\u01da"+
		"\u01d7\u0001\u0000\u0000\u0000\u01db\u01dc\u0001\u0000\u0000\u0000\u01dc"+
		"\u01e0\u0005\u0088\u0000\u0000\u01dd\u01e0\u0005y\u0000\u0000\u01de\u01e0"+
		"\u0005Q\u0000\u0000\u01df\u01cb\u0001\u0000\u0000\u0000\u01df\u01dd\u0001"+
		"\u0000\u0000\u0000\u01df\u01de\u0001\u0000\u0000\u0000\u01e0%\u0001\u0000"+
		"\u0000\u0000\u01e1\u01ef\u0005y\u0000\u0000\u01e2\u01e3\u0003(\u0014\u0000"+
		"\u01e3\u01e4\u0005\u0090\u0000\u0000\u01e4\u01e6\u0001\u0000\u0000\u0000"+
		"\u01e5\u01e2\u0001\u0000\u0000\u0000\u01e6\u01e9\u0001\u0000\u0000\u0000"+
		"\u01e7\u01e5\u0001\u0000\u0000\u0000\u01e7\u01e8\u0001\u0000\u0000\u0000"+
		"\u01e8\u01ef\u0001\u0000\u0000\u0000\u01e9\u01e7\u0001\u0000\u0000\u0000"+
		"\u01ea\u01ef\u0005 \u0000\u0000\u01eb\u01ef\u0005!\u0000\u0000\u01ec\u01ef"+
		"\u0005\"\u0000\u0000\u01ed\u01ef\u0005#\u0000\u0000\u01ee\u01e1\u0001"+
		"\u0000\u0000\u0000\u01ee\u01e7\u0001\u0000\u0000\u0000\u01ee\u01ea\u0001"+
		"\u0000\u0000\u0000\u01ee\u01eb\u0001\u0000\u0000\u0000\u01ee\u01ec\u0001"+
		"\u0000\u0000\u0000\u01ee\u01ed\u0001\u0000\u0000\u0000\u01ef\u01f1\u0001"+
		"\u0000\u0000\u0000\u01f0\u01f2\u0005\u0090\u0000\u0000\u01f1\u01f0\u0001"+
		"\u0000\u0000\u0000\u01f1\u01f2\u0001\u0000\u0000\u0000\u01f2\'\u0001\u0000"+
		"\u0000\u0000\u01f3\u01f4\u0005\u001f\u0000\u0000\u01f4\u01f5\u0005\u0085"+
		"\u0000\u0000\u01f5\u01f6\u0005z\u0000\u0000\u01f6\u01f7\u0005\u0090\u0000"+
		"\u0000\u01f7\u01f8\u0003$\u0012\u0000\u01f8\u01f9\u0005\u0090\u0000\u0000"+
		"\u01f9\u01fb\u0003&\u0013\u0000\u01fa\u01fc\u0005\u0086\u0000\u0000\u01fb"+
		"\u01fa\u0001\u0000\u0000\u0000\u01fb\u01fc\u0001\u0000\u0000\u0000\u01fc"+
		")\u0001\u0000\u0000\u0000\u01fd\u01fe\u0003(\u0014\u0000\u01fe\u01ff\u0005"+
		"\u0086\u0000\u0000\u01ff\u0200\u0005\u0084\u0000\u0000\u0200+\u0001\u0000"+
		"\u0000\u0000\u0201\u0202\u00053\u0000\u0000\u0202\u0203\u0005\u008d\u0000"+
		"\u0000\u0203\u0204\u0005\u0087\u0000\u0000\u0204\u0205\u0005 \u0000\u0000"+
		"\u0205\u0206\u0005\u0088\u0000\u0000\u0206-\u0001\u0000\u0000\u0000\u0207"+
		"\u0208\u00052\u0000\u0000\u0208\u0209\u0005\u008d\u0000\u0000\u0209\u020a"+
		"\u0005\u0087\u0000\u0000\u020a\u020b\u0005!\u0000\u0000\u020b\u020c\u0005"+
		"\u0088\u0000\u0000\u020c/\u0001\u0000\u0000\u0000\u020d\u020e\u00054\u0000"+
		"\u0000\u020e\u020f\u0005\u008d\u0000\u0000\u020f\u0210\u0005\u0087\u0000"+
		"\u0000\u0210\u0211\u0005\"\u0000\u0000\u0211\u0212\u0005\u0088\u0000\u0000"+
		"\u02121\u0001\u0000\u0000\u0000\u0213\u0214\u0005-\u0000\u0000\u0214\u0215"+
		"\u0005\u008d\u0000\u0000\u0215\u0216\u0005\u0087\u0000\u0000\u0216\u0217"+
		"\u0005\u0085\u0000\u0000\u0217\u0218\u0005\u0086\u0000\u0000\u0218\u0219"+
		"\u0005\t\u0000\u0000\u0219\u021a\u0007\u0004\u0000\u0000\u021a\u021b\u0005"+
		"\u0085\u0000\u0000\u021b\u021c\u0005y\u0000\u0000\u021c\u021d\u0005\u0086"+
		"\u0000\u0000\u021d\u021e\u0005\u0088\u0000\u0000\u021e3\u0001\u0000\u0000"+
		"\u0000\u021f\u0230\u0005\u008b\u0000\u0000\u0220\u0222\u00051\u0000\u0000"+
		"\u0221\u0223\u0003,\u0016\u0000\u0222\u0221\u0001\u0000\u0000\u0000\u0222"+
		"\u0223\u0001\u0000\u0000\u0000\u0223\u0224\u0001\u0000\u0000\u0000\u0224"+
		"\u0225\u0003.\u0017\u0000\u0225\u0227\u00030\u0018\u0000\u0226\u0228\u0003"+
		"2\u0019\u0000\u0227\u0226\u0001\u0000\u0000\u0000\u0227\u0228\u0001\u0000"+
		"\u0000\u0000\u0228\u0231\u0001\u0000\u0000\u0000\u0229\u022d\u0005y\u0000"+
		"\u0000\u022a\u022c\u00036\u001b\u0000\u022b\u022a\u0001\u0000\u0000\u0000"+
		"\u022c\u022f\u0001\u0000\u0000\u0000\u022d\u022b\u0001\u0000\u0000\u0000"+
		"\u022d\u022e\u0001\u0000\u0000\u0000\u022e\u0231\u0001\u0000\u0000\u0000"+
		"\u022f\u022d\u0001\u0000\u0000\u0000\u0230\u0220\u0001\u0000\u0000\u0000"+
		"\u0230\u0229\u0001\u0000\u0000\u0000\u0231\u0232\u0001\u0000\u0000\u0000"+
		"\u0232\u0233\u0005\r\u0000\u0000\u0233\u0234\u0005\u008c\u0000\u0000\u0234"+
		"5\u0001\u0000\u0000\u0000\u0235\u0236\u0007\u0005\u0000\u0000\u0236\u0237"+
		"\u0005\u008d\u0000\u0000\u0237\u0238\u0005\u0087\u0000\u0000\u0238\u0239"+
		"\u0005y\u0000\u0000\u0239\u023a\u0005\u0088\u0000\u0000\u023a7\u0001\u0000"+
		"\u0000\u0000\u023b\u023c\u0005\u0087\u0000\u0000\u023c\u023d\u0005\"\u0000"+
		"\u0000\u023d\u023e\u0005\u0088\u0000\u0000\u023e9\u0001\u0000\u0000\u0000"+
		"\u023f\u0240\u0005\u008b\u0000\u0000\u0240\u0241\u0005/\u0000\u0000\u0241"+
		"\u0242\u0005\u008c\u0000\u0000\u0242\u0243\u00038\u001c\u0000\u0243\u0244"+
		"\u0005\u008b\u0000\u0000\u0244\u0245\u0005\r\u0000\u0000\u0245\u0246\u0005"+
		"/\u0000\u0000\u0246\u0247\u0005\u008c\u0000\u0000\u0247;\u0001\u0000\u0000"+
		"\u0000\u0248\u0249\u0005\u0087\u0000\u0000\u0249\u024a\u0005#\u0000\u0000"+
		"\u024a\u024b\u0005\u0088\u0000\u0000\u024b=\u0001\u0000\u0000\u0000\u024c"+
		"\u024d\u0005\u008b\u0000\u0000\u024d\u024e\u0005.\u0000\u0000\u024e\u024f"+
		"\u0005\u008c\u0000\u0000\u024f\u0250\u0003<\u001e\u0000\u0250\u0251\u0005"+
		"\u008b\u0000\u0000\u0251\u0252\u0005\r\u0000\u0000\u0252\u0253\u0005."+
		"\u0000\u0000\u0253\u0254\u0005\u008c\u0000\u0000\u0254?\u0001\u0000\u0000"+
		"\u0000\u0255\u0256\u0005\u0087\u0000\u0000\u0256\u0257\u0005\u001e\u0000"+
		"\u0000\u0257\u0258\u0005\u0085\u0000\u0000\u0258\u0259\u0005\u0085\u0000"+
		"\u0000\u0259\u025a\u0005y\u0000\u0000\u025a\u025b\u0005\u0086\u0000\u0000"+
		"\u025b\u025c\u0005\t\u0000\u0000\u025c\u025d\u0005\u0085\u0000\u0000\u025d"+
		"\u025e\u00034\u001a\u0000\u025e\u025f\u0005\u0086\u0000\u0000\u025f\u0260"+
		"\u0005\u0086\u0000\u0000\u0260\u0261\u0005\u0088\u0000\u0000\u0261A\u0001"+
		"\u0000\u0000\u0000\u0262\u0268\u0003F#\u0000\u0263\u0268\u0003@ \u0000"+
		"\u0264\u0268\u00034\u001a\u0000\u0265\u0268\u0003:\u001d\u0000\u0266\u0268"+
		"\u0003>\u001f\u0000\u0267\u0262\u0001\u0000\u0000\u0000\u0267\u0263\u0001"+
		"\u0000\u0000\u0000\u0267\u0264\u0001\u0000\u0000\u0000\u0267\u0265\u0001"+
		"\u0000\u0000\u0000\u0267\u0266\u0001\u0000\u0000\u0000\u0268C\u0001\u0000"+
		"\u0000\u0000\u0269\u026a\u0003F#\u0000\u026aE\u0001\u0000\u0000\u0000"+
		"\u026b\u026c\u0005\u008b\u0000\u0000\u026c\u026d\u0005*\u0000\u0000\u026d"+
		"\u026e\u0005+\u0000\u0000\u026e\u026f\u0005\u008d\u0000\u0000\u026f\u0270"+
		"\u0005z\u0000\u0000\u0270\u0274\u0005\u008c\u0000\u0000\u0271\u0273\u0003"+
		"B!\u0000\u0272\u0271\u0001\u0000\u0000\u0000\u0273\u0276\u0001\u0000\u0000"+
		"\u0000\u0274\u0272\u0001\u0000\u0000\u0000\u0274\u0275\u0001\u0000\u0000"+
		"\u0000\u0275\u0277\u0001\u0000\u0000\u0000\u0276\u0274\u0001\u0000\u0000"+
		"\u0000\u0277\u0278\u0005\u008b\u0000\u0000\u0278\u0279\u0005,\u0000\u0000"+
		"\u0279\u027a\u0005\u008c\u0000\u0000\u027aG\u0001\u0000\u0000\u0000\u027b"+
		"\u027c\u0005\u0014\u0000\u0000\u027c\u027d\u0005\u0087\u0000\u0000\u027d"+
		"\u027e\u0005y\u0000\u0000\u027e\u027f\u0005\u0090\u0000\u0000\u027f\u0280"+
		"\u0007\u0004\u0000\u0000\u0280\u0281\u0005\u0088\u0000\u0000\u0281\u0282"+
		"\u0005\u008d\u0000\u0000\u0282\u0283\u0005y\u0000\u0000\u0283\u0284\u0005"+
		"\u0084\u0000\u0000\u0284I\u0001\u0000\u0000\u0000\u0285\u0286\u0005\u008b"+
		"\u0000\u0000\u0286\u028a\u00051\u0000\u0000\u0287\u0289\u0003L&\u0000"+
		"\u0288\u0287\u0001\u0000\u0000\u0000\u0289\u028c\u0001\u0000\u0000\u0000"+
		"\u028a\u0288\u0001\u0000\u0000\u0000\u028a\u028b\u0001\u0000\u0000\u0000"+
		"\u028b\u028e\u0001\u0000\u0000\u0000\u028c\u028a\u0001\u0000\u0000\u0000"+
		"\u028d\u028f\u00032\u0019\u0000\u028e\u028d\u0001\u0000\u0000\u0000\u028e"+
		"\u028f\u0001\u0000\u0000\u0000\u028f\u0290\u0001\u0000\u0000\u0000\u0290"+
		"\u0291\u0005\r\u0000\u0000\u0291\u0292\u0005\u008c\u0000\u0000\u0292K"+
		"\u0001\u0000\u0000\u0000\u0293\u0294\u0007\u0006\u0000\u0000\u0294\u0295"+
		"\u0005\u008d\u0000\u0000\u0295\u0296\u0005\u0087\u0000\u0000\u0296\u0297"+
		"\u0007\u0007\u0000\u0000\u0297\u0298\u0005\u0088\u0000\u0000\u0298M\u0001"+
		"\u0000\u0000\u0000\u0299\u029a\u0003H$\u0000\u029a\u029b\u0005\u001a\u0000"+
		"\u0000\u029b\u029c\u0005\u0085\u0000\u0000\u029c\u029d\u0003J%\u0000\u029d"+
		"\u029e\u0005\u0086\u0000\u0000\u029e\u029f\u0005\u0084\u0000\u0000\u029f"+
		"O\u0001\u0000\u0000\u0000\u02a0\u02a1\u0005\u0019\u0000\u0000\u02a1\u02a2"+
		"\u0005y\u0000\u0000\u02a2\u02a3\u0005\u0085\u0000\u0000\u02a3\u02a4\u0005"+
		"y\u0000\u0000\u02a4\u02a5\u0005\u0086\u0000\u0000\u02a5\u02a6\u0005\u0087"+
		"\u0000\u0000\u02a6\u02a7\u0003N\'\u0000\u02a7\u02a8\u0005\u0088\u0000"+
		"\u0000\u02a8Q\u0001\u0000\u0000\u0000\u02a9\u02aa\u0005\u0019\u0000\u0000"+
		"\u02aa\u02ab\u0007\b\u0000\u0000\u02ab\u02ac\u0005\u0085\u0000\u0000\u02ac"+
		"\u02ad\u0005\u0086\u0000\u0000\u02ad\u02b3\u0005\u0087\u0000\u0000\u02ae"+
		"\u02b2\u0003\u001a\r\u0000\u02af\u02b2\u0003n7\u0000\u02b0\u02b2\u0003"+
		"Z-\u0000\u02b1\u02ae\u0001\u0000\u0000\u0000\u02b1\u02af\u0001\u0000\u0000"+
		"\u0000\u02b1\u02b0\u0001\u0000\u0000\u0000\u02b2\u02b5\u0001\u0000\u0000"+
		"\u0000\u02b3\u02b1\u0001\u0000\u0000\u0000\u02b3\u02b4\u0001\u0000\u0000"+
		"\u0000\u02b4\u02b9\u0001\u0000\u0000\u0000\u02b5\u02b3\u0001\u0000\u0000"+
		"\u0000\u02b6\u02b8\u0003\u001c\u000e\u0000\u02b7\u02b6\u0001\u0000\u0000"+
		"\u0000\u02b8\u02bb\u0001\u0000\u0000\u0000\u02b9\u02b7\u0001\u0000\u0000"+
		"\u0000\u02b9\u02ba\u0001\u0000\u0000\u0000\u02ba\u02bd\u0001\u0000\u0000"+
		"\u0000\u02bb\u02b9\u0001\u0000\u0000\u0000\u02bc\u02be\u0003\"\u0011\u0000"+
		"\u02bd\u02bc\u0001\u0000\u0000\u0000\u02bd\u02be\u0001\u0000\u0000\u0000"+
		"\u02be\u02c5\u0001\u0000\u0000\u0000\u02bf\u02c4\u0003p8\u0000\u02c0\u02c4"+
		"\u0003r9\u0000\u02c1\u02c4\u0003v;\u0000\u02c2\u02c4\u0003x<\u0000\u02c3"+
		"\u02bf\u0001\u0000\u0000\u0000\u02c3\u02c0\u0001\u0000\u0000\u0000\u02c3"+
		"\u02c1\u0001\u0000\u0000\u0000\u02c3\u02c2\u0001\u0000\u0000\u0000\u02c4"+
		"\u02c7\u0001\u0000\u0000\u0000\u02c5\u02c3\u0001\u0000\u0000\u0000\u02c5"+
		"\u02c6\u0001\u0000\u0000\u0000\u02c6\u02c8\u0001\u0000\u0000\u0000\u02c7"+
		"\u02c5\u0001\u0000\u0000\u0000\u02c8\u02d0\u0005\u001a\u0000\u0000\u02c9"+
		"\u02ca\u0005\u0085\u0000\u0000\u02ca\u02cb\u0003D\"\u0000\u02cb\u02cd"+
		"\u0005\u0086\u0000\u0000\u02cc\u02ce\u0005\u0084\u0000\u0000\u02cd\u02cc"+
		"\u0001\u0000\u0000\u0000\u02cd\u02ce\u0001\u0000\u0000\u0000\u02ce\u02d1"+
		"\u0001\u0000\u0000\u0000\u02cf\u02d1\u0003*\u0015\u0000\u02d0\u02c9\u0001"+
		"\u0000\u0000\u0000\u02d0\u02cf\u0001\u0000\u0000\u0000\u02d1\u02d2\u0001"+
		"\u0000\u0000\u0000\u02d2\u02d4\u0005\u0088\u0000\u0000\u02d3\u02d5\u0003"+
		"X,\u0000\u02d4\u02d3\u0001\u0000\u0000\u0000\u02d4\u02d5\u0001\u0000\u0000"+
		"\u0000\u02d5S\u0001\u0000\u0000\u0000\u02d6\u02d7\u0005\u0014\u0000\u0000"+
		"\u02d7\u02d8\u0007\b\u0000\u0000\u02d8\u02d9\u0005\u008d\u0000\u0000\u02d9"+
		"\u02da\u0005\u0085\u0000\u0000\u02da\u02db\u0005\u0086\u0000\u0000\u02db"+
		"\u02dc\u0005\t\u0000\u0000\u02dc\u02e2\u0005\u0087\u0000\u0000\u02dd\u02e1"+
		"\u0003\u001a\r\u0000\u02de\u02e1\u0003n7\u0000\u02df\u02e1\u0003Z-\u0000"+
		"\u02e0\u02dd\u0001\u0000\u0000\u0000\u02e0\u02de\u0001\u0000\u0000\u0000"+
		"\u02e0\u02df\u0001\u0000\u0000\u0000\u02e1\u02e4\u0001\u0000\u0000\u0000"+
		"\u02e2\u02e0\u0001\u0000\u0000\u0000\u02e2\u02e3\u0001\u0000\u0000\u0000"+
		"\u02e3\u02e8\u0001\u0000\u0000\u0000\u02e4\u02e2\u0001\u0000\u0000\u0000"+
		"\u02e5\u02e7\u0003\u001c\u000e\u0000\u02e6\u02e5\u0001\u0000\u0000\u0000"+
		"\u02e7\u02ea\u0001\u0000\u0000\u0000\u02e8\u02e6\u0001\u0000\u0000\u0000"+
		"\u02e8\u02e9\u0001\u0000\u0000\u0000\u02e9\u02ec\u0001\u0000\u0000\u0000"+
		"\u02ea\u02e8\u0001\u0000\u0000\u0000\u02eb\u02ed\u0003\"\u0011\u0000\u02ec"+
		"\u02eb\u0001\u0000\u0000\u0000\u02ec\u02ed\u0001\u0000\u0000\u0000\u02ed"+
		"\u02f2\u0001\u0000\u0000\u0000\u02ee\u02f1\u0003p8\u0000\u02ef\u02f1\u0003"+
		"r9\u0000\u02f0\u02ee\u0001\u0000\u0000\u0000\u02f0\u02ef\u0001\u0000\u0000"+
		"\u0000\u02f1\u02f4\u0001\u0000\u0000\u0000\u02f2\u02f0\u0001\u0000\u0000"+
		"\u0000\u02f2\u02f3\u0001\u0000\u0000\u0000\u02f3\u02f5\u0001\u0000\u0000"+
		"\u0000\u02f4\u02f2\u0001\u0000\u0000\u0000\u02f5\u02fd\u0005\u001a\u0000"+
		"\u0000\u02f6\u02f7\u0005\u0085\u0000\u0000\u02f7\u02f8\u0003D\"\u0000"+
		"\u02f8\u02fa\u0005\u0086\u0000\u0000\u02f9\u02fb\u0005\u0084\u0000\u0000"+
		"\u02fa\u02f9\u0001\u0000\u0000\u0000\u02fa\u02fb\u0001\u0000\u0000\u0000"+
		"\u02fb\u02fe\u0001\u0000\u0000\u0000\u02fc\u02fe\u0003*\u0015\u0000\u02fd"+
		"\u02f6\u0001\u0000\u0000\u0000\u02fd\u02fc\u0001\u0000\u0000\u0000\u02fe"+
		"\u02ff\u0001\u0000\u0000\u0000\u02ff\u0301\u0005\u0088\u0000\u0000\u0300"+
		"\u0302\u0003X,\u0000\u0301\u0300\u0001\u0000\u0000\u0000\u0301\u0302\u0001"+
		"\u0000\u0000\u0000\u0302U\u0001\u0000\u0000\u0000\u0303\u0304\u0005\u0019"+
		"\u0000\u0000\u0304\u0305\u0005y\u0000\u0000\u0305\u0309\u0005\u0085\u0000"+
		"\u0000\u0306\u0308\u0005y\u0000\u0000\u0307\u0306\u0001\u0000\u0000\u0000"+
		"\u0308\u030b\u0001\u0000\u0000\u0000\u0309\u0307\u0001\u0000\u0000\u0000"+
		"\u0309\u030a\u0001\u0000\u0000\u0000\u030a\u030c\u0001\u0000\u0000\u0000"+
		"\u030b\u0309\u0001\u0000\u0000\u0000\u030c\u030d\u0005\u0086\u0000\u0000"+
		"\u030d\u0315\u0005\u0087\u0000\u0000\u030e\u0314\u0003V+\u0000\u030f\u0314"+
		"\u0003p8\u0000\u0310\u0314\u0003r9\u0000\u0311\u0314\u0003v;\u0000\u0312"+
		"\u0314\u0003x<\u0000\u0313\u030e\u0001\u0000\u0000\u0000\u0313\u030f\u0001"+
		"\u0000\u0000\u0000\u0313\u0310\u0001\u0000\u0000\u0000\u0313\u0311\u0001"+
		"\u0000\u0000\u0000\u0313\u0312\u0001\u0000\u0000\u0000\u0314\u0317\u0001"+
		"\u0000\u0000\u0000\u0315\u0313\u0001\u0000\u0000\u0000\u0315\u0316\u0001"+
		"\u0000\u0000\u0000\u0316\u031d\u0001\u0000\u0000\u0000\u0317\u0315\u0001"+
		"\u0000\u0000\u0000\u0318\u0319\u0005\u001a\u0000\u0000\u0319\u031a\u0005"+
		"y\u0000\u0000\u031a\u031c\u0005\u0084\u0000\u0000\u031b\u0318\u0001\u0000"+
		"\u0000\u0000\u031c\u031f\u0001\u0000\u0000\u0000\u031d\u031b\u0001\u0000"+
		"\u0000\u0000\u031d\u031e\u0001\u0000\u0000\u0000\u031e\u0320\u0001\u0000"+
		"\u0000\u0000\u031f\u031d\u0001\u0000\u0000\u0000\u0320\u0321\u0005\u0088"+
		"\u0000\u0000\u0321W\u0001\u0000\u0000\u0000\u0322\u0323\u0005\u001b\u0000"+
		"\u0000\u0323\u0324\u0005\u001c\u0000\u0000\u0324\u0325\u0007\b\u0000\u0000"+
		"\u0325\u0326\u0005\u0084\u0000\u0000\u0326Y\u0001\u0000\u0000\u0000\u0327"+
		"\u0328\u0005\u0015\u0000\u0000\u0328\u0329\u0005\u0085\u0000\u0000\u0329"+
		"\u032a\u0003\\.\u0000\u032a\u032b\u0005\u0086\u0000\u0000\u032b\u032c"+
		"\u0005\u0084\u0000\u0000\u032c[\u0001\u0000\u0000\u0000\u032d\u032f\u0005"+
		"y\u0000\u0000\u032e\u032d\u0001\u0000\u0000\u0000\u032f\u0330\u0001\u0000"+
		"\u0000\u0000\u0330\u032e\u0001\u0000\u0000\u0000\u0330\u0331\u0001\u0000"+
		"\u0000\u0000\u0331\u033d\u0001\u0000\u0000\u0000\u0332\u0334\u0005y\u0000"+
		"\u0000\u0333\u0332\u0001\u0000\u0000\u0000\u0334\u0335\u0001\u0000\u0000"+
		"\u0000\u0335\u0333\u0001\u0000\u0000\u0000\u0335\u0336\u0001\u0000\u0000"+
		"\u0000\u0336\u0337\u0001\u0000\u0000\u0000\u0337\u033d\u0003b1\u0000\u0338"+
		"\u033d\u0003^/\u0000\u0339\u033a\u0003^/\u0000\u033a\u033b\u0003b1\u0000"+
		"\u033b\u033d\u0001\u0000\u0000\u0000\u033c\u032e\u0001\u0000\u0000\u0000"+
		"\u033c\u0333\u0001\u0000\u0000\u0000\u033c\u0338\u0001\u0000\u0000\u0000"+
		"\u033c\u0339\u0001\u0000\u0000\u0000\u033d]\u0001\u0000\u0000\u0000\u033e"+
		"\u033f\u0005\u0085\u0000\u0000\u033f\u0340\u0005\u0086\u0000\u0000\u0340"+
		"\u0341\u0005\t\u0000\u0000\u0341\u0345\u0005\u0087\u0000\u0000\u0342\u0344"+
		"\u0003`0\u0000\u0343\u0342\u0001\u0000\u0000\u0000\u0344\u0347\u0001\u0000"+
		"\u0000\u0000\u0345\u0343\u0001\u0000\u0000\u0000\u0345\u0346\u0001\u0000"+
		"\u0000\u0000\u0346\u0348\u0001\u0000\u0000\u0000\u0347\u0345\u0001\u0000"+
		"\u0000\u0000\u0348\u0349\u0005\u0088\u0000\u0000\u0349_\u0001\u0000\u0000"+
		"\u0000\u034a\u0352\u0003v;\u0000\u034b\u0352\u0003|>\u0000\u034c\u0352"+
		"\u0003\u008eG\u0000\u034d\u0352\u0003\u0082A\u0000\u034e\u0352\u0003\u008c"+
		"F\u0000\u034f\u0352\u0003p8\u0000\u0350\u0352\u0003r9\u0000\u0351\u034a"+
		"\u0001\u0000\u0000\u0000\u0351\u034b\u0001\u0000\u0000\u0000\u0351\u034c"+
		"\u0001\u0000\u0000\u0000\u0351\u034d\u0001\u0000\u0000\u0000\u0351\u034e"+
		"\u0001\u0000\u0000\u0000\u0351\u034f\u0001\u0000\u0000\u0000\u0351\u0350"+
		"\u0001\u0000\u0000\u0000\u0352a\u0001\u0000\u0000\u0000\u0353\u0356\u0003"+
		"d2\u0000\u0354\u0356\u0003f3\u0000\u0355\u0353\u0001\u0000\u0000\u0000"+
		"\u0355\u0354\u0001\u0000\u0000\u0000\u0356c\u0001\u0000\u0000\u0000\u0357"+
		"\u0358\u0005\u0090\u0000\u0000\u0358\u0359\u0005\u0089\u0000\u0000\u0359"+
		"\u035a\u0005\u008a\u0000\u0000\u035ae\u0001\u0000\u0000\u0000\u035b\u035c"+
		"\u0005\u0090\u0000\u0000\u035c\u0360\u0005\u0089\u0000\u0000\u035d\u035f"+
		"\u0003h4\u0000\u035e\u035d\u0001\u0000\u0000\u0000\u035f\u0362\u0001\u0000"+
		"\u0000\u0000\u0360\u035e\u0001\u0000\u0000\u0000\u0360\u0361\u0001\u0000"+
		"\u0000\u0000\u0361\u0363\u0001\u0000\u0000\u0000\u0362\u0360\u0001\u0000"+
		"\u0000\u0000\u0363\u0364\u0005\u008a\u0000\u0000\u0364g\u0001\u0000\u0000"+
		"\u0000\u0365\u0368\u0003j5\u0000\u0366\u0368\u0003l6\u0000\u0367\u0365"+
		"\u0001\u0000\u0000\u0000\u0367\u0366\u0001\u0000\u0000\u0000\u0368i\u0001"+
		"\u0000\u0000\u0000\u0369\u036c\u0005y\u0000\u0000\u036a\u036c\u0003\u0016"+
		"\u000b\u0000\u036b\u0369\u0001\u0000\u0000\u0000\u036b\u036a\u0001\u0000"+
		"\u0000\u0000\u036ck\u0001\u0000\u0000\u0000\u036d\u0371\u0005y\u0000\u0000"+
		"\u036e\u0370\u0005\u0090\u0000\u0000\u036f\u036e\u0001\u0000\u0000\u0000"+
		"\u0370\u0373\u0001\u0000\u0000\u0000\u0371\u036f\u0001\u0000\u0000\u0000"+
		"\u0371\u0372\u0001\u0000\u0000\u0000\u0372m\u0001\u0000\u0000\u0000\u0373"+
		"\u0371\u0001\u0000\u0000\u0000\u0374\u0375\u0005\u0014\u0000\u0000\u0375"+
		"\u0376\u0005|\u0000\u0000\u0376\u0377\u0005\u008d\u0000\u0000\u0377\u0378"+
		"\u0005\u0016\u0000\u0000\u0378\u0379\u0005\u0085\u0000\u0000\u0379\u037a"+
		"\u0007\t\u0000\u0000\u037a\u037b\u0005\u0086\u0000\u0000\u037b\u037c\u0005"+
		"\u0084\u0000\u0000\u037co\u0001\u0000\u0000\u0000\u037d\u037e\u0007\n"+
		"\u0000\u0000\u037e\u0380\u0005y\u0000\u0000\u037f\u0381\u0005\u008d\u0000"+
		"\u0000\u0380\u037f\u0001\u0000\u0000\u0000\u0380\u0381\u0001\u0000\u0000"+
		"\u0000\u0381\u0383\u0001\u0000\u0000\u0000\u0382\u0384\u0003\u0014\n\u0000"+
		"\u0383\u0382\u0001\u0000\u0000\u0000\u0383\u0384\u0001\u0000\u0000\u0000"+
		"\u0384\u0385\u0001\u0000\u0000\u0000\u0385\u0386\u0005\u0084\u0000\u0000"+
		"\u0386q\u0001\u0000\u0000\u0000\u0387\u0388\u0005\u0014\u0000\u0000\u0388"+
		"\u0389\u0005y\u0000\u0000\u0389\u038a\u0005\u008d\u0000\u0000\u038a\u038b"+
		"\u0003\u0014\n\u0000\u038b\u038c\u0005\u0084\u0000\u0000\u038cs\u0001"+
		"\u0000\u0000\u0000\u038d\u0391\u0005z\u0000\u0000\u038e\u0391\u0005y\u0000"+
		"\u0000\u038f\u0391\u0003v;\u0000\u0390\u038d\u0001\u0000\u0000\u0000\u0390"+
		"\u038e\u0001\u0000\u0000\u0000\u0390\u038f\u0001\u0000\u0000\u0000\u0391"+
		"u\u0001\u0000\u0000\u0000\u0392\u0393\u0005(\u0000\u0000\u0393\u0394\u0005"+
		"\u0085\u0000\u0000\u0394\u0395\u0003t:\u0000\u0395\u0396\u0005\u0086\u0000"+
		"\u0000\u0396\u0397\u0005\u0084\u0000\u0000\u0397w\u0001\u0000\u0000\u0000"+
		"\u0398\u0399\u0005y\u0000\u0000\u0399\u039a\u0005\u008d\u0000\u0000\u039a"+
		"\u039b\u0003\u0014\n\u0000\u039b\u039c\u0005\u0084\u0000\u0000\u039cy"+
		"\u0001\u0000\u0000\u0000\u039d\u03a2\u0003\u008eG\u0000\u039e\u03a2\u0003"+
		"|>\u0000\u039f\u03a2\u0003\u0082A\u0000\u03a0\u03a2\u0003\u008cF\u0000"+
		"\u03a1\u039d\u0001\u0000\u0000\u0000\u03a1\u039e\u0001\u0000\u0000\u0000"+
		"\u03a1\u039f\u0001\u0000\u0000\u0000\u03a1\u03a0\u0001\u0000\u0000\u0000"+
		"\u03a2{\u0001\u0000\u0000\u0000\u03a3\u03a4\u00056\u0000\u0000\u03a4\u03a5"+
		"\u0003~?\u0000\u03a5\u03a6\u0003\u0080@\u0000\u03a6}\u0001\u0000\u0000"+
		"\u0000\u03a7\u03aa\u0005\u0085\u0000\u0000\u03a8\u03ab\u0003p8\u0000\u03a9"+
		"\u03ab\u0003r9\u0000\u03aa\u03a8\u0001\u0000\u0000\u0000\u03aa\u03a9\u0001"+
		"\u0000\u0000\u0000\u03ab\u03ac\u0001\u0000\u0000\u0000\u03ac\u03ad\u0005"+
		"y\u0000\u0000\u03ad\u03ae\u0007\u000b\u0000\u0000\u03ae\u03af\u0007\f"+
		"\u0000\u0000\u03af\u03b0\u0005\u0084\u0000\u0000\u03b0\u03b1\u0005y\u0000"+
		"\u0000\u03b1\u03b2\u0007\r\u0000\u0000\u03b2\u03b3\u0005\u0086\u0000\u0000"+
		"\u03b3\u007f\u0001\u0000\u0000\u0000\u03b4\u03b7\u0005\u0087\u0000\u0000"+
		"\u03b5\u03b8\u0005y\u0000\u0000\u03b6\u03b8\u0003t:\u0000\u03b7\u03b5"+
		"\u0001\u0000\u0000\u0000\u03b7\u03b6\u0001\u0000\u0000\u0000\u03b8\u03b9"+
		"\u0001\u0000\u0000\u0000\u03b9\u03ba\u0005\u0088\u0000\u0000\u03ba\u0081"+
		"\u0001\u0000\u0000\u0000\u03bb\u03bc\u00057\u0000\u0000\u03bc\u03bd\u0003"+
		"\u0084B\u0000\u03bd\u03be\u0003\u0088D\u0000\u03be\u0083\u0001\u0000\u0000"+
		"\u0000\u03bf\u03c0\u0005\u0085\u0000\u0000\u03c0\u03c1\u0003\u0086C\u0000"+
		"\u03c1\u03c5\u0005\u0086\u0000\u0000\u03c2\u03c4\u0005\u0084\u0000\u0000"+
		"\u03c3\u03c2\u0001\u0000\u0000\u0000\u03c4\u03c7\u0001\u0000\u0000\u0000"+
		"\u03c5\u03c3\u0001\u0000\u0000\u0000\u03c5\u03c6\u0001\u0000\u0000\u0000"+
		"\u03c6\u0085\u0001\u0000\u0000\u0000\u03c7\u03c5\u0001\u0000\u0000\u0000"+
		"\u03c8\u03ca\u0005y\u0000\u0000\u03c9\u03c8\u0001\u0000\u0000\u0000\u03ca"+
		"\u03cd\u0001\u0000\u0000\u0000\u03cb\u03c9\u0001\u0000\u0000\u0000\u03cb"+
		"\u03cc\u0001\u0000\u0000\u0000\u03cc\u03ce\u0001\u0000\u0000\u0000\u03cd"+
		"\u03cb\u0001\u0000\u0000\u0000\u03ce\u03d2\u0007\u000e\u0000\u0000\u03cf"+
		"\u03d1\u0005~\u0000\u0000\u03d0\u03cf\u0001\u0000\u0000\u0000\u03d1\u03d4"+
		"\u0001\u0000\u0000\u0000\u03d2\u03d0\u0001\u0000\u0000\u0000\u03d2\u03d3"+
		"\u0001\u0000\u0000\u0000\u03d3\u03e5\u0001\u0000\u0000\u0000\u03d4\u03d2"+
		"\u0001\u0000\u0000\u0000\u03d5\u03e5\u0005y\u0000\u0000\u03d6\u03d8\u0005"+
		"\u0098\u0000\u0000\u03d7\u03d6\u0001\u0000\u0000\u0000\u03d8\u03db\u0001"+
		"\u0000\u0000\u0000\u03d9\u03d7\u0001\u0000\u0000\u0000\u03d9\u03da\u0001"+
		"\u0000\u0000\u0000\u03da\u03dc\u0001\u0000\u0000\u0000\u03db\u03d9\u0001"+
		"\u0000\u0000\u0000\u03dc\u03e5\u0005<\u0000\u0000\u03dd\u03df\u0005\u0098"+
		"\u0000\u0000\u03de\u03dd\u0001\u0000\u0000\u0000\u03df\u03e2\u0001\u0000"+
		"\u0000\u0000\u03e0\u03de\u0001\u0000\u0000\u0000\u03e0\u03e1\u0001\u0000"+
		"\u0000\u0000\u03e1\u03e3\u0001\u0000\u0000\u0000\u03e2\u03e0\u0001\u0000"+
		"\u0000\u0000\u03e3\u03e5\u0005=\u0000\u0000\u03e4\u03cb\u0001\u0000\u0000"+
		"\u0000\u03e4\u03d5\u0001\u0000\u0000\u0000\u03e4\u03d9\u0001\u0000\u0000"+
		"\u0000\u03e4\u03e0\u0001\u0000\u0000\u0000\u03e5\u0087\u0001\u0000\u0000"+
		"\u0000\u03e6\u03e9\u0005\u0087\u0000\u0000\u03e7\u03ea\u0005y\u0000\u0000"+
		"\u03e8\u03ea\u0003t:\u0000\u03e9\u03e7\u0001\u0000\u0000\u0000\u03e9\u03e8"+
		"\u0001\u0000\u0000\u0000\u03ea\u03ee\u0001\u0000\u0000\u0000\u03eb\u03ed"+
		"\u0003\u008aE\u0000\u03ec\u03eb\u0001\u0000\u0000\u0000\u03ed\u03f0\u0001"+
		"\u0000\u0000\u0000\u03ee\u03ec\u0001\u0000\u0000\u0000\u03ee\u03ef\u0001"+
		"\u0000\u0000\u0000\u03ef\u03f1\u0001\u0000\u0000\u0000\u03f0\u03ee\u0001"+
		"\u0000\u0000\u0000\u03f1\u03f2\u0005\u0088\u0000\u0000\u03f2\u0089\u0001"+
		"\u0000\u0000\u0000\u03f3\u03f4\u0005y\u0000\u0000\u03f4\u03f5\u0007\r"+
		"\u0000\u0000\u03f5\u03f6\u0005\u0084\u0000\u0000\u03f6\u008b\u0001\u0000"+
		"\u0000\u0000\u03f7\u03f8\u00058\u0000\u0000\u03f8\u03f9\u0003\u0088D\u0000"+
		"\u03f9\u03fa\u00057\u0000\u0000\u03fa\u03fb\u0003\u0084B\u0000\u03fb\u008d"+
		"\u0001\u0000\u0000\u0000\u03fc\u03fd\u00059\u0000\u0000\u03fd\u03fe\u0003"+
		"\u0090H\u0000\u03fe\u0402\u0003\u0092I\u0000\u03ff\u0401\u0003\u0094J"+
		"\u0000\u0400\u03ff\u0001\u0000\u0000\u0000\u0401\u0404\u0001\u0000\u0000"+
		"\u0000\u0402\u0400\u0001\u0000\u0000\u0000\u0402\u0403\u0001\u0000\u0000"+
		"\u0000\u0403\u0408\u0001\u0000\u0000\u0000\u0404\u0402\u0001\u0000\u0000"+
		"\u0000\u0405\u0407\u0003\u0096K\u0000\u0406\u0405\u0001\u0000\u0000\u0000"+
		"\u0407\u040a\u0001\u0000\u0000\u0000\u0408\u0406\u0001\u0000\u0000\u0000"+
		"\u0408\u0409\u0001\u0000\u0000\u0000\u0409\u008f\u0001\u0000\u0000\u0000"+
		"\u040a\u0408\u0001\u0000\u0000\u0000\u040b\u040f\u0005\u0085\u0000\u0000"+
		"\u040c\u040e\u0007\f\u0000\u0000\u040d\u040c\u0001\u0000\u0000\u0000\u040e"+
		"\u0411\u0001\u0000\u0000\u0000\u040f\u040d\u0001\u0000\u0000\u0000\u040f"+
		"\u0410\u0001\u0000\u0000\u0000\u0410\u0412\u0001\u0000\u0000\u0000\u0411"+
		"\u040f\u0001\u0000\u0000\u0000\u0412\u0416\u0007\u000f\u0000\u0000\u0413"+
		"\u0415\u0007\f\u0000\u0000\u0414\u0413\u0001\u0000\u0000\u0000\u0415\u0418"+
		"\u0001\u0000\u0000\u0000\u0416\u0414\u0001\u0000\u0000\u0000\u0416\u0417"+
		"\u0001\u0000\u0000\u0000\u0417\u0419\u0001\u0000\u0000\u0000\u0418\u0416"+
		"\u0001\u0000\u0000\u0000\u0419\u041a\u0005\u0086\u0000\u0000\u041a\u0091"+
		"\u0001\u0000\u0000\u0000\u041b\u041e\u0005\u0087\u0000\u0000\u041c\u041f"+
		"\u0005y\u0000\u0000\u041d\u041f\u0003t:\u0000\u041e\u041c\u0001\u0000"+
		"\u0000\u0000\u041e\u041d\u0001\u0000\u0000\u0000\u041f\u0420\u0001\u0000"+
		"\u0000\u0000\u0420\u0421\u0005\u0088\u0000\u0000\u0421\u0093\u0001\u0000"+
		"\u0000\u0000\u0422\u0423\u0005:\u0000\u0000\u0423\u0424\u0003\u0090H\u0000"+
		"\u0424\u0425\u0003\u0092I\u0000\u0425\u0095\u0001\u0000\u0000\u0000\u0426"+
		"\u0427\u0005;\u0000\u0000\u0427\u0428\u0003\u0092I\u0000\u0428\u0097\u0001"+
		"\u0000\u0000\u0000\u0429\u042a\u0005d\u0000\u0000\u042a\u042c\u0005\u008f"+
		"\u0000\u0000\u042b\u042d\u0005~\u0000\u0000\u042c\u042b\u0001\u0000\u0000"+
		"\u0000\u042d\u042e\u0001\u0000\u0000\u0000\u042e\u042c\u0001\u0000\u0000"+
		"\u0000\u042e\u042f\u0001\u0000\u0000\u0000\u042f\u0430\u0001\u0000\u0000"+
		"\u0000\u0430\u0431\u0005g\u0000\u0000\u0431\u0432\u0005\u0084\u0000\u0000"+
		"\u0432\u0099\u0001\u0000\u0000\u0000\u0433\u0434\u0005e\u0000\u0000\u0434"+
		"\u0436\u0005\u008f\u0000\u0000\u0435\u0437\u0005~\u0000\u0000\u0436\u0435"+
		"\u0001\u0000\u0000\u0000\u0437\u0438\u0001\u0000\u0000\u0000\u0438\u0436"+
		"\u0001\u0000\u0000\u0000\u0438\u0439\u0001\u0000\u0000\u0000\u0439\u043a"+
		"\u0001\u0000\u0000\u0000\u043a\u043b\u0005g\u0000\u0000\u043b\u043c\u0005"+
		"\u0084\u0000\u0000\u043c\u009b\u0001\u0000\u0000\u0000\u043d\u043e\u0005"+
		"f\u0000\u0000\u043e\u0440\u0005\u008f\u0000\u0000\u043f\u0441\u0005~\u0000"+
		"\u0000\u0440\u043f\u0001\u0000\u0000\u0000\u0441\u0442\u0001\u0000\u0000"+
		"\u0000\u0442\u0440\u0001\u0000\u0000\u0000\u0442\u0443\u0001\u0000\u0000"+
		"\u0000\u0443\u0444\u0001\u0000\u0000\u0000\u0444\u0445\u0005g\u0000\u0000"+
		"\u0445\u0446\u0005\u0084\u0000\u0000\u0446\u009d\u0001\u0000\u0000\u0000"+
		"\u0447\u044b\u0003\u0098L\u0000\u0448\u044b\u0003\u009aM\u0000\u0449\u044b"+
		"\u0003\u009cN\u0000\u044a\u0447\u0001\u0000\u0000\u0000\u044a\u0448\u0001"+
		"\u0000\u0000\u0000\u044a\u0449\u0001\u0000\u0000\u0000\u044b\u009f\u0001"+
		"\u0000\u0000\u0000\u044c\u044d\u0005i\u0000\u0000\u044d\u044e\u0005\u008f"+
		"\u0000\u0000\u044e\u044f\u0005h\u0000\u0000\u044f\u0450\u0005\u0084\u0000"+
		"\u0000\u0450\u00a1\u0001\u0000\u0000\u0000\u0451\u0452\u0005`\u0000\u0000"+
		"\u0452\u0453\u0005\u008f\u0000\u0000\u0453\u0454\u0005b\u0000\u0000\u0454"+
		"\u0455\u0005\u0084\u0000\u0000\u0455\u00a3\u0001\u0000\u0000\u0000\u0456"+
		"\u0457\u0005a\u0000\u0000\u0457\u0458\u0005\u008f\u0000\u0000\u0458\u0459"+
		"\u0005c\u0000\u0000\u0459\u045a\u0005\u0084\u0000\u0000\u045a\u00a5\u0001"+
		"\u0000\u0000\u0000\u045b\u045f\u0003\u00a2Q\u0000\u045c\u045f\u0003\u00a4"+
		"R\u0000\u045d\u045f\u0003\u00a0P\u0000\u045e\u045b\u0001\u0000\u0000\u0000"+
		"\u045e\u045c\u0001\u0000\u0000\u0000\u045e\u045d\u0001\u0000\u0000\u0000"+
		"\u045f\u00a7\u0001\u0000\u0000\u0000\u0460\u0461\u0005\n\u0000\u0000\u0461"+
		"\u0462\u0007\u0010\u0000\u0000\u0462\u0466\u0005\u0087\u0000\u0000\u0463"+
		"\u0465\u0003\u00a6S\u0000\u0464\u0463\u0001\u0000\u0000\u0000\u0465\u0468"+
		"\u0001\u0000\u0000\u0000\u0466\u0464\u0001\u0000\u0000\u0000\u0466\u0467"+
		"\u0001\u0000\u0000\u0000\u0467\u0469\u0001\u0000\u0000\u0000\u0468\u0466"+
		"\u0001\u0000\u0000\u0000\u0469\u046a\u0005\u0088\u0000\u0000\u046a\u00a9"+
		"\u0001\u0000\u0000\u0000\u046b\u046c\u0005\n\u0000\u0000\u046c\u046d\u0007"+
		"\u0010\u0000\u0000\u046d\u046e\u00051\u0000\u0000\u046e\u0472\u0005\u0087"+
		"\u0000\u0000\u046f\u0471\u0003\u009eO\u0000\u0470\u046f\u0001\u0000\u0000"+
		"\u0000\u0471\u0474\u0001\u0000\u0000\u0000\u0472\u0470\u0001\u0000\u0000"+
		"\u0000\u0472\u0473\u0001\u0000\u0000\u0000\u0473\u0475\u0001\u0000\u0000"+
		"\u0000\u0474\u0472\u0001\u0000\u0000\u0000\u0475\u0476\u0005\u0088\u0000"+
		"\u0000\u0476\u00ab\u0001\u0000\u0000\u0000\u0477\u0479\u0003\u00a8T\u0000"+
		"\u0478\u0477\u0001\u0000\u0000\u0000\u0479\u047a\u0001\u0000\u0000\u0000"+
		"\u047a\u0478\u0001\u0000\u0000\u0000\u047a\u047b\u0001\u0000\u0000\u0000"+
		"\u047b\u0482\u0001\u0000\u0000\u0000\u047c\u047e\u0003\u00aaU\u0000\u047d"+
		"\u047c\u0001\u0000\u0000\u0000\u047e\u047f\u0001\u0000\u0000\u0000\u047f"+
		"\u047d\u0001\u0000\u0000\u0000\u047f\u0480\u0001\u0000\u0000\u0000\u0480"+
		"\u0482\u0001\u0000\u0000\u0000\u0481\u0478\u0001\u0000\u0000\u0000\u0481"+
		"\u047d\u0001\u0000\u0000\u0000\u0482\u00ad\u0001\u0000\u0000\u0000\u0483"+
		"\u0484\u0005v\u0000\u0000\u0484\u0485\u0005w\u0000\u0000\u0485\u0486\u0005"+
		"x\u0000\u0000\u0486\u00af\u0001\u0000\u0000\u0000\u0487\u0488\u0005j\u0000"+
		"\u0000\u0488\u0489\u0005k\u0000\u0000\u0489\u048a\u0005l\u0000\u0000\u048a"+
		"\u0490\u0005m\u0000\u0000\u048b\u048c\u0005n\u0000\u0000\u048c\u048d\u0005"+
		"o\u0000\u0000\u048d\u048e\u0005p\u0000\u0000\u048e\u048f\u0005q\u0000"+
		"\u0000\u048f\u0491\u0005s\u0000\u0000\u0490\u048b\u0001\u0000\u0000\u0000"+
		"\u0490\u0491\u0001\u0000\u0000\u0000\u0491\u0492\u0001\u0000\u0000\u0000"+
		"\u0492\u0493\u0005t\u0000\u0000\u0493\u0494\u0003\u00aeW\u0000\u0494\u0495"+
		"\u0005u\u0000\u0000\u0495\u0496\u0005r\u0000\u0000\u0496\u00b1\u0001\u0000"+
		"\u0000\u0000\u0497\u0498\u0005\u008b\u0000\u0000\u0498\u0499\u0005\u0004"+
		"\u0000\u0000\u0499\u049a\u0005\r\u0000\u0000\u049a\u049b\u0005\u008c\u0000"+
		"\u0000\u049b\u00b3\u0001\u0000\u0000\u0000\u049c\u049d\u0005$\u0000\u0000"+
		"\u049d\u049e\u0005\u0085\u0000\u0000\u049e\u049f\u0005%\u0000\u0000\u049f"+
		"\u04a0\u0005\u0085\u0000\u0000\u04a0\u04a1\u0005\b\u0000\u0000\u04a1\u04a2"+
		"\u0005\u0086\u0000\u0000\u04a2\u04a3\u0005\u0086\u0000\u0000\u04a3\u04a4"+
		"\u0005\n\u0000\u0000\u04a4\u04a5\u0005\u0005\u0000\u0000\u04a5\u04a6\u0005"+
		"\u0085\u0000\u0000\u04a6\u04a7\u0005\u008b\u0000\u0000\u04a7\u04a8\u0005"+
		"&\u0000\u0000\u04a8\u04a9\u0005\u008c\u0000\u0000\u04a9\u04aa\u0003\u00b2"+
		"Y\u0000\u04aa\u04ab\u0005\u008b\u0000\u0000\u04ab\u04ac\u0005\r\u0000"+
		"\u0000\u04ac\u04ad\u0005&\u0000\u0000\u04ad\u04ae\u0005\u008c\u0000\u0000"+
		"\u04ae\u04af\u0005\u0090\u0000\u0000\u04af\u04b0\u0005\u0086\u0000\u0000"+
		"\u04b0\u00b5\u0001\u0000\u0000\u0000\u04b1\u04b2\u0003\u00b8\\\u0000\u04b2"+
		"\u00b7\u0001\u0000\u0000\u0000\u04b3\u04b8\u0003\u00ba]\u0000\u04b4\u04b5"+
		"\u0005\u00a7\u0000\u0000\u04b5\u04b7\u0003\u00ba]\u0000\u04b6\u04b4\u0001"+
		"\u0000\u0000\u0000\u04b7\u04ba\u0001\u0000\u0000\u0000\u04b8\u04b6\u0001"+
		"\u0000\u0000\u0000\u04b8\u04b9\u0001\u0000\u0000\u0000\u04b9\u00b9\u0001"+
		"\u0000\u0000\u0000\u04ba\u04b8\u0001\u0000\u0000\u0000\u04bb\u04c0\u0003"+
		"\u00bc^\u0000\u04bc\u04bd\u0005\u00a6\u0000\u0000\u04bd\u04bf\u0003\u00bc"+
		"^\u0000\u04be\u04bc\u0001\u0000\u0000\u0000\u04bf\u04c2\u0001\u0000\u0000"+
		"\u0000\u04c0\u04be\u0001\u0000\u0000\u0000\u04c0\u04c1\u0001\u0000\u0000"+
		"\u0000\u04c1\u00bb\u0001\u0000\u0000\u0000\u04c2\u04c0\u0001\u0000\u0000"+
		"\u0000\u04c3\u04c8\u0003\u00be_\u0000\u04c4\u04c5\u0007\u0011\u0000\u0000"+
		"\u04c5\u04c7\u0003\u00be_\u0000\u04c6\u04c4\u0001\u0000\u0000\u0000\u04c7"+
		"\u04ca\u0001\u0000\u0000\u0000\u04c8\u04c6\u0001\u0000\u0000\u0000\u04c8"+
		"\u04c9\u0001\u0000\u0000\u0000\u04c9\u00bd\u0001\u0000\u0000\u0000\u04ca"+
		"\u04c8\u0001\u0000\u0000\u0000\u04cb\u04d0\u0003\u00c0`\u0000\u04cc\u04cd"+
		"\u0007\u000b\u0000\u0000\u04cd\u04cf\u0003\u00c0`\u0000\u04ce\u04cc\u0001"+
		"\u0000\u0000\u0000\u04cf\u04d2\u0001\u0000\u0000\u0000\u04d0\u04ce\u0001"+
		"\u0000\u0000\u0000\u04d0\u04d1\u0001\u0000\u0000\u0000\u04d1\u00bf\u0001"+
		"\u0000\u0000\u0000\u04d2\u04d0\u0001\u0000\u0000\u0000\u04d3\u04d8\u0003"+
		"\u00c2a\u0000\u04d4\u04d5\u0007\u0012\u0000\u0000\u04d5\u04d7\u0003\u00c2"+
		"a\u0000\u04d6\u04d4\u0001\u0000\u0000\u0000\u04d7\u04da\u0001\u0000\u0000"+
		"\u0000\u04d8\u04d6\u0001\u0000\u0000\u0000\u04d8\u04d9\u0001\u0000\u0000"+
		"\u0000\u04d9\u00c1\u0001\u0000\u0000\u0000\u04da\u04d8\u0001\u0000\u0000"+
		"\u0000\u04db\u04e0\u0003\u00c4b\u0000\u04dc\u04dd\u0007\u0013\u0000\u0000"+
		"\u04dd\u04df\u0003\u00c4b\u0000\u04de\u04dc\u0001\u0000\u0000\u0000\u04df"+
		"\u04e2\u0001\u0000\u0000\u0000\u04e0\u04de\u0001\u0000\u0000\u0000\u04e0"+
		"\u04e1\u0001\u0000\u0000\u0000\u04e1\u00c3\u0001\u0000\u0000\u0000\u04e2"+
		"\u04e0\u0001\u0000\u0000\u0000\u04e3\u04e4\u0007\u0014\u0000\u0000\u04e4"+
		"\u04e7\u0003\u00c4b\u0000\u04e5\u04e7\u0003\u00c6c\u0000\u04e6\u04e3\u0001"+
		"\u0000\u0000\u0000\u04e6\u04e5\u0001\u0000\u0000\u0000\u04e7\u00c5\u0001"+
		"\u0000\u0000\u0000\u04e8\u04e9\u0005\u0085\u0000\u0000\u04e9\u04ea\u0003"+
		"\u00b6[\u0000\u04ea\u04eb\u0005\u0086\u0000\u0000\u04eb\u04ef\u0001\u0000"+
		"\u0000\u0000\u04ec\u04ef\u0005y\u0000\u0000\u04ed\u04ef\u0005~\u0000\u0000"+
		"\u04ee\u04e8\u0001\u0000\u0000\u0000\u04ee\u04ec\u0001\u0000\u0000\u0000"+
		"\u04ee\u04ed\u0001\u0000\u0000\u0000\u04ef\u00c7\u0001\u0000\u0000\u0000"+
		"q\u00cb\u00e9\u00f8\u00fd\u0100\u0106\u010e\u0115\u011c\u0123\u0126\u0137"+
		"\u013c\u0142\u0145\u014f\u0153\u0161\u0164\u0172\u017d\u0187\u018f\u0199"+
		"\u01a3\u01b7\u01c3\u01d3\u01d7\u01da\u01df\u01e7\u01ee\u01f1\u01fb\u0222"+
		"\u0227\u022d\u0230\u0267\u0274\u028a\u028e\u02b1\u02b3\u02b9\u02bd\u02c3"+
		"\u02c5\u02cd\u02d0\u02d4\u02e0\u02e2\u02e8\u02ec\u02f0\u02f2\u02fa\u02fd"+
		"\u0301\u0309\u0313\u0315\u031d\u0330\u0335\u033c\u0345\u0351\u0355\u0360"+
		"\u0367\u036b\u0371\u0380\u0383\u0390\u03a1\u03aa\u03b7\u03c5\u03cb\u03d2"+
		"\u03d9\u03e0\u03e4\u03e9\u03ee\u0402\u0408\u040f\u0416\u041e\u042e\u0438"+
		"\u0442\u044a\u045e\u0466\u0472\u047a\u047f\u0481\u0490\u04b8\u04c0\u04c8"+
		"\u04d0\u04d8\u04e0\u04e6\u04ee";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}