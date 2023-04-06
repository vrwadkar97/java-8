package com.stream;

import java.util.ArrayList;
import java.util.List;

public class G_max_min {
	//min(c) & max(c) are two methods to fetch the minimum & maximum values in collection 
	//These methods takes the argument as comparator logic or instance
	
	//For ascending collection:- min is first element from the collection & max is last element
	
	//For descending collection:- min is first element from the collection & max is last element

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(5);
		list.add(1);
		list.add(20);
		list.add(15);
		
		System.out.println("Original List>>"+list);
		System.out.println();
		
		//Ascending min
		Integer min=list.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(min);
		System.out.println();
		//Ascending max
		Integer max=list.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println(max);
		System.out.println();
		
		//Descending min
		Integer min2=list.stream().min((i1,i2)->i2.compareTo(i1)).get();
		System.out.println(min2);
		System.out.println();
		
		//Descending max
		Integer max2=list.stream().max((i1,i2)->i2.compareTo(i1)).get();
		System.out.println(max2);

	}

}
