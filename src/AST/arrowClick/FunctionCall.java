package AST.arrowClick;

import AST.Params;
import AST.Statement;

import java.util.List;

public class FunctionCall extends Statement {
    static String nameFunctionCall;
    List<Params>paramsList;

    public  String getNameFunctionCall() {
        return nameFunctionCall;
    }

    public void setNameFunctionCall(String nameFunctionCall) {
        this.nameFunctionCall = nameFunctionCall;
    }

    public List<Params> getParamsList() {
        return paramsList;
    }
    public void setParamsList(List<Params> paramsList) {
        this.paramsList = paramsList;
    }

    public String print(List<Params> pms){
        String out = "(";
        for(int i=0;i<pms.size();i++){
            out += pms.get(i);
            if(i!=pms.size()-1) out += ", ";
        }
        out += " )";
        return out;
    }

    //setSelectedImage(image);
    @Override
    public String toString() {
        if (paramsList!=null)
        return "\n\t\t Call function |" +
                nameFunctionCall.toUpperCase() + " " +print(paramsList) + "|";
        else
            return "\n\t\t Call function |" +
                    nameFunctionCall.toUpperCase() + "()|";
    }


}
