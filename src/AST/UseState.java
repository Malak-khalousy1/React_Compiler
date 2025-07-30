package AST;

import java.util.List;

//usestate  :CONST OPEN_BRACKET ID COMMA ID CLOSE_BRACKET EQUAL USEStateT OPEN_PAREN params* CLOSE_PAREN SEMI_COLON;
public class UseState {
    String nameInitialValue;
    String nameFunction;

    List<Params>params;
    static String useStateLyric;

    public static String getUseStateLyric() {
        return useStateLyric;
    }

    public void setUseStateLyric(String useStateLyric) {
        this.useStateLyric = useStateLyric;
    }

    public String getNameFunction()
    {
        return nameFunction;
    }

    public void setNameFunction(String nameFunction) {
        this.nameFunction = nameFunction;
    }

    public List<Params> getParams() {
        return params;
    }

    public void setParams(List<Params> params) {
        this.params = params;
    }

    public String getNameInitialValue() {
        return nameInitialValue;
    }

    public void setNameInitialValue(String nameInitialValue) {
        this.nameInitialValue = nameInitialValue;
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

    @Override
    public String toString() {
        if(params!=null)
        return "\t Init value: " + nameInitialValue + ", " +
                "\tchanging value function: " + nameFunction + ", " +
                "\t arguments of useState: " + print(params) ;
        else
            return  "\t Init value: " + nameInitialValue + ", " +
                    "\t changing value function: " + nameFunction + ", " +
                    "arguments of useState: none";

    }
    public String generate(){
        StringBuilder res = new StringBuilder();
        for (Params param:params) {
            res.append("\nlet ").append(nameInitialValue).append(" = ").append(param.generate()).append('\n');
        }
        return res.toString();
    }
}
