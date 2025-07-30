package AST.expression;

import java.util.List;

public class LogicalOrExpression {
    LogicalAndExpression logicalAndExpression;
    List<LogicalOrExpression> logicalOrExpressionList;

    public LogicalAndExpression getLogicalAndExpression() {
        return logicalAndExpression;
    }

    public void setLogicalAndExpression(LogicalAndExpression logicalAndExpression) {
        this.logicalAndExpression = logicalAndExpression;
    }

    public List<LogicalOrExpression> getLogicalOrExpressionList() {
        return logicalOrExpressionList;
    }

    public void setLogicalOrExpressionList(List<LogicalOrExpression> logicalOrExpressionList) {
        this.logicalOrExpressionList = logicalOrExpressionList;
    }

    @Override
    public String toString() {
        if (logicalOrExpressionList!=null)
        return "LogicalOrExpression{" +
                "\n " + logicalAndExpression +"||" + logicalOrExpressionList +
                '}';
        else
            return "LogicalOrExpression{" +
                    "\n " + logicalAndExpression +
                    '}';
    }
}
