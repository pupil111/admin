package com.zy.modelTest.TemplateMethod;

public abstract class AbstractTemplateMethod {
	
	public int dual(int a, int b){
		int num = cal(a, b);
		return num;
	}
	
	public abstract int cal(int a, int b);
	
}
