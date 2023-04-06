package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Example:-To catch the even numbers from the list

//filter():-to apply conditional checks.It uses concept of Predicate


public class A_filter {

	public static void main(String[] args) {
	List<Integer> list=new ArrayList<>();
	list.add(10);
	list.add(15);
	list.add(25);
	list.add(20);
	list.add(16);
	
	System.out.println(list);
	
	System.out.println();
	
	List<Integer> list2 =list.stream().filter(i->i%2==0).collect(Collectors.toList());
	System.out.println(list2);

	}

}
