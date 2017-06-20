package com.zy.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zy.utils.Pager;

@Controller
@RequestMapping("/User")
public class UserController {
	
	@RequestMapping("/getUser")
	public String getUser(HttpServletRequest request, HttpServletResponse response, Model model) throws Exception{
		
		System.out.println("进入controller方法了");
		
//		PrintWriter out = response.getWriter();
//		out.print("进入controller方法了");
		
		Pager<String> pager = new Pager<String>(15);
		System.out.println(request.getParameter("sex"));
		request.setAttribute("hight", 1.5);
		model.addAttribute("name", "张三");
		model.addAttribute("age", 15);
		model.addAttribute("pager", pager);
		System.out.println(model.asMap().get("name"));
		System.out.println(model.asMap().get("age"));
		System.out.println(pager);
		return "test";
	}
	
	
}
