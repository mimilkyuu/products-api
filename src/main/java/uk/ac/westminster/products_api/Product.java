package uk.ac.westminster.products_api;

public class Product {

    private Long id;
    private String name;
    private double price;

    public Product(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Long getID() {return id;}

    public String getName() {return name;}
    /* name disappeared as Jackson looks for a public getx() method, name was skipped
    In a project with 15 fields, if there are less than 15 outputs, there may be a missing getter
     */

    public double getPrice() {return price;}

    public Product() {}

}
