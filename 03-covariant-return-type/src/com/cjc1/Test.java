package com.cjc1;

public class Test {

	public Object m1() {

		return "ABC";
	}

	public static void main(String[] args) {
		System.out.println("main----start");
		
		Test t = new Test();
		String i = (String) t.m1();

		System.out.println("main---ends");
	}
}
