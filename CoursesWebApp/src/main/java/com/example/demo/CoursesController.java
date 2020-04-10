package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CoursesController {
	@RequestMapping("course")
//	ResponseBody add @ before it and it will give body content
	public String courses()
	{
		//System.out.println("Welcome to My Web App");
		return "course";
	}
}
