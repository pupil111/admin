package com.zy.modelTest.visitor;

public class StudentZhou implements IStudent {
	
	private String name;
	
	public String getName() {
		return name;
	}
	
	public StudentZhou(String name) {
		super();
		this.name = name;
	}
	
	public void visitor(TeacherLi teacherLi) {
		System.out.println(teacherLi.getName()+"你好！我叫"+name);
		
	}

	public void visitor(TeacherWang teacherWang) {
		System.out.println(teacherWang.getName()+"你好！我叫"+name);
		
	}

	public void visitor(TeacherZhao teacherZhao) {
		System.out.println(teacherZhao.getName()+"你好！我叫"+name);
		
	}

	

}
