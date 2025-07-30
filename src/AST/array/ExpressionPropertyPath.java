package AST.array;

public class ExpressionPropertyPath extends ExpressionProperty{
    String expPath;

    public String getExpPath() {
        return expPath;
    }

    public void setExpPath(String expPath) {
        this.expPath = expPath;
    }

    @Override
    public String toString() {
        return "(path) '" + expPath + "'";
    }

    public String generate()
    {
        return expPath;
    }
}
