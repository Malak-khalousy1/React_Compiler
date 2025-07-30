package AST.props;

import AST.jsx.OnClick;

import java.util.List;

public class PropsReturn
{
    private String id;
    private List<Element> element;
    private OnClick onClick;

    public void setImage(String id)
    {
        this.id = id;
    }

    public void setOnClick(OnClick onClick)
    {
        this.onClick = onClick;
    }

    public String getImage()
    {
        return id;
    }

    public OnClick getOnClick()
    {
        return onClick;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Element> getElement() {
        return element;
    }

    public void setElement(List<Element> element) {
        this.element = element;
    }

    public String print(List<Element> e){
        String out="";
        for(int i=0;i<e.size();i++){
            out += "\t\t\t " + e.get(i);
            out+=",\n";
        }
        return out;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\t\t\t|" + id + "| attributes:\n");
        if (element != null) {
            sb.append(print(element)).append(", ");
        }
        if (onClick != null) {
            sb.append("\t\t\t Element{onClick=").append(onClick).append("}\n");
        }
        sb.append("\n");
        return sb.toString();
    }
}

