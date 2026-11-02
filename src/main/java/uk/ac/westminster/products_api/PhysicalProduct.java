package uk.ac.westminster.products_api;

// A PhysicalProduct IS-A Product because they share common attributes, and it is a specialised kind of product.
// One other class a shop system might have that would not pass this test would be: a ShoppingCart
// As the shopping cart HAS products, it owns it, not inherits it.

public class PhysicalProduct extends Product implements Discountable {

    private double weightKg;
    private String dimensions;
    private double discountPrice;

    public PhysicalProduct() {}

    public PhysicalProduct(Long id, String name,
                           double price, double weightKg,
                           String dimensions) {
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    @Override
    public String getSummary() {
        return "Name: " + getName() + " | Weight: " + weightKg + "Kg" + " | Size: " + dimensions;
    }
    @Override
    public void applyDiscount(double rate) {
        double cappedRate = Math.min(0.20, rate);
        discountPrice = getPrice() * (1 - cappedRate);
    }
    @Override
    public double getDiscountedPrice() {
        return discountPrice;
    }


    public double getWeightKg() {return weightKg;}
    public String getDimensions() {return dimensions;}

}
