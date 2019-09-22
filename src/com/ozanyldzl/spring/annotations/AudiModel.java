package com.ozanyldzl.spring.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AudiModel implements CarModel {
	
	@Value(value = "110hp")
	private String motorPower;
	
	@Value(value = "Diesel 4 cylinders")
	private String motorType;
	
	@Value(value = "203 km/h")
	private String speedMax;
	
	
	@Override
	public String getCarModel() {
		// TODO Auto-generated method stub
		return "A3";
	}

	@Override
	public String getCarPropertyModel() {
		// TODO Auto-generated method stub
		return "Motor Power:"+this.motorPower+" Motor Type:"+this.motorType+" Max Speed:"+this.speedMax;
	}

}
