/**
 * 
 */
package com.ozanyldzl.spring.jsc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Ozan YILDIZ
 *
 */
@Component("audi")
public class Audi implements Car {

	private CarModel model;
	//Constructor injection of Car Model
	@Autowired 
	Audi(CarModel model) {
		this.model=model;
	}
	
	@Override
	public String getCarBrand() {
		// TODO Auto-generated method stub
		return  "Audi  "+model.getCarModel();
	}

}
