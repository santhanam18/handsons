package com.hcl.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.hcl.model.User;

@Controller
public class LoginController {
	@GetMapping("/login")
	public String showLogin(Model model) {
		User user = new User("Steve", "steve");
		model.addAttribute(user);
		return "login";
	}

	@PostMapping("/process")
	public String processForm(@ModelAttribute("user") @Valid User user, BindingResult result) {
		if (result.hasErrors())
			return "login";
		return "login";
	}

}
