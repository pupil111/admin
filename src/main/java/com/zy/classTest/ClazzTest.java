package com.zy.classTest;

import java.util.Random;

public class ClazzTest {
	
	public static void main(String[] args) throws Exception {
		
		/*Class<?> class1 = Class.forName("com.zy.aop.Student");
		
		Class<?> class2 = Student.class;
		
		System.out.println(class1 == class2);
		
		System.out.println(class1.getName());*/
		
		//.class不初始化
		Class<Test1> test1 = Test1.class;
		System.out.println("==========1===========");
		//值是static final,不初始化
		System.out.println(Test1.No1);
		//域是static final，强制类初始化
		System.out.println(Test1.No2);
		
		//Class.forName()类初始化
		Class<?> test2 = Class.forName("com.zy.classTest.Test2");
		System.out.println("=========2==========");
		//类只初始化一次
		System.out.println(Test2.No3);
		System.out.println(Test2.No4);
		
		//static变量调用时初始化
		System.out.println(Test3.No5);
		System.out.println(Test3.No6);
		
		
	}
	
}

class Test1 {
	
	public static final int No1 = 45;
	public static final int No2 = (int)(Math.random()*100);
	
	static {
		System.out.println("After Test1 Driver");
	}
}


class Test2 {
	
	public static int No3 = 12;
	public static int No4 = 84;
	
	static {
		System.out.println("After Test2 Driver");
	}
}


class Test3 {
	
	public static int No5 = 34;
	public static int No6 = 33;
	
	static {
		System.out.println("After Test3 Driver");
	}
}


