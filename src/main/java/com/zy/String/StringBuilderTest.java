package com.zy.String;

import java.io.File;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Formatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringBuilderTest {
	
	@Override
	public String toString() {
		System.out.println("aaaaaaaaaaaaa");
		//return "hhhah  " + this;
		return "";
	}
	
	private String str;
	
	private Formatter formatter;
	
	public StringBuilderTest() {
		super();
	}

	public StringBuilderTest(String str, Formatter formatter) {
		super();
		this.str = str;
		this.formatter = formatter;
	}

	public void move(int x, int y){
		
		formatter.format("%s hhahahha %d %d hahhaha\n", str, x, y);
		
	}

	public static void main(String[] args) throws Exception {
		
		/*StringBuilder builder = new StringBuilder();
		builder.append("abc ").append("hahah ").append("啊啊啊").append("qwe ").append("rty ").append("fgfgfg");
		
		System.out.println(builder.toString());
		
		System.out.println(builder.length());
		
		builder.setLength(50);
		
		System.out.println(builder);
		
		System.out.println(builder.delete(0, 5));
		
		System.out.println(builder.replace(0, 5, "哈啊假按揭啊打发"));
		
		System.out.println(builder.reverse());
		System.out.println(builder.reverse());
		System.out.println(builder.substring(0, 5));
		CharSequence charSequence = builder.subSequence(0, 5);
		System.out.println(charSequence);
		System.out.println(charSequence.subSequence(0, 3));
		System.out.println(charSequence);
		
		StringBuilderTest test = new StringBuilderTest();
		
		System.out.println(test);
		
		String str = "aaa".intern();
		String str2 = "aaa".intern();
		String str3 = "aaa";
		System.out.println(str == str2);
		System.out.println(str.equals(str2));
		System.out.println(str == str3);
		System.out.println(str.equals(str3));
		
		
		System.out.format("haha [%s %s]\n", str3, str3);*/
		
		
		/*PrintStream printStream = System.out;
		
		StringBuilderTest builderTest = new StringBuilderTest("No1", new Formatter(printStream));
		
		StringBuilderTest builderTest2 = new StringBuilderTest("No2", new Formatter(System.out));
		
		builderTest.move(1, 10);
		builderTest2.move(2, 5);
		
		System.out.println(String.format("%-5d %-10s %b", 12, 12, 12));*/
		
		
		/*Pattern pattern = Pattern.compile("(-|\\+)?(\\d)+");
		
		Matcher matcher = pattern.matcher("-45地方454覆盖89fg65");
		
		//有匹配即可
		System.out.println(matcher.find());
		//开头匹配即可
		System.out.println(matcher.lookingAt());
		//全匹配
		System.out.println(matcher.matches());
		
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
		
		System.out.println(Arrays.asList(Pattern.compile("!").split("111111111!!22222222222!!3333333333@@!!444444")));*/
		
		
		
		
		
	}
	
}
