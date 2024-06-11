package com.SpringMvc.Mvc_Components_Eg2.service;

import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.stereotype.Service;
@Service
public class Timegetter {

	
	public Timegetter() {
		super();
		// TODO Auto-generated constructor stub
		  System.out.println("---------------------------------------");

	}

	public String getwhish() {
		LocalTime time=LocalTime.now();
          int hour=time.getHour();
          System.out.println("-------------------"+hour+"--------------------");
		if(hour<12)
		   return "GOOD MORNING";
		else if(hour<16)
			return "GOOD AFTER NOON";
		else if(hour <20)
			return "GOOD EVENING";
		else
			return "GOOD NIGHT";

		
	
	}
	
}
