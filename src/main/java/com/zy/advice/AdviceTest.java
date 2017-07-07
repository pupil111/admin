package com.zy.advice;

public class AdviceTest {
	
	public String advice(){
		
		System.out.println("程序启动中...");
		
		return "程序结束";
	}
	
	@Log
	public String advice2(){
		
		System.out.println("程序启动中...");
		
		return "程序结束";
	}
	
}
