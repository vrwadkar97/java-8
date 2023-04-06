package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class F_sorted {

	//Length comparison
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("vishal wadkar");
		list.add("rohan kolhal");
		list.add("sagar desai");
		list.add("akash bhosale");
		
		System.out.println(list);
		System.out.println();
		
		List<String> list2=list.stream().sorted((s1,s2)->(s1.length()<s2.length())?1:(s1.length()>s2.length())?-1:0).collect(Collectors.toList());

		System.out.println(list2);
	}

}
