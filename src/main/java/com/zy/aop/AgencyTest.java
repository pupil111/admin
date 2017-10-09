package com.zy.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class AgencyTest {
	
	private IClassRoom classRoom;
	
	public AgencyTest() {
		super();
		this.classRoom = (IClassRoom) Proxy.newProxyInstance(ClassRoom.class.getClassLoader(), new Class[]{IClassRoom.class}, new InvocationHandler() {
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				System.out.println(method);
				Object object = method.invoke(ClassRoom.class.newInstance(), args);
				System.out.println(Arrays.toString(args));
				return object;
			}
		});
	}
	
	
	
	public static void main(String[] args) {
		
		AgencyTest agencyTest = new AgencyTest();
		IClassRoom classRoom = agencyTest.classRoom;
		classRoom.firstAct("fir", 1);
		classRoom.secondAct(2, "sec");
		
	}
	
}
