package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class E_sorted {

	//String sorting
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("vishal");
		list.add("akash");
		list.add("rohan");
		list.add("sagar");
		
		System.out.println(list);
		System.out.println();
		
		List<String> list2=list.stream().sorted().collect(Collectors.toList());
		
		System.out.println(list2);
		System.out.println();
		
		List<String> list3=list2.stream().sorted((s1,s2)->(-s1.compareTo(s2))).collect(Collectors.toList());
		System.out.println(list3);
		
		
		
		
		
	}

}
