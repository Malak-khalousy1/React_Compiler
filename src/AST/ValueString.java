package AST;

public class ValueString extends  Value {
    String valStr;

    public String getValStr() {
        return valStr;
    }

    public void setValStr(String valStr) {
        this.valStr = valStr;
    }

    @Override
    public String toString() {
        return "(string)" + valStr;
    }

    @Override
    public String generate()
    {
        return valStr;
    }
}
