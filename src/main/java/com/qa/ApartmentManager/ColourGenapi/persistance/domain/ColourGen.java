package com.qa.ApartmentManager.ColourGenapi.persistance.domain;

import java.awt.Color;

public class ColourGen {

	private Color colourCode;
	
	public ColourGen() {}
	
	public ColourGen(Color colourCode) {
		this.setColourCode(colourCode);
	}
	
	public Color getColourCode() {
		return colourCode;
	}

	public void setColourCode(Color colourCode) {
		this.colourCode = colourCode;
	}
}
