package com.progrank.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {
	@RequestMapping("/contact")
	public String showForm() {
		return "contact";
	}
	
	// THIS IS THE OLD WAY OF DOING 
	/* @RequestMapping(path="/processform",method=RequestMethod.POST)
	public String handleForm(HttpServletRequest request) {
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		System.out.println("Name : "+name);
		System.out.println("Email : "+email);
		System.out.println("Password : "+password);
		return "";
	} */
	
	// NEW WAY IN SPRING MVC 
	@RequestMapping(path="/processform", method = RequestMethod.POST)
	public String handleForm(@RequestParam("email")String email,
							 @RequestParam("name") String name,
							 @RequestParam("password")String password,Model model) {
		
		System.out.println("Name : " +name);
		System.out.println("Email : " +email);
		System.out.println("Password : "+password);
		
		// Process
		
		model.addAttribute("name",name);
		model.addAttribute("email",email);
		model.addAttribute("password", password);
		return "success";
	}

}
