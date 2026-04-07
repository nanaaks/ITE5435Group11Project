package com.group11.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AccountService {

	@Autowired
	private AccountRepo repo;

	public Account saveAccount(Account account) {
		return repo.save(account);
	}

	public List<Account> getAllAccounts() {
		return repo.findAll();
	}
}