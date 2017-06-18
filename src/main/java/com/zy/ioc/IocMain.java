package com.zy.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocMain {
	
	public static void main(String[] args) {
		
		
		ApplicationContext config = new ClassPathXmlApplicationContext("aop.xml");
		
		IocTest iocTest = (IocTest) config.getBean("iocTest");
		
		System.out.println(iocTest);
		
	}
	
	
	
}
