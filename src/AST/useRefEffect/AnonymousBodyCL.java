package AST.useRefEffect;

import AST.prints.ConsoleLogStatement;

public class AnonymousBodyCL extends AnonymousBody
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
}
