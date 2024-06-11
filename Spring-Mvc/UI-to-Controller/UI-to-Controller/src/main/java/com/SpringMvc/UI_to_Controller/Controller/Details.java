package com.SpringMvc.UI_to_Controller.Controller;

public class Details {
private String name;
private Integer hno;
private String city;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Integer getHno() {
	return hno;
}
public void setHno(Integer hno) {
	this.hno = hno;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public Details() {
	super();
	// TODO Auto-generated constructor stub
}
public Details(String name, Integer hno, String city) {
	super();
	this.name = name;
	this.hno = hno;
	this.city = city;
}

}
