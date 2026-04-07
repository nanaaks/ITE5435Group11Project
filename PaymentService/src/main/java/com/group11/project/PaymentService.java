package com.group11.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PaymentService {

	@Autowired
	private PaymentRepo repo;

	public Payment addPayment(Payment payment) {
		return repo.save(payment);
	}

	public List<Payment> getAllPayments() {
		return repo.findAll();
	}
}