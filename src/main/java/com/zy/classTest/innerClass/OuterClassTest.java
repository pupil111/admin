package com.zy.classTest.innerClass;

public class OuterClassTest {
	
	private String outStr = "---out----";
	
//	class innerClassTest {
//		private String innerStr = "---inner----";
//		public String getOutStr() {
//			return outStr;
//		}
//		public innerClassTest getinnerStr() {
//			return getInnerClass();
//		}
//	}
//	public innerClassTest getInnerClass() {
//		return new innerClassTest();
//	}
	
	
//	public String getInnerClass() {
//		
//		class innerClassTest {
//			private String inner = "inner----";
//
//			public String getInner() {
//				return inner;
//			}
//
//			public innerClassTest(String inner) {
//				super();
//				this.inner = this.inner + inner + outStr;
//			}
//		}
//		
//		innerClassTest inner = new innerClassTest("inner---inner");
//		return inner.getInner();
//	}
	
	
	public static class innerClassTest {
		private static String innerStatic = "=======";
		
		private String inner = "inner----";

		public String getInner() {
			return inner;
		}

		public innerClassTest(String inner) {
			super();
			this.inner = inner;
		} 
		
	}
	
//	public InnerClassTest getInnerClass() {
//		
//		return new InnerClassTest() {
//			
//			public int getNumber() {
//				return 10;
//			}
//		};
//		
//		
//	}
	
	
//	public InnerClazz getInnerClass() {
//		
//		return new InnerClazz();
//	}
	
	
	
	
	public static void main(String[] args) {
		OuterClassTest out = new OuterClassTest();
		
//		成员内部类
//		System.out.println(out.outStr);
//		OuterClassTest.innerClassTest innerClass = out.new innerClassTest();
//		System.out.println(innerClass.innerStr);
//		OuterClassTest.innerClassTest innerClazz = out.getInnerClass();
//		System.out.println(innerClazz.innerStr);
		
//		局部内部类	
//		System.out.println(out.getInnerClass());
		
//		静态内部类
//		System.out.println(OuterClassTest.innerClassTest.innerStatic);
//		OuterClassTest.innerClassTest inner = new innerClassTest("####");
//		System.out.println(inner.inner);

//		匿名内部类
//		InnerClassTest inner = out.getInnerClass();
//		System.out.println(inner.getNumber());
			
//		InnerClazz inner = out.getInnerClass();
//		System.out.println(inner.getNumber());
		
		
	}
	
}