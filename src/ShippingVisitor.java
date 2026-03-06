// Visitor Interface
public interface ShippingVisitor {
    public void visit(Chair chair);
    public void visit(Table table);
    public void visit(Sofa sofa);
}