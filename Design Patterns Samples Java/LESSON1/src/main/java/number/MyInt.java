package number;

public class MyInt implements INumber {

    public void visit(INumberVisitor visitor) {
        visitor.visit(this);
    }
}