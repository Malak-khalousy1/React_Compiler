package AST.loopsAndConditions;

import AST.prints.PrintValue;

public class ForBody
{
    private String id;
    private PrintValue printValue;

    public ForBody(String id, PrintValue printValue) {
        this.id = id;
        this.printValue = printValue;
    }

    public String getId()
    {
        return id;
    }

    public PrintValue getPrintValue()
    {
        return printValue;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public void setPrintValue(PrintValue printValue)
    {
        this.printValue = printValue;
    }

    @Override
    public String toString() {
        return "ForBody{" +
                "identifier='" + id + '\'' +
                ", printValue=" + printValue +
                '}';
    }
}
