package com.zy.array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;

public class ArrayOfGeneric2<T> {  
	 T[] ts;  
	  
	@SuppressWarnings("unchecked")
	public ArrayOfGeneric2(Class<T> type, int size) {  
	    ts = (T[]) Array.newInstance(type, size);  
	}   
  
    public T get(int index) {  
        return (T) ts[index];  
    }  
  
    public T[] rep() {  
        return (T[]) ts;  
    }  
  
    public void set(int index, T t) {  
        ts[index] = t;  
    }  
  
    public static void main(String[] args) {  
        ArrayOfGeneric2<String> aog2 = new ArrayOfGeneric2<String>(String.class, 10); 
        
        String[] strs = aog2.rep();
        System.out.println(Arrays.asList(strs));
        Arrays.fill(strs, "aa");
        System.out.println(Arrays.asList(strs));
        
        
//        int[] a = new int[8];
//        int[] b = new int[10];
//        
//        Arrays.fill(a, 15);
//        Arrays.fill(b, 20);
//        
//        System.out.println("a=" + Arrays.toString(a));
//        System.out.println("b=" + Arrays.toString(b));
//        
//        System.arraycopy(a, 0, b, 0, a.length);
//        
//        System.out.println("a=" + Arrays.toString(a));
//        System.out.println("b=" + Arrays.toString(b));
//        
//        System.out.println("=================");
//        
//        
//        Arrays.fill(a, 11);
//        Arrays.fill(b, 22);
//        
//        System.out.println("a=" + Arrays.toString(a));
//        System.out.println("b=" + Arrays.toString(b));
//        
//        System.arraycopy(b, 0, a, 0, a.length);
//        
//        System.out.println("a=" + Arrays.toString(a));
//        System.out.println("b=" + Arrays.toString(b));
        
        int[] a = new int[]{1,45,56,23,56,7,8,26,9,99,655};
        
        Arrays.sort(a);
        
        System.out.println(Arrays.toString(a));
        
        Integer[] b = new Integer[]{45,56,15,23,56,7,8,26,9,99,655};
        
        System.out.println(Arrays.binarySearch(b, 56));
        
        List<Integer> bi = Arrays.asList(b);
        Collections.sort(bi);
        
        System.out.println(Arrays.binarySearch(b, 56));
        
        System.out.println(Arrays.toString(b));
        System.out.println(bi);
    }  
} 
