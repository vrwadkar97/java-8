package com.constructor.reference;

public class Test_AB {

	public static void main(String[] args) {
		//Here we have used :: operator to refer the method from FI to the constructor.
		A a=B::new;
	B b=a.get();
	B b2=a.get();
	
	}

}
