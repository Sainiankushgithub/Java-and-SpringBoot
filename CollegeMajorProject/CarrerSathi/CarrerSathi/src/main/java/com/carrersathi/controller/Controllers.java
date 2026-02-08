package com.carrersathi.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controllers{
	@GetMapping("/home")
	public String home() {
		return "home";
	}
	@GetMapping("/about")
	public String about() {
		return "about";
	}
	@GetMapping("/whatwedo")
	public String whatwedo() {
		return "whatwedo";
	}
	@GetMapping("/contactus")
	public String contactus() {
		return "contactus";
	}
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	@GetMapping("/signup")
	public String signup() {
		return "signup";
	}
}