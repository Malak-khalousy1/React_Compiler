package AST.jsx;

public class Heading {

    String headingLyric;
    Title title;


    public String getHeadingLyric() {
        return headingLyric;
    }

    public void setHeadingLyric(String headingLyric) {
        this.headingLyric = headingLyric;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return " Heading { " +
                title +
                " }";
    }
    String htmlGen(){
        return "<h2 id = \"selected-image-title\"></h2>";
    }
    public String generate(String src, String trg)
    {
        return src + ".textContext = " + title.generate(trg);
    }
}
