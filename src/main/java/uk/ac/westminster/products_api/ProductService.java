package uk.ac.westminster.products_api;

import org.springframework.stereotype.Service;
import uk.ac.westminster.products_api.exception.ProductNotFoundException;
import uk.ac.westminster.products_api.repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public Product addProduct(Product product) {
        return repository.save(product);
    }

    public Product getProductById(Long id) {
        return repository.findById(id)
                .orElseThrow( ()-> new ProductNotFoundException(id));
    }

    public void deleteProduct(Long id) {
        repository.findById(id);
        repository.delete(id);
    }

    public List<Product> findAll() {
        return repository.findAll();
    }

//    public List<String> getAllSummaries() {
//        List<String> productSummaries = new ArrayList<>();
//
//        for (Product p : products) {
//            productSummaries.add(p.getSummary());
//        }
//        return productSummaries;
//    }

}
