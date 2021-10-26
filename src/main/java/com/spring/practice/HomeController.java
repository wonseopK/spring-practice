package com.spring.practice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
		if(pass.equals("1234")) {
			model.addAttribute("result", "true");
		}else {
			model.addAttribute("result", "false");
		}
		
		return "form";
	}
	@GetMapping("/login/myPage")
	public String myPage(Model model) 
	{
		
		model.addAttribute("id", "wonseop"); 
		model.addAttribute("pass", "1234");
		model.addAttribute("name", "±è¿ø¼·");
		model.addAttribute("age", "29");
		
		return "myPage";
	}
	@GetMapping("/login/logout")
	public String logout() {
		System.out.println("Æû");
		return "redirect:/";
	}
	@GetMapping("/login/ok")
	public String process(Model model) 
	{
		model.addAttribute("login", "ok");
		return "home";
	}
	
}
