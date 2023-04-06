package com.functional_interface;

@FunctionalInterface
public interface B {
	void m1();
	
	default void m2() {
		//
	}
	
	static void m3() {
		//
	}

}
