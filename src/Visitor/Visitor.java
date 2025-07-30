package Visitor;

import AST.*;
import AST.array.*;
import AST.arrowClick.ArrowClick;
import AST.arrowClick.FunctionCall;
import AST.function.Default;
import AST.function.Function;
import AST.function.FunctionArrow;
import AST.function.FunctionReturnValue;
import AST.imports.Hooks;
import AST.imports.ImportFromPath;
import AST.imports.ImportHooks;
import AST.imports.ImportPackage;
import AST.jsx.*;
import AST.loopsAndConditions.DoWhile;
import AST.loopsAndConditions.For;
import AST.loopsAndConditions.If;
import AST.loopsAndConditions.While;
import AST.prints.*;
import AST.props.*;
import AST.pureReact.*;
import AST.useRefEffect.*;
import CodeGenerate.CodeGeneration;
import SemanticError.SemanticErrorCheck;
import SymbolTable.*;
import antlr.ReactParser;
import antlr.ReactParserBaseVisitor;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

import java.util.*;
import java.util.stream.Collectors;

public class Visitor extends ReactParserBaseVisitor {
    SymbolTable symbolTable = new SymbolTable();
    Row initialValueName = new Row();
    StringBuilder jsCode = new StringBuilder();
    StringBuilder htmlCode = new StringBuilder();



    @Override
    public Object visitProgram(ReactParser.ProgramContext ctx) {
        Program program = new Program();
        symbolTable.getScopes().push(new Scope("Program", new ArrayList<>()));


        for (ReactParser.StatementContext statementContext : ctx.statement()) {
            Statement statement = (Statement) visit(statementContext);
            program.addStatement(statement);
        }
        //pop program scope
        symbolTable.popScope();
        //print total symboltable
       // this.symbolTable.print();
        System.out.println("Symbol Table");
        System.out.println("............................................................");
        this.symbolTable.printScopesList();
        System.out.println("............................................................");
        System.out.println("............................................................");
        SemanticErrorCheck semanticErrorCheck = new SemanticErrorCheck();
        semanticErrorCheck.setSymbolTable(this.symbolTable);
        semanticErrorCheck.check();
        System.out.println("AST Tree");
        if(!SemanticErrorCheck.isError){
            System.out.println("--------------------------------------------------------");
            System.out.println("Code Generated:");
            System.out.println("-------------\nJS:\n-------------");
            System.out.println(jsCode.toString());
            System.out.println("-----------------------------------");
            System.out.println("-----------------------------------");
            System.out.println("-------------\nhtml:\n-------------");
            CodeGeneration html = new CodeGeneration(htmlCode.toString());
            System.out.println(html.htmlFile);
        }
        return program;
    }

    @Override
    public Object visitStatement(ReactParser.StatementContext ctx) {
        if (ctx.importPackage() != null) {
            return visitImportPackage(ctx.importPackage());
        } else if (ctx.importFromPath() != null) {
            return visitImportFromPath(ctx.importFromPath());
        } else if (ctx.importhooks() != null) {
            return visitImporthooks(ctx.importhooks());
        } else if (ctx.constDeclaration() != null) {
            return visitConstDeclaration(ctx.constDeclaration());
        } else if (ctx.arrayLiteral() != null) {
            return visitArrayLiteral(ctx.arrayLiteral());
        } else if (ctx.objectLiteral() != null) {
            return visitObjectLiteral(ctx.objectLiteral());
        } else if (ctx.property() != null) {
            return visitProperty(ctx.property());
        } else if (ctx.arrowclick() != null) {
            return visitArrowclick(ctx.arrowclick());
        } else if (ctx.function() != null) {
            return visitFunction(ctx.function());
        }
//        else if (ctx.functiondev() != null) {
//
//            return visitFunctiondev(ctx.functiondev());}
        else if (ctx.functionArrow() != null) {
            return visitFunctionArrow(ctx.functionArrow());
        } else if (ctx.functionReturnValue() != null) {
            return visitFunctionReturnValue(ctx.functionReturnValue());

        } else if (ctx.divBody() != null) {
            return visitDivBody(ctx.divBody());
        } else if (ctx.div() != null) {
            return visitDiv(ctx.div());
        } else if (ctx.consoleLogStatement() != null) {
            return visitConsoleLogStatement(ctx.consoleLogStatement());
        } else if (ctx.declarationStatement() != null) {
            return visitDeclarationStatement(ctx.declarationStatement());
        } else if (ctx.constStatement() != null) {
            return visitConstStatement(ctx.constStatement());

        } else if (ctx.variableValueAssignment() != null) {
            return visitVariableValueAssignment(ctx.variableValueAssignment());

        } else if (ctx.imageElements() != null) {
            return visitImageElements(ctx.imageElements());
        } else if (ctx.returnImageElements() != null) {
            return visitReturnImageElements(ctx.returnImageElements());
        } else if (ctx.propsFunction() != null) {
            return visitPropsFunction(ctx.propsFunction());
        } else if (ctx.conditionOrLoop() != null) {
            return visitConditionOrLoop(ctx.conditionOrLoop());
        } else if (ctx.cssprogram() != null) {
            return visitCssprogram(ctx.cssprogram());
        } else if (ctx.html() != null) {
            return visitHtml(ctx.html());
        } else if (ctx.node() != null) {
            return visitNode(ctx.node());
        } else if (ctx.expression() != null) {
            return visitExpression(ctx.expression());
        } else {
            throw new IllegalArgumentException("Unknown statement type: " + ctx.getText());
        }
    }

    @Override
    public Object
    visitDeclarationStatement(ReactParser.DeclarationStatementContext ctx) {
        DeclarationStatement declarationStatement = new DeclarationStatement();
        //declarationStatement:
        //(LET|Var) ID EQUAL? value? SEMI_COLON;
        Row declarationType = new Row();
        if (ctx.Var() != null) {
            declarationStatement.setVarLyric(ctx.Var().getText());
            declarationType.setType("var");

        } else {
            declarationStatement.setLetLyric(ctx.LET().getText());
            declarationType.setType("let");
        }


        declarationStatement.setIdentifier(ctx.ID().getText());
        declarationType.setValue(ctx.ID().getText());

        Value value=null;
        if(value!=null){
            if (ctx.value().STRING() != null) {
                ValueString valueString = new ValueString();
                valueString.setValStr(ctx.value().STRING().getText().replace("\"", ""));
                value = valueString;

            } else if (ctx.value().NUMBER() != null) {
                ValueNumber valueNumber = new ValueNumber();
                valueNumber.setValNum(Integer.parseInt(ctx.value().NUMBER().getText()));
                value = valueNumber;

            } else {
                throw new IllegalArgumentException("Unknown value type");
            }
        }


        symbolTable.getTable().add(declarationType);

        //add to scope
        symbolTable.getScopes().peek().addVar(declarationType);

        declarationStatement.setValue(value);
        return declarationStatement;

    }

    @Override
    public Object visitVariableValueAssignment(ReactParser.VariableValueAssignmentContext ctx) {
        VariableValueAssignment valueAssignment = new VariableValueAssignment();
        Row valueName = new Row();

        valueAssignment.setVariableName(ctx.ID().getText());
        valueName.setValue(ctx.ID().getText());

        Value value;

        if (ctx.value().STRING() != null) {
            ValueString valueString = new ValueString();
            valueString.setValStr(ctx.value().STRING().getText().replace("\"", "")); // Remove quotes
            value = valueString;
            valueName.setType("unDeclare value");
        } else if (ctx.value().NUMBER() != null) {
            ValueNumber valueNumber = new ValueNumber();
            valueNumber.setValNum(Integer.parseInt(ctx.value().NUMBER().getText()));
            value = valueNumber;
            valueName.setType("unDeclare value");
        } else {
            throw new IllegalArgumentException("Unknown value type");
        }
        symbolTable.getTable().add(valueName);

        //add to scope
        symbolTable.getScopes().peek().addVar(valueName);

        valueAssignment.setValue(value);

        return valueAssignment;
    }


