package com.complexForm.controllers;

import java.beans.PropertyEditorSupport;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.complexForm.dao.UserDao;
import com.complexForm.entities.Address;
import com.complexForm.entities.User;

@Controller
public class FormController {

	private final UserDao userDao;

	public FormController(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

	    binder.registerCustomEditor(LocalDate.class, new PropertyEditorSupport() {
	        @Override
	        public void setAsText(String text) {
	            setValue(LocalDate.parse(text, formatter));
	        }
	    });
	}


	@RequestMapping("/form")
	public String home() {
		return "form";
	}
	// This is my way 1
	/*
	 * 
	 * 
	 * @RequestMapping(path="/processform",method=RequestMethod.POST) public String
	 * success(@RequestParam("name")String name,
	 * 
	 * @RequestParam("email")String email,
	 * 
	 * @RequestParam("password")String password,
	 * 
	 * @RequestParam("age")int age,
	 * 
	 * @RequestParam("gender")String gender,
	 * 
	 * @RequestParam("street")String street,
	 * 
	 * @RequestParam("city")String city,
	 * 
	 * @RequestParam("dob") String dobString,
	 * 
	 * @RequestParam("course") String course,
	 * 
	 * @RequestParam("type") String type, Model model) {
	 * 
	 * LocalDate dob= LocalDate.parse(dobString);
	 * 
	 * 
	 * Address address = new Address(); address.setStreet(street);
	 * address.setCity(city);
	 * 
	 * User user = new User(); user.setAddress(address); user.setName(name);
	 * user.setEmail(email); user.setPassword(password); user.setAge(age);
	 * user.setGender(gender); user.setDob(dob); user.setCourse(course);
	 * user.setType(type);
	 * 
	 * model.addAttribute("user", user);
	 * 
	 * userDao.insert(user);
	 * 
	 * return "success"; }
	 * 
	 * 
	 */
	// This is my  2nd way 
	
	  @RequestMapping(path="/processform",method=RequestMethod.POST)
	  public String success(@ModelAttribute("user")User user,@ModelAttribute("address")Address address,Model model,BindingResult result) {
		  
		  if(result.hasErrors()) {
			  return "form";
		  }
		  
		  user.setAddress(address);
		  userDao.insert(user);
		  model.addAttribute("user", user);
		  
		  return "success";
	  }
    }
