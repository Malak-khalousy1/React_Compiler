package SymbolTable;

import java.util.List;

public class Scope {
    List<Row> scopeVariables;
    String scopeName;

    public Scope(String scopeName, List<Row> scopeVariables) {
        this.scopeVariables = scopeVariables;
        this.scopeName = scopeName;
    }

    public List<Row> getScopeVariables() {
        return scopeVariables;
    }

    public void addVar(Row r) {
        scopeVariables.add(r);
    }

    public void setScopeVariables(List<Row> scopeVariables) {
        this.scopeVariables = scopeVariables;
    }

    public String getScopeName() {
        return scopeName;
    }

    public void setScopeName(String scopeName) {
        this.scopeName = scopeName;
    }

}
