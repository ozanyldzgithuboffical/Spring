package com.ozanyldzl.spring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("changeCar")
public class ChangeCar implements Car {

	//Injection class
	@Autowired
	@Qualifier("skodaModel")
	private CarModel model;
	
	//Default Constructor
	public ChangeCar() {
		
	}
	
	@Override
	public String getCarBrand() {
		// TODO Auto-generated method stub
		return this.model.getCarModel();
	}

}
