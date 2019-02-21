package com.qa.ApartmentManager.ColourGenapi.rest;

import java.awt.Color;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.ApartmentManager.ColourGenapi.service.ColourGenService;

@RequestMapping("${path.base}")
@RestController
public class ColourGenRest {

	@Autowired
	private ColourGenService service;

	@GetMapping("${path.getColour}")
	public Color CreateColourGen() {
		return service.CreateColourGen();
	}
}
