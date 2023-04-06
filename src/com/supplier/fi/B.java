package com.supplier.fi;

import java.util.function.Supplier;

public class B {

	public static void main(String[] args) {
		
		
		Supplier<String> s=()->{
			String otp="";
			for(int x=1;x<=6;x++) {
				otp=otp+(int)(Math.random()*10);
			}
			return otp;
		};
		
		System.out.println(s.get());

	}

}
