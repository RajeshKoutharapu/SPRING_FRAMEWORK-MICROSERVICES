package com.SpringMvc.UI_to_Controller.Controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerClass {
@RequestMapping("/get")
public String getmsg(Map<String,Object> model) {
	Details obj=new Details("Rajesh",89,"ongole");
	model.put("msg", obj);
	return "index2";
	
}
}
