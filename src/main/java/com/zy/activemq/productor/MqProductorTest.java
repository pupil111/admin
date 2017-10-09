package com.zy.activemq.productor;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zy.activemq.Email;


@ContextConfiguration(locations={"classpath:springmvc.xml"})
@RunWith(value = SpringJUnit4ClassRunner.class)
public class MqProductorTest {
	
	@Resource
	private MqService mqService;
	
	@Test
	public void sendMsg() {
		Email email = new Email(null, "1817204670@qq.com", "MQ信息主题", "发送MQ信息到本邮件中。。。");
		mqService.sendMessage(email);
	}	
	
	@Test
	public void receive() {
		
		
	}
	
	
	
	
//	
//	public static void main(String[] args) {
//		
//		System.out.println("===1======");
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:springmvc.xml");
//		System.out.println("====2=====");
//		context.start();
//		System.out.println("====3=====");
//		MqProductorTest test = new MqProductorTest();
//		test.sendMsg();
//	}
	
}
