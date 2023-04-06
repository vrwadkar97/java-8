package com.default_method;

/*Default Method:- Default method is one which we can use it in any interface with "default" keyword &
 *  having its method body.
 *  These are non abstract methods with their implementation.
 *  We can use any number of default methods in Interface after java 8.
 *  Before java 8 Interface only consist of abstract methods.
 *  We can call this method in implementing classes if we have another interface with same method & that interface 
 *  extends this parent interface.
 *  Otherwise we can simply call it using Implementing class object.
 *  
 * Reason for providing Default Methods in Interface:-
 * If we have abstract method in interface then whenever we implement this interface with any class always we need to 
 * override this method so as to give implementation.
 * To overcome this issue java 8 feature introduces "Default" methods which allows the interfaces to have methods with 
 * implementation without affecting classes that implements this interfaces.
 * 
 * */

public interface Inter_1 {
	
	 default void getData() {
		System.out.println("Hii from Inter_1 Default Method...");
	}

}
