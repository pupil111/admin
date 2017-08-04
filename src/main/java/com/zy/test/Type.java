package com.zy.test;

public enum Type {
	
	ONE(1,"one"),
	TWO(2,"two"),
	THREE(3,"three");
	
	private int code;
	private String value;
	
	private Type(int code, String value) {
		this.code = code;
		this.value = value;
	}

	public int getCode() {
		return code;
	}

	public String getValue() {
		return value;
	}
	
}
