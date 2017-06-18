package com.zy.modelTest.visitor;

public class TeacherZhao implements ITeacher{

	private String name;
	
	public TeacherZhao(String name) {
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
