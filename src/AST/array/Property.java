package AST.array;

import AST.Statement;

public class Property extends Statement {

    String attributeName;
    ExpressionProperty property;

    public ExpressionProperty getPropertyList() {
        return property;
    }

    public void setPropertyList(ExpressionProperty propertyList) {
        this.property = propertyList;
    }

    public String getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    @Override
    public String toString() {
        return attributeName+
                ": " + property;
    }

    public String generate() {
        if (property instanceof ExpressionPropertyId) {
            return attributeName +
                    ": " + ((ExpressionPropertyId) property).generate();
        } else if (property instanceof ExpressionPropertyNumber) {
            return attributeName +
                    ": " + ((ExpressionPropertyNumber) property).generate();
        } else if (property instanceof ExpressionPropertyPath) {
            return attributeName +
                    ": '" + ((ExpressionPropertyPath) property).generate() + "'";
        } else {
            return attributeName +
                    ": '" + ((ExpressionPropertyString) property).generate() + "'";
        }

    }
}
