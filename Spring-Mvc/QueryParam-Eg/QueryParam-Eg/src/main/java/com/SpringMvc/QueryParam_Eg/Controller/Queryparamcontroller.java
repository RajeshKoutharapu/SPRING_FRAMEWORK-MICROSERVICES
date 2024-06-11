package com.SpringMvc.QueryParam_Eg.Controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Queryparamcontroller {
	//    http://localhost:8080/get?name=Rajesh&marks=88 -->zurl urd to get the answer
	
	@RequestMapping("/get")
	public String getmsg(@RequestParam("name")String Name,Integer marks,Map<String,Object> model) {
		String msg="Hey "+Name+" You Got "+marks+"marks in you semister";
		model.put("msg", msg);
		return "index";
		
	}

}
