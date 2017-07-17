package com.zy.classTest;

public class VolitaileTest {
	
	private boolean boo = true;

	private int num = 0;
	
	public void setBoo(boolean boo) {
		this.boo = boo;
	}
	
	public int getNum() {
		return num;
	}

	public void show() {
		System.out.println("线程开始");
		while (boo) {
			num++;
			boo = false;
		}
		System.out.println("线程结束"); 
	}
	
	public static void main(String[] args) throws Exception {
		
		final VolitaileTest test = new VolitaileTest();
		
		Thread thread = new Thread(new Runnable() {
			
			public void run() {
				test.show();
			}
		});
		thread.start();
		
		thread.sleep(1000);
		System.out.println(test.boo);
		System.out.println(test.num); 
		
		thread.sleep(2000);
		test.setBoo(false);
		System.out.println("已更改");
		System.out.println(test.num);
		
		thread.sleep(1000);
		System.out.println(test.boo);
		System.out.println(test.num);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
