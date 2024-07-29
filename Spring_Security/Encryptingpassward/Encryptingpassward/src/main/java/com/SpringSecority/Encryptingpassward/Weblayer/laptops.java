package com.SpringSecority.Encryptingpassward.Weblayer;

public class laptops {

	
	private Integer id;
	private String name;
	private String brand;
	private Integer price;
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
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public laptops(Integer id, String name, String brand, Integer price) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
		this.price = price;
	}
	public laptops() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
