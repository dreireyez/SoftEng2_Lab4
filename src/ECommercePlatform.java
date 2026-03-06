// Client
public class ECommercePlatform {
    public static void main(String[] args) {
        
        // Create items to calculate shipping
        Furniture chair1 = new Chair(10.5);
        Furniture table1 = new Table(25.0);
        Furniture sofa1 = new Sofa(120.0, 45.0);

        // Instantiate visitor class
        ShippingCostCalculator calculator = new ShippingCostCalculator();

        // ORDER 1
        chair1.accept(calculator);
        table1.accept(calculator);
        sofa1.accept(calculator);
        System.out.println("[ORDER 1] Total Estimated Shipping Cost: $"+ String.format("%.2f",calculator.getTotalCost()) +"\n");
        
        calculator.reset(); // Resets calculations for next order

        Furniture chair2 = new Chair(9.2);
        Furniture sofa2 = new Sofa(100.0, 30.0);

        // ORDER 2
        chair2.accept(calculator);
        sofa2.accept(calculator);
        System.out.println("[ORDER 2] Total Estimated Shipping Cost: $"+ String.format("%.2f",calculator.getTotalCost()) +"\n");

    }
}