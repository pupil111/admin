package com.zy.disruptor;

import java.math.BigDecimal;

public class Order {
	
	private int sn;
	
	private BigDecimal price;
	
	private String name;

	public int getSn() {
		return sn;
	}

	public void setSn(int sn) {
		this.sn = sn;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Order [sn=" + sn + ", price=" + price + ", name=" + name + "]";
	}
	
}
