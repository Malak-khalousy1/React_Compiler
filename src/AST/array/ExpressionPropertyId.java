package AST.array;

public class ExpressionPropertyId extends ExpressionProperty{
    String expID;

    public String getExpID() {
        return expID;
    }

    public void setExpID(String expID) {
        this.expID = expID;
    }

    @Override
    public String toString() {
        return "(attribute)"+ expID;
    }

    public String generate()
    {
        return expID;
    }
}

