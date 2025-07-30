package AST.useRefEffect;

import AST.ArrayElement;

public class OneParameterAE extends OneParameter
{
    private ArrayElement arrayElement;
    public ArrayElement getArrayElement()
    {
        return arrayElement;
    }
    public void setArrayElement(ArrayElement arrayElement)
    {
        this.arrayElement = arrayElement;
    }

    @Override
    public String toString() {
        return "OneParameterAE{" +
                "arrayElement=" + arrayElement +
                '}';
    }
}
