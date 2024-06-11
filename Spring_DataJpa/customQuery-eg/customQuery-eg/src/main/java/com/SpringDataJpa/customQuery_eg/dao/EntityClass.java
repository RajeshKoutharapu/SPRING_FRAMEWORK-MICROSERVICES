package com.SpringDataJpa.customQuery_eg.dao;
import jakarta.persistence.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
@Entity
@Table(name="nonveg_maincourse")
public class EntityClass {
	@Id
    private Integer sno;  
	private String itemname;
	private Integer price;
	private String existed;
	public Integer getSno() {
		return sno;
	}
	public void setSno(Integer sno) {
		this.sno = sno;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getExisted() {
		return existed;
	}
	public void setExisted(String existed) {
		this.existed = existed;
	}
	public EntityClass(Integer sno, String itemname, Integer price, String existed) {
		super();
		this.sno = sno;
		this.itemname = itemname;
		this.price = price;
		this.existed = existed;
	}
	@Override
	public String toString() {
		return "EntityClass [sno=" + sno + ", itemname=" + itemname + ", price=" + price + ", existed=" + existed + "]";
	}
	public EntityClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
