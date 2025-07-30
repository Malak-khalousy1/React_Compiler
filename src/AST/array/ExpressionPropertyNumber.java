package AST.array;

public class ExpressionPropertyNumber extends  ExpressionProperty{
    int expNumber;

    public int getExpNumber() {
        return expNumber;
    }

    public void setExpNumber(int number) {
        this.expNumber = number;
    }

    @Override
    public String toString() {
        return "(num)" +
                expNumber;
    }

    public String generate()
    {
        return String.valueOf(expNumber);
    }
}
