package com.cjss.institute.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Benifits {
	@NotNull
	private int bId;
	@NotEmpty
	private String bName;
	@NotEmpty(message = "Description must not be Empty")
	@Size(min = 10 , message = "Description must be more than 10 characters")
	private String bDesc;


	public int getbId() {
		return bId;
	}

	public void setbId(int bId) {
		this.bId = bId;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public String getbDesc() {
		return bDesc;
	}

	public void setbDesc(String bDesc) {
		this.bDesc = bDesc;
	}

	public Benifits(int bId, String bName, String bDesc) {
		this.bId = bId;
		this.bName = bName;
		this.bDesc = bDesc;
	}
}
