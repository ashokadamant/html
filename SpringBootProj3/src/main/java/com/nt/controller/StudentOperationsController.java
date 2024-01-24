package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentOperationsController {
    @GetMapping("/")
	public String  showWelcomePage() {
		return "welcome";
	}
    @GetMapping("/register")
    public String showStudentFormPage() {
    	return "registerstudent";
    }
    @PostMapping("/register")
    public String registerStudent(@ModelAttribute("stud") Student st) {
    	
    	return "showresult";
    }
	@GetMapping("/register1")
	public String registerStudent(){
		return "";
	}
}
