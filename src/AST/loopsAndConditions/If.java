package AST.loopsAndConditions;

public class If
{
    private IfCondition ifCondition;
    private IfBody ifBody;
    private ElseIF elseIF;
    private Else eelse;

    public IfCondition getIfCondition() {
        return ifCondition;
    }

    public void setIfCondition(IfCondition ifCondition) {
        this.ifCondition = ifCondition;
    }

    public IfBody getIfBody() {
        return ifBody;
    }

    public void setIfBody(IfBody ifBody) {
        this.ifBody = ifBody;
    }

    public ElseIF getElseIF() {
        return elseIF;
    }

    public void setElseIF(ElseIF elseIF) {
        this.elseIF = elseIF;
    }

    public Else getEelse() {
        return eelse;
    }

    public void setEelse(Else eelse) {
        this.eelse = eelse;
    }

    @Override
    public String toString() {
        return "If{" +
                "ifCondition=" + ifCondition +
                ", ifBody=" + ifBody +
                ", elseIF=" + elseIF +
                ", eelse=" + eelse +
                '}';
    }
}
