package com.zy.classTest;

import java.util.ArrayList;
import java.util.List;

import org.hamcrest.core.IsInstanceOf;

public class Genericity<T> {
	
	private Class<T> clazz ;

	public Genericity(Class<T> clazz) {
		super();
		this.clazz = clazz;
	}
	
	public List<T> getClassList(int num) throws Exception {
		
		List<T> list = new ArrayList<T>();
		
		for (int i = 0; i < num; i++) {
			list.add(clazz.newInstance());
		}
		
		return list;
	}
	
	public static void main(String[] args) throws Exception {
		Genericity<NumberTest> genericity = new Genericity<NumberTest>(NumberTest.class);
		System.out.println(genericity.getClassList(12));
		
		NumberT numberT = new NumberTest();
		
		Class<NumberTest> class1 = NumberTest.class;
		
		NumberTest numberTest = class1.cast(numberT);
		
		NumberTest numberTest2 = (NumberTest) numberT;
		
		System.out.println(numberTest == numberTest2);
		
		System.out.println(numberT instanceof NumberT);
		System.out.println(numberT instanceof NumberTest);
		
		
		
		System.out.println(NumberT.class.isInstance(numberT));
		
		
		
		
	}
}

class NumberT {
	private static int aa = 4;
	
	public int f(){
		return aa;
	}
	
}

class NumberTest extends NumberT{
	
	private static long num = 10;
	
	private long count = num++ ;
	
	public long g(){ return num;}
	
	@Override
	public String toString() {
		return this.count + "";
	}
	
	
}