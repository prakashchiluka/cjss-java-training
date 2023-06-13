package com.cjss.institute.model;

public class Benifits {
	private int bId;
	private String bName;
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
