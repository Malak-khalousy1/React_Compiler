package AST.function;

import AST.Statement;
import AST.prints.ConsoleLogStatement;
import AST.prints.ConstStatement;
import AST.prints.DeclarationStatement;
import AST.prints.VariableValueAssignment;

import java.util.List;

public class FunctionReturnValue extends Statement {

    private String functionName;
    private String parameterName;
    List<DeclarationStatement> declarationStatementList;
    List<ConstStatement>constStatementList;
    List<ConsoleLogStatement>consoleLogStatementList;
    List<VariableValueAssignment>variableValueAssignmentList;
    List<FunctionReturnValue>functionReturnValueList;

    public List<FunctionReturnValue> getFunctionReturnValueList() {
        return functionReturnValueList;
    }

    public void setFunctionReturnValueList(List<FunctionReturnValue> functionReturnValueList) {
        this.functionReturnValueList = functionReturnValueList;
    }

    private String value;

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public String getParameterName() {
        return parameterName;
    }


    public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }

    public List<DeclarationStatement> getDeclarationStatementList() {
        return declarationStatementList;
    }

    public void setDeclarationStatementList(List<DeclarationStatement> declarationStatementList) {
        this.declarationStatementList = declarationStatementList;
    }

    public List<ConstStatement> getConstStatementList() {
        return constStatementList;
    }

    public void setConstStatementList(List<ConstStatement> constStatementList) {
        this.constStatementList = constStatementList;
    }

    public List<ConsoleLogStatement> getConsoleLogStatementList() {
        return consoleLogStatementList;
    }

    public void setConsoleLogStatementList(List<ConsoleLogStatement> consoleLogStatementList) {
        this.consoleLogStatementList = consoleLogStatementList;
    }

    public List<VariableValueAssignment> getVariableValueAssignmentList() {
        return variableValueAssignmentList;
    }

    public void setVariableValueAssignmentList(List<VariableValueAssignment> variableValueAssignmentList) {
        this.variableValueAssignmentList = variableValueAssignmentList;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "FunctionReturnValue{" +
                "functionName='" + functionName + '\'' +
                ", parameterName='" + parameterName + '\'' +
                ", declarationStatementList=" + declarationStatementList +
                ", constStatementList=" + constStatementList +
                ", consoleLogStatementList=" + consoleLogStatementList +
                ", variableValueAssignmentList=" + variableValueAssignmentList +
                ", value='" + value + '\'' +
                '}';
    }
}
