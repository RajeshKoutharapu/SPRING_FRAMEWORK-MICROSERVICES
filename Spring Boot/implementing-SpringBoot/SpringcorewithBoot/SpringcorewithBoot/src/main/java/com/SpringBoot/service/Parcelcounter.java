package com.SpringBoot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Parcelcounter {
	public Parcelcounter(){
		System.out.println("bean created");
	}
	@Autowired
	private parcel item;
	public void packingdone() {
		
		
		boolean res=item.packing();
		if(res)
			System.out.println("packing done for :"+item.getClass().toString());
		else
			System.out.println("not packed");
	}

}
