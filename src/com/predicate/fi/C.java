package com.predicate.fi;

import java.util.function.Predicate;

public class C {

	public static void main(String[] args) {
		int[] x= {20,2,15,9,10,7,18};
		
		Predicate<Integer> p1=(i1)->{return i1%2==0;};
		
		Predicate<Integer> p2=(i1)->{return i1>10;};
		
		//and function
		for(Integer data: x) {
			if(p1.and(p2).test(data)) {
				System.out.println(data);
			}
		}
		
		System.out.println();
		
		//or function
		for(Integer data:x) {
			if(p1.or(p2).test(data)) {
				System.out.println(data);
			}
		}
		
		System.out.println();
		
		//negate function will provide all values other than condition in p1.
		for(Integer data:x) {
			if(p1.negate().test(data)) {
				System.out.println(data);
			}
		}

	}

}
