package com.zy.modelTest.Singleton;

public class SingletonTest {
	
	public static void main(String[] args) {
		
		Singleton1 singleton = Singleton1.getSingleton();
		
		Singleton1 singleton2 = Singleton1.getSingleton();
		
		System.out.println("=="+(singleton == singleton2));
		
		System.out.println("equals"+(singleton.equals(singleton2)));
	}
	
}
