package com.SpringMvc.Mvc_Components_Eg.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/controller3")
public class ThirdController {
	
	@GetMapping("/telusuko")
	public String getdeatil(Model model) {
		
		model.addAttribute("msg","welcome back telsko learners");
		return "telusko";
	}
	@GetMapping("/telusuko1")
	public String getdeatil1(Model model) {
		
		model.addAttribute("msg","welcome back telsko learners batch 1");
		return "telusko";
	}

}
