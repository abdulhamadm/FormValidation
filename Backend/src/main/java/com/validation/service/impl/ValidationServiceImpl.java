package com.validation.service.impl;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.validation.model.Input;
import com.validation.repository.ValidationRepository;
import com.validation.service.ValidationService;

@Service
public class ValidationServiceImpl implements ValidationService{

	private final String PATTERN = "^[a-zA-Z]*$";
	@Autowired
	private ValidationRepository validationRepository;
	
	@Override
	public String validate(String input)throws Exception {
		if(StringUtils.isNotEmpty(input)&& input.matches(PATTERN)){
			Input in = new Input();
			in.setInput(input);
			in.setCreatedDate(new Date());
			validationRepository.save(in);
			return StringUtils.swapCase(input);
		}
		throw new Exception("Invalid input");
	}
	

}
