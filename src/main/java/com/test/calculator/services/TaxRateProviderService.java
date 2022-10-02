package com.test.calculator.services;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class TaxRateProviderService {
	private static final Map<String, Double> TAX_RATE = createMap();

    private static Map<String, Double> createMap() {
        Map<String, Double> result = new HashMap<>();
        result.put("DE", 0.19);
        result.put("FR", 0.20);
        result.put("ES", 0.21);
        result.put("EN", 0.22);
        result.put("IT", 0.23);
        return Collections.unmodifiableMap(result);
    }
    
    public Double getVAT(String country) {
    	Double vat = TAX_RATE.get(country);
    	return null == vat ? 0.0 : vat;
    }
}
