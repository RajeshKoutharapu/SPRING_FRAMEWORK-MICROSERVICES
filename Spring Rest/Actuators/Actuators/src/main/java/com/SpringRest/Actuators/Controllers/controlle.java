package com.SpringRest.Actuators.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class controlle {

	@GetMapping("/getdata")
	public ResponseEntity<Pojolass> getdata(){
		Pojolass obj=new Pojolass(1,"rajesh","ongole");
		
		return new ResponseEntity<Pojolass>(obj,HttpStatus.OK);
	}
}
