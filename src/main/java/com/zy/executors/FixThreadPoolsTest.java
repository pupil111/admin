package com.zy.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 创建一个定长线程池，可控制线程最大并发数，超出的线程会在队列中等待。
 */
public class FixThreadPoolsTest {
	
	public static void main(String[] args) {
		
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		
		for (int i = 0; i < 10; i++) {
			final int index = i;
			executorService.execute(new Runnable() {
				public void run() {
					System.out.println(Thread.currentThread().getName()+"	"+index);
					try {
						Thread.currentThread().sleep(2*1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
		}
		
	}
	
}
