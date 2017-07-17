package com.zy.classTest;

public class SynchronizeTest {
	
	public synchronized void show() {
		System.out.println("父类开始");
		
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("父类结束");
	}
	
	public synchronized void show2() {
		System.out.println("父类2-------------");
	}
	
}
