package com.spring.practice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import member.MemberDto;

@Controller
@RequestMapping("/login")
public class LoginController {
	@GetMapping("/form")
	public String form() {
		return "login/loginForm";
	}
	@PostMapping("/read")
	public String read(@ModelAttribute("login") MemberDto dto) {
		return "login/loginResult";
	}
}
