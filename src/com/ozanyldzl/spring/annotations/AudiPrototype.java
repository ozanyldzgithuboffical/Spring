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
@Component("audiprototype")
@Scope("prototype")
public class AudiPrototype implements Car {

	private CarModel model;
	//Constructor injection of Car Model
	@Autowired
	private AudiPrototype(CarModel model) {
		this.model=model;
	}
	
	@Override
	public String getCarBrand() {
		// TODO Auto-generated method stub
		return  "Audi  "+model.getCarModel();
	}

}
