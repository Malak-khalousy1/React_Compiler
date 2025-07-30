package AST.props;

public class ElementTitlee extends Element
{
    private String title;


    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    @Override
    public String toString()
    {
        return "ElementTitle{" +
                "title='" + title + '\'' +
                '}';
    }
}
