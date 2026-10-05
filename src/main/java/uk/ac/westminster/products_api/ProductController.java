package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("products")
// This class will handle/control all the URL requests with /products
public class ProductController {

    @GetMapping("/{id}")
    // id is used as an input to show/get product with corresponding id
    public Product getById(@PathVariable Long id) {
        return new Product(id, "Laptop", 999.99);
    }
}

