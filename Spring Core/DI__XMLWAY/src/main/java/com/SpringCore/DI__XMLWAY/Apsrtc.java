package com.SpringCore.DI__XMLWAY;

import java.util.function.BooleanSupplier;

public class Apsrtc implements Bokingservic {
	
	public void service(String name) {
		System.out.println("ticket booked in apsrtc app for"+name);
	}

	

}
