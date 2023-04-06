package com.default_method;

public interface C {
	/*Overriding concept of default method:-
	 * 
	 *  If we don't want custom implementation of default method then we can override this default method
	 *  in our class manually which implements the interface that contains this default method.
	 *  So for overriding we need to write the method manually as public with same method name & same return type as that of default 
	 *  method of interface.
	 *  Only default "word" is removed with public "modifier". 
	 *  Only "public" modifier is used for this overriding method.
	 *  
	 *  */

	
	default int m1() {
		System.out.println("Hiii from Default method...");
		return 10;
	}

}
