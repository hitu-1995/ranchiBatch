package com.db;

public class MySQL implements Connection{

	public void commit() {
		
		System.out.println("MySQL commit success ............");
		
	}
	public void rollback() {
		System.out.println("MySQL rollback success............");
	}
	
	// 100
}
