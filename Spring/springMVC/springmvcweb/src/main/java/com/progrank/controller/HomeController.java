package com.progrank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String home() {
		return "redirect:/login";
	}
	@RequestMapping("help")
	public ModelAndView help() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("desk","Help Desk for Assistance");
		mv.addObject("assistant", "Ankush saini");
		return mv;
	}
}


