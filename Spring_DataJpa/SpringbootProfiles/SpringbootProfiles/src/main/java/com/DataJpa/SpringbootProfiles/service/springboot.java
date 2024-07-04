package com.DataJpa.SpringbootProfiles.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier
public class springboot implements course {

	@Override
	public void getcourse() {
		// TODO Auto-generated method stub
System.out.println("Youare in Spring boot class");
	}

}
