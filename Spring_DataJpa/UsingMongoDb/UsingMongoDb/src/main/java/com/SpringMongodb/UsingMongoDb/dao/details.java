package com.SpringMongodb.UsingMongoDb.dao;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class details {

	
	private Integer Hno;
	private String village;
	private String City;
	
	public Integer getHno() {
		return Hno;
	}
	public void setHno(Integer hno) {
		Hno = hno;
	}
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public details( Integer hno, String village, String city) {
		super();
		
		Hno = hno;
		this.village = village;
		City = city;
	}
	public details() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
