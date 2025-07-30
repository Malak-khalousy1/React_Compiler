package AST.props;
public class Props
{
    private String identifier;
    private String onClickLyric;
    private String function;
    private String props;

    public void setId(String id)
    {
        this.identifier = id;
    }

    public String getId()
    {
        return identifier;
    }

    public String getOnClickLyric() {
        return onClickLyric;
    }

    public void setOnClickLyric(String onClickLyric) {
        this.onClickLyric = onClickLyric;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public String getProps()
    {
        return props;
    }

    public void setProps(String props)
    {
        this.props = props;
    }

    @Override
    public String toString()
    {
        return "Props{" +
                "variable: |" + identifier + '|' +
                ", function: |" + function +
                "|} set to variable: |" + props + "|\n" ;
    }
}
