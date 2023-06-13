package com.cjss.school.model;

import com.cjss.school.Views;
import com.fasterxml.jackson.annotation.JsonView;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public class Staff {
	@JsonView(Views.MyResponseViews.class)
	private String name;
	@JsonView(Views.MyResponseViews.class)
	private String email;
	@JsonView(Views.MyResponseViews.class)
	private List<Subject> subjects;
	private String branchName;

	private List<Attendance> attendance;

	public Staff(String name, String email, List<Subject> subjects, String branchName, List<Attendance> attendance) {
		this.name = name;
		this.email = email;
		this.subjects = subjects;
		this.branchName = branchName;
		this.attendance = attendance;
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

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public List<Attendance> getAttendance() {
		return attendance;
	}

	public void setAttendance(List<Attendance> attendance) {
		this.attendance = attendance;
	}


}
