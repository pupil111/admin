package com.zy.entrytest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.zy.aop.Student;

public class EntryTest {
	
	public List<Student> show(){
		
		Map<Integer,String> maps = new HashMap<Integer,String>();
		
		maps.put(10, "张三");
		maps.put(20, "李四");
		
		List<Student> list = new ArrayList<Student>();
		for(Map.Entry<Integer,String> map : maps.entrySet()){
			Student student = new Student();
			student.setName(map.getValue());
			show2(student,map.getKey());
			list.add(student);
		}
		
		return list;
	}
	
	public void show2(Student student,int age){
		int age2 = age * 3;
		student.setAge(age2);
	}
	
	
	public static void main(String[] args){
		
		EntryTest test = new EntryTest();
		
		System.out.println(test.show());
		
		
	}
	
}
