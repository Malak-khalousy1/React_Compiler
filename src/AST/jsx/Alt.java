package AST.jsx;

public class Alt {

    String altLyric;
    String elementTitleAlt;

    public String getAltLyric() {
        return altLyric;
    }

    public void setAltLyric(String altLyric) {
        this.altLyric = altLyric;
    }

    public String getElementTitle() {
        return elementTitleAlt;
    }

    public void setElementTitle(String elementTitle) {
        this.elementTitleAlt = elementTitle;
    }

    @Override
    public String toString() {
        return "Alt{ " +
                elementTitleAlt +
                " }";
    }

    public String htmlGen(){
        return "alt =\"\"";
    }

    public String generate(String elementAlt, String elementTitle) {
        return elementAlt + ".alt = " +elementTitle+".title;" ;
    }
}
