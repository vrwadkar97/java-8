package com.functional_interface;

public class Test_BC implements B,C {
	
	@Override
	public void m1() {
		System.out.println("Hiii..");
	}

	public static void main(String[] args) {
	Test_BC bc=new Test_BC();
    bc.m1();
    
    B b=new Test_BC();
    b.m1();
    
    C c=new Test_BC();
    c.m1();
    
    
	}

	

}
