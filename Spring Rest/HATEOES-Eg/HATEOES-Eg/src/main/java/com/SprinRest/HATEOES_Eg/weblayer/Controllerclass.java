package com.SprinRest.HATEOES_Eg.weblayer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api")
public class Controllerclass {
@GetMapping("allmobiles")
	public List<mobilepojo> getallmobiles(){
		 List<mobilepojo> list=new ArrayList<>();
		  list.add(new mobilepojo("pocom3","MI","4gb","64gb","12mp"));
		  list.add(new mobilepojo("realmegt","oppo","4gb","64gb","102mp"));
		  list.add(new mobilepojo("s20Ultra","Samsung","8gb","64gb","120mp"));
		  list.add(new mobilepojo("motorola","MOTO","4gb","64gb","12mp"));
		 
		return  list;
				
	}
	@GetMapping("/getiphone")
	public ResponseEntity<mobilepojo> getiphone(){
	
		mobilepojo obj=new mobilepojo("Iphone 13","Apple","4gb","64gb","2mp");
		  Link link   =WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(Controllerclass.class).getallmobiles()).withRel("allmobiles");
		  obj.add(link);
		   return new ResponseEntity<mobilepojo>(obj,HttpStatus.OK);
		
	}
	
}
