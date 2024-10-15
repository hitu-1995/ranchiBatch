package com.db;

public interface Connection {

	  // this method is use for perform commit operation
	  void commit();

	  // this method is use for perform roolback operation
	  void rollback();
	  
}
