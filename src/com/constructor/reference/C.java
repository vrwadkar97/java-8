package com.constructor.reference;

public class C {
	
	//here we have matched the arguments
	
	C(String s){
		System.out.println("Hii from constructor>>"+s);
	}
	
	//so even if we have another constructor of no argument or even parameterized having other data type 
	// it will refer only the matching argument constructor.
	C(){
		System.out.println("Hii from no argument constructoe=r..");
	}
	
	C(int x){
		System.out.println("Hii from parameterized constructor having number>>"+x);
	}

}
