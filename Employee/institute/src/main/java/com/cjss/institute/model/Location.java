package com.cjss.institute.model;

public class Location {
	private  int lid;
	private  String lName;
	private  String lCountry;
	
	
	
	public int getLid() {
		return lid;
	}



	public String getlName() {
		return lName;
	}



	public String getlCountry() {
		return lCountry;
	}


	public void setLid(int lid) {
		this.lid = lid;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public void setlCountry(String lCountry) {
		this.lCountry = lCountry;
	}

	public Location(int lid, String lName, String lCountry) {
		this.lid = lid;
		this.lName = lName;
		this.lCountry = lCountry;
	}
}
