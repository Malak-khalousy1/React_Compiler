package SemanticError;

import AST.ArrayElement;
import AST.UseState;
import AST.arrowClick.FunctionCall;
import AST.function.Default;
import AST.function.Function;
import AST.imports.Hooks;
import AST.jsx.Image;
import AST.jsx.OnClick;

import AST.jsx.Paragraph;
import AST.prints.PrintValueID;
import AST.props.PropsFunction;
import AST.useRefEffect.UseRef;
import SymbolTable.SymbolTable;
import SymbolTable.Scope;
import SymbolTable.Row;

import java.util.*;


public class SemanticErrorCheck {

    SymbolTable symbolTable = new SymbolTable();

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    public void setSymbolTable(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    OnClick onClick = new OnClick();
    UseRef useRef=new UseRef();

    FunctionCall functionCall = new FunctionCall();
    Hooks hooks = new Hooks();
    UseState useState=new UseState();
    String messageError = "";

    List<String> functions = new ArrayList<>();
    String varName;
    String constName;
    String funName;
    String hookName;
    String arrayName;

    String componentName;
    public static boolean isError = false;
    public void check() {
        boolean foundError = false;

        // ANSI escape code for red color
        String redColor = "\u001B[31m";
        // ANSI escape code to reset color
        String resetColor = "\u001B[0m";

        if (!checkNameFunction(this.symbolTable)) {
            if (!foundError) {
                System.out.println(redColor + "FOUND ERROR :" + resetColor);
                foundError = true;
            }
            System.out.println(redColor + "Function " + funName + " is duplicated" + resetColor);
        }
        if (!checkNameFunctionExist(this.onClick, this.functionCall)) {
            if (!foundError) {
                System.out.println(redColor + "FOUND ERROR :" + resetColor);
                foundError = true;
            }
            System.out.println(redColor + "Function\t" + onClick.getNameFunctionClick() + "\tNot Declare" + resetColor);
        }
        if (!checkNameVariable(this.symbolTable)) {
            if (!foundError) {
                System.out.println(redColor + "FOUND ERROR :" + resetColor);
                foundError = true;
            }
            System.out.println(redColor + "Variable " + varName + " is duplicate" + resetColor);
        }
        Map<Boolean, String> map3 = checkNameVariableExist();
        if (map3.containsKey(false)) {
            if (!foundError) {
                System.out.println(redColor + "FOUND ERROR :" + resetColor);
                foundError = true;
            }
            System.out.println(redColor + "variable" + " " + map3.get(false) + " " + "Not Found" + resetColor);
        }

        if (!checkConstVariable(this.symbolTable)) {
            if (!foundError) {
                System.out.println(redColor + "FOUND ERROR :" + resetColor);
                foundError = true;
            }
            System.out.println(redColor + "Cannot redefine const variable " + constName + resetColor);
        }
//        if (!checkHooksInFunction(this.symbolTable)) {
//            if (!foundError) {
//                System.out.println(redColor + "FOUND ERROR :" + resetColor);
//                foundError = true;
//            }
//            System.out.println(redColor + "Cannot write hooks out of function " + constName + resetColor);
//        }
        if (!checkHooksImportUseRef(this.symbolTable)) {
            if (!foundError) {
                System.out.println(redColor + "FOUND ERROR :" + resetColor);
                foundError = true;
            }
            System.out.println(redColor + "Cannot use hooks useRef without import" + resetColor);
        }
        if (!checkHooksImportUseState(this.symbolTable)) {
            if (!foundError) {
                System.out.println(redColor + "FOUND ERROR :" + resetColor);
                foundError = true;
            }
            System.out.println(redColor + "Cannot use hooks useState without import" + resetColor);
        }
        if (!checkExportExist()) {
            if (!foundError) {
                System.out.println(redColor + "FOUND ERROR :" + resetColor);
                foundError = true;
            }
            System.out.println(redColor + "Export not exist" + resetColor);
        }
        if (!checkNameExport() && checkExportExist()) {
            if (!foundError) {
                System.out.println(redColor + "FOUND ERROR :" + resetColor);
                foundError = true;
            }
            System.out.println(redColor + "Export " + messageError + " not matches" + resetColor);
        }
        if (!checkNameHooks(this.symbolTable)) {
            if (!foundError) {
                System.out.println(redColor + "FOUND ERROR :" + resetColor);
                foundError = true;
            }
            System.out.println(redColor + "The hook " + hookName + " is duplicated" + resetColor);
        }
        if (!checkArrayName(this.symbolTable)) {
            if (!foundError) {
                System.out.println(redColor + "FOUND ERROR :" + resetColor);
                foundError = true;
            }
            System.out.println(redColor + "Array" + " " + arrayName + " " + "is duplicate" + resetColor);
        }

        if (!checkNameArrayExist()) {
            if (!foundError) {
                System.out.println(redColor + "FOUND ERROR :" + resetColor);
                foundError = true;
            }
            System.out.println(redColor + "Array" + " " + arrayName + " " + "Not Found" + resetColor);
        }
        if (!checkComponent(this.symbolTable)) {
            if (!foundError) {
                System.out.println(redColor + "FOUND ERROR :" + resetColor);
                foundError = true;
            }
            System.out.println(redColor + "Component" + " " + componentName + " " + "is duplicate" + resetColor);
        }
        if (!checkComponentExist()) {
            if (!foundError) {
                System.out.println(redColor + "FOUND ERROR :" + resetColor);
                foundError = true;
            }
            System.out.println(redColor + "Component" + " " + name + " " + "Not Found" + resetColor);
        }
        if (checkUseState()) {
            if (!foundError) {
                System.out.println(redColor + "FOUND ERROR :" + resetColor);
                foundError = true;
            }
            // System.out.println(redColor + "Component" + " " + name + " " + "Not Found" + resetColor);
        }

    }
    boolean checkUseState(){
        //List<String> hookRef= UseRef.getvariableName();
        String c = onClick.getNameFunctionClick();
        String userefvar= useRef.getVariable();
        String usestatefunction= UseState.getUseStateLyric();
        System.out.println(c);
        return  true;
    }

    boolean checkExportExist() {
        String exportLyric = Default.getExportDe();//for export
        String nameComponent = Function.getFunctionName();

        if (nameComponent == null) {
            return true;
        }
        if (exportLyric != null) {
            return true;
        }
        return false;
    }

    boolean checkNameExport() {
        String exportNameIdentifier = Default.getNameDefId();//forId
        String exportApp = Default.getExportN();//for App
        String nameComponent = Function.getFunctionName();
        if (nameComponent == null) {
            return true;
        }
        if (exportNameIdentifier != null) {
            if (Objects.equals(nameComponent, exportNameIdentifier)) {
                return true;
            }
            messageError = exportNameIdentifier;
        }
        if (exportApp != null) {
            if (Objects.equals(nameComponent, exportApp)) {
                return true;
            }
            messageError = exportApp;
        }
        return false;
    }

    boolean checkHooksImportUseRef(SymbolTable symbolTable) {
        String userefvar= UseRef.getUseRefLyric();

        String hookRef = Hooks.getUseRef();
        if (userefvar!= null) {
            if (hookRef == null) {
                return false;
            }
        }
        return true;
    }



    boolean checkHooksImportUseState(SymbolTable symbolTable) {
        String usestatefunction= UseState.getUseStateLyric();
        String hookLyric = Hooks.getUseState();
        if (usestatefunction!= null) {
            if (hookLyric == null) {
                return false;
            }
        }
        return true;
    }



    public static boolean hasNoDuplicates(List<String> list) {
        Set<String> set = new HashSet<>();
        for (String element : list) {
            if (!set.add(element)) {
                return false;
            }
        }
        return true;
    }

    boolean checkNameFunction(SymbolTable symbolTable) {

        List<String> functionsName = new ArrayList<>();
        for (Scope s : symbolTable.getScopesList()) {
            for (Row r : s.getScopeVariables()) {

                if (r.getType().equals("Function")) {
                    functionsName.add(r.getValue());
                }
                if (!hasNoDuplicates(functionsName)) {
                    funName = r.getValue();
                    return false;
                }
            }
            functionsName.clear();
        }
        return true;
    }

    boolean checkNameFunctionExist(OnClick onClick, FunctionCall functionCall) { //edit
        String c = onClick.getNameFunctionClick();
        String n = functionCall.getNameFunctionCall();

        if (c == null) {
            return true;
        }
        List<String> functions = new ArrayList<>();
        for (Scope s : symbolTable.getScopesList()) {
            for (Row r : s.getScopeVariables()) {
                if (r.getType().equals("Function")) {
                    functions.add(r.getValue());
                }
            }
            //System.out.println(functions);
            for (String s1 : functions) {
                if (Objects.equals(s1, c)) {
                    return true;
                }
            }
            functions.clear();
        }

        return false;
    }

    List<String> VariableName = new ArrayList<>();
    boolean checkNameVariable(SymbolTable symbolTable) {

        for (Scope s : symbolTable.getScopesList()) {
            for (Row r : s.getScopeVariables()) {

                if (r.getType().equals("const") || r.getType().equals("var") || r.getType().equals("let")) {
                    VariableName.add(r.getValue());
                }
                if (!hasNoDuplicates(VariableName)) {
                    varName = r.getValue();
                    return false;
                }
            }

            VariableName.clear();
        }
        return true;

    }


    boolean checkConstVariable(SymbolTable symbolTable) {

        for (Scope s : symbolTable.getScopesList()) {
            for (Row r : s.getScopeVariables()) {
                if (r.getType().equals("unDeclare value")) {
                    List<Row> scopeVariable = s.getScopeVariables();
                    for (Row x : s.getScopeVariables()) {
                        if (x.getValue().equals(r.getValue()) && x.getType().equals("const")) {
                            constName = r.getValue();
                            return false;
                        }
                    }
                    scopeVariable.clear();
                }
            }

        }
        return true;

    }

//    boolean checkHooksInFunction(SymbolTable symbolTable) {
//
//        for (Scope s : symbolTable.getScopesList()) {
//            String scope = s.getScopeName();
//            for (Row r : s.getScopeVariables()) {
//                if (r.getType().equals("StringUseRef") || r.getType().equals("NumberUseRef")) {
//                    if (!scope.equals("Function App"))
//                        return false;
//                }
//            }
//        }
//        return true;
//    }

    boolean checkNameHooks(SymbolTable symbolTable) {
        List<String> hookNameList = new ArrayList<>();
        for (Scope s : symbolTable.getScopesList()) {
            for (Row r : s.getScopeVariables()) {
                if (r.getType().equals("NumberUseRef") || r.getType().equals("ValueUseRef") || r.getType().equals("StringUseRef")) {
                    hookNameList.add(r.getValue());
                }
                if (!hasNoDuplicates(hookNameList)) {
                    hookName = r.getValue();
                    return false;
                }
            }
            hookNameList.clear();
        }
        return true;
    }



    boolean checkArrayName(SymbolTable symbolTable) {
        List<String> arrays = new ArrayList<>();
        for (Scope s : symbolTable.getScopesList()) {
            for (Row r : s.getScopeVariables()) {
                if (r.getType().equals("Arrayof Objects")) {
                    arrays.add(r.getValue());
                }
                if (!hasNoDuplicates(arrays)) {
                    arrayName = r.getValue();
                    return false;
                }
            }
            arrays.clear();
        }
        return true;
    }

    boolean checkNameArrayExist() {
        String a = ArrayElement.getId();
        if (a == null) {
            return true;
        }
        List<String> arrayname = new ArrayList<>();
        for (Scope s : symbolTable.getScopesList()) {
            for (Row r : s.getScopeVariables()) {
                if (r.getType().equals("Arrayof Objects")) {
                    arrayname.add(r.getValue());
                }
            }
            for (String s1 : arrayname) {
                if (!Objects.equals(s1, a)) {
                    arrayName = a;
                    return false;
                }
            }
            arrayname.clear();
        }
        return true;
    }

    boolean findVariableInScope(String value, Scope scope) {
        List<Row> ScopeVariables = scope.getScopeVariables();
        for (Row scopevariable : ScopeVariables) {
            if (scopevariable.getValue().equals(value) &&
                    scopevariable.getType().equals("unDeclare variable")) {
                return false;
            }
            if (scopevariable.getValue().equals(value)) {

                if (scopevariable.getType().equals("const") || scopevariable.getType().equals("let")
                        || scopevariable.getType().equals("var")) {
                    return true;
                }

            }
        }
        return false;
    }

    boolean findVariableInGlobalScope(String value, Scope scope, Scope curr) {
        List<Row> ScopeVariables = scope.getScopeVariables();
        for (Row scopevariable : ScopeVariables) {
            String fullName = scopevariable.getType() + " " + scopevariable.getValue();
            if (curr.getScopeName().equals(fullName)) {
                return false;
            }
            if (scopevariable.getValue().equals(value)) {

                if (scopevariable.getType().equals("const") || scopevariable.getType().equals("let")
                        || scopevariable.getType().equals("var")) {
                    return true;
                }

            }
        }
        return false;
    }

    Map<Boolean, String> checkNameVariableExist() {
        Map<Boolean, String> map = new HashMap<>();
        List<Scope> list = new ArrayList<>();
        Scope previous = null;
        for (Scope s : symbolTable.getScopesList()) {
            list.add(s);
            for (Row r : s.getScopeVariables()) {
                if (r.getType().equals("unDeclare variable")) {
                    String value = r.getValue();
                    boolean found = findVariableInScope(value, s);
                    if (!found) {
                        Scope globalScope = symbolTable.getScopesList().get(0);
                        found = findVariableInGlobalScope(value, globalScope, s);
                    }
                    if (!found) {
                        if (previous != null) {
                            Scope curr = s;
                            list.remove(0);
                            Collections.reverse(list);
                            list.remove(0);
                            for (Scope scope : list) {
                                List<Row> ScopeVariables = scope.getScopeVariables();
                                for (Row scopevariable : ScopeVariables) {
                                    String fullName = scopevariable.getType() + " " + scopevariable.getValue();
                                    if (curr.getScopeName().equals(fullName)) {
                                        found = findVariableInGlobalScope(value, scope, curr);
                                        if (found) {
                                            map.put(true, "___");
                                            return map;
                                        } else {
                                            curr = scope;
                                        }
                                    }

                                }
                            }

                        }
                    }
                    if (!found) {
                        map.put(false, value);
                        return map;
                    }
                }
            }
            previous = s;
        }
        map.put(true, "___");
        return map;
    }

    List<String> components = new ArrayList<>();
    boolean checkComponent(SymbolTable symbolTable) {

        for (Scope s : symbolTable.getScopesList()) {
            for (Row r : s.getScopeVariables()) {
                if (r.getType().equals("Function Component")) {
                    components.add(r.getValue());
                }
                if (!hasNoDuplicates(components)) {
                    componentName = r.getValue();
                    return false;
                }

            }
//            arrays.clear();
        }
        return true;

    }
    String name;
    boolean checkComponentExist() {
        String nameComponent = Image.getId();
        name=nameComponent;
        if (nameComponent != null)
            for (String s : components) {
                if (Objects.equals(s, nameComponent)) {
                    return true;
                }
                return false;
            }
        return true;
    }


}