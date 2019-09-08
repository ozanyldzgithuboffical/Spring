package com.ozanyldz.springioc;

public class Mathematics implements Lessons {
	//private field to inject the dependency
    private Holidays holidays;
    
    //default constructor to prevent compiler error
    public Mathematics() {
    	
    }
    
    //constructor to get the dependencies
    /*
    public Mathematics(Holidays obj) {
    	this.holidays=obj;
    }
    */
    //set the pascalyaholiday object as a dependency
    public void setPascalyaHoliday(Holidays obj) {
    	this.holidays=obj;
    }
    
	@Override
	public void getInfo() {
		System.out.println("Mathematics lessons given on Thursday & Friday");
	}

	@Override
	public void getHoliday() {
		//depended obj job
	  System.out.println(this.holidays.getHolidays());	
	}
	
	@Override
	public void getLesson() {
		
	}
	
}
