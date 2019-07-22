package com.validation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.validation.service.ValidationService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ValidationController {
	
	@Autowired
	private ValidationService validationService;
	
	@GetMapping("/validate")
	public String validate(String input){
		try{
			return validationService.validate(input);
		}catch(Exception e){
			return "Failed";
		}
	}

}
