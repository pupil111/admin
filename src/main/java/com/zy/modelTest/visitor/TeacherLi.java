package com.zy.modelTest.visitor;

public class TeacherLi implements ITeacher{
	
	private String name;
	
	public TeacherLi(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void accept(IStudent student) {
		student.visitor(this);
	}


}
