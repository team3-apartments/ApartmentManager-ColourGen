package com.qa.ApartmentManager.ColourGenapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.qa.ApartmentManager.ColourGenapi.util.generator.CreateColourGen;

@Service
public class ColourGenServiceImp implements ColourGenService {

	@Autowired
	private CreateColourGen createColourGen;

	@Override
	public String CreateColourGen() {
		return createColourGen.getCreateColourGen();
		
	}

}
