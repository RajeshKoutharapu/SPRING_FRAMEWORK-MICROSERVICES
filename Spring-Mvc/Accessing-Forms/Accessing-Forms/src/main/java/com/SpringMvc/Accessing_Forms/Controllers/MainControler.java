package com.SpringMvc.Accessing_Forms.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MainControler {
	
	@GetMapping("/register")
	public String get() {
		return "Register";
		}
  @RequestMapping("final")
	public String contrmethod(Model model, @ModelAttribute("po") Pojo po) {
		model.addAttribute("details", po); 
		
		return "result";
		
	}
}
