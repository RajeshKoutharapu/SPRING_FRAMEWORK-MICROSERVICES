package com.SpringCore.DI_AnnotationWayEx1;

import org.springframework.stereotype.Component;

@Component("dtdcbean")
public class Dtdc implements Delhiveryservice{
	static {
		System.out.println("Dtdc class loaded");
	}
	public Dtdc() {
		  System.out.println("bean created for DTDC");
	}
public void Service() {
	System.out.println("service provided by Dtdc");

}
}
