package com.zy.modelTest.visitor;

public class TeacherWang implements ITeacher {

	private String name;
	
	public TeacherWang(String name) {
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
