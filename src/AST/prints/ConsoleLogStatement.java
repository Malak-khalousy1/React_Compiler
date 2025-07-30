package AST.prints;

import AST.Statement;

public class ConsoleLogStatement extends Statement
{
    private PrintValue value;

    // Getter and Setter for variable
    public PrintValue getVariable()
    {
        return value;
    }

    public void setVariable(PrintValue variable)
    {
        this.value = variable;
    }

    @Override
    public String toString() {
        return "ConsoleLogStatement{" +
                "variable='" + value + '\'' +
                '}';
    }
}
