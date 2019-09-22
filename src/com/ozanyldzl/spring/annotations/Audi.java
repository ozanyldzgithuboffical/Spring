/**
 * 
 */
package com.ozanyldzl.spring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Ozan YILDIZ
 *
 */
@Component("audi")
public class Audi implements Car {

	private CarModel model;
	
	//Default constuctor
	private Audi() {
	}
	
	@Autowired
	public void setCarModel(CarModel model) {
		this.model=model;
	}
	
	@Override
	public String getCarBrand() {
		// TODO Auto-generated method stub
		return  "Audi  "+model.getCarModel();
	}
	
	

}
