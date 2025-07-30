package AST.props;

public class ElementURL extends Element
{
    private String url;

    public String getUrl()
    {
        return url;
    }
    public void setUrl(String url)
    {
        this.url = url;
    }

    @Override
    public String toString()
    {
        return "ElementURL{" +
                "url='" + url + '\'' +
                '}';
    }
}
