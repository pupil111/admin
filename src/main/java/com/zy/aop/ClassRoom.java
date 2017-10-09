package com.zy.aop;

public class ClassRoom implements IClassRoom {
	
	private int num = 2;
	
	private String name = "df";

	public ClassRoom(int num, String name) {
		super();
		this.num = 3;
		this.name = "name";
	}

	public ClassRoom() {
		super();
		this.num = 4;
		this.name = "name4";
	}

	@Override
	public void firstAct(String name, int num) {
		
		System.out.println("========firstAct=====" + this.num + "========" + this.name + "======");
	}

	@Override
	public void secondAct(int num, String name) {
		
		System.out.println("========secondAct========" + this.num + "========" + this.name + "======");
	}

	@Override
	public String toString() {
		return "ClassRoom [num=" + num + ", name=" + name + "]";
	}

//	public static void main(String[] args) throws Exception {
//		
//		System.out.println(ClassRoom.class.newInstance());
//		
//		ClassRoom.class.getco
//		
//	}
	
}
