package com.spring.practice;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/file")
public class FileController {
	//single upload
	@GetMapping("/uploadForm")
	public String uploadForm() {
		
		return "upload/uploadForm";
	}
	@PostMapping("/upload")
	public ModelAndView upload(@RequestParam String title, @RequestParam MultipartFile file, HttpServletRequest request) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
		ModelAndView mView = new ModelAndView();
		//���ε��� ������α��ϱ�
		String path = request.getSession().getServletContext().getRealPath("/WEB-INF/image"); 
		System.out.println(path);
		//���� �����̸�
		String fileName = file.getOriginalFilename();
		System.out.println(fileName);
		if(!fileName.equals("")) {
			fileName = "photo_"+sdf.format(new Date())+"_"+fileName;
			//path�� ���ε��ϱ�
			try {
				file.transferTo(new File(path+"\\"+fileName));
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			fileName = "no";//���ε� ������ ���
		}
		mView.addObject("fileName",fileName);
		mView.addObject("title",title);
		mView.addObject("path",path);
		
		mView.setViewName("upload/uploadResult");
		return mView;
	}
	
	//multi upload
	@GetMapping("/multiUploadForm")
	public String multiUploadForm() {
		
		return "upload/multiUploadForm";
	}
	@PostMapping("/multiUpload")
	public String multiUpload() {
		
		return "upload/uploadResult";
	}
}
