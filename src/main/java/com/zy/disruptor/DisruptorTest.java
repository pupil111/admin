package com.zy.disruptor;

import java.math.BigDecimal;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.lmax.disruptor.YieldingWaitStrategy;
import com.lmax.disruptor.dsl.Disruptor;
import com.lmax.disruptor.dsl.ProducerType;

public class DisruptorTest {
	
	public static void main(String[] args) {
		
		OrderFactory factory = new OrderFactory();
		int ringBufferSize = 4;
		ExecutorService executorService = Executors.newCachedThreadPool();
		
		Disruptor<Order> disruptor = new Disruptor<Order>(factory, ringBufferSize, executorService, ProducerType.SINGLE, new YieldingWaitStrategy());
		
		disruptor.handleEventsWith(new OrderCustomer());
		disruptor.start();
		
		OrderProduct product = new OrderProduct(disruptor.getRingBuffer());
		for (int i = 0; i < 10; i++) {
			Order order = new Order();
			order.setSn(i);
			order.setName("order" + i);
			order.setPrice(new BigDecimal(10 * i));
			product.addOrder(order);
			
		}
		
		
		
	}
	
	
}
