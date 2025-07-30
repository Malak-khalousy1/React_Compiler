package AST.arrowClick;

import AST.Statement;

public class ArrowClick extends Statement {
    String nameFunctionClick;
    String nameArgument;
    FunctionCall functionCall;

    public FunctionCall getFunctionCall() {
        return functionCall;
    }

    public void setFunctionCall(FunctionCall functionCall) {
        this.functionCall = functionCall;
    }

    public String getNameFunctionClick() {
        return nameFunctionClick;
    }

    public void setNameFunctionClick(String nameFunctionClick) {
        this.nameFunctionClick = nameFunctionClick;
    }

    public String getNameArgument() {
        return nameArgument;
    }

    public void setNameArgument(String nameArgument) {
        this.nameArgument = nameArgument;
    }

    @Override
    public String toString() {
        if (nameArgument!=null)
        return "\t Function name: |" + nameFunctionClick.toUpperCase() + '|' +
                ", Function argument: |" + nameArgument + '|' + ','+
                "\n\t Function body: " + functionCall;
        else
            return "\t Function name: |" +
                    nameFunctionClick.toUpperCase() + '|' + "Function argument: none,"+
                    "\n\t Function body: " + functionCall;
    }
    public String generatedID;
    public String generatedFunction;
    public String generate()
    {
        return "function " +nameFunctionClick+ "(" +nameArgument+") {\n"+ generatedID +" = "+nameArgument+
                ";\n"+ generatedFunction + "();\n}";
    }
}
