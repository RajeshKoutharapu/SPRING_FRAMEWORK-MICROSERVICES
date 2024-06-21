package com.SprinRest.HATEOES_Eg.weblayer;

import org.springframework.hateoas.RepresentationModel;

public class mobilepojo  extends RepresentationModel{

	private String name;
	private String company;
	private String ram;
	private String rom;
	private String cam;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getRom() {
		return rom;
	}
	public void setRom(String rom) {
		this.rom = rom;
	}
	public String getCam() {
		return cam;
	}
	public void setCam(String cam) {
		this.cam = cam;
	}
	public mobilepojo(String name, String company, String ram, String rom, String cam) {
		super();
		this.name = name;
		this.company = company;
		this.ram = ram;
		this.rom = rom;
		this.cam = cam;
	}
	public mobilepojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
