package AST.jsx;

public class Key {
    String keyLyric;
    String elementId;

    public String getElementId() {
        return elementId;
    }

    public void setElementId(String elementId) {
        this.elementId = elementId;
    }


    public String getKeyLyric() {
        return keyLyric;
    }

    public void setKeyLyric(String keyLyric) {
        this.keyLyric = keyLyric;
    }

    @Override
    public String toString() {
        return "Key { " +
                elementId +
                "}";
    }

}
