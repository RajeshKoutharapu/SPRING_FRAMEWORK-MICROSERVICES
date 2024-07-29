package com.SpringSecority.Encryptingpassward.Weblayer;
import java.util.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	 List<laptops> list=new ArrayList<>();
	public MainController() {
		list.add(new laptops(1,"hp victos","HP",1000));
		list.add(new laptops(2,"Accer nitro","ACCER",1000));
		list.add(new laptops(3,"Idea pad","LENOVO",1000));
		list.add(new laptops(4,"Think Pad","LENOVO",1000));
	}
	
	@GetMapping("/info")
	public String getinfo() {
		return "This is all about laptop";
	}
	@PostMapping("/add")
	public String adalap(@RequestBody laptops lap) {
		list.add(lap);
		return "laptop added succesully";
	}

	@GetMapping("/get")
	public List<laptops> getdata(){
		return list;
	}
}
