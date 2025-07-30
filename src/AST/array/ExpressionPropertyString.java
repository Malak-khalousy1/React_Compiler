package AST.array;

public class ExpressionPropertyString extends ExpressionProperty{
    String expString;
    public String getExpString() {
        return expString;
    }

    public void setExpString(String expString) {
        this.expString = expString;
    }
    @Override
    public String toString() {
        return "(string) '" + expString + "'";
    }
    public String generate()
    {
        return expString;
    }

}
