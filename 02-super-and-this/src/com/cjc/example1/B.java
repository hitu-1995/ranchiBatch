package com.cjc.example1;

public class B extends A{


	public B() {
		this("ABC");
     System.out.println("B------no-arg---constructor");
	}
	public B(int x) {
		this();
		System.out.println("B------int ----constructor");
	}
	public B(String s)
	{
		 super(100);
		System.out.println("B----String----Constructor");
	}
	
}
