package com.method.reference;

public class B {
	//Using instance method
	public void m1() {
		for(int x=1;x<=5;x++) {
			System.out.println("Hii from child thread");	
		}
		
	}

	public static void main(String[] args) {
		B b=new B();
		Runnable r=b::m1;
		Thread thread=new Thread(r);
		
		thread.start();
		
		for(int x=1;x<=5;x++) {
			System.out.println("Hii from main thread");
		}

	}

}