    @Override
    public Object visitConstStatement(ReactParser.ConstStatementContext ctx) {
        ConstStatement constStatement = new ConstStatement();
        Row constType = new Row();
        constStatement.setConstLyric(ctx.CONST().getText());
        constStatement.setIdentifierConst(ctx.ID().getText());
        constType.setValue(ctx.ID().getText());
        constType.setType("const");
        symbolTable.getTable().add(constType);

        //add to scope
        symbolTable.getScopes().peek().addVar(constType);

        Value value;

        if (ctx.value().STRING() != null) {
            ValueString valueString = new ValueString();
            valueString.setValStr(ctx.value().STRING().getText().replace("\"", "")); // Remove quotes
            value = valueString;
        } else if (ctx.value().NUMBER() != null) {
            ValueNumber valueNumber = new ValueNumber();
            valueNumber.setValNum(Integer.parseInt(ctx.value().NUMBER().getText()));
            value = valueNumber;
        } else {
            throw new IllegalArgumentException("Unknown value type");
        }

        constStatement.setValueConst(value);

        return constStatement;
    }

    @Override
    public Object visitImportFromPath(ReactParser.ImportFromPathContext ctx) {
        ImportFromPath importNode = new ImportFromPath();
        importNode.setImportLyric(ctx.IMPORT().getText());
        importNode.setImportString(ctx.STRING().getText());
        return importNode;
    }

    @Override
    public Object visitImportPackage(ReactParser.ImportPackageContext ctx) {
        ImportPackage importNode = new ImportPackage();
        importNode.setImportLyric(ctx.IMPORT().getText());
        List<ReactParser.ValueContext> idContextList = (List<ReactParser.ValueContext>) ctx.ID();
        List<String> idList = new ArrayList<>();

        for (ReactParser.ValueContext idContext : idContextList) {
            idList.add(idContext.getText());
        }
        importNode.setIdImportPackage(idList);
        importNode.setFromLyric(ctx.FROM().getText());
        importNode.setStringImportPackage(ctx.STRING().getText());

        return importNode;
    }

    @Override
    public Object visitImporthooks(ReactParser.ImporthooksContext ctx) {
        ImportHooks importHooksNode = new ImportHooks();
        importHooksNode.setImportLyric(ctx.IMPORT().getText());

        List<ReactParser.HooksContext> hooksContextList = ctx.hooks();
        List<Hooks> hooksList = new ArrayList<>();

        for (ReactParser.HooksContext hooksContext : hooksContextList) {
            Hooks hooksNode = (Hooks) visitHooks(hooksContext);
            hooksList.add(hooksNode);
        }

        importHooksNode.setHooks(hooksList);
        importHooksNode.setFromLyric(ctx.FROM().getText());

        return importHooksNode;
    }

    @Override
    public Object visitHooks(ReactParser.HooksContext ctx) {
        Hooks hooksNode = new Hooks();
        Row hooksName = new Row();


        if (ctx.USEStateT() != null) {
            hooksNode.setUseState(ctx.USEStateT().getText());
            hooksName.setValue("useState");
        }


        if (ctx.USEREF() != null) {
            hooksNode.setUseRef(ctx.USEREF().getText());
            hooksName.setValue("useRef");
        }


        if (ctx.USEFFECT() != null) {
            hooksNode.setUseEffect(ctx.USEFFECT().getText());
            hooksName.setValue("useEffect");
        }
        hooksName.setType("import");
        symbolTable.getTable().add(hooksName);
        symbolTable.getScopes().peek().addVar(hooksName);

        return hooksNode;
    }

    int counter = 0;

    @Override
    public Object visitProperty(ReactParser.PropertyContext ctx) {
        Property property = new Property();

        property.setAttributeName(ctx.ID(0).getText());
        Row attributeName = new Row();


        property.setAttributeName(ctx.ID(0).getText());
        String a = nameArrayObject + "[" + (counter - 1) + "]." + property.getAttributeName();
        attributeName.setValue(a);
        a = property.getAttributeName();

        ExpressionProperty expressionProperty;

        if (ctx.STRING() != null) {
            String value = ctx.STRING().getText();
            value = value.substring(1, value.length() - 1);
            expressionProperty = new ExpressionPropertyString();
            ((ExpressionPropertyString) expressionProperty).setExpString(value);
            attributeName.setType("String");
        } else if (ctx.NUMBER() != null) {
            int value = Integer.parseInt(ctx.NUMBER().getText());
            expressionProperty = new ExpressionPropertyNumber();
            ((ExpressionPropertyNumber) expressionProperty).setExpNumber(value);
            attributeName.setType("Number");
        } else if (ctx.ID() != null) {
            String value = ctx.ID(1).getText();
            expressionProperty = new ExpressionPropertyId();
            ((ExpressionPropertyId) expressionProperty).setExpID(value);
            attributeName.setType("String");
        } else if (ctx.PATH() != null) {
            String value = ctx.PATH().getText();
            expressionProperty = new ExpressionPropertyPath();
            ((ExpressionPropertyPath) expressionProperty).setExpPath(value);
            attributeName.setType("String");
        } else {
            throw new RuntimeException("Unrecognized property value type");
        }

        property.setPropertyList(expressionProperty);
        symbolTable.getTable().add(attributeName);
        symbolTable.getScopes().peek().addVar(new Row(attributeName.getType(), a));

        return property;
    }

    String nameArrayObject = null;

    @Override
    public Object visitConstDeclaration(ReactParser.ConstDeclarationContext ctx) {
        ConstDeclaration constDeclaration = new ConstDeclaration();
        Row arrayName = new Row();

        constDeclaration.setNameArray(ctx.ID().getText());
        //we will add to it later the type of array
        initialValueName.setType("Array");
        initialValueName.setValue(constDeclaration.getNameArray());
        nameArrayObject = constDeclaration.getNameArray();

        //symbolTable.getTable().add(arrayName);
        //symbolTable.getScopes().peek().addVar(arrayName);

        ArrayLiteral arrayLiteral = (ArrayLiteral) visit(ctx.arrayLiteral());
        constDeclaration.setArrayLiteral(arrayLiteral);

        symbolTable.popScope();

        jsCode.append(constDeclaration.generate());
        return constDeclaration;
    }


    @Override
    public Object visitArrayLiteral(ReactParser.ArrayLiteralContext ctx) {
        ArrayLiteral arrayLiteral = new ArrayLiteral();

        //get the type of array from its inside elements which are objects
        initialValueName.setType(initialValueName.getType() + "of Objects");
        //add the array to symbol table and to scope the array is in
        Row array = new Row(initialValueName.getType(), initialValueName.getValue());
        symbolTable.getTable().add(array);
        symbolTable.getScopes().peek().addVar(array);
        //create new scope for array elements
        symbolTable.getScopes().push(new Scope(initialValueName.getType() + " " + initialValueName.getValue(), new ArrayList<>()));

        List<ObjectLiteral> arrayObjects = new ArrayList<>();
        int cnt = 0;
        for (ReactParser.ObjectLiteralContext objectLiteralContext : ctx.objectLiteral()) {
            symbolTable.getScopes().peek().addVar(new Row("Object", initialValueName.getValue() + "[" + cnt + "]"));
            symbolTable.getScopes().push(new Scope(initialValueName.getValue() + "[" + cnt + "]", new ArrayList<>()));
            ObjectLiteral objectLiteral = (ObjectLiteral) visit(objectLiteralContext);
            arrayObjects.add(objectLiteral);
            cnt++;
            symbolTable.popScope();
        }

        arrayLiteral.setArrayLiterals(arrayObjects);

        return arrayLiteral;
    }

