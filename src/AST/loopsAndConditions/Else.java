package AST.loopsAndConditions;

public class Else
{
    private IfBody body;

    public Else(IfBody body) {
        this.body = body;
    }

    public IfBody getBody() {
        return body;
    }

    public void setBody(IfBody body) {
        this.body = body;
    }
}
