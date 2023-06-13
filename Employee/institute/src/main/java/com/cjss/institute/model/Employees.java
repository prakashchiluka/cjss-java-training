package com.cjss.institute.model;

import java.util.List;

public class
Employees {

	
	int id;
	String name;
	Double sal;
	Location location;
	Department department;

	List<Benifits> benifits;
	public Employees(int id, String name, Double sal, Location location, Department department,
			List<Benifits> benifits) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.location = location;
		this.department = department;
		this.benifits = benifits;
	}

	public Employees() {

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
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public List<Benifits> getBenifits() {
		return benifits;
	}
	public void setBenifits(List<Benifits> benifits) {
		this.benifits = benifits;
	}
	
	
	
	
}
