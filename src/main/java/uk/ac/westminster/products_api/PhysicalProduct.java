package uk.ac.westminster.products_api;

// A PhysicalProduct IS-A Product because they share common attributes, and it is a specialised kind of product.
// One other class a shop system might have that would not pass this test would be: a ShoppingCart
// As the shopping cart HAS products, it owns it, not inherits it.

public class PhysicalProduct extends Product{

    private double weightKg;
    private String dimensions;

    public PhysicalProduct(Long id, String name,
                           double price, double weightKg,
                           String dimensions) {
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    public PhysicalProduct() {}

    public double getWeightKg() {return weightKg;}

    public String getDimensions() {return dimensions;}
}