    @Override
    public Object visitObjectLiteral(ReactParser.ObjectLiteralContext ctx) {
        counter++;

        ObjectLiteral objectLiteral = new ObjectLiteral();

        List<Property> properties = new ArrayList<>();

        for (ReactParser.PropertyContext propertyContext : ctx.property()) {
            Property property = (Property) visit(propertyContext);
            properties.add(property);
        }

        objectLiteral.setProperties(properties);

        return objectLiteral;
    }

    @Override
    public Object visitValue(ReactParser.ValueContext ctx) {
        String valueText = ctx.getText();

        if (ctx.NUMBER() != null) {
            ValueNumber valueNumber = new ValueNumber();
            valueNumber.setValNum(Integer.parseInt(valueText));
            initialValueName.setType("Number");
            return valueNumber;
        } else if (ctx.STRING() != null) {
            String stringValue = valueText.substring(1, valueText.length() - 1);

            ValueString valueString = new ValueString();
            valueString.setValStr(stringValue);
            initialValueName.setType("String");
            return valueString;
        }
        return null;
    }

    @Override
    public Object visitArrayElement(ReactParser.ArrayElementContext ctx) {
        ArrayElement arrayElement = new ArrayElement();

        arrayElement.setId(ctx.ID().getText());

        Value value = (Value) visit(ctx.value());
        arrayElement.setValue(value);
        initialValueName.setType("Object");

        return arrayElement;
    }

    @Override
    public Object visitParams(ReactParser.ParamsContext ctx) {
        Params params = new Params();

        if (ctx.arrayElement() != null) {
            ArrayElement arrayElement = (ArrayElement) visit(ctx.arrayElement());
            params.setArrayElement(arrayElement);
        } else if (ctx.value() != null) {
            Value value = (Value) visit(ctx.value());
            params.setValue(value);
        } else if (ctx.ID() != null) {
            params.setIdParams(ctx.ID().getText());
        }

        return params;
    }

    String selectedImage;
    String function;
    @Override
    public Object visitUsestate(ReactParser.UsestateContext ctx) {
        UseState useState = new UseState();
        Row functionUseStateName = new Row();
        Row varUseStateName = new Row();
        Row useStateLyric = new Row();////

        useState.setNameInitialValue(ctx.ID(0).getText());

        useState.setNameFunction(ctx.ID(1).getText());
        useState.setUseStateLyric(ctx.USEStateT().getText());
        useStateLyric.setValue(ctx.USEStateT().getText());////
        useStateLyric.setType("hooks");////


        functionUseStateName.setValue(useState.getNameFunction());
        functionUseStateName.setType("Function");

        List<Params> paramsList = new ArrayList<>();

        for (ReactParser.ParamsContext paramsContext : ctx.params()) {
            Params params = (Params) visit(paramsContext);
            paramsList.add(params);
        }

        useState.setParams(paramsList);
        varUseStateName.setType(initialValueName.getType());
        varUseStateName.setValue(useState.getNameInitialValue());
        symbolTable.getTable().add(functionUseStateName);
        symbolTable.getTable().add(varUseStateName);
        symbolTable.getTable().add(useStateLyric);////

        //add to scope
        symbolTable.getScopes().peek().addVar(functionUseStateName);
        symbolTable.getScopes().peek().addVar(varUseStateName);
        symbolTable.getScopes().peek().addVar(useStateLyric);////

        jsCode.append(useState.generate());


        selectedImage = useState.getNameInitialValue();
        function = useState.getNameFunction();
        return useState;
    }

    @Override
    public Object visitArrowclick(ReactParser.ArrowclickContext ctx) {
        ArrowClick arrowClickNode = new ArrowClick();
        Row arrowClickName = new Row();
        Row arrowParameter = new Row();

        arrowClickNode.setNameFunctionClick(ctx.ID(0).getText());
        arrowClickName.setValue(arrowClickNode.getNameFunctionClick());
        arrowClickName.setType("Function");
        symbolTable.getTable().add(arrowClickName);
        symbolTable.getScopes().peek().addVar(arrowClickName);

        symbolTable.getScopes().push(new Scope(arrowClickName.getType() + " " + arrowClickName.getValue(), new ArrayList<>()));
        if (ctx.ID().size() > 1) {
            arrowClickNode.setNameArgument(ctx.ID(1).getText());

            arrowParameter.setValue(arrowClickNode.getNameArgument());
            arrowParameter.setType("Variable");

            symbolTable.getTable().add(arrowParameter);
            symbolTable.getScopes().peek().addVar(arrowParameter);
        }

        FunctionCall functionCallNode = (FunctionCall) visitFunctionCall(ctx.functionCall());
        arrowClickNode.setFunctionCall(functionCallNode);
        symbolTable.popScope();
        arrowClickNode.generatedID = selectedImage;
        arrowClickNode.generatedFunction = function;


        jsCode.append(arrowClickNode.generate());
        return arrowClickNode;
    }

    @Override
    public Object visitFunctionCall(ReactParser.FunctionCallContext ctx) {
        FunctionCall functionCallNode = new FunctionCall();

        functionCallNode.setNameFunctionCall(ctx.ID().getText());

        List<ReactParser.ParamsContext> paramsContextList = ctx.params();
        List<Params> paramsList = new ArrayList<>();

        for (ReactParser.ParamsContext paramsContext : paramsContextList) {
            Params paramsNode = (Params) visitParams(paramsContext);
            paramsList.add(paramsNode);
        }
        functionCallNode.setParamsList(paramsList);

        return functionCallNode;
    }

    public Object visitFunctionReturnValue(ReactParser.FunctionReturnValueContext ctx) {
        FunctionReturnValue functionReturnValue = new FunctionReturnValue();
        Row functionValueReturn = new Row();

        functionValueReturn.setType("Function");
        functionReturnValue.setFunctionName(ctx.ID(0).getText());
        String functionName = ctx.ID(0).getText();
        functionReturnValue.setFunctionName(functionName);
        functionValueReturn.setValue(functionReturnValue.getFunctionName());

        symbolTable.getTable().add(functionValueReturn);
        symbolTable.getScopes().peek().addVar(functionValueReturn);
        symbolTable.getScopes().push(new Scope(functionValueReturn.getType() + " " + functionValueReturn.getValue(), new ArrayList<>()));

        // Set function name

        // Set parameter name if exists
        if (ctx.ID().size() > 1) {
            functionReturnValue.setParameterName(ctx.ID(1).getText());
        }


        functionReturnValue.setConsoleLogStatementList(new ArrayList<>());
        functionReturnValue.setVariableValueAssignmentList(new ArrayList<>());
        functionReturnValue.setConstStatementList(new ArrayList<>());
        functionReturnValue.setDeclarationStatementList(new ArrayList<>());
        functionReturnValue.setFunctionReturnValueList(new ArrayList<>());
        for (ParseTree child : ctx.children) {
            if (child instanceof ReactParser.ConstStatementContext) {
                ConstStatement constStatement = (ConstStatement) visit(child);
                functionReturnValue.getConstStatementList().add(constStatement);
            } else if (child instanceof ReactParser.ConsoleLogStatementContext) {
                ConsoleLogStatement consoleLogStatement = (ConsoleLogStatement) visit(child);
                functionReturnValue.getConsoleLogStatementList().add(consoleLogStatement);
            } else if (child instanceof ReactParser.DeclarationStatementContext) {
                DeclarationStatement declarationStatement = (DeclarationStatement) visit(child);
                functionReturnValue.getDeclarationStatementList().add(declarationStatement);
            } else if (child instanceof ReactParser.VariableValueAssignmentContext) {
                VariableValueAssignment variableValueAssignment = (VariableValueAssignment) visit(child);
                functionReturnValue.getVariableValueAssignmentList().add(variableValueAssignment);

            } else if (child instanceof ReactParser.FunctionReturnValueContext) {
                FunctionReturnValue functionReturnValue1 = (FunctionReturnValue) visit(child);
                functionReturnValue.getFunctionReturnValueList().add(functionReturnValue1);

            }

        }
        if (ctx.RETURN() != null) {
            functionReturnValue.setValue(ctx.ID(ctx.ID().size() - 1).getText());
        }

        symbolTable.popScope();


        return functionReturnValue;
    }

