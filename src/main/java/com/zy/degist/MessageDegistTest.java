package com.zy.degist;

import java.security.MessageDigest;

public class MessageDegistTest {
	
	public static void main(String[] args) throws Exception {
		
		String message = "信息摘要的测试";
		MessageDigest digest = MessageDigest.getInstance("MD5");
		
		digest.update(message.getBytes());
		
		byte[] digestTest = digest.digest();
		System.out.println(digestTest.toString());
		
		
		
		
		
	}
	
}
