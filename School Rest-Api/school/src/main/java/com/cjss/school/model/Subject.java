package com.cjss.school.model;

import com.cjss.school.Views;
import com.fasterxml.jackson.annotation.JsonView;

import java.util.List;
import java.util.Map;

public class Subject {
	private String subjectCode;
	@JsonView(Views.MyResponseViews.class)
	private String subjectName;
	private Map<String, Integer> subjectBranchYear;
	public String getSubjectCode() {
		return subjectCode;
	}
	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public Map<String, Integer> getSubjectBranchYear() {
		return subjectBranchYear;
	}
	public void setSubjectBranchYear(Map<String, Integer> subjectBranchYear) {
		this.subjectBranchYear = subjectBranchYear;
	}
	public Subject(String subjectCode, String subjectName, Map<String, Integer> subjectBranchYear) {
		super();
		this.subjectCode = subjectCode;
		this.subjectName = subjectName;
		this.subjectBranchYear = subjectBranchYear;
	}
	
	
	
}
