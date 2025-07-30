package AST;

public class Params {
    ArrayElement arrayElement;
    Value value;
    String idParams;

    public ArrayElement getArrayElement() {
        return arrayElement;
    }

    public void setArrayElement(ArrayElement arrayElement) {
        this.arrayElement = arrayElement;
    }

    public String getIdParams() {
        return idParams;
    }

    public void setIdParams(String idParams) {
        this.idParams = idParams;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @Override
    public String toString() {
        if(arrayElement!=null)
        return " (array element)" + arrayElement + " ";
        else if(value!=null)
            return "(value)" + value + " ";
        else
            return "(attribute)" + idParams + " ";
    }
    public String generate(){
        if (arrayElement != null){
            return arrayElement.generate();
        }
        else if(value != null){
            return value.generate();
        }
        else{
            return idParams;
        }
    }
}
