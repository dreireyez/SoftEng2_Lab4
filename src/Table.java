// Concrete Visitable Class
public class Table implements Furniture {
    private double surfaceArea;

    public Table(double surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    // Getters
    public double getSurfaceArea() {
        return surfaceArea;
    }

    @Override
    public void accept(ShippingVisitor visitor) {
        visitor.visit(this);
    }
}