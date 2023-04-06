package com.functional_interface;

/*Overriding in Functional Interfaces:- 
 * If one functional interface(B=Child) extends another functional interface(A=Parent) then Child interface(B) is
 * still considered as functional interface even if it doesn't have any method.
 * Child interface(B) is still considered as functional interface even it contains a method which is overridden.
 * (i.e. method with same name & parameter as that of Parent interface(A)'s abstract method. 
 * But if we try to add another abstract method other than overridden method then it will not be an Functional interface.
 * */

@FunctionalInterface
public interface C extends B {
	void m1();
	
	//void m2(); if use this method then this interface is no longer a Functional interface & we will get a CE.
	
	default void m3() { 
		//
	}
}
