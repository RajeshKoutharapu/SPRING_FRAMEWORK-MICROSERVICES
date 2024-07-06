package com.SpringAop.SpringAopEg.model;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class laptop {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String lapname;
	private String brand;
	private String  ramp;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLapname() {
		return lapname;
	}
	public void setLapname(String lapname) {
		this.lapname = lapname;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getRamp() {
		return ramp;
	}
	public void setRamp(String ramp) {
		this.ramp = ramp;
	}
	public laptop(Integer id, String lapname, String brand, String ramp) {
		super();
		this.id = id;
		this.lapname = lapname;
		this.brand = brand;
		this.ramp = ramp;
	}
	public laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
