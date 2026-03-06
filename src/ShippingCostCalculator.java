
// Concrete Visitor Class
public class ShippingCostCalculator implements ShippingVisitor {
    private double totalCost = 0.0;

    // Visitor Methods
    @Override
    public void visit(Chair chair) {
        double cost = 15.00;
        System.out.println("[Chair] Calculated Shipping Cost: $" + String.format("%.2f", cost));
        totalCost += cost;
    }

    @Override
    public void visit(Table table) {
        double cost = 30.00 + (table.getSurfaceArea() * 1.20);
        System.out.println("[Table] Calculated Shipping Cost: $" + String.format("%.2f", cost));
        totalCost += cost;
    }

    @Override
    public void visit(Sofa sofa) {
        double cost = 50.00 + (sofa.getVolume() * 3.00) + (sofa.getDistance() * 2.00);
        System.out.println("[Sofa] Calculated Shipping Cost: $" + String.format("%.2f", cost));
        totalCost += cost;
    }

    // Helper Methods
    public double getTotalCost() {
        return totalCost;
    }

    public void reset() {
        totalCost = 0.0;
    }
}