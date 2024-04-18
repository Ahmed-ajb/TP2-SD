package ma.fsumi.university;

import ma.fsumi.university.entities.Product;
import ma.fsumi.university.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class UniversityApplication implements CommandLineRunner {
	@Autowired
	private ProductRepository productRepository;

	public static void main (String[] args) {
		SpringApplication.run(UniversityApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//productRepository.save(new Product(null,"Computer",4300,2));
		//productRepository.save(new Product(null,"Printer",1000,3));
		//productRepository.save(new Product(null,"Phone",42500,5));
		List<Product> products = productRepository.findAll();
		products.forEach(p -> {
			System.out.println(p.toString());
		});
		Product product =productRepository.findById(Long.valueOf(1)).get();
		System.out.println("*******************");
		System.out.println(product.getId());
		System.out.println(product.getName());
		System.out.println(product.getQuantity());
		System.out.println("*******************");
		List <Product> productList =productRepository.findByNameContains("C");
		productList.forEach(p->{
			System.out.println(p);
		});
		System.out.println("------------------------------");
		List <Product> productList2 =productRepository.search("%C%");
		productList2.forEach(p->{
			System.out.println(p);
		});
		  System.out.println("first product updated to Tlaja");
        Product produit = productRepository.findById(Long.valueOf(1)).orElse(null);
        if (produit != null) {
            produit.setName("Tlaja ");
            productRepository.save(produit);
        } else {
            System.out.println("Patient not found");
        }





	}
}
