package AST.pureReact;
public class ElementProperty {

    String keyLyric;
    String elementId;

    String srcLyric;
    String elementUrl;

    String altLyric;

    String elementTitle;

    public String getElementId() {
        return elementId;
    }

    public void setElementId(String elementId) {
        this.elementId = elementId;
    }

    public String getElementUrl() {
        return elementUrl;
    }

    public void setElementUrl(String elementUrl) {
        this.elementUrl = elementUrl;
    }

    public String getElementTitle() {
        return elementTitle;
    }

    public void setElementTitle(String elementTitle) {
        this.elementTitle = elementTitle;
    }

    public String getKeyLyric() {
        return keyLyric;
    }

    public void setKeyLyric(String keyLyric) {
        this.keyLyric = keyLyric;
    }

    public String getAltLyric() {
        return altLyric;
    }

    public void setAltLyric(String altLyric) {
        this.altLyric = altLyric;
    }

    public String getSrcLyric() {
        return srcLyric;
    }

    public void setSrcLyric(String srcLyric) {
        this.srcLyric = srcLyric;
    }

    @Override
    public String toString() {
        if (elementId!=null)
        return  elementId + ',';
        else if (elementUrl!=null)
                return elementUrl + ',';
        else
            return elementTitle + ',';

    }
}
