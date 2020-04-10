package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CoursesController {
	@RequestMapping("course")
//	ResponseBody add @ before it and it will give body content
//	public String courses(HttpServletRequest req)
//	{
//		HttpSession session = req.getSession();
//		String cname = req.getParameter("cname");
//		//System.out.println("The course name is: " + cname);
//		session.setAttribute("cname", cname);
//		return "course";
//	}
	public ModelAndView courses(@RequestParam("cname")String coursename)
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("cname", coursename);
		mv.setViewName("course");
		return mv;
	}
}
