/**
 * 
 */
package com.ozanyldzl.spring.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Ozan YILDIZ
 *
 */
public class OzanAnnotationApplication {

	/**
	 * @param args
	 */
	/*
	 * You will see that our bean instance is shared with two different
	 * object bean since it is singleton based.  
	 * */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create container
		ClassPathXmlApplicationContext _context=new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		//Get the car bean
		Car audi=_context.getBean("audi",Car.class);
		System.out.println(audi.getCarBrand());
		
		
		//Destroy context
		_context.destroy();

	}

}
