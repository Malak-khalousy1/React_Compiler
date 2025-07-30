package AST.pureReact;

import java.util.List;

public class ElementSecond {
    String classNameLyric;
    String str;
    String keyLyric;
    String srcLyric;
    String altLyric;
    String elementId;
    String elementUrl;
    String elementTitle;
    String elementDescription;
    String elementSecondId;
    List<String> elementSecondList;

    public String getClassNameLyric() {
        return classNameLyric;
    }

    public void setClassNameLyric(String classNameLyric) {
        this.classNameLyric = classNameLyric;
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

    public String getKeyLyric() {
        return keyLyric;
    }

    public void setKeyLyric(String keyLyric) {
        this.keyLyric = keyLyric;
    }

    public String getNameClass() {
        return str;
    }

    public void setNameClass(String nameClass) {
        this.str = nameClass;
    }

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

    public String getElementDescription() {
        return elementDescription;
    }

    public void setElementDescription(String elementDescription) {
        this.elementDescription = elementDescription;
    }

    public void setElementTitle(String elementTitle) {
        this.elementTitle = elementTitle;
    }

    public String getElementSecondId() {
        return elementSecondId;
    }

    public void setElementSecondId(String elementSecondId) {
        this.elementSecondId = elementSecondId;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public List<String> getElementSecondList() {
        return elementSecondList;
    }

    public void setElementSecondList(List<String> elementSecondList) {
        this.elementSecondList = elementSecondList;
    }

    @Override
    public String toString() {
        if (elementSecondId == null)
        {
            if (str != null)
                return "(class) " + str;
            else if (elementId != null)
                return "(attribute) " + elementId;
            else if (elementUrl != null)
                return "(url) " + elementUrl;
            else if (elementTitle != null)
                return "(title) " + elementTitle;
            else if (elementDescription!=null)
                return "(description) " + elementDescription;
            else
                return elementSecondList.toString();
        }
        else {
            return "(secondId) " + elementSecondId;
        }
    }
}