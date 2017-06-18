package com.zy.modelTest.chainOfResponsibilities;

public class ChainTest {
	
	public static void main(String[] args) {
		
		Chain chain = new Chain("C1");
		Chain chain2 = new Chain("C2");
		Chain chain3 = new Chain("C3");
		Chain chain4 = new Chain("C4");
		Chain chain5 = new Chain("C5");
		Chain chain6 = new Chain("C6");
		
		AbstractChain.addChain(chain);
		AbstractChain.addChain(chain2);
		AbstractChain.addChain(chain3);
		AbstractChain.addChain(chain4);
		AbstractChain.addChain(chain5);
		AbstractChain.addChain(chain6);
		/*chain.addChain(chain);
		chain.addChain(chain2);
		chain.addChain(chain3);
		chain.addChain(chain4);
		chain.addChain(chain5);
		chain.addChain(chain6);*/
		
		chain.operitor();
		
		
	}
	
}
