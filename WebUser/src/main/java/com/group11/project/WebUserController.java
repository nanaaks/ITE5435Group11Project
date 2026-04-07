package com.group11.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class WebUserController {

	@Autowired
	private WebUserService webUserService;

	@GetMapping("/webuser-form")
	public String showForm(Model model) {

		model.addAttribute("webUser", new WebUser());
		return "index";
	}

	@PostMapping("/StoringUserData")
	public String storeWebUser(@ModelAttribute("webUser") WebUser webUser) {
		webUserService.saveWebUser(webUser);
		return "redirect:/webuser-form";
	}
}