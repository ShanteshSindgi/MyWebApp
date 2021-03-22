package com.shantesh.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	 
	
	@RequestMapping("home")
	public String home(HttpServletRequest req)
	{
		String name=req.getParameter("name");
		System.out.println("In home"+ name);

		return "home";
	}
}
