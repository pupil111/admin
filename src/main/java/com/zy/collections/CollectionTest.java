package com.zy.collections;

import java.math.BigDecimal;
import java.util.Arrays;

import com.zy.disruptor.Order;

public class CollectionTest{
	
//	@SuppressWarnings("unused")
//	private List<T>[] listArray;
//	
//	@SuppressWarnings("unchecked")
//	public CollectionTest(int size) {
//		super();
//		this.listArray = (List<T>[]) new Object[size];
//	}
	
	
	public static void main(String[] args) {
		
//		List<Integer> list = new ArrayList<Integer>();
//		
//		list.add(1);list.add(10);list.add(80);list.add(56);
//		list.add(15);list.add(45);list.add(63);list.add(56);
//		list.add(5);list.add(45);list.add(13);
//		
//		//Collections.sort(list);
//		
//		System.out.println(list);
//		
//		//Collections.shuffle(list);
//		
//       Collections.sort(list, new Comparator<Integer>() {
//
//			public int compare(Integer num1, Integer num2) {
//				
//				return num1.compareTo(num2);
//			}
//		});
//		
//		System.out.println(list);
//		
//		Collections.shuffle(list);
//		
//		System.out.println(list);
		
		
		
//		String[] str = new String[5];
//		
//		Arrays.fill(str, 0, 3, "ha");
//		
//		System.out.println(Arrays.toString(str));
		
		int[] it = new int[]{1,2,3,4,5,6,7,8};
		int[] in = new int[5];
		System.arraycopy(it, 1, in, 0, 5); 
		
		System.out.println(Arrays.toString(in));
		
		Order order = new Order();
		order.setSn(1);
		order.setName("45");
		order.setPrice(BigDecimal.TEN);
		Order order1 = new Order();
		order1.setSn(1);
		order1.setName("45");
		order1.setPrice(BigDecimal.TEN);
		Order order2 = new Order();
		order2.setSn(1);
		order2.setName("45");
		order2.setPrice(BigDecimal.TEN);
		Order order3 = new Order();
		order3.setSn(1);
		order3.setName("45");
		order3.setPrice(BigDecimal.TEN);
		
		Order[] orderarr = new Order[5];
		orderarr[0] = order;
		orderarr[1] = order1;
		orderarr[2] = order2;
		orderarr[3] = order3;
		
		
	}
	
	
}
