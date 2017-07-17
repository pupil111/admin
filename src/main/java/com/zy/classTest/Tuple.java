package com.zy.classTest;

import com.zy.aop.Student;

public class Tuple {
	
	public <a, b, c> String getTuple(a a1, b b1, c c1) {
		
		return a1.getClass().getTypeName() + " " + b1.getClass().getTypeName() + " " + c1.getClass().getTypeName();
		
	}
	
	public static void main(String[] args) {
		
		Tuple tuple = new Tuple();
		
		System.out.println(tuple.getTuple("sdf", 24, new Student()));
		
		System.out.println(tuple.getTuple("sdf", 24, Tuple.class));
		
	}
	
	
}
