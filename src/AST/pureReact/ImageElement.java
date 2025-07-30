package AST.pureReact;

import AST.Statement;
import AST.array.ObjectLiteral;
import AST.arrowClick.FunctionCall;

import java.util.List;

public class ImageElement extends Statement {
    String nameComponent;
    String mapCall;
    String argumentFunction;

    String createElement;
    String firstArgument;
    List<ElementProperty>elementProperties;

    String onClick;
    String functionName;
    String funcArgument;
    String ReactFunc;

    public String getReactFunc() {
        return ReactFunc;
    }

    public void setReactFunc(String reactFunc) {
        ReactFunc = reactFunc;
    }

    public String getNameComponent() {
        return nameComponent;
    }

    public void setNameComponent(String nameComponent) {
        this.nameComponent = nameComponent;
    }

    public String getMapCall() {
        return mapCall;
    }

    public void setMapCall(String mapCall) {
        this.mapCall = mapCall;
    }


    public String getCreateElement() {
        return createElement;
    }

    public void setCreateElement(String createElement) {
        this.createElement = createElement;
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public String getFuncArgument() {
        return funcArgument;
    }

    public void setFuncArgument(String funcArgument) {
        this.funcArgument = funcArgument;
    }

    public String getFirstArgument() {
        return firstArgument;
    }
    public void setFirstArgument(String firstArgument) {
        this.firstArgument = firstArgument;
    }
    public List<ElementProperty> getElementProperties() {
        return elementProperties;
    }

    public void setElementProperties(List<ElementProperty> elementProperties) {
        this.elementProperties = elementProperties;
    }


    public String getOnClick() {
        return onClick;
    }

    public void setOnClick(String onClick) {
        this.onClick = onClick;
    }

    public String getArgumentFunction() {
        return argumentFunction;
    }

    public void setArgumentFunction(String argumentFunction) {
        this.argumentFunction = argumentFunction;
    }

    public String print(List<ElementProperty> ep){
        String out = "\t\t\t\tProperty object: {\n";
        for(int i=0;i<ep.size();i++){
            out += "\t\t\t\t\t " + ep.get(i) + "\n";
        }
        return out;
    }

    @Override
    public String toString() {
        return "\t\tConst Declaration |" + nameComponent.toUpperCase() + "| =\n\t\t\t" +
                "Map Through Array: |" + mapCall + "| {" +
                "\n\t\t\tCreate Arrow Function with argument: (" + argumentFunction +
                ") => { \n\t\t\t Call Function |" + ReactFunc.toUpperCase() + "| From React with arguments: (" + firstArgument + ",\n" +
                print(elementProperties) +
                "\t\t\t\t\t (Function)onClick: (arrowFunction) returns >> " + functionName + "( (attribute)" +
                funcArgument + ")\n\t\t\t\t}\n\t\t\t )\n\t\t\t} end of arrow Function creat";
    }
}
