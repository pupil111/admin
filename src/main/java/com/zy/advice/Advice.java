package com.zy.advice;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Advice {
	
	@Before("within(com.zy.advice.AdviceTest)")
	public void proAdvice(){
		
		System.out.println("程序前置通知");
	}
	
	@After("within(com.zy.advice.AdviceTest)")
	public void afterAdvice(){
		
		System.out.println("程序后置通知");
		
	}
	
	@AfterReturning("within(com.zy.advice.AdviceTest)")
	public void agterReturning(){
		
		System.out.println("程序返回通知");
		
	}
	
}
