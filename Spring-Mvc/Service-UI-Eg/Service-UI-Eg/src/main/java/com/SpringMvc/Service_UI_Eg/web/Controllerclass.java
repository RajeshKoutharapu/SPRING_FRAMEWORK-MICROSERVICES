package com.SpringMvc.Service_UI_Eg.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.SpringMvc.Service_UI_Eg.service.Details;

@Controller
public class Controllerclass {
//	@Autowired
//	Details details;
	Details details=new Details(2,"rajesh","ongle",25);
	@RequestMapping("/info")
	public String mydetaiols(Model model) {
		model.addAttribute("info",details);
	   return "details";
		}

}