    @Override

    public Object visitElementProperties(ReactParser.ElementPropertiesContext ctx) {
        ElementProperty elementProperty = new ElementProperty();


        if (ctx.ELEMENTID() != null) {
            elementProperty.setElementId(ctx.KEY().getText() + ": " + ctx.ELEMENTID().getText());
            symbolTable.getScopes().peek().addVar(new Row("Number", ctx.KEY().getText()));
            symbolTable.getTable().add(new Row("Number", ctx.KEY().getText()));
        } else if (ctx.ELEMENTURL() != null) {
            elementProperty.setElementUrl(ctx.SRC().getText() + ": " + ctx.ELEMENTURL().getText());
            symbolTable.getScopes().peek().addVar(new Row("String", ctx.SRC().getText()));
            symbolTable.getTable().add(new Row("String", ctx.SRC().getText()));
        } else if (ctx.ELEMENTTITLE() != null) {
            elementProperty.setAltLyric(ctx.ALT().getText());
            elementProperty.setElementTitle(ctx.ALT().getText() + ": " + ctx.ELEMENTTITLE().getText());
            symbolTable.getScopes().peek().addVar(new Row("String", ctx.ALT().getText()));
            symbolTable.getTable().add(new Row("String", ctx.ALT().getText()));
        }

        return elementProperty;
    }

    @Override
    public Object visitImageElements(ReactParser.ImageElementsContext ctx) {
        ImageElement imageElement = new ImageElement();
        Row imageElementN = new Row();
        Row parameterMapName = new Row();

        imageElement.setNameComponent(ctx.ID(0).getText());
        StringBuilder res = new StringBuilder(ctx.MAPCALL().getText());
        res.setLength(res.length() - 4);
        imageElement.setMapCall(res.toString());

        imageElementN.setType("Array");
        imageElementN.setValue(imageElement.getNameComponent());
        symbolTable.getTable().add(imageElementN);
        symbolTable.getScopes().peek().addVar(imageElementN);

        symbolTable.getScopes().push(new Scope("Arrow Click instance", new ArrayList<>()));

        imageElement.setArgumentFunction(ctx.ID(1).getText());

        parameterMapName.setType("Variable ");
        parameterMapName.setValue(imageElement.getArgumentFunction());
        symbolTable.getTable().add(parameterMapName);
        symbolTable.getScopes().peek().addVar(parameterMapName);

        imageElement.setReactFunc(ctx.CREATE_ELEMENT().getText().substring(6));
        imageElement.setFirstArgument(ctx.STRING().getText());
        symbolTable.getScopes().push(new Scope("create Object", new ArrayList<>()));


        List<ElementProperty> elementProperties = new ArrayList<>();
        for (ReactParser.ElementPropertiesContext elementPropertiesContext : ctx.elementProperties()) {
            ElementProperty elementProperty = (ElementProperty) visit(elementPropertiesContext);
            elementProperties.add(elementProperty);
        }
        imageElement.setElementProperties(elementProperties);
        imageElement.setOnClick(ctx.ONCLICK().getText());
        symbolTable.getTable().add(new Row("Function", ctx.ONCLICK().getText()));
        symbolTable.getScopes().peek().addVar(new Row("Function", ctx.ONCLICK().getText()));
        symbolTable.popScope();
        symbolTable.popScope();


        if (ctx.ONCLICK() != null) {
            imageElement.setFunctionName(ctx.ID(2).getText());
            imageElement.setFuncArgument(ctx.ID(3).getText());
        }


        return imageElement;
    }

    @Override
    public Object visitElementSecond(ReactParser.ElementSecondContext ctx) {
        ElementSecond element = new ElementSecond();
        if (ctx.CNAME() != null) {
            element.setClassNameLyric(ctx.CNAME().getText());
        }

        if (ctx.ID() != null) {
            element.setElementSecondId(ctx.ID().getText());
            element.setElementSecondList(Collections.singletonList(ctx.ID().getText()));
        } else if (ctx.STRING() != null) {
            element.setNameClass(ctx.STRING().getText());
        } else {
            List<String> elementSecondList = new ArrayList<>();

            for (int i = 0; i < ctx.getChildCount(); i++) {
                ParseTree child = ctx.getChild(i);
                if (child instanceof ReactParser.ElementSecondContext) {
                    ReactParser.ElementSecondContext childContext = (ReactParser.ElementSecondContext) child;
                    ElementSecond childElement = (ElementSecond) visit(childContext);
                    elementSecondList.add(childElement.toString());
                } else if (child instanceof TerminalNodeImpl) {
                    TerminalNodeImpl terminalNode = (TerminalNodeImpl) child;
                    String key = terminalNode.getSymbol().getText();
                    if (key.contains(",")) {
                        String[] keys = key.split(",");
                        for (String k : keys) {
                            if (!k.isEmpty()) {
                                if (k.equals("class")) {
                                    elementSecondList.add(ctx.getChild(i + 2).getText());
                                } else if (k.equals("id")) {
                                    elementSecondList.add(ctx.getChild(i + 2).getText());
                                } else if (k.equals("src")) {
                                    elementSecondList.add(ctx.getChild(i + 2).getText());
                                } else if (k.equals("alt")) {
                                    elementSecondList.add(ctx.getChild(i + 2).getText());
                                } else if (k.equals("title")) {
                                    elementSecondList.add(ctx.getChild(i + 2).getText());
                                } else if (k.equals("description")) {
                                    elementSecondList.add(ctx.getChild(i + 2).getText());
                                } else if (k.equals("null")) {
                                    elementSecondList.add("null");
                                }
                            }
                        }
                    } else {
                        if (key.equals("class")) {
                            elementSecondList.add(ctx.getChild(i + 2).getText());
                        } else if (key.equals("id")) {
                            elementSecondList.add(ctx.getChild(i + 2).getText());
                        } else if (key.equals("src")) {
                            elementSecondList.add(ctx.getChild(i + 2).getText());
                        } else if (key.equals("alt")) {
                            elementSecondList.add(ctx.getChild(i + 2).getText());
                        } else if (key.equals("title")) {
                            elementSecondList.add(ctx.getChild(i + 2).getText());
                        } else if (key.equals("description")) {
                            elementSecondList.add(ctx.getChild(i + 2).getText());
                        } else if (key.equals("null")) {
                            elementSecondList.add("null");
                        }
                    }
                }
            }

            element.setElementSecondList(elementSecondList);
        }

        return element;
    }

