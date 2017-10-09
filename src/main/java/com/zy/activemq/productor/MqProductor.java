package com.zy.activemq.productor;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.DeliveryMode;
import javax.jms.Destination;
import javax.jms.MessageProducer;
import javax.jms.ObjectMessage;
import javax.jms.Session;

import org.apache.activemq.ActiveMQConnectionFactory;

import com.zy.activemq.Email;

public class MqProductor {
	
	public static void main(String[] args) throws Exception {
		
		String activeMqName = "admin";
		String activeMqPassword = "admin";
		String activeMqBrokerURL = "tcp://localhost:61616";
		
		Connection connection = null;
		
		try {
			ConnectionFactory factory = new ActiveMQConnectionFactory(activeMqName, activeMqPassword, activeMqBrokerURL);
			connection =  factory.createConnection();
			connection.start();
			Session session = connection.createSession(Boolean.FALSE, Session.AUTO_ACKNOWLEDGE);
			
			Destination destination = session.createQueue("firstQueue");
			MessageProducer messageProducer = session.createProducer(destination);
			messageProducer.setDeliveryMode(DeliveryMode.PERSISTENT);
			
			Email email = new Email(null, "1817204670@qq.com", "MQ信息主题", "发送MQ信息到本邮件中。。。");
			ObjectMessage message = session.createObjectMessage(email);
			
			messageProducer.send(message);
		} finally {
			if (connection != null) {
				connection.close();
			}
			
		}
		
	}
	
}
