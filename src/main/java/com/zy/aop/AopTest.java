package com.zy.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopTest {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
		
		IAopTest teacher = (IAopTest) context.getBean("teacher");
		IAopTest student = (IAopTest) context.getBean("student");
		
		teacher.showName();
		
		student.showName();
	}
	
	
}
