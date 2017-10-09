package com.zy.activemq.customer;

import java.io.IOException;

import javax.annotation.Resource;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.springframework.jms.listener.SessionAwareMessageListener;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zy.activemq.Email;

import net.sf.json.JSONObject;

public class CustomSessionAwareMessageListener implements SessionAwareMessageListener<Message> {
	
	@Resource
	private MailUtil mailUtil;
	
	@Override
	public void onMessage(Message message, Session session) throws JMSException {
		System.out.println(((TextMessage)message).getText());
		System.out.println(JSONObject.fromObject(((TextMessage)message).getText()));
		
		ObjectMapper mapper = new ObjectMapper();
		Email email = null;
		try {
			email = mapper.readValue(((TextMessage)message).getText(), Email.class);
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(email);
		
		mailUtil.sendEmail(email);
		
		
		
	}

}
