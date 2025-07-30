package AST.props;

public class PropsBody
{
    private Props props;
    private PropsReturn propsReturn;
    private String returnLyric;

    public void setProps(Props props)
    {
        this.props = props;
    }

    public void setPropsReturn(PropsReturn propsReturn)
    {
        this.propsReturn = propsReturn;
    }

    public Props getProps()
    {
        return props;
    }

    public PropsReturn getPropsReturn()
    {
        return propsReturn;
    }


    public String getReturnLyric() {
        return returnLyric;
    }

    public void setReturnLyric(String returnLyric) {
        this.returnLyric = returnLyric;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n");
        if (props != null) {
            sb.append("\t\t").append(props).append("\n");
        }
        if (propsReturn != null) {
            sb.append("\t\t Function PropsReturns: \n").append(propsReturn).append("\n");
        }
        sb.append('}');
        return sb.toString();
    }
}
