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
		Car audi1=_context.getBean("audi",Car.class);
		System.out.println(audi1.getCarBrand());
		Car audi2=_context.getBean("audi",Car.class);
		System.out.println(audi2.getCarBrand());
		if(audi1==audi2) {
			System.out.println("Shared bean object");
		}else {
			System.out.println("Not Shared");
		}
		
		Car audip1=_context.getBean("audiprototype",Car.class);
		System.out.println(audip1.getCarBrand());
		Car audip2=_context.getBean("audiprototype",Car.class);
		System.out.println(audip2.getCarBrand());
		if(audip1==audip2) {
			System.out.println("Shared bean object");
		}else {
			System.out.println("Not Shared");
		}
		//Destroy context
		_context.destroy();

	}

}
