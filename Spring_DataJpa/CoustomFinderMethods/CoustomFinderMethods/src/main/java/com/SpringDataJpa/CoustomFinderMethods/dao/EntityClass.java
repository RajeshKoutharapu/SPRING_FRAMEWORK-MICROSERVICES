package com.SpringDataJpa.CoustomFinderMethods.dao;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="tablets")
public class EntityClass {
	
	@Id
	//@GeneratedValue(strategy=Generated.Auto)
	private Integer id;
	private String name;
	private Integer price;
	private String weight;
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
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public EntityClass(Integer id, String name, Integer price, String weight) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.weight = weight;
	}
	public EntityClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
