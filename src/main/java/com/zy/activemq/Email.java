package com.zy.activemq;

import java.io.Serializable;

public class Email implements Serializable {
	
	private static final long serialVersionUID = 1l;
	
	private String from;
	
	private String to;
	
	private String topic;
	
	private String context;
	
	public Email() {
		super();
	}

	public Email(String from, String to, String topic, String context) {
		super();
		this.from = from;
		this.to = to;
		this.topic = topic;
		this.context = context;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	@Override
	public String toString() {
		return "Email [from=" + from + ", to=" + to + ", topic=" + topic + ", context=" + context + "]";
	}
	
}
