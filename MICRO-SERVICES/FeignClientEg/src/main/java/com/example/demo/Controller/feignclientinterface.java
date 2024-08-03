package com.example.demo.Controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="BIKESERVICE")
public interface feignclientinterface {

	@GetMapping("/getbike")
	public String getbikeapi();
}
