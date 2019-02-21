package com.qa.ApartmentManager.ColourGenapi.util.generator;

import java.awt.Color;
import java.util.Random;

public class CreateColourGen {

	public String getCreateColourGen() {

		Random rand = new Random();

		float red = rand.nextFloat();
		float green = rand.nextFloat();
		float blue = rand.nextFloat();

		Color randomColor = new Color(red, green, blue);

		return toHex(randomColor);

	}

	public static String toHex(Color randomColor) {
		if ((randomColor.getRed() & randomColor.getGreen() & randomColor.getBlue()) == 0) {
			randomColor.brighter();
		}
		return "#" + toBrowserHexValue(randomColor.getRed()) + toBrowserHexValue(randomColor.getGreen())
				+ toBrowserHexValue(randomColor.getGreen());
	}

	private static String toBrowserHexValue(int number) {
		StringBuilder builder = new StringBuilder(Integer.toHexString(number & 0xff));
		for (int i = builder.length(); i < 2; i++) {
			builder.append("0");
		}
		return builder.toString().toUpperCase();
	}
}
