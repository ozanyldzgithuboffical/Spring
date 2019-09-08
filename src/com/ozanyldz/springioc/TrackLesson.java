package com.ozanyldz.springioc;

public class TrackLesson implements Lessons {
    
	//setter injection lesson name object
	private String lessonName;
	
	//setter injection lesson code object
	private String lessonCode;
	
	
	@Override
	public void getInfo() {
		// TODO Auto-generated method stub
		System.out.println("Lessons are on from monday to friday");
	}

	@Override
	public void getHoliday() {
		// TODO Auto-generated method stub
		
	}
	
	public void setLessonName(String lessonName) {
		this.lessonName=lessonName;
	}
	
	public void setLessonCode(String lessonCode) {
		this.lessonCode=lessonCode;
	}
	
	@Override
	public void getLesson() {
		System.out.println("Lesson Name:"+this.lessonName+",Lesson Code:"+this.lessonCode);
	}

}
