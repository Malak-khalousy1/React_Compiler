package AST.jsx;

import org.antlr.v4.runtime.misc.Pair;

public class Container {
    DivBody divBody;
    LL ll;
    Image image;
    Heading heading;
    Paragraph paragraph;

    String genType;
    public Paragraph getParagraph() {
        return paragraph;
    }

    public void setParagraph(Paragraph paragraph) {
        this.paragraph = paragraph;
    }

    public LL getLl() {
        return ll;
    }

    public void setLl(LL ll) {
        this.ll = ll;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public Heading getHeading() {
        return heading;
    }

    public void setHeading(Heading heading) {
        this.heading = heading;
    }

    public DivBody getDivBody() {
        return divBody;
    }

    public void setDivBody(DivBody divBody) {
        this.divBody = divBody;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Container {");

        if (divBody != null) {
            sb.append(" new div= ").append(divBody);
        }

        if (ll != null) {
            sb.append(" ll=").append(ll);
        }

        if (image != null) {
            sb.append(" ").append(image);
        }

        if (heading != null) {
            sb.append(" ").append(heading);
        }

        if (paragraph != null) {
            sb.append(" paragraph=").append(paragraph);
        }

        sb.append("\n\t");
        return sb.toString();
    }
    String elementId ="";
    String htmlGen(){
        if (image != null) {
            return image.htmlGen() + "\n";
        }
///////////////////////////////////////////
        else if (heading != null) {
            return heading.htmlGen() +"\n";
        }

        else if(paragraph != null) {
            return paragraph.htmlGen() + "\n";
        }
        else if(ll != null){
            return ll.htmlGen();
        }
        else {
            return divBody.htmlGen();
        }
    }

    public String generatedID;
    public String generatedFunction;
    public Pair<String,String> generate()
    {
        StringBuilder initiateSection = new StringBuilder();;
        StringBuilder workSection = new StringBuilder();;

        StringBuilder res = new StringBuilder();
        if (image != null) {
            elementId = "selected-image-img";
            image.generatedFunction = generatedFunction;
            workSection.append(image.generate(generatedID, camelCase(elementId), "update"));
        }

        else if (heading != null) {
            elementId = "selected-image-title";
            workSection.append(heading.generate(camelCase(elementId), generatedID));
        }

        else if (paragraph != null) {
            elementId = "selected-image-description";
            workSection.append(paragraph.generate(camelCase(elementId), generatedID)).append("\n}");
        }
        else if(ll != null){
            workSection.append(ll.generate());
        }
        else{
            elementId = divBody.getClassName().replace('\"', ' ').trim();
            workSection.append(divBody.generate());
        }
        if(elementId != ""){
        initiateSection.append("const ").append(camelCase(elementId)).append(" = document.getElementById('")
                .append(elementId).append("');").append('\n');
        }
        return new Pair<>(initiateSection.toString(), workSection.toString());
    }

    public static String camelCase(String s)
    {
        String[] parts = s.split("-");
        StringBuilder camelCase = new StringBuilder(parts[0]);
        for(int i=1; i<parts.length; i++){
            camelCase.append(parts[i].substring(0, 1).toUpperCase())
                    .append(parts[i].substring(1));
        }
        return camelCase.toString();
    }
}
