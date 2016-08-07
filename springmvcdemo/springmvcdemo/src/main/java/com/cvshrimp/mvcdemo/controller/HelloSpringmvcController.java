package com.cvshrimp.mvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/springmvc")
public class HelloSpringmvcController {
	
	@RequestMapping("/hello")
	public String helloMvc()
	{
		return "home";
	}
}
