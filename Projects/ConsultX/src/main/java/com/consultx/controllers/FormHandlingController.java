package com.consultx.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.consultx.dao.ConsulteeDao;
import com.consultx.dao.ConsultorDao;
import com.consultx.entities.Consultee;
import com.consultx.entities.Consultor;

@Controller
public class FormHandlingController {
	
	@Autowired
	private ConsulteeDao consulteeDao;
	
	@Autowired
	private ConsultorDao consultorDao;
	
	@RequestMapping(path="/processConsulteeForm",method=RequestMethod.POST)
	public String ProcessConsulteeForm(@ModelAttribute Consultee consultee) {
		int result = consulteeDao.insert(consultee);
		System.out.println("Result : "+result);
		return "success";
	}
	
	@RequestMapping(path="processConsultorForm",method = RequestMethod.POST)
	public String processConsultorForm(@ModelAttribute Consultor consultor) {
		int result=consultorDao.insert(consultor);
		System.out.println(result);
		return "success";
	}
	
	
	// Sign in 
	@RequestMapping("/signin")
	public String signin() {
		return "signin";
	}
	@RequestMapping(path="/processUserForm", method=RequestMethod.POST)
	public String processUser(
	        @RequestParam("email_phone") String email_phone,
	        @RequestParam("password") String password,
	        @RequestParam("role") String role,
	        Model model,
	        HttpSession session) {
	    try {
	        if (role.equals("Consultor")) {
	            Consultor con = consultorDao.getUserByEmail_Number(email_phone, email_phone, password);
	            if (con != null) {
	                session.setAttribute("currentUser", con);
	                model.addAttribute("validMessageConsultor", "Welcome Consultor!" + con.getName());
	                return "signin";
	            }
	        } else if (role.equals("Consultee")) {
	            Consultee con = consulteeDao.getUserByEmail_Number(email_phone, email_phone, password);
	            if (con != null) {
	                session.setAttribute("currentUser", con);
	                model.addAttribute("validMessageConsultee", "Welcome Consultee!" + con.getName());
	                return "signin";
	            }
	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	        return "error";
	    }
	    model.addAttribute("invalidMessage", "Invalid Login credentials! Please try again.");
        return "signin";
	}


	
	@RequestMapping("/userConsultor")
	public String getUserConsultor() {
		return "userConsultor";
	}
	@RequestMapping("/userConsultee")
	public String getUserConsultee() {
		return "userConsultee";
	}

}
