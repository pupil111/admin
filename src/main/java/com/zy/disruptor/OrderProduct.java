package com.zy.disruptor;

import org.springframework.beans.BeanUtils;

import com.lmax.disruptor.RingBuffer;

public class OrderProduct {
	
	private final RingBuffer<Order> buffer;

	public OrderProduct(RingBuffer<Order> buffer) {
		super();
		this.buffer = buffer;
	}
	
	public void addOrder(Order order){
		long sequence = buffer.next();
		try {
			Order order2 = buffer.get(sequence);
			BeanUtils.copyProperties(order, order2);
		} finally {
			buffer.publish(sequence);
		}
	}
	
}
