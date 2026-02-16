package ast;
import java.util.*;

public interface Type extends AstNode { }

class IntType extends AbstractLocatable implements Type {
    public IntType(int l, int c) { super(l, c); }
}

class CharType extends AbstractLocatable implements Type {
    public CharType(int l, int c) { super(l, c); }
}

class VoidType extends AbstractLocatable implements Type {
    public VoidType(int l, int c) { super(l, c); }
}

class NumberType extends AbstractLocatable implements Type {
    public NumberType(int l, int c) { super(l, c); }
}

class ArrayType extends AbstractLocatable implements Type {
    private int size;
    private Type indexType;
    public ArrayType(int l, int c, int size, Type type) {
        super(l, c); this.size = size; this.indexType = type;
    }
}

class RecordField extends AbstractLocatable {
    private String name;
    private Type type;
    public RecordField(int l, int c, String name, Type type) {
        super(l, c); this.name = name; this.type = type;
    }
}

class RecordType extends AbstractLocatable implements Type {
    private List<RecordField> fields;
    public RecordType(int l, int c, List<RecordField> fields) {
        super(l, c); this.fields = fields;
    }
}