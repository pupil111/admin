package com.zy.lambda;

public class LambdaTest {
	
	public static void main(String[] args) {
		
		LambdaInterface i = (int a) -> a + 1;
		
		System.out.println(i.add(3));
		
	}
	
}
