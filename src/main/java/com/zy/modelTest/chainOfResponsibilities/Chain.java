package com.zy.modelTest.chainOfResponsibilities;

public class Chain extends AbstractChain implements IChain {
	
	private String name;
	
	public Chain(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Chain [name=" + name + "]";
	}

	public void operitor() {
		System.out.println(name+"deal!");
		if (chainList != null) {
			chainList.get((int)(Math.random()*chainList.size())).operitor();
		}
		/*System.out.println(chainList.get());
		if (chainList.get() != null) {
			int num = (int)(Math.random()*chainList.get().size());
			System.out.println(num);
			chainList.get().get(num).operitor();
		}*/
		
	}

}
