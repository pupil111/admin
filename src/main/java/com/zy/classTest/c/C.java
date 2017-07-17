package com.zy.classTest.c;

import com.zy.classTest.a.A;

class B extends A {

	@Override
	public void f() {
		super.f();
		System.out.println("BA--------f()");
	}
	
	public void g() {
		System.out.println("BA---------g()");
	}
	
	void m() {
		System.out.println("BA--------m()");
	}
	
	private void n() {
		System.out.println("BA---------n()");
	}
	
	protected void p() {
		System.out.println("BA--------p()");
	}
	
}


public class C {
	
	public static A makeB() {
		
		return new B();
	}
	
}
