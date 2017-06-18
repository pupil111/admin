package com.zy.modelTest.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Cloneable,Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private int id = 10;
	
	private static String name = "aaa";
	
	private int age = 20;

	private Teacher teacher;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", teacher=" + teacher + "]";
	}
	
	public Student clonStudent() throws CloneNotSupportedException{
		
		return (Student) super.clone();
		
	}
	
	
	public Student cloneDeep() throws IOException, ClassNotFoundException{
		
		//ByteArrayOutputStream bao = new ByteArrayOutputStream();
		FileOutputStream bao = new FileOutputStream("D:/student.txt");
		
		ObjectOutputStream oop = new ObjectOutputStream(bao);
		oop.writeObject(this);
		FileInputStream bai = new FileInputStream("D:/student.txt");
		//ByteArrayInputStream bai = new ByteArrayInputStream(bao.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(bai);
		return (Student) ois.readObject();
		
	}
	
	
}