    @Override
    public ElementThird visitElementThird(ReactParser.ElementThirdContext ctx) {
        ElementThird elementThird = new ElementThird();

        if (ctx.ID() != null) {
            elementThird.setThird(ctx.ID().getText());
        } else if (ctx.ELEMENTID() != null) {
            elementThird.setThird(ctx.ELEMENTID().getText());
        } else if (ctx.ELEMENTURL() != null) {
            elementThird.setThird(ctx.ELEMENTURL().getText());
        } else if (ctx.ELEMENTTITLE() != null) {
            elementThird.setThird(ctx.ELEMENTTITLE().getText());
        } else if (ctx.ELEMENTDESCRIPTION() != null) {
            elementThird.setThird(ctx.ELEMENTDESCRIPTION().getText());
        } else if (ctx.createImageElements() != null) {
            if (!ctx.createImageElements().isEmpty()) {
                List<CreateImageElements> createImageElementsList = new ArrayList<>();
                for (ReactParser.CreateImageElementsContext createImageElementsContext : ctx.createImageElements()) {
                    CreateImageElements createImageElements = (CreateImageElements) visitCreateImageElements(createImageElementsContext);
                    createImageElementsList.add(createImageElements);
                }
                elementThird.setElementThird(createImageElementsList);
            }
        }

        return elementThird;
    }

    @Override
    public Object visitCreateImageElements(ReactParser.CreateImageElementsContext ctx) {
        CreateImageElements createImageElements = new CreateImageElements();
        createImageElements.setCreateImageElementLyric(ctx.CREATE_ELEMENT().getText());

        createImageElements.setArgumentFirst(ctx.STRING().getText());

        ElementSecond elementSecond = (ElementSecond) visitElementSecond(ctx.elementSecond());
        createImageElements.setElementSecond(elementSecond);

        ElementThird elementThird = (ElementThird) visitElementThird(ctx.elementThird());
        createImageElements.setElementThird(elementThird);

        return createImageElements;
    }

    @Override
    public Object visitReturnImageElements(ReactParser.ReturnImageElementsContext ctx) {
        ReturnImageElements returnImageElements = new ReturnImageElements();

        CreateImageElements createImageElements = (CreateImageElements) visitCreateImageElements(ctx.createImageElements());
        returnImageElements.setCreateImageElements(createImageElements);

        return returnImageElements;
    }

    @Override
    public Object visitKey(ReactParser.KeyContext ctx) {
        Key key = new Key();
        key.setKeyLyric(ctx.KEY().getText());
        key.setElementId(ctx.ELEMENTID().getText());
        Row r = new Row("Number", key.getKeyLyric());
        symbolTable.getTable().add(r);
        symbolTable.getScopes().peek().addVar(r);
        return key;
    }

    @Override
    public Object visitSrc(ReactParser.SrcContext ctx) {
        Src src = new Src();
        src.setElementUrl(ctx.ELEMENTURL().getText());
        src.setSrcLyric(ctx.SRC().getText());
        Row r = new Row("String", src.getSrcLyric());
        symbolTable.getTable().add(r);
        symbolTable.getScopes().peek().addVar(r);
        return src;
    }

    @Override
    public Object visitAlt(ReactParser.AltContext ctx) {
        Alt alt = new Alt();
        alt.setElementTitle(ctx.ELEMENTTITLE().getText());
        alt.setAltLyric(ctx.ALT().getText());
        Row r = new Row("String", alt.getAltLyric());
        symbolTable.getTable().add(r);
        symbolTable.getScopes().peek().addVar(r);
        return alt;
    }

    @Override
    public Object visitOnClick(ReactParser.OnClickContext ctx) {
        OnClick onClick = new OnClick();

        onClick.setOnClickLyric(ctx.ONCLICK().get(0).getText());
        if (ctx.ONCLICK().size() == 1) {
            onClick.setNameFunctionClick(ctx.ID(0).getText());
            onClick.setArgumentFunctionClick(ctx.ID(1).getText());
        } else {
            onClick.setNameFunctionClick(ctx.ONCLICK(1).getText());
            onClick.setArgumentFunctionClick(ctx.ID(0).getText());
        }
        Row r = new Row("Function", onClick.getOnClickLyric());
        symbolTable.getTable().add(r);
        symbolTable.getScopes().peek().addVar(r);

        return onClick;
    }

    @Override
    public Object visitImage(ReactParser.ImageContext ctx) {
        Image image = new Image();
        if (ctx.IMG() != null) {
            image.setImageLyric(ctx.IMG().getText());
            symbolTable.getScopes().push(new Scope(image.getImageLyric() + " tag", new ArrayList<>()));

            if (ctx.key() != null) {
                Key key = new Key();
                Row r;
                key.setElementId(ctx.key().getText());
                image.setKey(key);
                r = new Row("Number", ctx.key().getChild(0).getText());
                symbolTable.getTable().add(r);
                symbolTable.getScopes().peek().addVar(r);
            }
            if (ctx.src() != null) {
                Src src = new Src();
                Row r;
                src.setElementUrl(ctx.src().getText());
                image.setSrc(src);
                r = new Row("String", ctx.src().getChild(0).getText());
                symbolTable.getTable().add(r);
                symbolTable.getScopes().peek().addVar(r);
            }
            if (ctx.alt() != null) {
                Alt alt = new Alt();
                Row r;
                alt.setElementTitle(ctx.alt().getText());
                image.setAlt(alt);
                r = new Row("String", ctx.alt().getChild(0).getText());
                symbolTable.getTable().add(r);
                symbolTable.getScopes().peek().addVar(r);
            }
            if (ctx.onClick() != null) {
                OnClick onClick = new OnClick();
                Row r;
                onClick.setOnClickLyric(ctx.onClick().ONCLICK(0).getText());
                onClick.setNameFunctionClick(ctx.onClick().getChild(6).getText());
                int sz = ctx.onClick().ID().size() - 1;
                onClick.setArgumentFunctionClick(ctx.onClick().ID(sz).getText());
                image.setOnClick(onClick);
                r = new Row("Function", onClick.getOnClickLyric());
                symbolTable.getTable().add(r);
                symbolTable.getScopes().peek().addVar(r);
            }
            symbolTable.popScope();
        } else {
            image.setId(ctx.ID().getText());
            symbolTable.getScopes().push(new Scope(image.getId() + " tag", new ArrayList<>()));
            if (!ctx.imageProperty().isEmpty()) {
                List<Element> e = new ArrayList<>();
                for (ReactParser.ImagePropertyContext imP : ctx.imageProperty()) {
                    Element el = new Element();
                    el.setType(imP.getChild(0).getText());
                    Row r = new Row();
                    r.setValue(el.getType());
                    if (Objects.equals(r.getValue(), "src") || r.getValue().equals("alt")) {
                        r.setType("String");
                    } else if (Objects.equals(r.getValue(), "onClick")) {
                        r.setType("Function");
                    } else if (Objects.equals(r.getValue(), "id") || Objects.equals(r.getValue(), "key")) {
                        r.setType("Number");
                    } else {
                        r.setType("Variable");
                    }

                    symbolTable.getTable().add(r);
                    symbolTable.getScopes().peek().addVar(r);

                    el.setValue(imP.getChild(3).getText());
                    e.add(el);
                }
                image.setE(e);
            }
            symbolTable.popScope();
        }
        return image;
    }

    @Override
    public Object visitTitle(ReactParser.TitleContext ctx) {
        Title title = new Title();
        title.setElementTitle(ctx.ELEMENTTITLE().getText());
        return title;
    }

