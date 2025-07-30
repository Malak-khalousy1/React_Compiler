package AST.imports;

import AST.Statement;

import java.util.List;

// AST node for the ImportHooks rule
public class ImportHooks extends Statement {
    String importLyric;
     List<Hooks> hooks;
     String fromLyric;



    public List<Hooks> getHooks() {
        return hooks;
    }

    public void setHooks(List<Hooks> hooks) {
        this.hooks = hooks;
    }

    public String getFromLyric() {
        return fromLyric;
    }

    public void setFromLyric(String fromLyric) {
        this.fromLyric = fromLyric;
    }

    public String getImportLyric() {
        return importLyric;
    }

    public void setImportLyric(String importLyric) {
        this.importLyric = importLyric;
    }

    public String print(List<Hooks> hooks){
        String out = "";
        for(int i=0;i<hooks.size();i++) {
            out += hooks.get(i);
            if(i!=hooks.size()-1) out += ", ";
        }
        return out;
    }



    @Override
    public String toString() {
        return "Import(" +
                print(hooks) +
               ")\n";
    }
}

