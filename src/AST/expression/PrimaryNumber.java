package AST.expression;

public class PrimaryNumber extends  Primary{
    int primNum;

    public int getPrimNum() {
        return primNum;
    }

    public void setPrimNum(int primNum) {
        this.primNum = primNum;
    }

    @Override
    public String toString() {
        return "\n PrimaryNumber{" +
                "\n" + primNum +
                "\n }";
    }
}
