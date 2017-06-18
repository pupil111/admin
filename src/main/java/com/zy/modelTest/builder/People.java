package com.zy.modelTest.builder;

public class People {
	
	private int id;
	
	private String name;
	
	private int age;
	
	private String email;
	
	private String address;

	public People(PeopleParam param) {
		super();
		this.id = param.id;
		this.name = param.name;
		this.age = param.age;
		this.email = param.email;
		this.address = param.address;
	}

	static class PeopleParam{
		
		static int id;
		
		static String name;
		
		static int age;
		
		static String email;
		
		static String address;

		public static void setId(int id) {
			PeopleParam.id = id;
		}

		public static void setName(String name) {
			PeopleParam.name = name;
		}

		public static void setAge(int age) {
			PeopleParam.age = age;
		}

		public static void setEmail(String email) {
			PeopleParam.email = email;
		}

		public static void setAddress(String address) {
			PeopleParam.address = address;
		}
		
	}
	
	
	
	
}
