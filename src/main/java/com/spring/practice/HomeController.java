package com.spring.practice;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@GetMapping("/")
	public String start() {
		return "home";
	}
	
	
	@GetMapping("/login/form")
	public String login() {
		System.out.println("Æû");
		return "form";
	}
	@GetMapping("/login/read")
	public String process(Model model, @RequestParam(value = "id") String id,
			@RequestParam(value = "pass") String pass) 
	{
		model.addAttribute("id", id);
		model.addAttribute("pass", pass);
		model.addAttribute("login", "ok");
		return "home";
	}
	@GetMapping("/login/logout")
	public String logout() {
		System.out.println("Æû");
		return "redirect:/";
	}
	
	
}
