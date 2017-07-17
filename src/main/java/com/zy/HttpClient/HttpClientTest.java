package com.zy.HttpClient;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

public class HttpClientTest {
	
	public void PostTest() throws Exception{
		
		HttpClient httpClient = new DefaultHttpClient();
		
		HttpPost post = new HttpPost("http://localhost:8080/adminTest/User/PostTest.htm");
		
		List<NameValuePair> list = new ArrayList<NameValuePair>();
		list.add(new BasicNameValuePair("name", "张三"));
		list.add(new BasicNameValuePair("age", "15"));
		HttpEntity httpEntity = new UrlEncodedFormEntity(list, "UTF-8");
		/*MultipartEntity entity = new MultipartEntity();
		entity.addPart("file", new FileBody(new File("")));*/
		
		post.setEntity(httpEntity);
		HttpResponse response = httpClient.execute(post);
		
		System.out.println(EntityUtils.toString(response.getEntity()));
		httpClient.getConnectionManager().shutdown();
	}
	
	@Test
	public void test() throws Exception{
		PostTest();
	}
	
}
