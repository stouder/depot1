package com.hb.tp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller

public class HelloWorldController {
 
	@RequestMapping(value="/hello", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
 
		model.addAttribute("message", "Spring 3 MVC Hello World");
		return "hello";
 
	}
	
	@RequestMapping(value="/test", method = RequestMethod.GET)
	public String test(ModelMap model){
		model.addAttribute("test","Fabien est le meilleur");
		return "test";
	}
 
}
