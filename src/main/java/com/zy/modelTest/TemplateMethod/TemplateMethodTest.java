package com.zy.modelTest.TemplateMethod;

public class TemplateMethodTest {
	public static void main(String[] args) {
		
		AbstractTemplateMethod atm = new PlusTest();
		
		System.out.println(atm.dual(10, 5));
		
		AbstractTemplateMethod atm2 = new RemoveTest();
		
		System.out.println(atm2.dual(10, 5));
		
	}
}
