package com.function.fi;

import java.util.function.Function;

public class A {

	public static void main(String[] args) {
		Function<Integer, Integer> f=i->i*i;
	//	System.out.println(f.apply(5));
		
		Function<String, Integer> f1=s->s.length();
	//	System.out.println(f1.apply("vishal"));
		
		Function<String,String> f2=s2->s2.toUpperCase();
		System.out.println(f2.apply("akash"));
				
	}

}
