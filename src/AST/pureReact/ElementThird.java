package AST.pureReact;

import java.util.List;

public class ElementThird
{
    String third;
    List<CreateImageElements> elementThird;

    public String getThird() {
        return third;
    }

    public void setThird(String third) {
        this.third = third;
    }

    public List<CreateImageElements> getElementThird() {
        return elementThird;
    }

    public void setElementThird(List<CreateImageElements> elementThird) {
        this.elementThird = elementThird;
    }

    public String print(List<CreateImageElements> cie){
        String out = "{\n";
        for(int i=0;i<cie.size();i++){
            out += "\t\t\t" + cie.get(i);
            if(i!=cie.size()-1)
                out += ",\n";
        }
        out += "\t\t}";
        return out;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (third != null) {
            sb.append("(var) ").append(third).append(' ');
        }
        if (elementThird != null) {
            if (!elementThird.isEmpty())
                sb.append(" ").append(print(elementThird));
        }
        sb.append("\n\t\t\tend of inner");
        return sb.toString();
    }

}
