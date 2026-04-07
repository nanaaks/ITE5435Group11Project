package com.group11.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrderService {

	@Autowired
	private OrderRepo orderRepo;

	@Autowired
	private LineItemRepo itemRepo;

	public OrderClass saveOrder(OrderClass order) {
		return orderRepo.save(order);
	}

	public List<OrderClass> getAllOrders() {
		return orderRepo.findAll();
	}

	public LineItem saveLineItem(LineItem item) {
		return itemRepo.save(item);
	}
}