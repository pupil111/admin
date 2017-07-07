package com.zy.future;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

import com.zy.aop.Student;

public class ExecutorTask {
	
	public static void main(String[] args) throws Exception {
		
		Task task = new Task();
		
		ExecutorService service = Executors.newCachedThreadPool();
		
		
		//第一种
//		Future<Student> future = service.submit(task);
//		service.shutdown();
//		Student student = future.get();
//		System.out.println(student);
//		student.showName();
		
		
		
		//第二种
//		FutureTask<Student> futureTask = new FutureTask<Student>(task);
//		service.submit(futureTask);
//		service.shutdown();
//		Student student = futureTask.get();
//		System.out.println(student);
//		student.showName();
		
		
		//第三种
		FutureTask<Student> futureTask = new FutureTask<Student>(task);
		Thread thread = new Thread(futureTask);
		thread.start();
		Thread.sleep(1000);
		System.out.println(futureTask.isDone());
		Student student = futureTask.get();
		
		System.out.println(student);
		student.showName();

		
		
		
		
		
		
	}
	
}
