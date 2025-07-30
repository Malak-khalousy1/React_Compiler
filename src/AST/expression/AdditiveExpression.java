package AST.expression;


import java.util.List;

public class AdditiveExpression {
    MultiplicativeExpression multiplicativeExpression;
    char plus;
    char minus;
    List<AdditiveExpression> additiveExpressionList;

    public List<AdditiveExpression> getAdditiveExpressionList() {
        return additiveExpressionList;
    }

    public void setAdditiveExpressionList(List<AdditiveExpression> additiveExpressionList) {
        this.additiveExpressionList = additiveExpressionList;
    }

    public MultiplicativeExpression getMultiplicativeExpression() {
        return multiplicativeExpression;
    }

    public void setMultiplicativeExpression(MultiplicativeExpression multiplicativeExpression) {
        this.multiplicativeExpression = multiplicativeExpression;
    }

    public char getPlus() {
        return plus;
    }

    public void setPlus(char plus) {
        this.plus = plus;
    }

    public char getMinus() {
        return minus;
    }

    public void setMinus(char minus) {
        this.minus = minus;
    }


    @Override
    public String toString() {
        if (additiveExpressionList!=null)
            if (plus!='\0')
        return "\n AdditiveExpression { " +
                " \n " + multiplicativeExpression + "+"+ additiveExpressionList +
                "\n }";
        else
                return "\n AdditiveExpression { " +
                        " \n " + multiplicativeExpression + "-"+ additiveExpressionList +
                        "\n }";
        else
            return "\n AdditiveExpression { " +
                    " \n " + multiplicativeExpression + " "+
                    "\n }";

    }
}
