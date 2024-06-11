package com.SpringDataJpa.Demo_DataJpa.persistence;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="demo")
public class demodetails {
	
	
public demodetails() {
		super();
		// TODO Auto-generated constructor stub
	}
@Id
private Integer  id;
private String name;
private Integer Class;
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
public Integer getlevel() {
	return Class;
}
public void setClass(Integer Class) {
	this.Class = Class;
}
public demodetails(Integer id, String name, Integer Class) {
	super();
	this.id = id;
	this.name = name;
	this.Class = Class;
}


}
