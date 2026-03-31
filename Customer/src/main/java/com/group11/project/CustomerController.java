package com.group11.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CustomerController {
	@Autowired
	private CustomerRepo repo;

	@GetMapping("/customer-form")
	public String showForm(Model model) {
		model.addAttribute("customer", new Customer());
		return "customer";
	}

	@PostMapping("/StoringCustomerData")
	public String storeCustomer(@ModelAttribute Customer customer) {
		repo.save(customer);
		return "redirect:/customer-form";
	}
}