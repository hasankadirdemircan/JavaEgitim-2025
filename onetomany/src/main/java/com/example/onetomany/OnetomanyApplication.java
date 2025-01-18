package com.example.onetomany;

import com.example.onetomany.model.Category;
import com.example.onetomany.model.Product;
import com.example.onetomany.repository.CategoryRepository;
import com.example.onetomany.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OnetomanyApplication implements CommandLineRunner {

	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(OnetomanyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//save1();
		//save2();
		delete();
	}

	private void delete() {
		categoryRepository.deleteById(1L);
	//	productRepository.deleteById(52L);
	}
	private void save2() {
		Category category = new Category();
		category.setId(1L);
		Product product = new Product();

		product.setPrice(20.5);
		product.setName("yogurt2");
		product.setCategory(category);

		productRepository.save(product);

	}
	private void save1() {
		Category category = new Category();
		Product product = new Product();

		category.setName("dairy");

		product.setPrice(10.5);
		product.setName("yogurt");
		product.setCategory(category);

		productRepository.save(product);

	}
}
