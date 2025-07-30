package AST.expression;

import java.util.List;

public class EqualityExpression {
    RelationalExpression relationalExpression;
    String equal;
    String notEqual;

    List<EqualityExpression>equalityExpressions;

    public RelationalExpression getRelationalExpression() {
        return relationalExpression;
    }

    public void setRelationalExpression(RelationalExpression relationalExpression) {
        this.relationalExpression = relationalExpression;
    }

    public List<EqualityExpression> getEqualityExpressions() {
        return equalityExpressions;
    }

    public void setEqualityExpressions(List<EqualityExpression> equalityExpressions) {
        this.equalityExpressions = equalityExpressions;
    }

    public String getEqual() {
        return equal;
    }

    public void setEqual(String equal) {
        this.equal = equal;
    }

    public String getNotEqual() {
        return notEqual;
    }

    public void setNotEqual(String notEqual) {
        this.notEqual = notEqual;
    }

    @Override
    public String toString() {
        if (equal != null)
        return "EqualityExpression{" +
                " " + relationalExpression + "==" + equalityExpressions +
               "\n }";
        else
            return "NotEqualityExpression{" +
                    " " + relationalExpression + "!=" + equalityExpressions +
                    "\n }";
    }
}
