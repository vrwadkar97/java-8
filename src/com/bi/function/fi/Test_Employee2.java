package com.bi.function.fi;

import java.util.function.BiFunction;

public class Test_Employee2 {

	public static void main(String[] args) {
		BiFunction<Integer, String, Employee> b=(i,s)->{return new Employee(i,s);

	};
	System.out.println(b.apply(101, "vishal"));
	
	}
}
