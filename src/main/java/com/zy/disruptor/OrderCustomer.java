package com.zy.disruptor;

import com.lmax.disruptor.EventHandler;

public class OrderCustomer implements EventHandler<Order> {

	public void onEvent(Order event, long sequence, boolean endOfBatch) throws Exception {
		System.out.println(event);
		System.out.println(sequence);
		System.out.println(endOfBatch);
	}

}
