package com.qa.ApartmentManager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.qa.ApartmentManager.ColourGenapi.util.generator.CreateColourGen;

@SpringBootApplication
public class ColourGenApplication {

	public static void main(String[] args) {
		SpringApplication.run(ColourGenApplication.class, args);
	}

	@Bean
	public CreateColourGen ColourGen(){
		return new CreateColourGen();
	}
	
//
//	@Bean
//	public AbstractAccountGen accountGenerator(){
//		return new EightAccountGen();
//	}


}


