package AST.expression;

public class PrimaryExpression extends  Primary{
    Expression expression;

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return "\n PrimaryExpression { " +
                "\n " + expression +
                "\n }";
    }
}