    @Override
    public Object visitHeading(ReactParser.HeadingContext ctx) {
        Heading heading = new Heading();
        heading.setHeadingLyric(ctx.H2().get(0).getText());
        heading.setTitle((Title) visit(ctx.title()));

        return heading;
    }

    @Override
    public Object visitDescription(ReactParser.DescriptionContext ctx) {
        Description description = new Description();
        description.setElementDescription(ctx.ELEMENTDESCRIPTION().getText());
        return description;
    }

    @Override
    public Object visitParagraph(ReactParser.ParagraphContext ctx) {
        Paragraph paragraph = new Paragraph();
        paragraph.setParagraphLyric(ctx.PARAGRAPH().get(0).getText());
        paragraph.setDescription((Description) visit(ctx.description()));
        return paragraph;
    }

    @Override
    public Object visitLl(ReactParser.LlContext ctx) {
        LL ll = new LL();

        Row argumentMap = new Row();
        symbolTable.getScopes().push(new Scope("Jsx arrow Function", new ArrayList<>()));
        ll.setMapCall(ctx.MAPCALL().getText());
        ll.setArgumentArrow(ctx.ID().getText());
        ll.setImage((Image) visit(ctx.image()));

        argumentMap.setValue(ll.getArgumentArrow());
        argumentMap.setType("Variable");
        symbolTable.getTable().add(argumentMap);
        symbolTable.getScopes().peek().addVar(argumentMap);
        symbolTable.popScope();
        return ll;
    }

    @Override
    public Object visitContainer(ReactParser.ContainerContext ctx) {
        Container container = new Container();
        if (ctx.divBody() != null) {
            container.setDivBody((DivBody) visit(ctx.divBody()));
        } else if (ctx.ll() != null) {
            container.setLl((LL) visit(ctx.ll()));
        } else if (ctx.image() != null) {
            container.setImage((Image) visitImage(ctx.image()));
        } else if (ctx.heading() != null) {
            container.setHeading((Heading) visit(ctx.heading()));
        } else if (ctx.paragraph() != null) {
            container.setParagraph((Paragraph) visit(ctx.paragraph()));
        }
        return container;
    }

    @Override
    public Object visitDiv(ReactParser.DivContext ctx) {
        Div div = new Div();
        div.setDivBody((DivBody) visit(ctx.divBody()));
        jsCode.append(div.generate());
        htmlCode.append(div.htmlGen());
        return div;
    }

    @Override
    public Object visitDivBody(ReactParser.DivBodyContext ctx) {
        DivBody divBody = new DivBody();
        divBody.setDivLyric(ctx.DIVO().getText());
        divBody.setcNameLyric(ctx.CNAME().getText());
        divBody.setClassName(ctx.STRING().getText());
        List<Container> containerList = new ArrayList<>();
        for (ReactParser.ContainerContext containerContext : ctx.container()) {
            containerList.add((Container) visit(containerContext));
        }
        divBody.setContainerList(containerList);
        divBody.generatedID = selectedImage;
        divBody.generatedFunction = function;


        return divBody;
    }


    @Override
    public Object visitProps(ReactParser.PropsContext ctx) {
        Props props = new Props();
        Row functionPropsName = new Row();
        Row variableProps = new Row();

        symbolTable.getScopes().push(new Scope("Props Attributes", new ArrayList<>()));

        props.setId(ctx.ID(0).getText());
        variableProps.setType("Variable");
        variableProps.setValue(props.getId());
        symbolTable.getTable().add(variableProps);
        symbolTable.getScopes().peek().addVar(variableProps);

        props.setFunction(ctx.getChild(4).getText());
        functionPropsName.setType("Function");
        functionPropsName.setValue(props.getFunction());
        symbolTable.getTable().add(functionPropsName);
        symbolTable.getScopes().peek().addVar(functionPropsName);

        props.setProps(ctx.ID(2).getText());

        symbolTable.popScope();

        return props;
    }

    @Override
    public Object visitPropsReturn(ReactParser.PropsReturnContext ctx) {
        PropsReturn propsReturn = new PropsReturn();
        propsReturn.setId(ctx.IMG().getText());
        symbolTable.getScopes().push(new Scope(propsReturn.getId() + " tag", new ArrayList<>()));
        List<Element> e = new ArrayList<>();
        Element element = new Element();
        if (ctx.propsElements() != null) {
            if (!ctx.propsElements().isEmpty()) {
                for (ReactParser.PropsElementsContext peC : ctx.propsElements()) {
                    element = (Element) visitPropsElements(peC);
                    e.add(element);
                }
            }
        }
        propsReturn.setElement(e);
        if (ctx.onClick() != null) {
            propsReturn.setOnClick((OnClick) visit(ctx.onClick()));
        }
        symbolTable.popScope();

        return propsReturn;
    }

    @Override
    public Object visitPropsElements(ReactParser.PropsElementsContext ctx) {
        Element e = new Element();
        e.setType(ctx.getChild(0).getText());
        e.setValue(ctx.getChild(3).getText());

        Row r = new Row();
        r.setValue(e.getType());
        if (Objects.equals(r.getValue(), "src") || r.getValue().equals("alt")) {
            r.setType("String");
        } else if (Objects.equals(r.getValue(), "onClick")) {
            r.setType("Function");
        } else if (Objects.equals(r.getValue(), "id") || Objects.equals(r.getValue(), "key")) {
            r.setType("Number");
        } else {
            r.setType("Variable");
        }

        symbolTable.getTable().add(r);
        symbolTable.getScopes().peek().addVar(r);

        return e;
    }

    @Override
    public Object visitPropsBody(ReactParser.PropsBodyContext ctx) {
        PropsBody propsBody = new PropsBody();
        propsBody.setProps((Props) visit(ctx.props()));
        propsBody.setPropsReturn((PropsReturn) visit(ctx.propsReturn()));
        propsBody.setReturnLyric(ctx.RETURN().getText());
        return propsBody;
    }

    @Override
    public Object visitPropsFunction(ReactParser.PropsFunctionContext ctx) {
        PropsFunction propsFunction = new PropsFunction();
        Row propsFunctionName = new Row();
        Row propsArgument = new Row();
        propsFunction.setFunctionName(ctx.ID(0).getText());
        propsFunction.setParameter(ctx.ID(1).getText());

        propsFunctionName.setType("Function");
        propsFunctionName.setValue(propsFunction.getFunctionName());
        propsArgument.setType("Variable");
        propsArgument.setValue(propsFunction.getParameter());
        symbolTable.getTable().add(propsFunctionName);
        symbolTable.getScopes().peek().addVar(propsFunctionName);

        symbolTable.getScopes().push(new Scope(propsFunctionName.getValue() + " " + propsFunctionName.getType(), new ArrayList<>()));
        symbolTable.getTable().add(propsArgument);
        symbolTable.getScopes().peek().addVar(propsArgument);

        propsFunction.setPropsBodyNode((PropsBody) visit(ctx.propsBody()));

        symbolTable.popScope();

        return propsFunction;
    }

