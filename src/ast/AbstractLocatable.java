package ast;

interface Locatable {
    int getLine();
    int getColumn();
}

interface AstNode extends Locatable { }

public abstract class AbstractLocatable implements AstNode {
    private int line;
    private int column;

    public AbstractLocatable(int line, int column) {
        this.line = line;
        this.column = column;
    }

    @Override public int getLine() { return line; }
    @Override public int getColumn() { return column; }
}