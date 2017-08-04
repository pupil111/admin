package com.zy.disruptor;

import com.lmax.disruptor.EventFactory;

public class OrderFactory implements EventFactory<Order> {

	public Order newInstance() {
		
		return new Order();
	}

}
