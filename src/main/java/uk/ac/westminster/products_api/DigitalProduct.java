package uk.ac.westminster.products_api;

public class DigitalProduct extends Product{

    private String downloadUrl;
    private double fileSizeMB;

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

    public String getDownloadUrl() {return downloadUrl;}
    public double getFileSizeMB() {return fileSizeMB;}


}

