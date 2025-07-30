package AST.prints;

import AST.Statement;
import AST.Value;

public class VariableValueAssignment extends Statement {
    String variableName;
    Value value;

    public String getVariableName() {
        return variableName;
    }

    public void setVariableName(String variableName) {
        this.variableName = variableName;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "VariableValueAssignment{" +
                "variableName='" + variableName + '\'' +
                ", value=" + value +
                '}';
    }
}
