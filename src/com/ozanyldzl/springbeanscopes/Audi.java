/**
 * 
 */
package com.ozanyldzl.springbeanscopes;

/**
 * @author Ozan YILDIZ
 *
 */
public class Audi implements Car {

	/* (non-Javadoc)
	 * @see com.ozanyldzl.springbeanscopes.Car#getCarBrand()
	 */
	//dependency => Audi imp Cars has dependency over AudiModel of CarModel
	private CarModel model;
	
	//Default Constructor
	private Audi() {
		
	}
	
	//Injections are loadeded in constructor injection way
	private Audi(CarModel model) {
		this.model=model;
	}
	
	@Override
	public String getCarBrand() {
		// TODO Auto-generated method stub
		return  "Audi "+this.model.getCarModel();
	}

}
