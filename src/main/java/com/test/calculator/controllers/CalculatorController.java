package com.test.calculator.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.calculator.services.CalculatorService;

@RestController
@RequestMapping("/api")
public class CalculatorController {
	 @Autowired
	 private CalculatorService calculatorService;
	
	@GetMapping("/netPrice/{grossPrice}/{country}")
	public Double getNetPrice(@PathVariable(value = "grossPrice") Double grossPrice, @PathVariable(value = "country") String country) {
		return calculatorService.getNetPrice(grossPrice, country);
	}

}