    @Override
    public Object visitFunction(ReactParser.FunctionContext ctx) {
        Function function = new Function();
        function.setFunctionLyric(ctx.FUNCTION().getText());
        Row functionComponentName = new Row();
        String functionName = null;

        if (ctx.ID() != null) {
            functionName = ctx.ID().getText();
            function.setFunctionName(functionName);
            functionComponentName.setValue(function.getFunctionName());

        } else if (ctx.APP() != null) {
            functionName = "App";
            function.setFunctionName(functionName);
            functionComponentName.setValue("App");

        }
        functionComponentName.setType("Function");
        symbolTable.getTable().add(functionComponentName);
        symbolTable.getScopes().peek().addVar(functionComponentName);


        symbolTable.getScopes().push(new Scope(functionComponentName.getType() + " " + functionComponentName.getValue(), new ArrayList<>()));

        function.setUseStateList(new ArrayList<>());
        function.setUseEffectList(new ArrayList<>());
        function.setUseRefList(new ArrayList<>());
        function.setDeclarationStatement(new ArrayList<>());
        function.setConstStatement(new ArrayList<>());
        function.setConsoleLogStatement(new ArrayList<>());
        function.setVariableValueAssignmentList(new ArrayList<>());


        for (ParseTree child : ctx.children) {
            if (child instanceof ReactParser.UsestateContext) {
                UseState useState = (UseState) visit(child);
                function.getUseStateList().add(useState);
            } else if (child instanceof ReactParser.UseEffectContext) {
                UseEffect useEffect = (UseEffect) visit(child);
                function.getUseEffectList().add(useEffect);
            } else if (child instanceof ReactParser.UseRefContext) {
                UseRef useRef = (UseRef) visit(child);
                function.getUseRefList().add(useRef);
            } else if (child instanceof ReactParser.DeclarationStatementContext) {
                DeclarationStatement declarationStatement = (DeclarationStatement) visit(child);
                function.getDeclarationStatement().add(declarationStatement);
            } else if (child instanceof ReactParser.ConstStatementContext) {
                ConstStatement constStatement = (ConstStatement) visit(child);
                function.getConstStatement().add(constStatement);


            } else if (child instanceof ReactParser.ConsoleLogStatementContext) {
                ConsoleLogStatement consoleLogStatement = (ConsoleLogStatement) visit(child);
                function.getConsoleLogStatement().add(consoleLogStatement);

            } else if (child instanceof ReactParser.VariableValueAssignmentContext) {
                VariableValueAssignment variableValueAssignment = (VariableValueAssignment) visit(child);
                function.getVariableValueAssignmentList().add(variableValueAssignment);
            }
        }
        function.setReturnLyric(ctx.RETURN().getText());

        for (ParseTree child : ctx.children) {
            if (child instanceof ReactParser.ArrowclickContext) {
                ArrowClick arrowClick = (ArrowClick) visit(child);
                function.setArrowClick(new ArrayList<>());

            } else if (child instanceof ReactParser.ImageElementsContext) {
                ImageElement imageElement = (ImageElement) visit(child);
                function.setImageElements(imageElement);
            } else if (child instanceof ReactParser.DivContext) {
                Div functionDiv = (Div) visit(child);
                function.setFunctionDiv(functionDiv);
//                System.out.println("visitDev");
//                js.append(function.generate());
            } else if (child instanceof  ReactParser.DefaultStatementContext) {
                Default aDefault=(Default) visit(child);
                function.setaDefault(aDefault);

            } else if (child instanceof ReactParser.ReturnImageElementsContext) {

                ReturnImageElements returnImageElements = (ReturnImageElements) visit(child);
                function.setFunctionReturnImageElements(returnImageElements);
            }
        }

        symbolTable.popScope();
        return function;
    }

    @Override
    public Object visitFunctionArrow(ReactParser.FunctionArrowContext ctx) {
        FunctionArrow functionArrow = new FunctionArrow();
        Row functionArrowName = new Row();
        String functionName = null;
        if (ctx.ID() != null) {
            functionName = ctx.ID().getText();
            functionArrow.setFunctionName(functionName);

            functionArrowName.setValue(functionArrow.getFunctionName());
        } else if (ctx.APP() != null) {
            functionName = "App";
            functionArrow.setFunctionName(functionName);
            functionArrowName.setValue("App");
        }
        functionArrowName.setType("Function");
        symbolTable.getTable().add(functionArrowName);
        symbolTable.getScopes().peek().addVar(functionArrowName);

        symbolTable.getScopes().push(new Scope(functionArrowName.getType() + " " + functionArrowName.getValue(), new ArrayList<Row>()));
        functionArrow.setUseStateList(new ArrayList<>());
        functionArrow.setUseEffectList(new ArrayList<>());
        functionArrow.setUseRefList(new ArrayList<>());

        for (ParseTree child : ctx.children) {
            if (child instanceof ReactParser.UsestateContext) {
                UseState useState = (UseState) visit(child);
                functionArrow.getUseStateList().add(useState);
            } else if (child instanceof ReactParser.UseEffectContext) {
                UseEffect useEffect = (UseEffect) visit(child);
                functionArrow.getUseEffectList().add(useEffect);
            } else if (child instanceof ReactParser.UseRefContext) {
                UseRef useRef = (UseRef) visit(child);
                functionArrow.getUseRefList().add(useRef);
            }
        }
        functionArrow.setReturnLyric(ctx.RETURN().getText());

        for (ParseTree child : ctx.children) {
            if (child instanceof ReactParser.ArrowclickContext) {
                ArrowClick arrowClick = (ArrowClick) visit(child);
                functionArrow.setArrowClick(new ArrayList<>());

            } else if (child instanceof ReactParser.ImageElementsContext) {
                ImageElement imageElement = (ImageElement) visit(child);
                functionArrow.setImageElements(imageElement);
            } else if (child instanceof ReactParser.DivContext) {
                Div functionArrowDiv = (Div) visit(child);
                functionArrow.setFunctionDiv(functionArrowDiv);
            } else if (child instanceof ReactParser.ReturnImageElementsContext) {
                ReturnImageElements returnImageElements = (ReturnImageElements) visit(child);
                functionArrow.setFunctionReturnImageElements(returnImageElements);
            }
        }

        symbolTable.popScope();

        return functionArrow;
    }

    @Override
    public Object visitDefaultStatement(ReactParser.DefaultStatementContext ctx) {
        Default defaultT = new Default();
        if (ctx.DEFAULT() != null) {
            defaultT.setNameDef(ctx.DEFAULT().getText());
        }
        if (ctx.EXPORT() != null) {
            defaultT.setExportDe(ctx.EXPORT().getText());
        }
        if (ctx.APP() != null) {
            defaultT.setExportN(ctx.APP().getText());
        }
        if (ctx.ID() != null) {
            defaultT.setNameDefId(ctx.ID().getText());

        }
        defaultT.generatedFunction = function;
        jsCode.append(defaultT.generate());
        return defaultT;
    }

    @Override
    public Object visitUseEffect(ReactParser.UseEffectContext ctx) {
        UseEffect useEffect = new UseEffect();
        useEffect.setUseEffectLyric(ctx.USEFFECT().getText());
        useEffect.setCallBack((CallBack) visitCallback(ctx.callback()));

        return useEffect;
    }

