// Generated from C:/Users/Lenovo/Desktop/ReactProject66/ReactProject74/src/antlr/ReactParser.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ReactParser}.
 */
public interface ReactParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ReactParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ReactParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ReactParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ReactParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ReactParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#importFromPath}.
	 * @param ctx the parse tree
	 */
	void enterImportFromPath(ReactParser.ImportFromPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#importFromPath}.
	 * @param ctx the parse tree
	 */
	void exitImportFromPath(ReactParser.ImportFromPathContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#importPackage}.
	 * @param ctx the parse tree
	 */
	void enterImportPackage(ReactParser.ImportPackageContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#importPackage}.
	 * @param ctx the parse tree
	 */
	void exitImportPackage(ReactParser.ImportPackageContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#importhooks}.
	 * @param ctx the parse tree
	 */
	void enterImporthooks(ReactParser.ImporthooksContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#importhooks}.
	 * @param ctx the parse tree
	 */
	void exitImporthooks(ReactParser.ImporthooksContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#hooks}.
	 * @param ctx the parse tree
	 */
	void enterHooks(ReactParser.HooksContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#hooks}.
	 * @param ctx the parse tree
	 */
	void exitHooks(ReactParser.HooksContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(ReactParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(ReactParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstDeclaration(ReactParser.ConstDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstDeclaration(ReactParser.ConstDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteral(ReactParser.ArrayLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteral(ReactParser.ArrayLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void enterObjectLiteral(ReactParser.ObjectLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#objectLiteral}.
	 * @param ctx the parse tree
	 */
	void exitObjectLiteral(ReactParser.ObjectLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(ReactParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(ReactParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#arrayElement}.
	 * @param ctx the parse tree
	 */
	void enterArrayElement(ReactParser.ArrayElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#arrayElement}.
	 * @param ctx the parse tree
	 */
	void exitArrayElement(ReactParser.ArrayElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(ReactParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(ReactParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#usestate}.
	 * @param ctx the parse tree
	 */
	void enterUsestate(ReactParser.UsestateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#usestate}.
	 * @param ctx the parse tree
	 */
	void exitUsestate(ReactParser.UsestateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#arrowclick}.
	 * @param ctx the parse tree
	 */
	void enterArrowclick(ReactParser.ArrowclickContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#arrowclick}.
	 * @param ctx the parse tree
	 */
	void exitArrowclick(ReactParser.ArrowclickContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(ReactParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(ReactParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#elementProperties}.
	 * @param ctx the parse tree
	 */
	void enterElementProperties(ReactParser.ElementPropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#elementProperties}.
	 * @param ctx the parse tree
	 */
	void exitElementProperties(ReactParser.ElementPropertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#imageElements}.
	 * @param ctx the parse tree
	 */
	void enterImageElements(ReactParser.ImageElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#imageElements}.
	 * @param ctx the parse tree
	 */
	void exitImageElements(ReactParser.ImageElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#elementSecond}.
	 * @param ctx the parse tree
	 */
	void enterElementSecond(ReactParser.ElementSecondContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#elementSecond}.
	 * @param ctx the parse tree
	 */
	void exitElementSecond(ReactParser.ElementSecondContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#elementThird}.
	 * @param ctx the parse tree
	 */
	void enterElementThird(ReactParser.ElementThirdContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#elementThird}.
	 * @param ctx the parse tree
	 */
	void exitElementThird(ReactParser.ElementThirdContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#createImageElements}.
	 * @param ctx the parse tree
	 */
	void enterCreateImageElements(ReactParser.CreateImageElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#createImageElements}.
	 * @param ctx the parse tree
	 */
	void exitCreateImageElements(ReactParser.CreateImageElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#returnImageElements}.
	 * @param ctx the parse tree
	 */
	void enterReturnImageElements(ReactParser.ReturnImageElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#returnImageElements}.
	 * @param ctx the parse tree
	 */
	void exitReturnImageElements(ReactParser.ReturnImageElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#key}.
	 * @param ctx the parse tree
	 */
	void enterKey(ReactParser.KeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#key}.
	 * @param ctx the parse tree
	 */
	void exitKey(ReactParser.KeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#src}.
	 * @param ctx the parse tree
	 */
	void enterSrc(ReactParser.SrcContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#src}.
	 * @param ctx the parse tree
	 */
	void exitSrc(ReactParser.SrcContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#alt}.
	 * @param ctx the parse tree
	 */
	void enterAlt(ReactParser.AltContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#alt}.
	 * @param ctx the parse tree
	 */
	void exitAlt(ReactParser.AltContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#onClick}.
	 * @param ctx the parse tree
	 */
	void enterOnClick(ReactParser.OnClickContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#onClick}.
	 * @param ctx the parse tree
	 */
	void exitOnClick(ReactParser.OnClickContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#image}.
	 * @param ctx the parse tree
	 */
	void enterImage(ReactParser.ImageContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#image}.
	 * @param ctx the parse tree
	 */
	void exitImage(ReactParser.ImageContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#imageProperty}.
	 * @param ctx the parse tree
	 */
	void enterImageProperty(ReactParser.ImagePropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#imageProperty}.
	 * @param ctx the parse tree
	 */
	void exitImageProperty(ReactParser.ImagePropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#title}.
	 * @param ctx the parse tree
	 */
	void enterTitle(ReactParser.TitleContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#title}.
	 * @param ctx the parse tree
	 */
	void exitTitle(ReactParser.TitleContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#heading}.
	 * @param ctx the parse tree
	 */
	void enterHeading(ReactParser.HeadingContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#heading}.
	 * @param ctx the parse tree
	 */
	void exitHeading(ReactParser.HeadingContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#description}.
	 * @param ctx the parse tree
	 */
	void enterDescription(ReactParser.DescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#description}.
	 * @param ctx the parse tree
	 */
	void exitDescription(ReactParser.DescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#paragraph}.
	 * @param ctx the parse tree
	 */
	void enterParagraph(ReactParser.ParagraphContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#paragraph}.
	 * @param ctx the parse tree
	 */
	void exitParagraph(ReactParser.ParagraphContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#ll}.
	 * @param ctx the parse tree
	 */
	void enterLl(ReactParser.LlContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#ll}.
	 * @param ctx the parse tree
	 */
	void exitLl(ReactParser.LlContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#container}.
	 * @param ctx the parse tree
	 */
	void enterContainer(ReactParser.ContainerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#container}.
	 * @param ctx the parse tree
	 */
	void exitContainer(ReactParser.ContainerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#div}.
	 * @param ctx the parse tree
	 */
	void enterDiv(ReactParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#div}.
	 * @param ctx the parse tree
	 */
	void exitDiv(ReactParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#divBody}.
	 * @param ctx the parse tree
	 */
	void enterDivBody(ReactParser.DivBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#divBody}.
	 * @param ctx the parse tree
	 */
	void exitDivBody(ReactParser.DivBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#props}.
	 * @param ctx the parse tree
	 */
	void enterProps(ReactParser.PropsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#props}.
	 * @param ctx the parse tree
	 */
	void exitProps(ReactParser.PropsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#propsReturn}.
	 * @param ctx the parse tree
	 */
	void enterPropsReturn(ReactParser.PropsReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#propsReturn}.
	 * @param ctx the parse tree
	 */
	void exitPropsReturn(ReactParser.PropsReturnContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#propsElements}.
	 * @param ctx the parse tree
	 */
	void enterPropsElements(ReactParser.PropsElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#propsElements}.
	 * @param ctx the parse tree
	 */
	void exitPropsElements(ReactParser.PropsElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#propsBody}.
	 * @param ctx the parse tree
	 */
	void enterPropsBody(ReactParser.PropsBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#propsBody}.
	 * @param ctx the parse tree
	 */
	void exitPropsBody(ReactParser.PropsBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#propsFunction}.
	 * @param ctx the parse tree
	 */
	void enterPropsFunction(ReactParser.PropsFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#propsFunction}.
	 * @param ctx the parse tree
	 */
	void exitPropsFunction(ReactParser.PropsFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(ReactParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(ReactParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#functionArrow}.
	 * @param ctx the parse tree
	 */
	void enterFunctionArrow(ReactParser.FunctionArrowContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#functionArrow}.
	 * @param ctx the parse tree
	 */
	void exitFunctionArrow(ReactParser.FunctionArrowContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#functionReturnValue}.
	 * @param ctx the parse tree
	 */
	void enterFunctionReturnValue(ReactParser.FunctionReturnValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#functionReturnValue}.
	 * @param ctx the parse tree
	 */
	void exitFunctionReturnValue(ReactParser.FunctionReturnValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#defaultStatement}.
	 * @param ctx the parse tree
	 */
	void enterDefaultStatement(ReactParser.DefaultStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#defaultStatement}.
	 * @param ctx the parse tree
	 */
	void exitDefaultStatement(ReactParser.DefaultStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#useEffect}.
	 * @param ctx the parse tree
	 */
	void enterUseEffect(ReactParser.UseEffectContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#useEffect}.
	 * @param ctx the parse tree
	 */
	void exitUseEffect(ReactParser.UseEffectContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#callback}.
	 * @param ctx the parse tree
	 */
	void enterCallback(ReactParser.CallbackContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#callback}.
	 * @param ctx the parse tree
	 */
	void exitCallback(ReactParser.CallbackContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#anonymous}.
	 * @param ctx the parse tree
	 */
	void enterAnonymous(ReactParser.AnonymousContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#anonymous}.
	 * @param ctx the parse tree
	 */
	void exitAnonymous(ReactParser.AnonymousContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#anonymousbody}.
	 * @param ctx the parse tree
	 */
	void enterAnonymousbody(ReactParser.AnonymousbodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#anonymousbody}.
	 * @param ctx the parse tree
	 */
	void exitAnonymousbody(ReactParser.AnonymousbodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#dependencies}.
	 * @param ctx the parse tree
	 */
	void enterDependencies(ReactParser.DependenciesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#dependencies}.
	 * @param ctx the parse tree
	 */
	void exitDependencies(ReactParser.DependenciesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#empty}.
	 * @param ctx the parse tree
	 */
	void enterEmpty(ReactParser.EmptyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#empty}.
	 * @param ctx the parse tree
	 */
	void exitEmpty(ReactParser.EmptyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#existent}.
	 * @param ctx the parse tree
	 */
	void enterExistent(ReactParser.ExistentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#existent}.
	 * @param ctx the parse tree
	 */
	void exitExistent(ReactParser.ExistentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(ReactParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(ReactParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#one}.
	 * @param ctx the parse tree
	 */
	void enterOne(ReactParser.OneContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#one}.
	 * @param ctx the parse tree
	 */
	void exitOne(ReactParser.OneContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#many}.
	 * @param ctx the parse tree
	 */
	void enterMany(ReactParser.ManyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#many}.
	 * @param ctx the parse tree
	 */
	void exitMany(ReactParser.ManyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#useRef}.
	 * @param ctx the parse tree
	 */
	void enterUseRef(ReactParser.UseRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#useRef}.
	 * @param ctx the parse tree
	 */
	void exitUseRef(ReactParser.UseRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#declarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationStatement(ReactParser.DeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#declarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationStatement(ReactParser.DeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#constStatement}.
	 * @param ctx the parse tree
	 */
	void enterConstStatement(ReactParser.ConstStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#constStatement}.
	 * @param ctx the parse tree
	 */
	void exitConstStatement(ReactParser.ConstStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#printvalue}.
	 * @param ctx the parse tree
	 */
	void enterPrintvalue(ReactParser.PrintvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#printvalue}.
	 * @param ctx the parse tree
	 */
	void exitPrintvalue(ReactParser.PrintvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#consoleLogStatement}.
	 * @param ctx the parse tree
	 */
	void enterConsoleLogStatement(ReactParser.ConsoleLogStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#consoleLogStatement}.
	 * @param ctx the parse tree
	 */
	void exitConsoleLogStatement(ReactParser.ConsoleLogStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#variableValueAssignment}.
	 * @param ctx the parse tree
	 */
	void enterVariableValueAssignment(ReactParser.VariableValueAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#variableValueAssignment}.
	 * @param ctx the parse tree
	 */
	void exitVariableValueAssignment(ReactParser.VariableValueAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#conditionOrLoop}.
	 * @param ctx the parse tree
	 */
	void enterConditionOrLoop(ReactParser.ConditionOrLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#conditionOrLoop}.
	 * @param ctx the parse tree
	 */
	void exitConditionOrLoop(ReactParser.ConditionOrLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#for}.
	 * @param ctx the parse tree
	 */
	void enterFor(ReactParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#for}.
	 * @param ctx the parse tree
	 */
	void exitFor(ReactParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void enterForCondition(ReactParser.ForConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void exitForCondition(ReactParser.ForConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#forBody}.
	 * @param ctx the parse tree
	 */
	void enterForBody(ReactParser.ForBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#forBody}.
	 * @param ctx the parse tree
	 */
	void exitForBody(ReactParser.ForBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#while}.
	 * @param ctx the parse tree
	 */
	void enterWhile(ReactParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#while}.
	 * @param ctx the parse tree
	 */
	void exitWhile(ReactParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#whileCondition}.
	 * @param ctx the parse tree
	 */
	void enterWhileCondition(ReactParser.WhileConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#whileCondition}.
	 * @param ctx the parse tree
	 */
	void exitWhileCondition(ReactParser.WhileConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#whileConditionFunction}.
	 * @param ctx the parse tree
	 */
	void enterWhileConditionFunction(ReactParser.WhileConditionFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#whileConditionFunction}.
	 * @param ctx the parse tree
	 */
	void exitWhileConditionFunction(ReactParser.WhileConditionFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#whileBody}.
	 * @param ctx the parse tree
	 */
	void enterWhileBody(ReactParser.WhileBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#whileBody}.
	 * @param ctx the parse tree
	 */
	void exitWhileBody(ReactParser.WhileBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#whileBodyFunction}.
	 * @param ctx the parse tree
	 */
	void enterWhileBodyFunction(ReactParser.WhileBodyFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#whileBodyFunction}.
	 * @param ctx the parse tree
	 */
	void exitWhileBodyFunction(ReactParser.WhileBodyFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#do}.
	 * @param ctx the parse tree
	 */
	void enterDo(ReactParser.DoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#do}.
	 * @param ctx the parse tree
	 */
	void exitDo(ReactParser.DoContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#if}.
	 * @param ctx the parse tree
	 */
	void enterIf(ReactParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#if}.
	 * @param ctx the parse tree
	 */
	void exitIf(ReactParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#ifCondition}.
	 * @param ctx the parse tree
	 */
	void enterIfCondition(ReactParser.IfConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#ifCondition}.
	 * @param ctx the parse tree
	 */
	void exitIfCondition(ReactParser.IfConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#ifBody}.
	 * @param ctx the parse tree
	 */
	void enterIfBody(ReactParser.IfBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#ifBody}.
	 * @param ctx the parse tree
	 */
	void exitIfBody(ReactParser.IfBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#elseIf}.
	 * @param ctx the parse tree
	 */
	void enterElseIf(ReactParser.ElseIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#elseIf}.
	 * @param ctx the parse tree
	 */
	void exitElseIf(ReactParser.ElseIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#else}.
	 * @param ctx the parse tree
	 */
	void enterElse(ReactParser.ElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#else}.
	 * @param ctx the parse tree
	 */
	void exitElse(ReactParser.ElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#width}.
	 * @param ctx the parse tree
	 */
	void enterWidth(ReactParser.WidthContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#width}.
	 * @param ctx the parse tree
	 */
	void exitWidth(ReactParser.WidthContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#height}.
	 * @param ctx the parse tree
	 */
	void enterHeight(ReactParser.HeightContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#height}.
	 * @param ctx the parse tree
	 */
	void exitHeight(ReactParser.HeightContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#margin}.
	 * @param ctx the parse tree
	 */
	void enterMargin(ReactParser.MarginContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#margin}.
	 * @param ctx the parse tree
	 */
	void exitMargin(ReactParser.MarginContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#bodyImage}.
	 * @param ctx the parse tree
	 */
	void enterBodyImage(ReactParser.BodyImageContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#bodyImage}.
	 * @param ctx the parse tree
	 */
	void exitBodyImage(ReactParser.BodyImageContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#flexDirection}.
	 * @param ctx the parse tree
	 */
	void enterFlexDirection(ReactParser.FlexDirectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#flexDirection}.
	 * @param ctx the parse tree
	 */
	void exitFlexDirection(ReactParser.FlexDirectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#display}.
	 * @param ctx the parse tree
	 */
	void enterDisplay(ReactParser.DisplayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#display}.
	 * @param ctx the parse tree
	 */
	void exitDisplay(ReactParser.DisplayContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#justify}.
	 * @param ctx the parse tree
	 */
	void enterJustify(ReactParser.JustifyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#justify}.
	 * @param ctx the parse tree
	 */
	void exitJustify(ReactParser.JustifyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#cssBody}.
	 * @param ctx the parse tree
	 */
	void enterCssBody(ReactParser.CssBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#cssBody}.
	 * @param ctx the parse tree
	 */
	void exitCssBody(ReactParser.CssBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#css}.
	 * @param ctx the parse tree
	 */
	void enterCss(ReactParser.CssContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#css}.
	 * @param ctx the parse tree
	 */
	void exitCss(ReactParser.CssContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#cssImg}.
	 * @param ctx the parse tree
	 */
	void enterCssImg(ReactParser.CssImgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#cssImg}.
	 * @param ctx the parse tree
	 */
	void exitCssImg(ReactParser.CssImgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#cssprogram}.
	 * @param ctx the parse tree
	 */
	void enterCssprogram(ReactParser.CssprogramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#cssprogram}.
	 * @param ctx the parse tree
	 */
	void exitCssprogram(ReactParser.CssprogramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(ReactParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(ReactParser.ContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#html}.
	 * @param ctx the parse tree
	 */
	void enterHtml(ReactParser.HtmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#html}.
	 * @param ctx the parse tree
	 */
	void exitHtml(ReactParser.HtmlContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#app}.
	 * @param ctx the parse tree
	 */
	void enterApp(ReactParser.AppContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#app}.
	 * @param ctx the parse tree
	 */
	void exitApp(ReactParser.AppContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#node}.
	 * @param ctx the parse tree
	 */
	void enterNode(ReactParser.NodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#node}.
	 * @param ctx the parse tree
	 */
	void exitNode(ReactParser.NodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ReactParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ReactParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(ReactParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(ReactParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(ReactParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(ReactParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpression(ReactParser.EqualityExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#equalityExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpression(ReactParser.EqualityExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(ReactParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(ReactParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpression(ReactParser.AdditiveExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#additiveExpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpression(ReactParser.AdditiveExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpression(ReactParser.MultiplicativeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpression(ReactParser.MultiplicativeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(ReactParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(ReactParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ReactParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(ReactParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ReactParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(ReactParser.PrimaryExpressionContext ctx);
}