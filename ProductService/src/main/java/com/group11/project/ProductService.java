package com.group11.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {

	@Autowired
	private ProductRepo repo;

	public Product addProduct(Product product) {
		return repo.save(product);
	}

	public List<Product> getAllProducts() {
		return repo.findAll();
	}
}