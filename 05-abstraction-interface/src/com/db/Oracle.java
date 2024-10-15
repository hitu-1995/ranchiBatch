package com.db;

public class Oracle implements Connection{

	public void commit() {
		System.out.println("Oracle commit success.......");
	}


	public void rollback() {
		System.out.println("Oracle rollback success......");
	}
	
	// 100
}
