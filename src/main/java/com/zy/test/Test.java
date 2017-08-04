package com.zy.test;

import java.io.CharArrayWriter;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import java.util.Arrays;
import java.util.BitSet;

public class Test {
	
	public static void main(String[] args) throws Exception {
		
//		System.out.println(Arrays.toString(args));
//		
		String a = "abcdefg";
		String b = "按揭付款";
//		
//		System.out.println(new String(a.getBytes("UTF-8")));
//		System.out.println(new String(b.getBytes("UTF-8")));
//		
//		System.out.println(new String(a.getBytes(), "UTF-8"));
//		System.out.println(new String(b.getBytes(), "UTF-8"));
//		
//		System.out.println(new String(a.getBytes("UTF-8"), "UTF-8"));
//		System.out.println(new String(b.getBytes("UTF-8"), "UTF-8"));
//		
//		URLEncoder.encode(s, enc)
		
//		System.out.println(new String(a.getBytes("UTF-8"), "gbk"));
//		
//		byte[] by = b.getBytes("UTF-8");
//		System.out.println(by);
//		String str = new String(by, "UTF-8");
//		System.out.println(str);
//		System.out.println(new String(str.getBytes("UTF-16"), "UTF-16"));
//		System.out.println(new String(str.getBytes("UTF-8"), "UTF-8"));
//		System.out.println(new String(str.getBytes("gbk"), "gbk"));
//		System.out.println(new String(str.getBytes("iso-8859-1"), "iso-8859-1"));
		
		System.out.println(URLEncoder.encode(b, "UTF-8"));
		System.out.println(URLEncoder.encode(URLEncoder.encode(b, "UTF-8"), "UTF-8"));
		System.out.println(URLDecoder.decode(URLEncoder.encode(URLEncoder.encode(b, "UTF-8"), "UTF-8"), "iso-8859-1"));
		System.out.println(URLDecoder.decode(URLDecoder.decode(URLEncoder.encode(URLEncoder.encode(b, "UTF-8"), "UTF-8"), "iso-8859-1"), "UTF-8"));
		
		
	}
	
}
