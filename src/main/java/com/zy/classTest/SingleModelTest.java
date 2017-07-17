package com.zy.classTest;

public class SingleModelTest {
	
	private SingleModelTest(){}
	
	/*private static SingleModelTest modelTest = new SingleModelTest();
	
	public static SingleModelTest getInstance() {
		if (modelTest == null) {
			synchronized (SingleModelTest.class) {
				if (modelTest == null) {
					modelTest = new SingleModelTest();
				}
			}
		}
		return modelTest;
		
	}*/
	
	private static class SingleTest {
		private static SingleModelTest modelTest = new SingleModelTest();
		
	}
	
	public static SingleModelTest getInstance() {
		return SingleTest.modelTest;
	} 
	
}
