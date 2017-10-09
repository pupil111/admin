package com.zy.activemq.customer;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.ObjectMessage;
import javax.jms.Session;

import org.apache.activemq.ActiveMQConnectionFactory;

import com.zy.activemq.Email;

import net.sf.json.JSONObject;

public class MqConsumer {
	
	public static void main(String[] args) throws Exception {
		
		String activeMqName = "admin";
		String activeMqPassword = "admin";
		String activeMqBrokerURL = "tcp://0.0.0.0:61616";
		Connection connection = null;
		try {
			ActiveMQConnectionFactory factory = new ActiveMQConnectionFactory(activeMqName, activeMqPassword, activeMqBrokerURL);
			factory.setTrustAllPackages(true);
			connection =  factory.createConnection();
			connection.start();
			Session session = connection.createSession(Boolean.FALSE, Session.AUTO_ACKNOWLEDGE);
			
			Destination destination = session.createQueue("firstQueue");
			MessageConsumer consumer = session.createConsumer(destination);
			
			Message message = consumer.receive();
			
			if (message instanceof ObjectMessage) {
				System.out.println(message);
				Email email = (Email) ((ObjectMessage) message).getObject();
				System.out.println(email);
			}
		} finally {
			
			if (connection != null) {
				connection.close();
			}
		}
		
		
	}
	
}
