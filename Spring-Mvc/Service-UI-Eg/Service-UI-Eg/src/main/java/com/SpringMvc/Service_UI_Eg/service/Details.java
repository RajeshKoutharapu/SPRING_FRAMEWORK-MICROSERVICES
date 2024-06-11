package com.SpringMvc.Service_UI_Eg.service;

import org.springframework.stereotype.Service;

import lombok.Data;
@Service
@Data
public class Details {
private int id;
private String name;
private String city;
private int age;
public Details(int id, String name, String city, int age) {
	super();
	this.id = id;
	this.name = name;
	this.city = city;
	this.age = age;
}
public int getId() {
	return id;
}
public void setId(int id) {
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
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Details() {
	super();
	// TODO Auto-generated constructor stub
}

}
