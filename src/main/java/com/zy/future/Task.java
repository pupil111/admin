package com.zy.future;

import java.util.concurrent.Callable;

import com.zy.aop.Student;

public class Task implements Callable<Student> {

	public Student call() throws Exception {
		
		Student student = new Student();
		
		student.setName("张三");
		
		return student;
	}
}
