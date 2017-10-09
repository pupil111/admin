package com.zy.activemq.productor;

import javax.annotation.Resource;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zy.activemq.Email;

import net.sf.json.JSONObject;

@Service("mqService")
public class MqService {
	
	@Resource
	private JmsTemplate jmsTemplate;
	
	public void sendMessage(Email email) {
		
		jmsTemplate.send(new MessageCreator() {
			@Override
			public Message createMessage(Session session) throws JMSException {
				
				ObjectMapper objectMapper = new ObjectMapper();
				try {
					return session.createTextMessage(objectMapper.writeValueAsString(email));
				} catch (JsonProcessingException e) {
					return null;
				}
			}
		});
		
	}
	
	
}
