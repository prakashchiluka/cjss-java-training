package com.cjss.school.model;

import com.cjss.school.Views;
import com.fasterxml.jackson.annotation.JsonView;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {

	@JsonView(Views.MyResponseViews.class)
	private String name;
	@JsonView(Views.MyResponseViews.class)
	private String branch;
	@JsonView(Views.MyResponseViews.class)
	private int year;
	private Map<String, Double> subjectMarks;
	private List<Attendance> attendance;

	public Student(String name, String branch, int year, Map<String, Double> subjectMarks, List<Attendance> attendance) {
		this.name = name;
		this.branch = branch;
		this.year = year;
		this.subjectMarks = subjectMarks;
		this.attendance = attendance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Map<String, Double> getSubjectMarks() {
		return subjectMarks;
	}

	public void setSubjectMarks(Map<String, Double> subjectMarks) {
		this.subjectMarks = subjectMarks;
	}

	public List<Attendance> getAttendance() {
		return attendance;
	}

	public void setAttendance(List<Attendance> attendance) {
		this.attendance = attendance;
	}


	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				", branch='" + branch + '\'' +
				", year=" + year +
				'}';
	}
}
