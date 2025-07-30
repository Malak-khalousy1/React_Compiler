package AST.jsx;

public class Paragraph {
    String paragraphLyric;
    Description description;


    public String getParagraphLyric() {
        return paragraphLyric;
    }

    public void setParagraphLyric(String paragraphLyric) {
        this.paragraphLyric = paragraphLyric;
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return " Paragraph{ " +
                description +
               " }";
    }

    public String htmlGen(){
        StringBuilder res = new StringBuilder();
        res.append("<p id=\"selected-image-description\"></p>");
        return res.toString();
    }
    public String generate(String src, String trg)
    {
        return src + ".textContext = " + description.generate(trg);
    }
}
