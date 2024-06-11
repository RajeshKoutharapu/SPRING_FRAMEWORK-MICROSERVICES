package com.SpringCore.DI__XMLWAY;

public class Targetclass {
	static {
		System.out.println("Target class is loaded");
	}
	   private String name;

	public void setName(String name) {
		this.name = name;
	}
	private Bokingservic booktc;
	
	public void setBooktc(Bokingservic booktc) {
		this.booktc = booktc;
	}
  public Targetclass() {
	    System.out.println("bean is created for Target class");
  }
	public void booktickets() {
		booktc.service(name);
	}
	
	   

}
