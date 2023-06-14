package com.cjss.institute.model;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;

public class
Employees {

	@NotNull
	int id;
	@NotBlank
	@Size(min = 3,max = 20,message = "name must contain minimum of 3 characters and maximum of 20 characters")
	@Pattern(regexp = "[a-zA-z]+[.]?[a-zA-Z]+")
			//added Pattern to name which accepts only Alphabets
	String name;

	@Email(message = "given email is not valid,please provide valid email address")
//	@Pattern(regexp = "[A-Za-z0-9\\-._]+[@]+[a-z]+[.]+[a-z]{2,4}",message = "given email is not valid,please provide valid email address")
	String email;
	@NotNull(message = "please provide valid details")
	@PositiveOrZero(message = "please provide positive values")
	Double sal;

	@Valid Location location;
	@Valid Department department;

	List<@Valid Benifits> benifits;

	public Employees(int id, String name, String email, Double sal, Location location, Department department, List<Benifits> benifits) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.sal = sal;
		this.location = location;
		this.department = department;
		this.benifits = benifits;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
