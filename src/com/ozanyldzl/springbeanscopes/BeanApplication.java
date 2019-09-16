/**
 * 
 */
package com.ozanyldzl.springbeanscopes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Ozan YILDIZ
 *
 */
public class BeanApplication {

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
		
		//Get the bean in singleton scope
		Car bean1=_context.getBean("audi",Car.class);
		bean1.getCarBrand();
		//Get the bean in singleton scope
		Car bean2=_context.getBean("audi",Car.class);
		bean2.getCarBrand();
		System.out.println("Bean 1:"+bean1);
		System.out.println("Bean 2:"+bean2);
		
		//Destroy context
		_context.destroy();
	
		

	}

}
