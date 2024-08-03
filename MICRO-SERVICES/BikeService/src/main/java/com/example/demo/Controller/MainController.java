package com.example.demo.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	@GetMapping("/getbike")
	public ResponseEntity<String> get(){
		String s="HELLO THIS BIKE SERVICE FROM RAJESH MOTERS";
		return new ResponseEntity<String>(s,HttpStatus.OK);
	}

}
