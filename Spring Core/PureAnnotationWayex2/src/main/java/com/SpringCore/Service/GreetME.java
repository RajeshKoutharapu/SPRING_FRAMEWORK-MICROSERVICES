package com.SpringCore.Service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class GreetME {
	@Autowired
 private LocalDateTime datetime;
 
public void generategreetings() {
	int time=datetime.getHour();
	if(time<12)
		System.out.println("GOOD MORNING");
	else if(time<17)
		System.out.println("GOOD AFTERNOON");
	else if(time<20)
		System.out.println("GOOD EVENING");
	else
		System.out.println("GOOD NIGHT");
}
}
