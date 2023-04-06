package com.lambda_arraylist_sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class A {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(101);
		list.add(50);
	    list.add(200);
	    list.add(25);
	    
	    System.out.println("Original ArrayList>>"+list);
	    /*Here we have used lambda expression for comparator(I) interface as it is functional interface & 
	    * consist of only one abstract method which is compare(Obj1 o1,Obj2 o2) method.
	    * So we can call this method using lambda expression with its implementation.
	    *  
	    * Here to provide implementation we've used the ternary operator.
	    */
	    
	    Comparator<Integer> c=(I1,I2)-> (I1>I2)?1:(I1<I2)?-1:0;
	    
	    Collections.sort(list, c);
	    
	    System.out.println(list);
	    
	    //Here we have used stream's forEach method to print the list elements one by one.
	    list.stream().forEach(System.out::println);
	    
	    //Here we have used stream's filter method to get the even numbers from list & it will be saved into list2
	    List list2=list.stream().filter(i->i%2==0).collect(Collectors.toList());
	    
	    System.out.println(list2);

	}

}
