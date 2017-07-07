package com.zy.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SheduledThreadPoolTest {
	
	public static void main(String[] args) {
		
		ScheduledExecutorService executorService = Executors.newScheduledThreadPool(3);
		
		for (int i = 0; i < 20; i++) {
			final int index = i;
			executorService.scheduleAtFixedRate(new Runnable() {
				public void run() {
					System.out.println(Thread.currentThread().getName()+"	"+index);
					try {
						Thread.currentThread().sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}, 1, 3, TimeUnit.SECONDS);
			
		}
		
	}
	
}
