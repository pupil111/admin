package com.zy.filter;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FilterServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response){
		System.out.println("=============");
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out;
		try {
			out = response.getWriter();
			
			out.println("啥歌词？");
			
			
			//获得用户的时间cookie,并且获取值，如果第一次的话，是没有Cookie信息的，所以Cookie数组可能为null,所以我们要做判断  
	        Cookie cookies[] = request.getCookies();  
	        for(int i=0;cookies != null && i<cookies.length;i++){  
	            if(cookies[i].getName().equals("time")){  
	                long cookieValue = Long.parseLong(cookies[i].getValue());  
	                Date date = new Date(cookieValue);  
	                out.print(date.toLocaleString());  
	            }  
	        }  
			
			
			Cookie cookie = new Cookie("time", System.currentTimeMillis()+"");
			cookie.setMaxAge(24*60*60);
			response.addCookie(cookie);
			System.out.println("===============");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
