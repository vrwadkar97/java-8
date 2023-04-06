package com.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class D_sorted {
	
	//sorted() method:-It is used to sort the list as per DNSO. for customized sorting order we need to pass the comparator logic or object.

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(15);
		list.add(25);
		list.add(20);
		list.add(16);
		
		System.out.println(list);
		
		System.out.println();
		
		//here we have used sorted() method to get DNSO.
		List<Integer> list2=list.stream().sorted().collect(Collectors.toList());
		
		System.out.println(list2);
		System.out.println();
		
		//here we have used sorted(LE logic) to sort the list as per Reverse order(customized order).
		List<Integer> list3=list.stream().sorted((i1,i2)->(i1<i2)?1:(i1>i2)?-1:0).collect(Collectors.toList());

		System.out.println(list3);
		
		//here we have created Comparator instance with logic implemented using LE & we will pass it to the sorted() method to for sorting the list.
		Comparator<Integer> c=(i1,i2)->(i1<i2)?-1:(i1>i2)?1:0;
		System.out.println();
		
		//here we called the sorted(c) method and passed the comparator instance to the method.
		List<Integer>list4=list3.stream().sorted(c).collect(Collectors.toList());
		
		System.out.println(list4);
	}

}
