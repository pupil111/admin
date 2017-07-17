package com.zy.classTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {
	
	private int num = 0;
	
	public void add() {
		num++;
		
	}
	
	public List<String> add(List<String> list1, List<String> list2) {
		list1.addAll(list2);
		return list1;
		
	}
	
	public List<String> remove(List<String> list1, List<String> list2) {
		list1.removeAll(list2);
		return list1;
		
	}
	
	public List<String> retain(List<String> list1, List<String> list2) {
		list1.retainAll(list2);
		return list1;
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		final CountDownLatchTest latchTest = new CountDownLatchTest();
		
		final CountDownLatch latch = new CountDownLatch(1);
		
		Thread thread = new Thread(new Runnable() {
			
			public void run() {
				System.out.println("线程1开始");
				
				for (int i = 0; i < 10; i++) {
					latchTest.add();
					System.out.println(latchTest.num);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if (latchTest.num == 5) {
						latch.countDown();
					}
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("线程1结束");
			}
		});
		
		
		Thread thread2 = new Thread(new Runnable() {
			
			public void run() {
				System.out.println("线程2开始");
				
				if (latchTest.num != 5) {
					try {
						latch.await();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("线程2结束");
			}
		});
		//thread.start();
		
		//thread2.start();
		
		//System.out.println(Arrays.asList("abcdefghi".split(""))); 
		
//		List<String> list1 = new ArrayList<String>(Arrays.asList("abcdefgh".split("")));
//		
//		List<String> list2 = new ArrayList<String>(Arrays.asList("abcijklm".split("")));
//		
//		List<String> list3 = new ArrayList<String>(Arrays.asList("abcdefgh".split("")));
//		
//		System.out.println(list1);
//		System.out.println(list2);
//		System.out.println(latchTest.add(list1, list2));//abcdefghijklm
//		System.out.println(latchTest.remove(list1, list2));//defgh
//		System.out.println(latchTest.retain(list1, list2));//abc
//		System.out.println(latchTest.remove(latchTest.add(list1, list2), latchTest.retain(list3, list2)));//defghijklm
		
		
		
		/*Set<Integer> result = new HashSet<Integer>();
        Set<Integer> set1 = new HashSet<Integer>(){{
            add(1);
            add(3);
            add(5);
        }};

        Set<Integer> set2 = new HashSet<Integer>(){{
            add(1);
            add(2);
            add(3);
        }};

        result.clear();
        result.addAll(set1);
        System.out.println("去重复交集前1："+set1);//135
        System.out.println("去重复交集前2："+set2);//123
        result.retainAll(set2);
        System.out.println("set1与set2的交集是："+result);//13

        result.clear();
        result.addAll(set2);
        System.out.println("差集前的1："+set1);//135
        System.out.println("差集前的2："+set2);//123
        result.removeAll(set1);
        System.out.println("set2与set1的差集是："+result);//2

        result.clear();
        result.addAll(set1);
        result.addAll(set2);
       
        System.out.print("set1和set2的并集："+result);//1235
        System.err.print("set1集合并集：是去重复"+"\n");
        
        
        
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> list1 = new ArrayList<Integer>(){{
            add(1);
            add(3);
            add(5);
        }};

        List<Integer> list2 = new ArrayList<Integer>(){
        {
            add(1);
            add(2);
            add(3);
        }};

        list.clear();
        list.addAll(list1);
        System.out.println("去重复交集前1："+list1);//135
        System.out.println("去重复交集前2："+list2);//123
        list.retainAll(list2);
        System.out.println("list1与list2的交集是："+list);//13

        list.clear();
        list.addAll(list2);
        System.out.println("差集前的1："+list1);//135
        System.out.println("差集前的2："+list2);//123
        list.removeAll(list1);
        System.out.println("list2与list1的差集是："+list);//2

        list.clear();
        list.addAll(list1);
        list.addAll(list2);
        
        System.out.print("list1和set2的并集："+list);//135123
        System.err.print("List集合并集：是不会去重复");*/
		
		
		
	}
	
	
}
