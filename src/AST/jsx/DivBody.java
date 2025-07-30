package AST.jsx;

import AST.Statement;
import org.antlr.v4.runtime.misc.Pair;

import java.util.List;

public class DivBody extends Statement {

    String divLyric;
    String cNameLyric;
    String className;
    List<Container>containerList;

    public String getDivLyric() {
        return divLyric;
    }

    public void setDivLyric(String divLyric) {
        this.divLyric = divLyric;
    }

    public String getcNameLyric() {
        return cNameLyric;
    }

    public void setcNameLyric(String cNameLyric) {
        this.cNameLyric = cNameLyric;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public List<Container> getContainerList() {
        return containerList;
    }

    public void setContainerList(List<Container> containerList) {
        this.containerList = containerList;
    }

    public String print(List<Container> c){
        String out = "";
        for(Container cc: c)
            out += "\t\t\t" + cc + "\n";
        return out;
    }

    @Override
    public String toString() {
        if (containerList!=null)
        return divLyric + " : "+ cNameLyric + "  |" + className + '|' +
                " contains{\n" + print(containerList) +
                "\n\t\t}end of div(" + className +")\n";
        else
            return "\n\t\t" + divLyric + " : "+ cNameLyric + "  |" +
                    className + '|' +
                    "\n ";

    }
    public String htmlGen(){
        StringBuilder result = new StringBuilder();
        result.append("\n<div class =");
        result.append(className);
        if(className != "\"App\""){
            result.append(" id =");
            result.append(className);
        }
        result.append('>');
        for(Container container : containerList){
            System.out.println("1");
            result.append(container.htmlGen());
        }
        result.append("</div>\n");
        return result.toString();
    }
    public String generatedID;
    public String generatedFunction;
    public String generate() {
        StringBuilder result = new StringBuilder("\n");
        StringBuilder initiateSection = new StringBuilder();
        StringBuilder work = new StringBuilder();
        for (Container container : containerList){
            container.generatedID = generatedID;
            container.generatedFunction = generatedFunction;
            Pair<String, String> cont = container.generate();
            initiateSection.append(cont.a).append('\n');
            work.append(cont.b).append('\n');
        }
        result.append(initiateSection).append(work);

        return result.toString();
    }
}
