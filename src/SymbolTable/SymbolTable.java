package SymbolTable;

import java.util.ArrayList;
import java.util.*;

public class SymbolTable {

    List<Row> table;
    Stack<Scope> scopes;

    List<Scope> scopesList;

    public SymbolTable() {
        table = new ArrayList<>();
        scopes = new Stack<>();
        scopesList = new ArrayList<Scope>();
    }

    public List<Row> getTable() {
        return table;
    }

    public void setTable(List<Row> table) {
        this.table = table;
    }

    public Stack<Scope> getScopes() { return scopes; }

    public void setScopes(Stack<Scope> scopes) { this.scopes = scopes; }

    public List<Scope> getScopesList() {
        return scopesList;
    }

    public void setScopesList(List<Scope> scopesList) {
        this.scopesList = scopesList;
    }

    public void print()
    {
        if (table != null) {
            for (int i = 0; i < table.size(); i++) {
                System.out.printf(
                        "%-20s \t   %-20s\n", table.get(i).getValue(), table.get(i).getType()
                );
            }
        }
    }

    public void popScope(){
        Scope s = this.scopes.pop();
        scopesList.add(s);
    }

    public void printScopesList(){
        Collections.reverse(scopesList);
        for(Scope s: scopesList){
            System.out.println(s.scopeName+"{\n");
            for(Row r: s.scopeVariables){
                System.out.printf("\t\t \t%-20s %-20s %-20s\n", r.getValue(), r.getType(),s.scopeName);

            }
            System.out.println("}\n");
        }
    }
}