    @Override
    public Object visitCallback(ReactParser.CallbackContext ctx) {
        if (ctx.ID().size() > 0) {
            if (ctx.dependencies() != null) {
                CallBackWithDependencies callBackWithDependencies = new CallBackWithDependencies();
                callBackWithDependencies.setParameters(ctx.ID().stream().map(ParseTree::getText).collect(Collectors.toList()));
                callBackWithDependencies.setDependencies((Dependencies) visitDependencies(ctx.dependencies()));
                return callBackWithDependencies;
            } else if (ctx.anonymous() != null) {
                CallBackWithAnonymous callBackWithAnonymous = new CallBackWithAnonymous();
                callBackWithAnonymous.setParameters(ctx.ID().stream().map(ParseTree::getText).collect(Collectors.toList()));
                callBackWithAnonymous.setAnonymous((Anonymous) visitAnonymous(ctx.anonymous()));
                return callBackWithAnonymous;
            } else {
                CallBackID callBackID = new CallBackID();
                callBackID.setParameters(ctx.ID().stream().map(ParseTree::getText).collect(Collectors.toList()));
                return callBackID;
            }
        } else if (ctx.anonymous() != null && ctx.dependencies() != null) {

            CallBackWithAD callBackWithAD = new CallBackWithAD();
            callBackWithAD.setDependencies((Dependencies) visitDependencies(ctx.dependencies()));
            callBackWithAD.setAnonymous((Anonymous) visitAnonymous(ctx.anonymous()));
            return callBackWithAD;
        }
        return null;
    }

    @Override
    public Object visitAnonymous(ReactParser.AnonymousContext ctx) {
        List<AnonymousBody> anonymousBodyList = new ArrayList<>();
        for (ReactParser.AnonymousbodyContext bodyContext : ctx.anonymousbody()) {
            AnonymousBody anonymousBody = (AnonymousBody) visitAnonymousbody(bodyContext);
            anonymousBodyList.add(anonymousBody);
        }
        return new Anonymous(anonymousBodyList);
    }

    @Override
    public Object visitAnonymousbody(ReactParser.AnonymousbodyContext ctx) {
        if (ctx.consoleLogStatement() != null) {
            AnonymousBodyCL anonymousBodyCL = new AnonymousBodyCL();
            anonymousBodyCL.setConsoleLogStatement((ConsoleLogStatement) visitConsoleLogStatement(ctx.consoleLogStatement()));
            return anonymousBodyCL;
        } else if (ctx.for_() != null) {
            AnonymousBodyFor anonymousBodyFor = new AnonymousBodyFor();
            anonymousBodyFor.setFor((For) visitFor(ctx.for_()));
            return anonymousBodyFor;
        } else if (ctx.if_() != null) {
            AnonymousBodyIF anonymousBodyIF = new AnonymousBodyIF();
            anonymousBodyIF.setAnIf((If) visitIf(ctx.if_()));
            return anonymousBodyIF;
        } else if (ctx.while_() != null) {
            AnonymousBodyWhile anonymousBodyWhile = new AnonymousBodyWhile();
            anonymousBodyWhile.setWhile((While) visitWhile(ctx.while_()));
            return anonymousBodyWhile;
        } else if (ctx.do_() != null) {
            AnonymousBodyDo anonymousBodyDo = new AnonymousBodyDo();
            anonymousBodyDo.setDoWhile((DoWhile) visitDo(ctx.do_()));
            return anonymousBodyDo;
        } else if (ctx.declarationStatement() != null) {
            AnonymousBodyLS anonymousBodyLS = new AnonymousBodyLS();
            anonymousBodyLS.setDeclarationStatement((DeclarationStatement) visitDeclarationStatement(ctx.declarationStatement()));
            return anonymousBodyLS;
        } else {
            return null;
        }
    }

    @Override
    public Object visitDependencies(ReactParser.DependenciesContext ctx) {
        if (ctx.empty() != null) {
            return visitEmpty(ctx.empty());
        } else {
            return visitExistent(ctx.existent());
        }
    }

    @Override
    public Object visitEmpty(ReactParser.EmptyContext ctx) {
        DependenciesEmpty dependenciesEmpty = new DependenciesEmpty();
        return dependenciesEmpty;
    }

    @Override
    public DependenciesExistent visitExistent(ReactParser.ExistentContext ctx) {
        DependenciesExistent dependencies = new DependenciesExistent();

        List<Parameter> parameters = new ArrayList<>();

        if (ctx.parameter() != null) {
            for (ReactParser.ParameterContext paramCtx : ctx.parameter()) {
                Parameter parameter = (Parameter) visitParameter(paramCtx);
                parameters.add(parameter);
            }
        }

        dependencies.setParameters(parameters);

        return dependencies;
    }

    @Override
    public Object visitParameter(ReactParser.ParameterContext ctx) {
        Parameter parameter = new Parameter();
        if (ctx.one() != null) {
            parameter.setOneParameter((OneParameter) visit(ctx.one()));
        } else {
            parameter.setManyParameters((ManyParameters) visit(ctx.many()));
        }
        return parameter;
    }

    @Override
    public Object visitOne(ReactParser.OneContext ctx) {
        if (ctx.ID() != null) {
            OneParameterID idParam = new OneParameterID();
            idParam.setId(ctx.ID().getText());
            return idParam;
        } else {
            OneParameterAE aeParam = new OneParameterAE();
            aeParam.setArrayElement((ArrayElement) visit(ctx.arrayElement()));
            return aeParam;
        }
    }

    @Override
    public Object visitMany(ReactParser.ManyContext ctx) {
        ManyParameters manyParameters = new ManyParameters();
        List<String> parameters = new ArrayList<>();
        List<TerminalNode> idNodes = (List<TerminalNode>) ctx.ID();
        for (TerminalNode idNode : idNodes) {
            parameters.add(idNode.getText());
        }
        manyParameters.setId(parameters);
        return manyParameters;
    }

    @Override
    public Object visitUseRef(ReactParser.UseRefContext ctx) {
        UseRef useRef = new UseRef();
        Row useRefVariableName = new Row();
        useRef.setVariable(ctx.VARIABLE().getText());
        useRefVariableName.setValue(useRef.getVariable());
        useRef.setUseRefLyric(ctx.USEREF().getText());
        Object initialValue = null;

        if (ctx.ID() != null) {
            initialValue = ctx.ID().getText();
            useRefVariableName.setType("ValueUseRef");

        } else if (ctx.NUMBER() != null) {
            initialValue = Integer.parseInt(ctx.NUMBER().getText());
            useRefVariableName.setType("NumberUseRef");

        } else if (ctx.STRING() != null) {
            initialValue = ctx.STRING().getText();
            useRefVariableName.setType("StringUseRef");
        }

        useRef.setInitialValue(initialValue);
        symbolTable.getTable().add(useRefVariableName);
        symbolTable.getScopes().peek().addVar(useRefVariableName);
        return useRef;
    }


    public Object visitPrintValue(ReactParser.PrintvalueContext ctx) {
        Row printValueName = new Row();

        if (ctx.STRING() != null) {
            PrintValueString printValueString = new PrintValueString();
            printValueString.setStringValue(ctx.STRING().getText().replace("\"", "")); // Remove quotes
            return printValueString;
        } else if (ctx.ID() != null) {
            PrintValueID printValueID = new PrintValueID();
            printValueID.setIdentifier(ctx.ID().getText());
            printValueName.setValue(ctx.ID().getText());
            printValueName.setType("unDeclare variable");
            symbolTable.getTable().add(printValueName);

            //add to scope
            symbolTable.getScopes().peek().addVar(printValueName);
            return printValueID;
        } else if (ctx.consoleLogStatement() != null) {
            return visitConsoleLogStatement(ctx.consoleLogStatement());
        } else {
            throw new IllegalArgumentException("Unknown print value type");
        }


    }

    public Object visitConsoleLogStatement(ReactParser.ConsoleLogStatementContext ctx) {
        ConsoleLogStatement consoleLogStatement = new ConsoleLogStatement();
        PrintValue printValue = (PrintValue) visitPrintValue(ctx.printvalue());
        consoleLogStatement.setVariable(printValue);
        return consoleLogStatement;
    }


    public static StringBuilder jsInitElements = new StringBuilder();
}


