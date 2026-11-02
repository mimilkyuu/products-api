package uk.ac.westminster.products_api;

public abstract class Product {

    private Long id;
    private String name;
    private double price;

    public Product() {}

    public Product(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public abstract String getSummary();

    public Long getId() {return id;}
    public double getPrice() {return price;}
    public String getName() {return name;}
    /* name disappeared as Jackson looks for a public getx() method, name was skipped
    In a project with 15 fields, if there are less than 15 outputs, there may be a missing getter
     */

    public void setId(Long id)         {this.id = id;}
    public void setName(String name)   {this.name = name;}
    public void setPrice(double price) {this.price = price;}

}
