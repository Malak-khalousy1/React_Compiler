package AST.expression;

public class UnaryExpression {
    Primary primaryExpression;
    UnaryExpression unaryExpression;
    char plus;
    char minus;
    char not;
    char bitNot;

    public char getPlus() {
        return plus;
    }

    public void setPlus(char plus) {
        this.plus = plus;
    }

    public char getNot() {
        return not;
    }

    public void setNot(char not) {
        this.not = not;
    }

    public char getMinus() {
        return minus;
    }

    public void setMinus(char minus) {
        this.minus = minus;
    }

    public char getBitNot() {
        return bitNot;
    }

    public void setBitNot(char bitNot) {
        this.bitNot = bitNot;
    }

    public Primary getPrimaryExpression() {
        return primaryExpression;
    }

    public void setPrimaryExpression(Primary primaryExpression) {
        this.primaryExpression = primaryExpression;
    }

    public UnaryExpression getUnaryExpression() {
        return unaryExpression;
    }

    public void setUnaryExpression(UnaryExpression unaryExpression) {
        this.unaryExpression = unaryExpression;
    }


    @Override
    public String toString() {
        if (unaryExpression!=null)
            if (plus!='\0')
        return "UnaryExpression {" +
                "\n " +"+"+ unaryExpression +
               "\n }";
        else if (minus!='\0')
            return "UnaryExpression {" +
                    "\n " +"-"+ unaryExpression +
                    "\n }";
            else if (not !='\0')
                return "UnaryExpression {" +
                        "\n " +"!"+ unaryExpression +
                        "\n }";
            else
                return "UnaryExpression {" +
                        "\n " +"~"+ unaryExpression +
                        "\n }";
            else
            return "primaryExpression {" +
                    "\n " + primaryExpression +
                    "\n }";



    }
}
