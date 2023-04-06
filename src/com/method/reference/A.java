package com.method.reference;

public class A {
	/*Method Reference:-
	 *                   It is used an an alternative to the Lambda Expression.
	 * It is used to mapped or refer the functional interface method with our class method.
	 * Our class method can be either static or non static but it should have the same arguments as that of the 
	 * Functional interface method.(method name & modifier need not to be same as that of functional interface method)
	 * The main advantage of method reference is that code re-usability(i.e. Existing method can be used instead of 
	 * overriding interface method & giving the implementation).
	 * We use ::(Double colon operator to call our class method)
	 **/ 
	
	//Using static method.          (Instance method example in B class)
	public static void m1() {
		for(int x=1;x<=5;x++) {
			System.out.println("Hii from child thread");	
		}
		
	}

	public static void main(String[] args) {
		Runnable r=A::m1;
		Thread t=new Thread(r);
		t.start();
		
		for(int x=1;x<=5;x++) {
			System.out.println("Hii from main thread");
		}

	}

}
