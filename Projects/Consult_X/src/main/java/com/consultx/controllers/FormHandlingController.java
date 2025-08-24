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

    @RequestMapping(path="/processConsulteeForm", method=RequestMethod.POST)
    public String processConsultee(@ModelAttribute Consultee consultee, RedirectAttributes ra) {
        int rows = consulteeDao.saveConsultee(consultee);
        if (rows > 0) {
            ra.addFlashAttribute("successMessage", "Consultee registered successfully!");
        } else {
            ra.addFlashAttribute("errorMessage", "Failed to register Consultee.");
        }
        return "redirect:/signin";
    }
    
    @RequestMapping(path="/processConsultorForm", method=RequestMethod.POST)
    public String processConsultor(@ModelAttribute Consultor consultor, RedirectAttributes ra) {
        int rows = consultorDao.saveConsultor(consultor);
        if (rows > 0) {
            ra.addFlashAttribute("successMessage", "Consultor registered successfully!");
        } else {
            ra.addFlashAttribute("errorMessage", "Failed to register Consultor.");
        }
        return "redirect:/signin";
    }

    @RequestMapping("/signin")
    public String signin() { return "signin"; }

    @RequestMapping(path="/processUserForm", method=RequestMethod.POST)
	public String processUser(@RequestParam("email_phone") String email_phone,
	                          @RequestParam("password") String password,
	                          @RequestParam("role") String role,
	                          Model model,
	                          HttpSession session) {
	    try {
	        if ("Consultor".equals(role)) {
	            Consultor con = consultorDao.getUserByEmail_Number(email_phone, email_phone, password);
	            if (con != null) {
	                session.setAttribute("currentUser", con);
	                model.addAttribute("validMessageConsultor", "Welcome Consultor! " + con.getName());
	                return "signin";  // redirect to consultor dashboard
	            }
	        } else if ("Consultee".equals(role)) {
	            Consultee con = consulteeDao.getUserByEmail_Number(email_phone, email_phone, password);
	            if (con != null) {
	                session.setAttribute("currentUser", con);
	                model.addAttribute("validMessageConsultee", "Welcome Consultee! " + con.getName());
	                return "signin";  // redirect to consultee dashboard
	            }
	            
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	        model.addAttribute("errorMessage", "Something went wrong. Please try again.");
	        return "error";
	    }
	    
	    model.addAttribute("invalidMessage", "Invalid login credentials! Please try again.");
	    return "signin";
	}

    @RequestMapping("/userConsultee")
    public String userConsultee() { return "userConsultee"; }
    
    @RequestMapping("/userConsultor")
    public String userConsultor() { return "userConsultor"; }

    @RequestMapping("/consultNow")
    public String consultNow() { return "consultNow"; }
}
