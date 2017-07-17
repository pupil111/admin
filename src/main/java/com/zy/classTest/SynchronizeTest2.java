package com.zy.classTest;

public class SynchronizeTest2 extends SynchronizeTest {
	
	public synchronized void showSub() {
		System.out.println("子类开始");
		
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("子类结束");
	}
	
	public synchronized void show4() {
		System.out.println("子类2-------------");
	}
	
	public static void main(String[] args) {
		
		final SynchronizeTest test = new SynchronizeTest();
		
		final SynchronizeTest2 test2 = new SynchronizeTest2();
		
		Thread thread = new Thread(new Runnable() {
			
			public void run() {
				test2.show();
			}
		});
		
		Thread thread2 = new Thread(new Runnable() {
			
			public void run() {
				test2.show4();
			}
		});
		
		thread.start();
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		thread2.start();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
