package com.SpringMvc.Mvc_Components_Eg2.weblayer;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.SpringMvc.Mvc_Components_Eg2.service.Timegetter;

@Controller
public class FirstController {
	@Autowired
	Timegetter obj;
	@RequestMapping("/wish")
	public String Wishme(Model model) {
//		String ss=obj.getwhish();
//		map.put("msg",ss);
		model.addAttribute("msg",obj.getwhish());
		return "demopage";
	}

}
