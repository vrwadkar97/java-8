package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class B_filter {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(45);
		list.add(25);
		list.add(50);
		list.add(30);
		list.add(60);
		
		System.out.println(list);
		
		System.out.println();
		
		List<Integer> list2=list.stream().filter(m->m<35).collect(Collectors.toList()); 
		
		System.out.println(list2);
		
		Long count=list.stream().filter(m->m<35).count();
		
		System.out.println();
		
		System.out.println(count);

	}

}
