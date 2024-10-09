package com.cjc.multilevel;

public class Test {

public static void main(String[] args) {
		
		System.out.println("main----start");
		
		A a = new A();
		a.m1();
		System.out.println(a.x);
System.out.println("--------------------------------");
		
		B b = new B();
		b.m2();
	    b.m1();
		System.out.println(b.y);
		System.out.println(b.x);
System.out.println("---------------------------------");	
		C c  = new C();
		c.m3();
		c.m1();
		System.out.println(c.z);
		System.out.println(c.x);
		
		
	}
}
