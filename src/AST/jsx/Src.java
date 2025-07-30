package AST.jsx;

public class Src {

    String srcLyric;
    String elementUrl;

    public String getElementUrl() {
        return elementUrl;
    }

    public void setElementUrl(String elementUrl) {
        this.elementUrl = elementUrl;
    }

    public String getSrcLyric() {
        return srcLyric;
    }

    public void setSrcLyric(String srcLyric) {
        this.srcLyric = srcLyric;
    }

    @Override
    public String toString() {
        return "Src { " +
                elementUrl +
                " }";
    }
    String htmlGen(){
        return "src =\"\"";
    }
    public String generate(String elementSrc, String elementUri) {

        return elementSrc+".src = " + elementUri+".url ;";
    }
}
