package com.zy.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionTest {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(1);list.add(10);list.add(80);list.add(56);
		list.add(15);list.add(45);list.add(63);list.add(56);
		list.add(5);list.add(45);list.add(13);
		
		//Collections.sort(list);
		
		System.out.println(list);
		
		//Collections.shuffle(list);
		
		Collections.sort(list, new Comparator<Integer>() {

			public int compare(Integer num1, Integer num2) {
				
				return num1.compareTo(num2);
			}
		});
		
		System.out.println(list);
	}
	
	
}
