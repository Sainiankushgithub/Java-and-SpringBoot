package com.websearch.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import java.util.*;

@Controller
public class ControllerClass {
	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println();
		String result=null;
		try {
			int len=result.length();
			System.out.println("length is : "+len);
			
		}catch(Exception e) {
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			e.printStackTrace(pw);
			String error= sw.toString();
			model.addAttribute("error", error);
			return "error";
		}
		return "home";
	}
	@RequestMapping(path="/uploadfile",method=RequestMethod.POST)
	public String handleFile(@RequestParam("inputfile")CommonsMultipartFile file,Model model,HttpSession session) {
		System.out.println("Succesfully input file uploaded");
		System.out.println("File size : "+file.getSize());
		System.out.println("File name : "+file.getName());
		System.out.println("File Content Type : "+file.getContentType());
		System.out.println("File Original Name : "+file.getOriginalFilename());
		System.out.println("File Byte : "+file.getBytes());
		System.out.println(""+file.getStorageDescription());
		byte []data=file.getBytes();
//		String path=session.getServletContext().getRealPath("/")+file.getOriginalFilename();
//		If I want in a WEB INF FOLDER 
		
		String path=session.getServletContext().getRealPath("/")+"resources"+File.separator+"Img"+File.separator+file.getOriginalFilename();
		System.out.println("Path :   "+path);

		try {
			FileOutputStream fos = new FileOutputStream(path);
			fos.write(data);
			fos.close();
			System.out.println("Uploded SuccessFully");
		}catch(IOException e) {
			e.printStackTrace();
			System.out.println("Uploading error");
		}
		model.addAttribute("file", file);
		return "success";
	}
	
	// Error page Mapping 
	@RequestMapping("/error")
	public String ErrorPage() {
		return "error";
	}
	
}
