package AST;

public class ArrayElement {

    static String nameArray;
    Value value;

    public static String  getId() {
        return nameArray;
    }

    public void setId(String id) {
        this.nameArray = id;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return nameArray.toUpperCase() + "[ " + "value: " + value + " ]";
    }

    public String generate(){
        return nameArray +"["+value.generate()+"]";
    }
}
