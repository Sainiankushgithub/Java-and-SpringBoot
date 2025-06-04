package com.progrank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectController {

	@RequestMapping("/one")
	/*
	 * 
	 * 
	 * WAY 1 
	public String one() {
		return "redirect:/enjoy";
	}
	 * 
	 * 
	 */
	
	public RedirectView one() {
		RedirectView rv = new RedirectView();
		rv.setUrl("enjoy");
		return rv;
	}
	
	
	
	@RequestMapping("/enjoy")
	public String enjoy() {
		return "contact";
	}
}
