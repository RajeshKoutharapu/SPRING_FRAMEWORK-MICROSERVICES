package com.DataJpa.SpringbootProfiles.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Primary
@Profile("devops")
public class devops implements course {

	public void getcourse() {
		// TODO Auto-generated method stub
		System.out.println("you are in devops course");

	}

}
