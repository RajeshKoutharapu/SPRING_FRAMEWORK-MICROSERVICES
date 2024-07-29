package com.SpringSecority.Encryptingpassward.Dao;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user")
public class users {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private Integer id;
private String name;
private String pass;
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
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}
public users(Integer id, String name, String pass) {
	super();
	this.id = id;
	this.name = name;
	this.pass = pass;
}
public users() {
	super();
	// TODO Auto-generated constructor stub
}


}
