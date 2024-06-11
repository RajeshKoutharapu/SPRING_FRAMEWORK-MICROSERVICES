package com.SpringMvc.Mvc_Components_Eg.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class FirstController {
	
	@RequestMapping("/hi")
	public String getmsg(Model model) {
		model.addAttribute("msg","Hey there  I am rajesh");
		return "home";
	}

}
