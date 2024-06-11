package com.SpringCore.DI_AnnotationWayEx1;

import org.springframework.stereotype.Component;

@Component("fedxbean")
public class Fdex implements Delhiveryservice{
	static {
		System.out.println("Fdex class is  loaded ");
	}
	public Fdex() {
		System.out.println("bean create for Fdex ");
	}
	public void Service() {
		 System.out.println("service provide by fdex");
	}

}
