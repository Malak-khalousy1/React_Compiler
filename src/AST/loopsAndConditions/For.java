package AST.loopsAndConditions;

public class For
{
    private ForCondition forCondition;
    private ForBody forBody;

    public ForCondition getForCondition() {
        return forCondition;
    }

    public void setForCondition(ForCondition forCondition) {
        this.forCondition = forCondition;
    }

    public ForBody getForBody() {
        return forBody;
    }

    public void setForBody(ForBody forBody) {
        this.forBody = forBody;
    }

    @Override
    public String toString() {
        return "For{" +
                "forCondition=" + forCondition +
                ", forBody=" + forBody +
                '}';
    }
}
