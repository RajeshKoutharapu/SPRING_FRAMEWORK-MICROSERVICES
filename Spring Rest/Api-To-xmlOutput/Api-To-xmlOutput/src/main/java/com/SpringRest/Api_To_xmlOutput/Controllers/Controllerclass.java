package com.SpringRest.Api_To_xmlOutput.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Api")
public class Controllerclass {

	@PostMapping(value="/setdata",produces = {"aplications/xml","applications/json"})
	public ResponseEntity<String> setdata(@RequestBody coustmerdata data){
		   String msg="Data inserted succesfully";
			return new ResponseEntity<String>(msg,HttpStatus.ACCEPTED);
	}
	@GetMapping( value ="/getdata",produces ={"aplications/xml","applications/json"})
	public ResponseEntity<coustmerdata> getdata()
	
	{
		System.out.println("INVOKED--------");
		coustmerdata obj=new coustmerdata(1,"rajesh","ongole","delivered");
		
		return new  ResponseEntity<coustmerdata>(obj,HttpStatus.OK);
	}

}
