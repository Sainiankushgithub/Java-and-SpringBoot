package com.progrank.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	@RequestMapping("/login")
	public String login(Model model) {
		System.out.println("This is login page url");
		model.addAttribute("name", "Ankush saini");
		model.addAttribute("age",22);
		List<String>friends= new ArrayList<String>();
		friends.add("Vishal");
		friends.add("Suraj");
		friends.add("vivek");
		friends.add("SumanDeep");
		model.addAttribute("f", friends);
		return "login";
	}

}
