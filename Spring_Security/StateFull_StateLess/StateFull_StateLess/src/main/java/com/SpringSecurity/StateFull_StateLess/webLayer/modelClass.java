package com.SpringSecurity.StateFull_StateLess.webLayer;

public class modelClass {

	private String Name;
	private String Job;
	private Integer Salary;
	private String Location;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getJob() {
		return Job;
	}
	public void setJob(String job) {
		Job = job;
	}
	public Integer getSalary() {
		return Salary;
	}
	public void setSalary(Integer salary) {
		Salary = salary;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public modelClass(String name, String job, Integer salary, String location) {
		super();
		Name = name;
		Job = job;
		Salary = salary;
		Location = location;
	}
	public modelClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
