package com.SpringBoot.SpringJDBCAPI.perisistence;

import org.springframework.stereotype.Component;

@Component
public class Menu {
	private int sno;
	private String itemname;
	private int price;
	private String Status;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	

}
