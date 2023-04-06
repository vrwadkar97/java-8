package com.stream;

import java.util.stream.Stream;

public class J_of_method {

	public static void main(String[] args) {
		
		Stream s=Stream.of(10,100,1000);
		s.forEach(System.out::println);
		
		Integer[] x= {5,10,15,20,25};
		
		System.out.println();
		
		Stream.of(x).forEach(System.out::println);

	}

}
