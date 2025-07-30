package AST.prints;

public class PrintValueString extends PrintValue
{
    private String stringValue;
    public String getStringValue()
    {
        return stringValue;
    }
    public void setStringValue(String stringValue)
    {
        this.stringValue = stringValue;
    }

    @Override
    public String toString() {
        return "PrintValueString{" +
                "stringValue='" + stringValue + '\'' +
                '}';
    }
}
