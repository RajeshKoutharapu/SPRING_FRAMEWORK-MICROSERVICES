package com.SpringCore.DI_AnnotationWayEx1;

import org.springframework.stereotype.Component;

@Component("ecartbean")
public class Ecart implements Delhiveryservice{
	static {
		System.out.println("Ecart class is loaded");
	}
	public Ecart() {
		System.out.println("bean created for Ecart");
	}
	public void Service() {
		System.out.println("service provided by Ecart");

	}

}
