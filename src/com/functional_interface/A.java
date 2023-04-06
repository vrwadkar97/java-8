package com.functional_interface;

public class A implements Int_3{
	
	@Override
	public void getData() {
		System.out.println("Hiii"); 
	}

	public static void main(String[] args) {
		A a=new A();
		a.getData();

	}

	

}
