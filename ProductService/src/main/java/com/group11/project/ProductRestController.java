package com.group11.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductRestController {
	@Autowired
	private ProductRepo repo;

	@PostMapping("/add")
	public Product addProduct(@RequestBody Product product) {
		return repo.save(product);
	}

	@GetMapping("/all")
	public List<Product> getAllProducts() {
		return repo.findAll();
	}
}