package com.group11.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/webuser")
public class WebUserRestController {

	@Autowired
	private WebUserRepo webUserRepo;

	// ShoppingInfo fetch data
	@GetMapping("/get/{loginId}")
	public WebUser getWebUserById(@PathVariable String loginId) {

		return webUserRepo.findById(loginId).orElse(null);
	}
}
