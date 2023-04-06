package com.functional_interface;
/*Functional Interface:- The interface having only one abstract method is called as Functional Interface.
 * Functional interface consist of any number of default & static methods but only one abstract method.
 * We can indicate an interface as Functional interface by using @FunctionalInterface annotation.
 * 
 * @FunctionalInterface annotation helps the compiler to show errors if user is trying to add more than 
 * one abstract method.
 * 
 * */

@FunctionalInterface
public interface Int_3 {

	void getData();
}
