// Concrete Visitable Class
public class Sofa implements Furniture {
    private double distance;
    private double volume;

    public Sofa(double distance, double volume) {
        this.distance = distance;
        this.volume = volume;
    }

    // Getters 
    public double getDistance() {
        return distance;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public void accept(ShippingVisitor visitor) {
        visitor.visit(this);
    }
}