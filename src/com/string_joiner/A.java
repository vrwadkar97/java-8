package com.string_joiner;

import java.util.StringJoiner;

public class A {
	/*StringJoiner:-It is used to create a sequence of Strings separated by delimiter
	 * It is new feature of java 8 which included as a class present in java.util package
	 *  
	 *  */

	public static void main(String[] args) {
		StringJoiner joiner=new StringJoiner(">>");
		joiner.add("ABC");
		joiner.add("123");
		joiner.add("-(*&^");
		
		System.out.println(joiner);

	}

}
