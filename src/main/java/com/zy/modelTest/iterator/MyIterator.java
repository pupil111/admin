package com.zy.modelTest.iterator;

public class MyIterator implements Iterator {
	private Collections collections;
	
	private int point = -1;
	
	public MyIterator(Collections collections) {
		super();
		this.collections = collections;
	}

	public Object previous() {
		
		if (point > 0) {
			point--;
			return collections.get(point);
		} else {
			return "已经到头了";
		}
		
		
	}

	public Object next() {
		
		if (point < collections.size()-1) {
			point++;
			return collections.get(point);
		} else {
			return "已经到尾了";
		}
	}

	public Object first() {
		
		return collections.get(0);
	}

	public Object last() {
		
		return collections.get(collections.size()-1);
	}

	public boolean hasNext() {
		if (point < collections.size()-1) {
			return true;
		} else {
			return false;
		}
	}

	public boolean hasPrevious() {
		if (point > 0 ) {
			return true;
		} else {
			return false;
		}
	}

}
