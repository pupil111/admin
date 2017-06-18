package com.zy.modelTest.prototype;

public class PrototypePattern {
	public static void main(String[] args) throws Exception {
		
		Teacher teacher = new Teacher();

		//Teacher teacher2 = new Teacher();
		
		Student student = new Student();
		student.setTeacher(teacher);
		
		Student student2 = student.clonStudent();
		
		Student student3 = student.cloneDeep();
		
		//student2.setTeacher(teacher2);
		//student.setTeacher(teacher2);
		
		System.out.println(student);
		System.out.println(student2);
		System.out.println(student3);
		
		System.out.println(student.getName() == student2.getName());
		System.out.println(student.getTeacher() == student2.getTeacher());
		
		System.out.println(student.getName() == student3.getName());
		System.out.println(student.getTeacher() == student3.getTeacher());
		
		
		
	}
}
