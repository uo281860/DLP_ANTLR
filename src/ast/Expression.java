package ast;

public interface Expression extends AstNode { }

class Variable extends AbstractLocatable implements Expression {
    private String name;
    public Variable(int l, int c, String n) { super(l, c); this.name = n; }
}

class IntLiteral extends AbstractLocatable implements Expression {
    private int value;
    public IntLiteral(int l, int c, int v) { super(l, c); this.value = v; }
}

abstract class BinaryOperation extends AbstractLocatable implements Expression {
    protected Expression left, right;
    protected String operator;
    public BinaryOperation(int l, int c, Expression lf, String op, Expression rg) {
        super(l, c); this.left = lf; this.operator = op; this.right = rg;
    }
}

class Arithmetic extends BinaryOperation {
    public Arithmetic(int l, int c, Expression lf, String op, Expression rg) {
        super(l, c, lf, op, rg);
    }
}