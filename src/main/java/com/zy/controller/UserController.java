package com.zy.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.http.client.HttpClient;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zy.utils.Pager;

import net.sf.json.JSONObject;

@Controller
@RequestMapping("/User")
public class UserController {
	
	@RequestMapping("/getUser")
	public String getUser(HttpServletRequest request, HttpServletResponse response, Model model) throws Exception{
		
//		String name = request.getParameter("name");
		
		//String name1 = URLEncoder.encode(name, "UTF-8");
		
		//String name2 = new String(name.getBytes(), "UTF-8");
		
		
		
//		System.out.println(name);
//		
//		String age = request.getParameter("age");
//		System.out.println(age);
//		
//		String sex = request.getParameter("sex");
//		System.out.println(sex);
//		
//		String height = request.getParameter("height");
//		System.out.println(height);
//		
//		
//		model.addAttribute("name", name+1);
//		model.addAttribute("age", age+1);
//		model.addAttribute("sex", sex+1);
//		model.addAttribute("height", height+1);
//		
//		System.out.println("进入controller方法了");
//		
////		PrintWriter out = response.getWriter();
////		out.print("进入controller方法了");
//		
//		Pager<String> pager = new Pager<String>(15);
//		System.out.println(request.getParameter("sex"));
//		request.setAttribute("hight", 1.5);
//		model.addAttribute("pager", pager);
//		System.out.println(model.asMap().get("name"));
//		System.out.println(model.asMap().get("age"));
//		System.out.println(pager);
		
		
		//HttpClient client = new 
		
		
		return "test";
	}
	
	@RequestMapping("/PostTest")
	public void PostTest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		
		Map<String, String[]> map = request.getParameterMap();
		for (String key : map.keySet()) {
			if (map.get(key).length == 1) {
				resultMap.put(key, StringUtils.trimToEmpty(map.get(key)[0]));
			} else {
				resultMap.put(key, map.get(key));
			}
		}
		System.out.println(request.getParameter("name"));
		String msg = "name = " + resultMap.get("name").toString() + ";age = " + Integer.parseInt(resultMap.get("age").toString());
		resultMap.put("msg", msg);
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		response.getWriter().write(JSONObject.fromObject(resultMap).toString());
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
