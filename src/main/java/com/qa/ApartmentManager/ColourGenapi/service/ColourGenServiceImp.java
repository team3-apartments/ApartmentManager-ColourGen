package com.qa.ApartmentManager.ColourGenapi.service;

import java.awt.Color;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.qa.ApartmentManager.ColourGenapi.util.generator.CreateColourGen;

@Service
public class ColourGenServiceImp implements ColourGenService {

	@Autowired
	private CreateColourGen createColourGen;

	@Override
	public Color CreateColourGen() {
		return createColourGen.getCreateColourGen();
		
	}

}
