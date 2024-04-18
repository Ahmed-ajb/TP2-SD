package ma.fsumi.university.web;


import ma.fsumi.university.entities.Product;
import ma.fsumi.university.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductRestService {
    @Autowired
    private ProductRepository ProductRepository;

    @GetMapping("/products")
    public List<Product> products(){
        return ProductRepository.findAll();
    }
    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable Long id){
        return ProductRepository.findById(id).orElse(null);
    }
}