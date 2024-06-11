package com.SpringBoot.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Pizza implements parcel {
	public boolean packing() {
		return true;
	}

}
