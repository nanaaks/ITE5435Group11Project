package com.group11.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/payment")
public class PaymentRestController {
	@Autowired
	private PaymentRepo repo;

	@PostMapping("/add")
	public Payment addPayment(@RequestBody Payment payment) {
		return repo.save(payment);
	}

	@GetMapping("/all")
	public List<Payment> getAllPayments() {
		return repo.findAll();
	}
}