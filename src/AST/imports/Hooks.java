package AST.imports;

public class Hooks {
static String useState;
String useEffect;
static String useRef;

    public static  String getUseState()
    {
        return useState;
    }

    public void setUseState(String useState)
    {
        this.useState = useState;
    }

    public static String getUseRef() {
        return useRef;
    }

    public void setUseRef(String useRef) {
        this.useRef = useRef;
    }

    public String getUseEffect() {
        return useEffect;
    }

    public void setUseEffect(String useEffect) {
        this.useEffect = useEffect;
    }

    @Override
    public String toString() {
        if(useState!=null)
        return "'"+ useState + "'";
        else if (useRef!=null)
            return "'"+ useRef + "'";
        else if(useEffect!=null)
            return "'"+ useEffect + "'";
        else
            return "''";

    }
}
