package com.zy.classTest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SimpleInvokeHandler implements InvocationHandler {
	
	private Object porxyInter ;
	
	public SimpleInvokeHandler(Object porxyInter) {
		super();
		this.porxyInter = porxyInter;
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("proxy = " + proxy.getClass() + " ,method = " + method + " ,args = " + args);
		
		Object object = method.invoke(porxyInter, args);
		
		System.out.println("================");
		return object;
	}
	
	public Object bing() {
		
		//return Proxy.newProxyInstance(ProxyInterface.class.getClassLoader(), new Class[]{ProxyInterface.class}, this);
		return Proxy.newProxyInstance(porxyInter.getClass().getClassLoader(), porxyInter.getClass().getInterfaces(), this);
	}
	
	
	public static void main(String[] args) {
		
		ProxyInterface proxyInterface = (ProxyInterface) new SimpleInvokeHandler(new ProxyClassTest()).bing();
		proxyInterface.PrintMessage();
		proxyInterface.showMessage();
		
	}
	

}

