package AST.useRefEffect;


import AST.prints.DeclarationStatement;

public class AnonymousBodyLS extends AnonymousBody
{
    private DeclarationStatement declarationStatement;

    public DeclarationStatement getDeclarationStatement() {
        return declarationStatement;
    }

    public void setDeclarationStatement(DeclarationStatement declarationStatement) {
        this.declarationStatement = declarationStatement;
    }
}
