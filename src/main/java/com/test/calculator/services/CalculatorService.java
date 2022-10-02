package com.test.calculator.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
	
	@Autowired
	private TaxRateProviderService taxRateProviderService;
	
	public Double getNetPrice(Double grossPrice, String country) {
		Double discount = grossPrice * taxRateProviderService.getVAT(country);
		return grossPrice - discount;
	}

}
