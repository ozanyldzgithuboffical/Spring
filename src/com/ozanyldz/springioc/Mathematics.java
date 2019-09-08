package com.ozanyldz.springioc;

public class Mathematics implements Lessons {

	@Override
	public void getInfo() {
		System.out.println("Mathematics lessons given on Thursday & Friday");
	}
}
