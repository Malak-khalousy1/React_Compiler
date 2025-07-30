// Generated from C:/Users/Lenovo/Desktop/ReactProject66/ReactProject74/src/antlr/ReactParser.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ReactParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ReactParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ReactParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ReactParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ReactParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#importFromPath}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportFromPath(ReactParser.ImportFromPathContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#importPackage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportPackage(ReactParser.ImportPackageContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#importhooks}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImporthooks(ReactParser.ImporthooksContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#hooks}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHooks(ReactParser.HooksContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(ReactParser.PropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#constDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDeclaration(ReactParser.ConstDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#arrayLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLiteral(ReactParser.ArrayLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#objectLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectLiteral(ReactParser.ObjectLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(ReactParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#arrayElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayElement(ReactParser.ArrayElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(ReactParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#usestate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsestate(ReactParser.UsestateContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#arrowclick}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrowclick(ReactParser.ArrowclickContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(ReactParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#elementProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementProperties(ReactParser.ElementPropertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#imageElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImageElements(ReactParser.ImageElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#elementSecond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementSecond(ReactParser.ElementSecondContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#elementThird}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementThird(ReactParser.ElementThirdContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#createImageElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateImageElements(ReactParser.CreateImageElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#returnImageElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnImageElements(ReactParser.ReturnImageElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey(ReactParser.KeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#src}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSrc(ReactParser.SrcContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#alt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlt(ReactParser.AltContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#onClick}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnClick(ReactParser.OnClickContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#image}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImage(ReactParser.ImageContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#imageProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImageProperty(ReactParser.ImagePropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#title}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTitle(ReactParser.TitleContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#heading}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeading(ReactParser.HeadingContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescription(ReactParser.DescriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#paragraph}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParagraph(ReactParser.ParagraphContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#ll}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLl(ReactParser.LlContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#container}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainer(ReactParser.ContainerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#div}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(ReactParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#divBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivBody(ReactParser.DivBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#props}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProps(ReactParser.PropsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#propsReturn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropsReturn(ReactParser.PropsReturnContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#propsElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropsElements(ReactParser.PropsElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#propsBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropsBody(ReactParser.PropsBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#propsFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropsFunction(ReactParser.PropsFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(ReactParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#functionArrow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionArrow(ReactParser.FunctionArrowContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#functionReturnValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionReturnValue(ReactParser.FunctionReturnValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#defaultStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultStatement(ReactParser.DefaultStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#useEffect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseEffect(ReactParser.UseEffectContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#callback}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallback(ReactParser.CallbackContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#anonymous}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonymous(ReactParser.AnonymousContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#anonymousbody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonymousbody(ReactParser.AnonymousbodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#dependencies}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDependencies(ReactParser.DependenciesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#empty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmpty(ReactParser.EmptyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#existent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExistent(ReactParser.ExistentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(ReactParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#one}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOne(ReactParser.OneContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#many}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMany(ReactParser.ManyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#useRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseRef(ReactParser.UseRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#declarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationStatement(ReactParser.DeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#constStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstStatement(ReactParser.ConstStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#printvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintvalue(ReactParser.PrintvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#consoleLogStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsoleLogStatement(ReactParser.ConsoleLogStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#variableValueAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableValueAssignment(ReactParser.VariableValueAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#conditionOrLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionOrLoop(ReactParser.ConditionOrLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(ReactParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#forCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForCondition(ReactParser.ForConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#forBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForBody(ReactParser.ForBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(ReactParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#whileCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileCondition(ReactParser.WhileConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#whileConditionFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileConditionFunction(ReactParser.WhileConditionFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#whileBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileBody(ReactParser.WhileBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#whileBodyFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileBodyFunction(ReactParser.WhileBodyFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#do}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDo(ReactParser.DoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(ReactParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#ifCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfCondition(ReactParser.IfConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#ifBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBody(ReactParser.IfBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#elseIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseIf(ReactParser.ElseIfContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse(ReactParser.ElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#width}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWidth(ReactParser.WidthContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#height}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHeight(ReactParser.HeightContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#margin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMargin(ReactParser.MarginContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#bodyImage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyImage(ReactParser.BodyImageContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#flexDirection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlexDirection(ReactParser.FlexDirectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#display}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisplay(ReactParser.DisplayContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#justify}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJustify(ReactParser.JustifyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#cssBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssBody(ReactParser.CssBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#css}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCss(ReactParser.CssContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#cssImg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssImg(ReactParser.CssImgContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#cssprogram}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssprogram(ReactParser.CssprogramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent(ReactParser.ContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#html}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtml(ReactParser.HtmlContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#app}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApp(ReactParser.AppContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#node}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNode(ReactParser.NodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ReactParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression(ReactParser.LogicalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpression(ReactParser.LogicalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#equalityExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpression(ReactParser.EqualityExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(ReactParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#additiveExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpression(ReactParser.AdditiveExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#multiplicativeExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpression(ReactParser.MultiplicativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(ReactParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ReactParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpression(ReactParser.PrimaryExpressionContext ctx);
}