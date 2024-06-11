package com.SpringMvc.PathParam_Eg.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.websocket.server.PathParam;

@Controller
public class Pathparamcontroller {
@RequestMapping("/get/{name}/{cource}")
	public String getmsg(@PathVariable("name")String Name,@PathVariable("cource") String c,Map<String, Object> model)
	{
		
	String msg="hi "+Name+" you know "+c+" Right?";
	model.put("msg", msg);
		return "index";
	}
	
}
