package com.consumer.fi;

import java.util.function.Consumer;

public class A {

	public static void main(String[] args) {
		Consumer<String> c=s->System.out.println(s);
		
		c.accept("vishal");
		c.accept("is");
		c.accept("doing");
		c.accept("jscript");

	}

}
