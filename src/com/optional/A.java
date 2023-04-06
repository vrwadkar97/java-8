package com.optional;

import java.util.Optional;

public class A {
	
	public static void main(String[] args) {
		String s=null;
		Optional<String> check=Optional.ofNullable(s);
		
		if(check.isPresent()) {
			System.out.println(s);
		}
		else {
			System.out.println("word is null");
		}
		
		
	}

}
