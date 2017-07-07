package com.zy.timertask;

import java.util.Timer;
import java.util.TimerTask;

public class TimerTaskTest extends TimerTask {
	
	private String name;
	
	public TimerTaskTest(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println("执行" + name + "任务调度");
	}
	
	public static void main(String[] args) {
		
		Timer timer = new Timer(true);
		
		timer.schedule(new TimerTaskTest("第一个"), 2*1000, 5*1000);
		
		timer.schedule(new TimerTaskTest("第二个"), 3*1000, 3*1000);
		
		
		try {
			Thread.sleep(1000*30);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
}
