package com.cjc;

import com.adhyan.A;

public class C extends A{

	public void m3() {
		
		A a = new A();
	  // System.out.println(a.x); error 
	  
	  // directly we can access
	  System.out.println(x);
	  
	  // by child class object we can access
	  C c = new C();
	  System.out.println(c.x);
	
	}
}
