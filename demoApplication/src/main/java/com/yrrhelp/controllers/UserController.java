package com.yrrhelp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yrrhelp.models.User;

@Controller
@RequestMapping("/user")
public class UserController {
  
	  
	@GetMapping("/login")
	public String displayLogin(Model model) {
		
		User user= new User();
		model.addAttribute("user",user);
		
		return "user_login";
	}
	
	@PostMapping("/login")
	public String processLogin(@ModelAttribute("user") User user, Model model) {
		
		
		return "home";
	}
}
