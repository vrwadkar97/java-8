package com.annonymous.inner_class;

public class Test_A {

	public static void main(String[] args) {
		A a=new A() {

			@Override
			public void m1() {
				System.out.println("Hiii from m1...");
				
			}

			@Override
			public void m2() {
				System.out.println("Hiii from m2...");
				
			}

	};
	
	a.m1();
	a.m2();

}
}
