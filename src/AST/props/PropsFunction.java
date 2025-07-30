package AST.props;

import AST.Statement;

public class PropsFunction extends Statement {
    private String functionLyric;
    private static String functionName;
    private String parameter;
    private PropsBody propsBodyNode;

    public String getFunctionLyric() {
        return functionLyric;
    }

    public void setFunctionLyric(String functionLyric) {
        this.functionLyric = functionLyric;
    }

    public static String getFunctionName() {
        return functionName;
    }

    public String getParameter() {
        return parameter;
    }

    public PropsBody getPropsBodyNode() {
        return propsBodyNode;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    public void setPropsBodyNode(PropsBody propsBodyNode) {
        this.propsBodyNode = propsBodyNode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Props Function: {\n");
        if (functionName != null) {
            sb.append("\tname: ").append(functionName).append(',');
        }
        if (parameter != null) {
            sb.append("\n\tparameter: ").append(parameter).append(',');
        }
        if (propsBodyNode != null) {
            sb.append("\n\tbody{").append(propsBodyNode).append("\n\t}");
        }
        sb.append('}');
        return sb.toString();
    }
}
