package com.progrank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@RequestMapping("/searchBox")
	public String searchBox() {
		return "searchBox";
	}
	
	@RequestMapping("/search")
	public RedirectView search(@RequestParam("querybox")String query) {
		String url="https://www.google.com/search?q="+query;
		RedirectView rv= new RedirectView();
		rv.setUrl(url);
		return rv;
	}
}
