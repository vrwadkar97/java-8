package com.static_methods;

public class B implements Int_1,Int_2{
	
	public void getData() {
		Int_1.getData();
		Int_2.getData();
	}

	public static void main(String[] args) {
		B b=new B(); 
		b.getData();
		
		System.out.println(); 
		
		Int_2.getData();
		Int_1.getData();
		
		

	}

}
