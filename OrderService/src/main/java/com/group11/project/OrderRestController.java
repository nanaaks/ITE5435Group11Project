package com.group11.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderRestController {

	@Autowired
	private OrderService orderService;

	// URL: http://localhost:8086/api/orders/add
	@PostMapping("/add")
	public OrderClass addOrder(@RequestBody OrderClass order) {
		return orderService.saveOrder(order);
	}

	// URL: http://localhost:8086/api/orders/all
	@GetMapping("/all")
	public List<OrderClass> getAllOrders() {
		return orderService.getAllOrders();
	}

	// URL: http://localhost:8086/api/orders/addLineItem
	@PostMapping("/addLineItem")
	public LineItem addLineItem(@RequestBody LineItem item) {
		return orderService.saveLineItem(item);
	}
}