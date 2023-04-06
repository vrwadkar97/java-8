package com.method.reference;

   //With argument example
public class Test_C {
	public static void getSum(int x,int y) {
		System.out.println("sum is>>"+(x+y));
	}

	public static void main(String[] args) {
		C c=Test_C::getSum;
		c.add(10, 20);

	}

}
