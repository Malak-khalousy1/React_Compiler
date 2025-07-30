package AST.loopsAndConditions;

public class ElseIF
{
    private IfCondition condition;
    private IfBody body;
    public ElseIF(IfCondition condition, IfBody body) {
        this.condition = condition;
        this.body = body;
    }

    public IfCondition getCondition() {
        return condition;
    }

    public void setCondition(IfCondition condition) {
        this.condition = condition;
    }

    public IfBody getBody() {
        return body;
    }

    public void setBody(IfBody body) {
        this.body = body;
    }
}
