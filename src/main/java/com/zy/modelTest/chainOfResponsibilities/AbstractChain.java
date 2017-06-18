package com.zy.modelTest.chainOfResponsibilities;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractChain {
	
	protected static List<IChain> chainList = new ArrayList<IChain>();
	
	public static void addChain(IChain chain) {
		chainList.add(chain);
	}

	public static void removeChain(IChain chain) {
		if (chainList != null && chainList.contains(chain)) {
			chainList.remove(chain);
		}
	}
	
	
	/*protected static ThreadLocal<List<IChain>> chainList = new ThreadLocal<List<IChain>>();
	
	public void addChain(IChain chain) {
		if (chainList.get() == null) {
			List<IChain> list = new ArrayList<IChain>();
			list.add(chain);
			chainList.set(list);
		} else {
			chainList.get().add(chain);
		}
	}

	public void removeChain(IChain chain) {
		if (chainList.get() != null && chainList.get().contains(chain)) {
			chainList.get().remove(chain);
		}
	}*/
	
	
}
