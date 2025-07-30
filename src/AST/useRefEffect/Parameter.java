package AST.useRefEffect;

public class Parameter {
    private OneParameter oneParameter;
    private ManyParameters manyParameters;

    public OneParameter getOneParameter() {
        return oneParameter;
    }

    public void setOneParameter(OneParameter oneParameter) {
        this.oneParameter = oneParameter;
    }

    public ManyParameters getManyParameters() {
        return manyParameters;
    }

    public void setManyParameters(ManyParameters manyParameters) {
        this.manyParameters = manyParameters;
    }

    @Override
    public String toString() {
        if (oneParameter != null) {
            return oneParameter.toString();
        } else {
            return manyParameters.toString();
        }
    }
}
