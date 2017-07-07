package com.zy.advice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:advice.xml");
		
		AdviceTest adviceTest = (AdviceTest) context.getBean("adviceTest");
		
		System.out.println(adviceTest.advice());
		
		System.out.println(adviceTest.advice2());
		
	}
	
}
