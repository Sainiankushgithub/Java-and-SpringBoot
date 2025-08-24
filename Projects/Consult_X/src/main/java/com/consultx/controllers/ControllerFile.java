package com.consultx.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerFile {

	@RequestMapping("/")
	public String homePage() {
		return "redirect:/home";
	}
	@RequestMapping("/home")
    public String homeView() {
        return "home"; 
    }
	@RequestMapping("/signup")
	public String signUp() {
		return "signup";
	}
	@RequestMapping("/signupConsultee")
	public String signupConsultee() {
	    return "signupConsultee"; 
	}

	@RequestMapping("/signupConsultor")
	public String signupConsultor() {
	    return "signupConsultor"; 
	}
	@RequestMapping("/what")
	public String what_we_do() {
		return "what_we_do";
	}
	
	@RequestMapping("/contact")
	public String contact() {
		return "contact";
	}
}
