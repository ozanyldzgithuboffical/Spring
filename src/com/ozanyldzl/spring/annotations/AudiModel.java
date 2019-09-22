package com.ozanyldzl.spring.annotations;

import org.springframework.stereotype.Component;

@Component
public class AudiModel implements CarModel {
	
	@Override
	public String getCarModel() {
		// TODO Auto-generated method stub
		return "A3";
	}

}
