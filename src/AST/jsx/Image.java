package AST.jsx;

import AST.props.Element;

import java.util.List;

public class Image {
//key? src alt onClick?

    String imageLyric;
    Key key;
    Src src;
    Alt alt;
    OnClick onClick;

    static String id;
    List<Element> e;

    public static String getId() {
        return id;
    }

    public void setId(String id) {
        Image.id = id;
    }

    public String getImageLyric() {
        return imageLyric;
    }

    public void setImageLyric(String imageLyric) {
        this.imageLyric = imageLyric;
    }

    public List<Element> getE() {
        return e;
    }

    public void setE(List<Element> e) {
        this.e = e;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Src getSrc() {
        return src;
    }

    public void setSrc(Src src) {
        this.src = src;
    }

    public Alt getAlt() {
        return alt;
    }

    public void setAlt(Alt alt) {
        this.alt = alt;
    }

    public OnClick getOnClick() {
        return onClick;
    }

    public void setOnClick(OnClick onClick) {
        this.onClick = onClick;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Image ={");

        if(imageLyric != null){
            if (key != null)
                sb.append(" ").append(key);
            sb.append(" ").append(src);
            sb.append(" ").append(alt);
            if (onClick != null)
                sb.append(" ").append(onClick);
        }
        else if(id!=null) {
            sb.append("\n\t\t\t\t\tComponent: <").append(id).append("   ");
            if (e != null) {
                if (e.size() > 0)
                    sb.append(e);
            }
            sb.append("\n\t\t\t\t> end of container ").append(id).append("\n");
        }

        sb.append(" }");
        return sb.toString();
    }
    String idName = "\"selected-image-image\"";
    String htmlGen(){
        StringBuilder res = new StringBuilder();
        res.append("<").append(imageLyric).append(" id =").append(idName).append(' ')
                .append(src.htmlGen()).append(' ')
                .append(alt.htmlGen()).append(">");
        return res.toString();
    }
    public String generatedFunction;
    public String generate(String arg, String container, String mode) {
        StringBuilder res = new StringBuilder();
        //declare
        if(mode == "dec"){
            String generatedContainer = "imgElement";
            res.append("const ").append(generatedContainer).append(" = document.getElementById('img')").append('\n');
            if (src != null) {
                res.append(src.generate(generatedContainer, arg)).append('\n');
            }
            if (alt != null) {
                res.append(alt.generate(generatedContainer, arg)).append('\n');
            }
            if (onClick != null) {
                res.append(onClick.generate(generatedContainer, arg, "image")).append('\n');
            }
            res.append("imageContainer.appendChild(imgElement);");
        }
        //update
        else{
            res.append("function ").append(generatedFunction).append("() {\n")
                    .append(src.generate(container, arg)).append('\n')
                    .append(alt.generate(container, arg));

        }

        return res.toString();
    }
}
