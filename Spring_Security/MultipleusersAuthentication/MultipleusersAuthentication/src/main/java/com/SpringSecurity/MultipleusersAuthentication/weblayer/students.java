package com.SpringSecurity.MultipleusersAuthentication.weblayer;

public class students {
  private Integer id;
  private String name;
  private String  course;
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
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
public students() {
	super();
	// TODO Auto-generated constructor stub
}
public students(Integer id, String name, String course) {
	super();
	this.id = id;
	this.name = name;
	this.course = course;
}
  
}
