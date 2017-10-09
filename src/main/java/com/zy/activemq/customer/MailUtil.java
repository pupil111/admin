package com.zy.activemq.customer;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import com.zy.activemq.Email;

public class MailUtil {
	
	private JavaMailSenderImpl mailSender;
	private SimpleMailMessage simpleMailMessage;
	private ThreadPoolTaskExecutor executor;
	
	public void setMailSender(JavaMailSenderImpl mailSender) {
		this.mailSender = mailSender;
	}

	public void setSimpleMailMessage(SimpleMailMessage simpleMailMessage) {
		this.simpleMailMessage = simpleMailMessage;
	}
	
	public void setExecutor(ThreadPoolTaskExecutor executor) {
		this.executor = executor;
	}

	public void sendEmail(Email email){
		
		executor.execute(new Runnable() {
			public void run() {
				simpleMailMessage.setTo(email.getTo());
				simpleMailMessage.setSubject(email.getTopic());
				simpleMailMessage.setText(email.getContext());
				mailSender.send(simpleMailMessage);
				System.out.println("邮件发送成功！！！");
			}
		});
		
	}
	
}
