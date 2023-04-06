package com.interface_inheritance;

public interface A {

	void m1();
	
	default void m2() {
		System.out.println("Hii from A default");
	}
}
