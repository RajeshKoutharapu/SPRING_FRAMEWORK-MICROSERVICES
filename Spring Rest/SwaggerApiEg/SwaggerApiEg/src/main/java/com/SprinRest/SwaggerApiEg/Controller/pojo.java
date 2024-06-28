package com.SprinRest.SwaggerApiEg.Controller;

public class pojo {
private Integer id;
private String name;
private String city;
private String marks;
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
public String getMarks() {
	return marks;
}
public void setMarks(String marks) {
	this.marks = marks;
}
public pojo() {
	super();
	// TODO Auto-generated constructor stub
}
public pojo(Integer id, String name, String city, String marks) {
	super();
	this.id = id;
	this.name = name;
	this.city = city;
	this.marks = marks;
}

}
