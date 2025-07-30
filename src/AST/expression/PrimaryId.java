package AST.expression;

public class PrimaryId extends Primary{
    String primId;

    public String getPrimId() {
        return primId;
    }

    public void setPrimId(String primId) {
        this.primId = primId;
    }

    @Override
    public String toString() {
        return "\n PrimaryId {" +
                "\n " + primId + '\'' +
                "\n }";
    }
}
