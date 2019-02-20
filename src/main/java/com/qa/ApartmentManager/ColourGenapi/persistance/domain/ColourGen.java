package com.qa.ApartmentManager.ColourGenapi.persistance.domain;

public class ColourGen {

	private String colourCode;
	
	public ColourGen() {}
	
	public ColourGen(String colourCode) {
		this.setColourCode(colourCode);
	}
	
	public String getColourCode() {
		return colourCode;
	}

	public void setColourCode(String colourCode) {
		this.colourCode = colourCode;
	}
}
