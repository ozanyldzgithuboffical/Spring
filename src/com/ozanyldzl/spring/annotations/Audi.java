/**
 * 
 */
package com.ozanyldzl.spring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Ozan YILDIZ
 *
 */
@Component("audi")
public class Audi implements Car {

	@Value("2007")
	private String carYear;
	@Value("DSG")
	private String carMotorType;
	private CarModel model;
	
	//Default constuctor
	private Audi() {
	}
	
	@Autowired
	public void setCarModel(CarModel model) {
		this.model=model;
	}
	
	@Override
	public String getCarInfo() {
		// TODO Auto-generated method stub
		return "Model Year:"+this.carYear+" Motor Type:"+this.carMotorType;
	}
	
	@Override
	public String getCarBrand() {
		// TODO Auto-generated method stub
		return  "Audi  "+model.getCarModel()+" "+this.getCarInfo();
	}

	
	
	

}
