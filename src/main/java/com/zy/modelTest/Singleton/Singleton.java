package com.zy.modelTest.Singleton;

public class Singleton {
	
	//懒汉模式
	private static Singleton singleton = null;
	
	private Singleton(){
		
	}
	
	public static synchronized Singleton getSingleton(){
		
		if (singleton == null) {
			singleton = new Singleton();
		}
		
		return singleton;
	}
	
}
