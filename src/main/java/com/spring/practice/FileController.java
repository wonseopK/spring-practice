package com.spring.practice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/file")
public class FileController {
	
	@GetMapping("/uploadForm")
	public String upload() {
		
		return "upload/uploadForm";
	}
	@GetMapping("/multiUploadForm")
	public String multiUpload() {
		
		return "upload/multiUploadForm";
	}
}
