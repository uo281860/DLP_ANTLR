package ast;
import java.util.*;

public interface Definition extends AstNode {
    String getName();
    Type getType();
}

class VariableDefinition extends AbstractLocatable implements Definition {
    private String name;
    private Type type;
    public VariableDefinition(int l, int c, String name, Type type) {
        super(l, c); this.name = name; this.type = type;
    }
    @Override public String getName() { return name; }
    @Override public Type getType() { return type; }
}

class FunctionDefinition extends AbstractLocatable implements Definition {
    private String name;
    private Type type;
    private List<Statement> body;
    public FunctionDefinition(int l, int c, String name, Type type, List<Statement> body) {
        super(l, c); this.name = name; this.type = type;
        this.body = body;
    }
    @Override public String getName() { return name; }
    @Override public Type getType() { return type; }
}

class Program extends AbstractLocatable {
    private List<Definition> definitions;
    public Program(int l, int c, List<Definition> defs) {
        super(l, c); this.definitions = defs;
    }
}