package uk.ac.westminster.products_api;

public class DigitalProduct extends Product implements Discountable {

    private String downloadUrl;
    private double fileSizeMB;
    private double discountedPrice;

    public DigitalProduct() {}

    public DigitalProduct(Long id, String name,
                          double price, String downloadUrl,
                          double fileSizeMB) {
        super(id, name, price);
        this.downloadUrl = downloadUrl;
        this.fileSizeMB = fileSizeMB;
    }

    @Override
    public String getSummary() {
        return "Name: " + getName() + " | URL: " + downloadUrl;
        // this is the subclass and name field is private, therefore
        // to call the name you must use getName(), including override
    }
    @Override
    public void applyDiscount(double rate) {
        discountedPrice = getPrice() * (1 - rate);
    }
    @Override
    public double getDiscountedPrice() {
        return discountedPrice;
    }

    public String getDownloadUrl() {return downloadUrl;}
    public double getFileSizeMB() {return fileSizeMB;}


}

