package com.SpringRest.WebClient_eg.weblayer;

public class Coustmerpojo {

	private Integer id;
	private String name;
	private String source;
	private String destination;
	private String packagetype;
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
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getPackagetype() {
		return packagetype;
	}
	public void setPackagetype(String packagetype) {
		this.packagetype = packagetype;
	}
	@Override
	public String toString() {
		return "Coustmerpojo [id=" + id + ", name=" + name + ", source=" + source + ", destination=" + destination
				+ ", packagetype=" + packagetype + "]";
	}
	
	
	

}
