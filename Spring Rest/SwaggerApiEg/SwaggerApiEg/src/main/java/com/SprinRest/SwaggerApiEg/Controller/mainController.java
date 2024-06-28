package com.SprinRest.SwaggerApiEg.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api")
@Tag(name="dataoperation api",description="get and set the data")
public class mainController {

	@GetMapping("/getdata")
	@Operation(summary = "usedtoget data",description = "just give the data stored in")
	public  ResponseEntity<pojo> getdata(){
		pojo p=new pojo(1,"rajesh","ongole","33");
		return new ResponseEntity<pojo>(p,HttpStatus.OK);
	}
	
	@PostMapping("/setdata")
	@Operation(summary = "set the data ",description = "taje input as json and store the data")
	 public ResponseEntity<String> setdata(@RequestBody pojo p){
		String s="data succesfully stired";
		
		return new  ResponseEntity<String>(s,HttpStatus.ACCEPTED);
	}
}
