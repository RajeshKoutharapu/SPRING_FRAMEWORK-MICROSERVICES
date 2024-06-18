package com.SpringRest.Global_Exception_HandlingEg1.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.SpringRest.Global_Exception_HandlingEg1.model.coustmerpojo;
@Component
public interface interfaceimpl {

	public coustmerpojo getdata(Integer id);
	public coustmerpojo updatedestination(Integer id,String destination);
}
