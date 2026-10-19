package uk.ac.westminster.products_api;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private List<Product> products = new ArrayList<>();
    private Long nextId = 1L;

    public ProductService() {
        products.add(new DigitalProduct(
                nextId++, "Programming in Java (E-book)", 32.78,
                "/downloads/Programming-in-Java.pdf", 5.2));

        products.add(new PhysicalProduct(
                nextId++, "Mechanical Keyboard", 115.08,
                2.3, "W:27cm, D:12cm, H:6cm"));

        // id, name, and price come from the Product parent class.
        // This allows the subclass to inherit its attributes and getters.
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public Product addProduct(Product product) {
        product.setId(nextId++);
        products.add(product);
        return product;
    }

    public Optional<Product> getProductById(Long id) {
        return products.stream()
                    .filter(p -> p.getId().equals(id))
                    .findFirst();
    }

    public void deleteProduct(Long id) {
        products.removeIf(p -> p.getId().equals(id));
    }

    public List<Product> findByName(String name) {
        return products.stream()
                .filter(p -> p.getName().contains(name))
                .toList();
    }

}
