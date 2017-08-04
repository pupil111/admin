package com.zy.thread;

public class ThreadTest {
	
	private static boolean boo = true;
	
	public static void main(String[] args) throws Exception {
		
		new Thread(new Runnable() {
			
			public void run() {
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				boo = false;
				System.out.println(boo);
			}
		}).start();
		System.out.println(boo);
		Thread.sleep(5000);
		
		System.out.println(boo);
		
	
	}
	
	
	
}
