package com.cjc.example2;

public class C extends B{

	int x = 20;

	public void m1() {
       
		System.out.println("m1---B");		
	}
	
	public void m2() {
	// for variable calling
      int x = 30;

      System.out.println(this.x); // 20
      System.out.println(x); // 20
      
      // for method calling
//		super.m1();  // m1----A
//		this.m1();  // m1----B
//		System.out.println("m2---B"); // m2--B
	}
}
