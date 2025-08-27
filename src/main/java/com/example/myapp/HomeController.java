package com.example.myapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("message", "Welcome");
		return "home";
	}
	
	@GetMapping("/hello")
	public String hello(@RequestParam(required=false) String name, Model model) {
		model.addAttribute("greetings", "Hello~~!!!!! eunbi~ github nnactions test!"+name);
		return "hello";
	}	
}
