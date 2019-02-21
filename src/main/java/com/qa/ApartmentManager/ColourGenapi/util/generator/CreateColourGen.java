package com.qa.ApartmentManager.ColourGenapi.util.generator;
import java.awt.Color;
import java.util.Random;

public class CreateColourGen {
	
	public String getCreateColourGen() {
	
		Random rand = new Random();
		
		// Java 'Colour' class takes 3 floats, from 0 to 1.
		float r = rand.nextFloat();
		float g = rand.nextFloat();
		float b = rand.nextFloat();
		
		Color randomColor = new Color(r, g, b);
		
		String hex = toHex(randomColor); 
		
	return hex;
	
	}
	
	public static String toHex(Color randomColor) {
		if ((randomColor.getRed() & randomColor.getGreen() & randomColor.getBlue()) == 0) {
			randomColor.brighter();
			return "#" + toBrowserHexValue(randomColor.getRed()) + toBrowserHexValue(randomColor.getGreen()) + toBrowserHexValue(randomColor.getGreen());
		}
	    return "#" + toBrowserHexValue(randomColor.getRed()) + toBrowserHexValue(randomColor.getGreen()) + toBrowserHexValue(randomColor.getGreen());
	  }

	  private static String toBrowserHexValue(int number) {
	    StringBuilder builder = new StringBuilder(Integer.toHexString(number & 0xff));
	    while (builder.length() < 2) {
	      builder.append("0");
	    }
	    return builder.toString().toUpperCase();
	  }
}
