package AST.expression;

import java.util.List;

public class MultiplicativeExpression {
    UnaryExpression unaryExpression;
    char multiply;
    char divide;

    List<MultiplicativeExpression>multiplicativeExpressionList;


    public char getDivide() {
        return divide;
    }

    public void setDivide(char divide) {
        this.divide = divide;
    }

    public List<MultiplicativeExpression> getMultiplicativeExpressionList() {
        return multiplicativeExpressionList;
    }

    public void setMultiplicativeExpressionList(List<MultiplicativeExpression> multiplicativeExpressionList) {
        this.multiplicativeExpressionList = multiplicativeExpressionList;
    }

    public char getMultiply() {
        return multiply;
    }

    public void setMultiply(char multiply) {
        this.multiply = multiply;
    }

    public UnaryExpression getUnaryExpression() {
        return unaryExpression;
    }

    public void setUnaryExpression(UnaryExpression unaryExpression) {
        this.unaryExpression = unaryExpression;
    }


    @Override
    public String toString() {
        if(multiplicativeExpressionList!=null)
            if (multiply!='\0')
        return "\n MultiplicativeExpression { " +
                "\n " + unaryExpression + " * "+ multiplicativeExpressionList +

                "\n }";
        else
                return "\n MultiplicativeExpression { " +
                        "\n " + unaryExpression + " / "+ multiplicativeExpressionList +
                        "\n }";
        else
            return "\n MultiplicativeExpression { " +
                    "\n " + unaryExpression + " "+
                    "\n }";

    }
}
