package com.default_method;

public class B implements Inter_1,Inter_2{
	@Override
	public void getData() {
		
		Inter_1.super.getData();
		Inter_2.super.getData();
	}
	
	public static void main(String[] args) {
		B b=new B();
		b.getData(); 
	}





}
