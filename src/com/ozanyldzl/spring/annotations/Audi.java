/**
 * 
 */
package com.ozanyldzl.spring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author Ozan YILDIZ
 *
 */
@Component("audi")
@Scope("singleton")
public class Audi implements Car {

	private CarModel model;
	//Constructor injection of Car Model
	@Autowired
	private Audi(CarModel model) {
		this.model=model;
	}
	
	@Override
	public String getCarBrand() {
		// TODO Auto-generated method stub
		return  "Audi  "+model.getCarModel();
	}

}
