package AST.loopsAndConditions;

import AST.prints.PrintValue;

import java.util.List;

public class WhileBody
{
    private String identifier;
    private String operation;
    List<PrintValue> printValueList;
    List<String> id;

    public List<PrintValue> getPrintValueList() {
        return printValueList;
    }

    public void setPrintValueList(List<PrintValue> printValueList) {
        this.printValueList = printValueList;
    }

    public List<String> getId() {
        return id;
    }

    public void setId(List<String> id) {
        this.id = id;
    }

    public String getIdentifier()
    {
        return identifier;
    }
    public void setIdentifier(String identifier)
    {
        this.identifier = identifier;
    }
    public String getOperation()
    {
        return operation;
    }
    public void setOperation(String operation)
    {
        this.operation = operation;
    }


}
