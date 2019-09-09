/**
 * 
 */
package com.ozanyldz.springioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Ozan YILDIZ
 *
 */
public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Creating Spring Container-ApplicationContext
		ClassPathXmlApplicationContext _context=new ClassPathXmlApplicationContext("applicationcontext.xml");
		//Retrieve bean from Spring Container
		Mathematics mathematics=_context.getBean("mathematics",Mathematics.class);
		//Call methods on mathematics bean
		mathematics.getInfo();
		//Track object
		Lessons lesson=_context.getBean("tracklesson",Lessons.class);
		//Call methods on mathematics bean
		lesson.getInfo();
		//Get maths christmas holiday status
		mathematics.getHoliday();
		//get turkish lesson name
	    lesson.getLesson();
		//get mathematic lesson
	    mathematics.getLesson();
		
		
	    //close the context
		_context.close();
       
	}

}
