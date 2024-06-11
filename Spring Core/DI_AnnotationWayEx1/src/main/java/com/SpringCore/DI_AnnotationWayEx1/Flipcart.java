package com.SpringCore.DI_AnnotationWayEx1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("Flipcartbean")
public class Flipcart {
	@Autowired
	@Qualifier("dtdcbean")
     private Delhiveryservice service;
	public void Getservice() {
		service.Service();
	}
	
     
}
