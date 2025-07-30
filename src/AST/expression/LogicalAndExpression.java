package AST.expression;

import java.util.List;

public class LogicalAndExpression {
    EqualityExpression equalityExpression;
    List<LogicalAndExpression>logicalAndExpressionList;

    public EqualityExpression getEqualityExpression() {
        return equalityExpression;
    }

    public void setEqualityExpression(EqualityExpression equalityExpression) {
        this.equalityExpression = equalityExpression;
    }

    public List<LogicalAndExpression> getLogicalAndExpressionList() {
        return logicalAndExpressionList;
    }

    public void setLogicalAndExpressionList(List<LogicalAndExpression> logicalAndExpressionList) {
        this.logicalAndExpressionList = logicalAndExpressionList;
    }


    @Override
    public String toString() {
        if (logicalAndExpressionList!=null)
        return "\n LogicalAndExpression { " +
                "\n" + equalityExpression + "&&"+ logicalAndExpressionList +
                "\n }";
        else
            return "\n LogicalAndExpression { " +
                    "\n" + equalityExpression +
                    "\n }";

    }
}
