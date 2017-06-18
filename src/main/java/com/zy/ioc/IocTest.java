package com.zy.ioc;

public class IocTest {
	
	private int age;
	
	private String name;

	public IocTest(int age) {
		super();
		this.age = 45;
	}

	public IocTest(int age, String name) {
		super();
		this.age = 30;
		this.name = name;
	}

	public IocTest() {
		super();
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = 50;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "IocTest [age=" + age + ", name=" + name + "]";
	}
	
}
