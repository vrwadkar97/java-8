package com.default_method;

public class Test_C implements C {
	
	public int m1() {
		System.out.println("Hii from custom m1() implementation...");
		return 10;
	}

	public static void main(String[] args) {
	Test_C c=new Test_C();
	c.m1();
	

	}

}
