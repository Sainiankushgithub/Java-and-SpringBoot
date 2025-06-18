package com.consultx.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.consultx.dao.UserDao;
import com.consultx.entities.Users;

@Controller
public class ControllerFile {
	
	@Autowired
	private UserDao userDao;
	
	@RequestMapping("/signup")
	public String signUp() {
		return "signup";
	}
	@RequestMapping(path="/processform",method =RequestMethod.POST)
	public String processingForm(@ModelAttribute Users user,RedirectAttributes model,HttpSession session) {
		
		if(user.getName()==null || user.getName().trim().isEmpty()) {
			model.addFlashAttribute("errorMessage","Name field cannot be empty.");
			return "redirect:/signup";
		}
		
		if(user.getEmail()==null || !user.getEmail().matches("^[A-Za-z0-9+_.-]+@(.+)$")) {
			model.addFlashAttribute("errorMessage", "Invalid email format.");
			return "redirect:/signup";
		}
		if(user.getPhone_no()==null || !user.getPhone_no().matches("\\d{10}")) {
			model.addFlashAttribute("errorMessage","Invalid phone number!");
			return "redirect:/signup";
		}
		if(user.getPassword()==null || user.getPassword().trim().isEmpty()) {
			model.addFlashAttribute("errorMessage", "Password field cannot be empty.");
			return "redirect:/signup";
		}
		
		try {
			int result=userDao.insert(user);
			System.out.println(result);
			if(result>0) {
				model.addFlashAttribute("successMessage","Successfullt submitted.");
				session.setAttribute("user", user);
			}
			else {
				model.addFlashAttribute("errorMessage", "Email or phone number already exits.");
			}
		}catch(Exception e){
			e.printStackTrace();
			model.addFlashAttribute("errorMessage", "Email or phone number already exits.");
		}
		System.out.println(user);
		return "redirect:/signup";
	}
	
//  User Panel 
	@RequestMapping("/user")
	public String user(){
		return "user";
	}
	
//	 Home page 
	@RequestMapping("/home")
	public String homme() {
		return "home";
	}
}
