package AST.expression;

import java.util.List;

public class RelationalExpression {
    AdditiveExpression additiveExpression;
    char greater;
    char smaller;
    String lessThanEquals;
    String greaterThanEquals;
    List<RelationalExpression>relationalExpressionList;

    public AdditiveExpression getAdditiveExpression() {
        return additiveExpression;
    }

    public void setAdditiveExpression(AdditiveExpression additiveExpression) {
        this.additiveExpression = additiveExpression;
    }

    public List<RelationalExpression> getRelationalExpressionList() {
        return relationalExpressionList;
    }

    public void setRelationalExpressionList(List<RelationalExpression> relationalExpressionList) {
        this.relationalExpressionList = relationalExpressionList;
    }

    public char getGreater() {
        return greater;
    }

    public void setGreater(char greater) {
        this.greater = greater;
    }

    public String getGreaterThanEquals() {
        return greaterThanEquals;
    }

    public void setGreaterThanEquals(String greaterThanEquals) {
        this.greaterThanEquals = greaterThanEquals;
    }

    public String getLessThanEquals() {
        return lessThanEquals;
    }

    public void setLessThanEquals(String lessThanEquals) {
        this.lessThanEquals = lessThanEquals;
    }

    public char getSmaller() {
        return smaller;
    }

    public void setSmaller(char smaller) {
        this.smaller = smaller;
    }

    @Override
    public String toString() {
        if(relationalExpressionList!= null)
            if (greater!='\0')
        return " \n RelationalExpression { " +
                "\n " + additiveExpression + ">" + relationalExpressionList +
                "\n }";
            else if (smaller!='\0')
                return " \n RelationalExpression { " +
                        "\n " + additiveExpression + "<" + relationalExpressionList +
                        "\n }";
            else if (lessThanEquals!=null)
                return " \n RelationalExpression { " +
                        "\n " + additiveExpression + "<=" + relationalExpressionList +
                        "\n }";
            else
                return " \n RelationalExpression { " +
                        "\n " + additiveExpression + ">=" + relationalExpressionList +
                        "\n }";
            else
            return " \n RelationalExpression { " +
                    "\n " + additiveExpression + " "+
                    "\n }";



    }
}
