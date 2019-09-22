/**
 * 
 */
package com.ozanyldzl.spring.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

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
	private Audi(CarModel model) {
		this.model=model;
	}
	
	@Override
	public String getCarBrand() {
		// TODO Auto-generated method stub
		return  "Audi  "+model.getCarModel();
	}
	
	@PostConstruct
	public void startInit() {
	System.out.println("Spring Container starts the job");	
	}
	
	@PreDestroy
	public void endProcess() {
		System.out.println("Context is destroyed");
	}

}
