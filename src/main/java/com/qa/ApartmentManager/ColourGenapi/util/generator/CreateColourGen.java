package com.qa.ApartmentManager.ColourGenapi.util.generator;
import java.awt.Color;
import java.util.Random;

public class CreateColourGen {
	
	public Color getCreateColourGen() {
	
		Random rand = new Random();
		
		// Java 'Colour' class takes 3 floats, from 0 to 1.
		float r = rand.nextFloat();
		float g = rand.nextFloat();
		float b = rand.nextFloat();
		
		Color randomColor = new Color(r, g, b);
	return randomColor;
	
	}
}
