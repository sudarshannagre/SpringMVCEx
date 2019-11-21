package com.sud.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloController {

	@RequestMapping(method = RequestMethod.GET)
	public String hello(ModelMap model) {
		model.addAttribute("msg", "This is first MVC 5 application...Welcome");
		return "welcome";
	}
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String helloSpring(ModelMap model) {
		model.addAttribute("msg", "This is first MVC 5 application...Welcome");
		return "welcome";
	}
}
