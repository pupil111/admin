package com.zy.modelTest.factory;

public class SimpleFactoryPattern {
	
	private static IObject object;
	
	public static IObject getObject(String str){
		
		if ("object1".equals(str)) {
			object = new Object1();
		} else {
			object = new Object2();
		}
		return object;
	}
	
}
