package com.SpringRest.WebClient_eg.weblayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.SpringRest.WebClient_eg.service.implementation;
import com.SpringRest.WebClient_eg.weblayer.Coustmerpojo;

@Controller
@RequestMapping("/abhibus")

public class mainController {
	@Autowired
	implementation imp;
	@RequestMapping("/main")
	public String manipage() {
		return "mainpage";
	}
     @PostMapping("/bookticket")
	public String bookticket(@ModelAttribute("bean") Coustmerpojo bean,Model md) {
	Integer id=imp.bookingtickets(bean);
	   md.addAttribute("pojo1",id);
	  return "mainpage";	
	}

    @RequestMapping("/linkticket")
    public String get() {
    	return "ticket";
    }

     @GetMapping("/getticket")
     public String getingTicket(@RequestParam("id") Integer Id,Model model) {
	
     Coustmerpojo data=imp.gettickets(Id);
	  model.addAttribute("data", data);
	  return "ticket";
}
}
