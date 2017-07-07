package com.zy.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 * 创建一个可缓存线程池，如果线程池长度超过处理需要，可灵活回收空闲线程，若无可回收，则新建线程
 */
public class CachedThreadPoolsTest {
	
	public static void main(String[] args) throws Exception {
		
		ExecutorService executorService = Executors.newCachedThreadPool();
		
		for (int i = 0; i < 10; i++) {
			final int index = i;
			//Thread.sleep(2*1000);
			executorService.execute(new Runnable() {
				public void run() {
					System.out.println(Thread.currentThread().getName()+"	"+index);
				}
			});
			
		}
		//线程池为无限大，当执行第二个任务时第一个任务已经完成，会复用执行第一个任务的线程，而不用每次新建线程。
	}
	
}
