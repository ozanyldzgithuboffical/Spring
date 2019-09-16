/**
 * 
 */
package com.ozanyldz.spring.annotations;

import org.springframework.stereotype.Component;

/**
 * @author Ozan YILDIZ
 *
 */
@Component
public class Audi implements Car {

	/* (non-Javadoc)
	 * @see com.ozanyldzl.springbeanscopes.Car#getCarBrand()
	 */
	//dependency => Audi imp Cars has dependency over AudiModel of CarModel
	//private CarModel model;
	
	//Default Constructor
	private Audi() {
		
	}
	
	@Override
	public String getCarBrand() {
		// TODO Auto-generated method stub
		return  "Audi ";
	}

}