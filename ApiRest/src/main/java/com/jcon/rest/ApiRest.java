package com.jcon.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiRest {

	@GetMapping ("/nombre")
	public String nombreWeb() {
		return "Api Rest";
	}
	
	@GetMapping ("/descripcion")
	public String descripcionWeb() {
		return "Api Rest construida con SpringBoot";
	}
	
		
	
}
