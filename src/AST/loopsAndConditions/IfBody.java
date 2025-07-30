package AST.loopsAndConditions;

import AST.prints.PrintValue;

import java.util.List;

public class IfBody
{
   List<String>id;
   List<PrintValue>printValueList;

    public List<String> getId() {
        return id;
    }

    public void setId(List<String> id) {
        this.id = id;
    }

    public List<PrintValue> getPrintValueList() {
        return printValueList;
    }

    public void setPrintValueList(List<PrintValue> printValueList) {
        this.printValueList = printValueList;
    }
}
