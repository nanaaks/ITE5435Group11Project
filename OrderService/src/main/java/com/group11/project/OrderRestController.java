package com.group11.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderRestController {

	@Autowired
	private OrderRepo orderRepo;

	@Autowired
	private ShoppingCartRepo cartRepo;

	@Autowired
	private LineItemRepo itemRepo;

	// URL: http://localhost:8086/api/orders/add
	@PostMapping("/add")
	public OrderClass addOrder(@RequestBody OrderClass order) {
		return orderRepo.save(order);
	}

	// URL: http://localhost:8086/api/orders/all
	@GetMapping("/all")
	public List<OrderClass> getAllOrders() {
		return orderRepo.findAll();
	}

	// URL: http://localhost:8086/api/orders/addCart
	@PostMapping("/addCart")
	public ShoppingCart addCart(@RequestBody ShoppingCart cart) {
		return cartRepo.save(cart);
	}

	// URL: http://localhost:8086/api/orders/addLineItem
	@PostMapping("/addLineItem")
	public LineItem addLineItem(@RequestBody LineItem item) {
		return itemRepo.save(item);
	}
}
