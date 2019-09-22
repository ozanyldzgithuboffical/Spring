package com.ozanyldzl.spring.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("skodaModel")
public class SkodaModel implements CarModel {

	@Value(value = "110hp")
	private String motorPower;
	
	@Value(value = "Fuel")
	private String motorType;
	
	@Value(value = "195 km/h")
	private String speedMax;
	
	
	@Override
	public String getCarModel() {
		// TODO Auto-generated method stub
		return "Octavia";
	}

	@Override
	public String getCarPropertyModel() {
		// TODO Auto-generated method stub
		return this.getCarModel()+" Motor Power:"+this.motorPower+" Motor Type:"+this.motorType+" Max Speed:"+this.speedMax;
	}

}
