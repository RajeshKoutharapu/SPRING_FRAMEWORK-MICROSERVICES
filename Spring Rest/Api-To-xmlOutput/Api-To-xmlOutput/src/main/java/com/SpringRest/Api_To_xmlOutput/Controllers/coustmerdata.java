package com.SpringRest.Api_To_xmlOutput.Controllers;

import javax.xml.bind.annotation.XmlRootElement;

//import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class coustmerdata {
	
	private Integer id;
	private String name;
	private String city;
	private String status;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public coustmerdata(Integer id, String name, String city, String status) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.status = status;
	}
	public coustmerdata() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
