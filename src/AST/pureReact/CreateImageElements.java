package AST.pureReact;
import java.util.List;

public class CreateImageElements {
    private String createImageElementLyric;
    private String argumentFirst;
    private ElementSecond elementSecond;
    private ElementThird elementThird;

    public String getCreateImageElementLyric() {
        return createImageElementLyric;
    }

    public void setCreateImageElementLyric(String createImageElementLyric) {
        this.createImageElementLyric = createImageElementLyric;
    }

    public String getArgumentFirst() {
        return argumentFirst;
    }

    public void setArgumentFirst(String argumentFirst) {
        this.argumentFirst = argumentFirst;
    }

    public ElementSecond getElementSecond() {
        return elementSecond;
    }

    public void setElementSecond(ElementSecond elementSecond) {
        this.elementSecond = elementSecond;
    }

    public ElementThird getElementThird() {
        return elementThird;
    }

    public void setElementThird(ElementThird elementThird) {
        this.elementThird = elementThird;
    }

    public String print(List<String> ie){
        String out = "[\n";
        for(int i=0;i<ie.size();i++){
            out += "\t\t" + ie.get(i);
            if(i!=ie.size()-1)
                out += ",\n\t\t";
        }
        out+="\n\t\t]";
        return out;
    }


    public String toString() {
        StringBuilder sb = new StringBuilder("\t\tCreate React Element: {");
        if (argumentFirst != null) {
            sb.append("\n\t\t\t").append(argumentFirst).append(',').append(' ');
        }
        if (elementSecond != null) {
            sb.append("\n\t\t\t").append(elementSecond).append(',').append(' ');
        }
        if (elementThird != null) {
            sb.append("\n\t\t\t(inner elements) {\n\t").append(elementThird).append(',').append("\n\t\t}");
        }
        sb.append("\n\t\t} end of create react element");
        return sb.toString();
    }

}