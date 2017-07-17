package com.zy.classTest;

class A {
}

class B extends A {
}

public class Test {
    public static void main(String[] args) {

        B b = new B();
        A a = new A();
        A ba = new B();
        
        System.out.println("1------------");
        System.out.println(b instanceof B);//t
        System.out.println(b instanceof A);//t
        System.out.println(b instanceof Object);//t
        System.out.println(null instanceof Object);//f
        System.out.println("2------------");
        System.out.println(b.getClass().isInstance(b));//t
        System.out.println(b.getClass().isInstance(a));//f
        System.out.println("3------------");
        System.out.println(a.getClass().isInstance(ba));//t
        System.out.println(b.getClass().isInstance(ba));//t
        System.out.println(b.getClass().isInstance(null));//f
        System.out.println("4------------");
        System.out.println(A.class.isInstance(a));//t
        System.out.println(A.class.isInstance(b));//t
        System.out.println(A.class.isInstance(ba));//t
        System.out.println("5------------");
        System.out.println(B.class.isInstance(a));//f
        System.out.println(B.class.isInstance(b));//t
        System.out.println(B.class.isInstance(ba));//t
        System.out.println("6------------");
        System.out.println(Object.class.isInstance(b));//t
        System.out.println(Object.class.isInstance(null));//f
    }
}