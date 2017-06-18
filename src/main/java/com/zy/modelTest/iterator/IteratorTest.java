package com.zy.modelTest.iterator;

public class IteratorTest {
	public static void main(String[] args) {
		
		MyCollections collections = new MyCollections();
		Iterator iterator = collections.getIterator();
		
		System.out.println(iterator.first());
		System.out.println("=========================");
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
		System.out.println("=========================");
		System.out.println(iterator.next());
		System.out.println("=========================");
		System.out.println(iterator.last());
		System.out.println("=========================");
		while (iterator.hasPrevious()) {
			System.out.println(iterator.previous());
			
		}
		System.out.println("=========================");
		System.out.println(iterator.previous());
	}
}
