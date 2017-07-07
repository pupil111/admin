package com.zy.aop;

public class Student implements IAopTest {

	private String name;
	
	private int age;
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public Student() {
		super();
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	public void showName() {
		
		System.out.println("我的名字是"+name);
	}

}
