package com.group11.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/account")
public class AccountRestController {
	@Autowired
	private AccountRepo repo;

	@PostMapping("/add")
	public Account addAccount(@RequestBody Account account) {
		return repo.save(account);
	}

	@GetMapping("/all")
	public List<Account> getAllAccounts() {
		return repo.findAll();
	}
}