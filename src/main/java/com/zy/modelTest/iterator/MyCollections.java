package com.zy.modelTest.iterator;

public class MyCollections implements Collections {
	
	private String[] str = {"aaa","bbb","ccc","ddd","eee","fff","ggg","hhh","iii","mmm","nnn","ppp","qqq","sss","ttt",};
	
	public Object get(int i) {
		
		return str[i];
	}

	public int size() {
		
		return str.length;
	}

	public Iterator getIterator() {
		
		return new MyIterator(this);
	}
	
	
	
}
