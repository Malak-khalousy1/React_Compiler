package AST.loopsAndConditions;

public class While
{
    private WhileCondition whileCondition;
    private WhileBody whileBody;

    public WhileCondition getWhileCondition()
    {
        return whileCondition;
    }

    public void setWhileCondition(WhileCondition whileCondition)
    {
        this.whileCondition = whileCondition;
    }

    public WhileBody getWhileBody()
    {
        return whileBody;
    }

    public void setWhileBody(WhileBody whileBody)
    {
        this.whileBody = whileBody;
    }
}
