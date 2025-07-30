package AST.prints;

public class PrintValueCL extends PrintValue
{
    private ConsoleLogStatement consoleLogStatement;

    public ConsoleLogStatement getConsoleLogStatement()
    {
        return consoleLogStatement;
    }

    public void setConsoleLogStatement(ConsoleLogStatement consoleLogStatement)
    {
        this.consoleLogStatement = consoleLogStatement;
    }

    @Override
    public String toString() {
        return "PrintValueCL{" +
                "consoleLogStatement=" + consoleLogStatement +
                '}';
    }
}
