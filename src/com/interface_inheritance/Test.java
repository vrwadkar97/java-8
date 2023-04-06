package com.interface_inheritance;

public class Test implements C{
	@Override
	public void m1() {
		System.out.println("Hiii");
		
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
	}
	

	public static void main(String[] args) {
		
B b=new Test();
b.m1();

A a=new Test();
a.m1();



}


	
	
}
