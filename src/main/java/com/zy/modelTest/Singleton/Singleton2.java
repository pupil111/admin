package com.zy.modelTest.Singleton;

public class Singleton2 {
	
	//静态内部类
	private Singleton2(){
		
	}
	
	private static class StaticSingleton{
		private static final Singleton2 singleton = new Singleton2();
	}
	
	public static Singleton2 getSingleton(){
		return StaticSingleton.singleton;
	}
	
	
	
}
