package ast;
import java.util.*;

public interface Statement extends AstNode { }

class If extends AbstractLocatable implements Statement {
    private Expression condition;
    private List<Statement> thenBody;
    private List<Statement> elseBody;
    public If(int l, int c, Expression cond, List<Statement> t, List<Statement> e) {
        super(l, c); this.condition = cond; this.thenBody = t; this.elseBody = e;
    }
}

class While extends AbstractLocatable implements Statement {
    private Expression condition;
    private List<Statement> body;
    public While(int l, int c, Expression cond, List<Statement> b) {
        super(l, c); this.condition = cond; this.body = b;
    }
}

class Assignment extends AbstractLocatable implements Statement {
    private Expression left, right;
    public Assignment(int l, int c, Expression lft, Expression rgt) {
        super(l, c); this.left = lft; this.right = rgt;
    }
}

class Return extends AbstractLocatable implements Statement {
    private Expression expression;
    public Return(int l, int c, Expression exp) { super(l, c); this.expression = exp; }
}

// Invocación puede ser tanto Sentencia como Expresión según el diagrama
class Invocation extends AbstractLocatable implements Statement, Expression {
    private Variable variable;
    private List<Expression> arguments;
    public Invocation(int l, int c, Variable var, List<Expression> args) {
        super(l, c); this.variable = var; this.arguments = args;
    }
}