package com.SpringMvc.Mvc_Components_Eg.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecondController {

	@RequestMapping("/hello")
public String getmsg(Model model) {
		
	model.addAttribute("msg","I AM LEARNING SPRING BOOT djj");
		return "home";
	}
	
	@PostMapping("/hello")
	public String getmsg1(Model model) {
			
		model.addAttribute("msg","I AM LEARNING SPRING BOOT post mapping");
			return "home";
		}
	
}
