package com.progrank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.progrank.dao.UserDao;
import com.progrank.model.User;

@Controller
public class ContactController {
	
	private final UserDao userDao;
	
	public ContactController(UserDao userDao) {
		this.userDao=userDao;
	}
	
	@RequestMapping("/contact")
	public String showForm() {
		return "contact";
	}

	// THIS IS THE OLD WAY OF DOING
	/*
	 * 
	 * 
	 * @RequestMapping(path="/processform",method=RequestMethod.POST) public String
	 * handleForm(HttpServletRequest request) { String
	 * name=request.getParameter("name"); String
	 * email=request.getParameter("email"); String
	 * password=request.getParameter("password");
	 * System.out.println("Name : "+name); System.out.println("Email : "+email);
	 * System.out.println("Password : "+password); return ""; }
	 *
	 *
	 */

	
	
	
	/*
	 * 
	 * 
	 * // NEW WAY IN SPRING MVC
	 * 
	 * @RequestMapping(path="/processform", method = RequestMethod.POST) public
	 * String handleForm(@RequestParam("email")String email,
	 * 
	 * @RequestParam("name") String name,
	 * 
	 * @RequestParam("password")String password,Model model) {
	 * 
	 * System.out.println("Name : " +name); System.out.println("Email : " +email);
	 * System.out.println("Password : "+password);
	 * 
	 * // Process
	 * 
	 * model.addAttribute("name",name); model.addAttribute("email",email);
	 * model.addAttribute("password", password); return "success"; }
	 *
	 *
	 */

	
	
	// NOW DOING THE WAY THING THROUGH USER CLASS
	// WAY 1 NOT GOOD IF WE HAVE MULTIPLE LINE OF CODE
	/*
	 * 
	 * 
	 * @RequestMapping(path="/processform", method=RequestMethod.POST) public String
	 * handleForm(@RequestParam("name")String name,
	 * 
	 * @RequestParam("email")String email,
	 * 
	 * @RequestParam("password")String password, Model model) { User user = new
	 * User(); user.setName(name); user.setEmail(email); user.setPassword(password);
	 * 
	 * System.out.println(user); model.addAttribute("user", user);
	 * 
	 * return "success"; }
	 *
	 *
	 */
	
	
	
	// WAY 2 OF ABOVE IN A SINGLE WHICH HANDLES @REQUESTPARAM,MODEL EVERYTHING BY
	// ITS OWN BUT THE ONE THING SHOULD SAME IF YOU HAVE A FORM MAKE
	// SURE ITS NAME LIKE name="name" etc SHOULD SAME WITH CLASS VARIABLE AS IT.
	@RequestMapping(path="/processform", method=RequestMethod.POST)
	public String handleForm(@ModelAttribute User user,Model model) {
		System.out.println(user);
		if(user.getName().isBlank()) {
			return "redirect:/contact";
		}
		
		
		if(user.getEmail().isBlank()||user.getPassword().isBlank()) {
			return "redirect:/contact";
		}
		
		
		// INSERTING THE DATA INTO THE DATA BASE 
		userDao.insert(user);
		return "success";
	}
	
	
}
