package com.zy.modelTest.prototype;

import java.io.Serializable;

public class Teacher implements Serializable{

	private static final long serialVersionUID = 1L;

	private String name = "李老师";
	
	private int age = 50;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Teacher [name=" + name + ", age=" + age + "]";
	}
	
}
