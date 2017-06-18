package com.zy.modelTest.iterator;

public interface Iterator {
	
	Object previous();
	
	Object next();
	
	Object first();
	
	Object last();
	
	boolean hasNext();
	
	boolean hasPrevious();
	
}
