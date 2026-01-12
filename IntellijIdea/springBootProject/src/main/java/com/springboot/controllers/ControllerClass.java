package com.springboot.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerClass {
    @GetMapping("/index")
    public String home() {
        return "home"; // resolves to /WEB-INF/views/home.jsp
    }
}