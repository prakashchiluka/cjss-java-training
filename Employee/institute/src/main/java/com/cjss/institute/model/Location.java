package com.cjss.institute.model;

import com.cjss.institute.validators.ValidateCountryName;
import com.cjss.institute.validators.ValidateLocationName;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class Location {
	@NotNull
	private  int lid;
	@NotEmpty
	@ValidateLocationName(message = "City name must be Hyderabad or Chennai or London")
	private  String lName;
	@NotEmpty
	@ValidateCountryName(message = "Country name must be London or India")
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
