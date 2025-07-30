package AST.function;

import AST.Statement;
import AST.UseState;
import AST.arrowClick.ArrowClick;
import AST.jsx.Div;
import AST.prints.ConsoleLogStatement;
import AST.prints.ConstStatement;
import AST.prints.DeclarationStatement;
import AST.prints.VariableValueAssignment;
import AST.pureReact.ImageElement;
import AST.pureReact.ReturnImageElements;
import AST.useRefEffect.UseEffect;
import AST.useRefEffect.UseRef;

import java.util.List;

public class Function extends Statement
{
//    function:
//    FUNCTION (ID|APP) OPEN_PAREN CLOSE_PAREN OPEN_CURLY  (usestate| useRef|useEffect)*arrowclick*imageElements?
//    (declarationStatement|constStatement)* RETURN
//        ((OPEN_PAREN div CLOSE_PAREN SEMI_COLON?)|returnImageElements) CLOSE_CURLY defaultStatement;

    private String functionLyric;
    private static String functionName;
    private  String returnLyric;
    private List<UseState> useStateList;



    private List<UseEffect> useEffectList;
    private List<UseRef> useRefList;
    private List<ArrowClick> arrowClick;
    private List<ConsoleLogStatement> consoleLogStatement;
    private ImageElement imageElements;
    private Div functionDiv;
    private ReturnImageElements functionReturnImageElements;
    private List<DeclarationStatement> declarationStatement;
    private List<ConstStatement> constStatement;
    private List<VariableValueAssignment>variableValueAssignmentList;
    private  Default aDefault;

    public List<VariableValueAssignment> getVariableValueAssignmentList() {
        return variableValueAssignmentList;
    }

    public void setVariableValueAssignmentList(List<VariableValueAssignment> variableValueAssignmentList) {
        this.variableValueAssignmentList = variableValueAssignmentList;
    }

    public List<ConsoleLogStatement> getConsoleLogStatement() {
        return consoleLogStatement;
    }

    public void setConsoleLogStatement(List<ConsoleLogStatement> consoleLogStatement) {
        this.consoleLogStatement = consoleLogStatement;
    }

    public String getReturnLyric() {
        return returnLyric;
    }

    public void setReturnLyric(String returnLyric) {
        this.returnLyric = returnLyric;
    }

    public String getFunctionLyric() {
        return functionLyric;
    }

    public void setFunctionLyric(String functionLyric) {
        this.functionLyric = functionLyric;
    }


    public static String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public List<UseState> getUseStateList() {
        return useStateList;
    }

    public void setUseStateList(List<UseState> useStateList) {
        this.useStateList = useStateList;
    }

    public List<UseEffect> getUseEffectList() {
        return useEffectList;
    }

    public void setUseEffectList(List<UseEffect> useEffectList) {
        this.useEffectList = useEffectList;
    }

    public List<UseRef> getUseRefList() {
        return useRefList;
    }

    public void setUseRefList(List<UseRef> useRefList) {
        this.useRefList = useRefList;
    }

    public List<ArrowClick> getArrowClick() {
        return arrowClick;
    }

    public void setArrowClick(List<ArrowClick> arrowClick) {
        this.arrowClick = arrowClick;
    }

    public ImageElement getImageElements() {
        return imageElements;
    }

    public void setImageElements(ImageElement imageElements) {
        this.imageElements = imageElements;
    }

    public Div getFunctionDiv() {
        return functionDiv;
    }

    public void setFunctionDiv(Div functionDiv) {
        this.functionDiv = functionDiv;
    }

    public ReturnImageElements getFunctionReturnImageElements() {
        return functionReturnImageElements;
    }

    public void setFunctionReturnImageElements(ReturnImageElements functionReturnImageElements) {
        this.functionReturnImageElements = functionReturnImageElements;
    }

    public List<DeclarationStatement> getDeclarationStatement() {
        return declarationStatement;
    }

    public void setDeclarationStatement(List<DeclarationStatement> declarationStatement) {
        this.declarationStatement = declarationStatement;
    }

    public List<ConstStatement> getConstStatement() {
        return constStatement;
    }

    public void setConstStatement(List<ConstStatement> constStatement) {
        this.constStatement = constStatement;
    }

    public Default getaDefault() {
        return aDefault;
    }

    public void setaDefault(Default aDefault) {
        this.aDefault = aDefault;
    }

    public String declarationPrint(List<DeclarationStatement>declarationStatementList)
    {
        String out = "{";
        for(int i=0;i<declarationStatementList.size();i++){
            out += declarationStatementList.get(i);
            if(i!=declarationStatementList.size()-1)
                out+=", ";
        }
        out += " }";
        return out;

    }
    public String constStatementPrint(List<ConstStatement>constStatementList){

        String out = "{";
        for(int i=0;i<constStatementList.size();i++){
            out += constStatementList.get(i);
            if(i!=constStatementList.size()-1)
                out+=", ";
        }
        out += " }";
        return out;
    }

    public String useStatePrint(List<UseState> us){
        String out = "{";
        for(int i=0;i<us.size();i++){
           out += us.get(i);
           if(i!=us.size()-1)
               out+=", ";
        }
        out += " }";
        return out;
    }

    public String useEffectPrint(List<UseEffect> ue){
        String out = "{";
        for(int i=0;i<ue.size();i++){
            out += ue.get(i);
            if(i!=ue.size()-1)
                out+=", ";
        }
        out += " }";
        return out;
    }

    public String useRefPrint(List<UseRef> ur){
        String out = "{";
        for(int i=0;i<ur.size();i++){
            out += ur.get(i);
            if(i!=ur.size()-1)
                out+=", ";
        }
        out += " }";
        return out;
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Function ").append("|").append(functionName.toUpperCase()).append("|: ").append("\n{\n");

        if (useStateList != null) {
            if(!useStateList.isEmpty())
                sb.append("\tUse State components: ").append(useStatePrint(useStateList)).append("\n");
        }

        if (useEffectList != null) {
            if(!useEffectList.isEmpty())
                sb.append("\tUse Effect components: ").append(useEffectPrint(useEffectList)).append("\n");
        }

        if (useRefList != null) {
            if(!useRefList.isEmpty())
                sb.append("\tUse Ref components: ").append(useRefPrint(useRefList)).append("\n");
        }
        if(aDefault!=null)
        {
            sb.append("DefaultStatement: ").append(aDefault.toString()).append("\n\t");

        }

        if (arrowClick != null) {
            sb.append("\tArrow Click function:{ \n").append(arrowClick.toString()).append("\n\t}\n");
        }

        if (imageElements != null) {
            sb.append("\tCreate Image Elements: {\n").append(imageElements.toString()).append("\n");
        }

        if (functionDiv != null) {
            sb.append("\tthis Function returns: ").append(functionDiv.toString()).append("\n");
        }

        if (functionReturnImageElements != null) {
            sb.append("\tthis Function returns: ").append(functionReturnImageElements.toString()).append("\n");
        }
        if (declarationStatement != null) {
            sb.append("\tDeclaration statement: ").append(declarationPrint(declarationStatement)).append("\n");
        }
        if (constStatement != null) {
            sb.append("\tConst statement: ").append(constStatementPrint(constStatement)).append("\n");
        }


        sb.append("}\n");

        return sb.toString();
    }
    public String generate(){
        return functionDiv.generate();
    }

}
