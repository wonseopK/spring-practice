package com.spring.practice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/file")
public class FileController {
	
	@GetMapping("/uploadForm")
	public String uploadForm() {
		
		return "upload/uploadForm";
	}
	@PostMapping("/upload")
	public String upload() {
		
		return "upload/uploadResult";
	}
	
	@GetMapping("/multiUploadForm")
	public String multiUploadForm() {
		
		return "upload/multiUploadForm";
	}
}
