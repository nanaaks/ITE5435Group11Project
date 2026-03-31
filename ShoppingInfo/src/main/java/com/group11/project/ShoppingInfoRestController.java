package com.group11.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
@RequestMapping("/api/shoppinginfo")
public class ShoppingInfoRestController {

	@Autowired
	private WebUserRepo repo;

	@GetMapping("/user/{loginId}")
	public WebUser fetchWebUser(@PathVariable String loginId) {
		Optional<WebUser> user = repo.findById(loginId);
		return user.orElse(null);
	}
}
