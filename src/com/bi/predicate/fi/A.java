package com.bi.predicate.fi;

import java.util.function.BiPredicate;

public class A {

	public static void main(String[] args) {
		BiPredicate<Integer, Integer> i=(a,b)->(a+b)%2==0;

	System.out.println(i.test(10, 20));
	System.out.println(i.test(20, 15));
	
	
}
}
