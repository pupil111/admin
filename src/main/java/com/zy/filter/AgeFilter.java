package com.zy.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

public class AgeFilter implements Filter {
	
	private Integer age;
	
	private FilterConfig config;
	
	public void destroy() {
		//System.out.println(config.getFilterName()+" end");
		this.age = null;
		this.config = null;
	}

	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		
		System.out.println("当前时间是："+System.currentTimeMillis());
		
		HttpServletRequest request = (HttpServletRequest) req;
		
		System.out.println(request.getServerName());
		System.out.println(request.getServletPath());
		
		System.out.println("=======过滤器========");
		chain.doFilter(req, res);
		System.out.println("=======过滤器========");
		
		System.out.println("当前时间是："+System.currentTimeMillis());
		
	}

	public void init(FilterConfig arg0) throws ServletException {
		System.out.println(arg0.getFilterName()+" start");
		System.out.println(arg0);
		System.out.println(arg0.getServletContext());
		this.config = arg0;
		age = Integer.parseInt(arg0.getInitParameter("age"));
		System.out.println(age);
	}

}
