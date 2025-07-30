package AST.expression;

import AST.Statement;

public class Expression extends Statement {
    LogicalOrExpression logicalOrExpression;

    public LogicalOrExpression getLogicalOrExpression() {
        return logicalOrExpression;
    }

    public void setLogicalOrExpression(LogicalOrExpression logicalOrExpression) {
        this.logicalOrExpression = logicalOrExpression;
    }

    @Override
    public String toString() {
        return "\n Expression { " +
                "\n" + logicalOrExpression +
                "\n }";
    }
}
