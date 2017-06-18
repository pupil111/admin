package com.zy.modelTest.Singleton;

public class Singleton1 {
	
	//双检测模式
	private static Singleton1 singleton = null;
	//private static volatile Singleton singleton = null;
	
	private Singleton1(){
		
	}
	
	public static Singleton1 getSingleton(){
		if (singleton == null) {
			synchronized (Singleton1.class) {
				if (singleton == null) {
					singleton = new Singleton1();
				}
			}
		}
		
		return singleton;
	}
	
	
}
