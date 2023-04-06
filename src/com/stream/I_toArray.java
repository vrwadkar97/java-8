package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class I_toArray {
	/*toArray():- This method of stream is used to convert stream of collection objects into an Array
	 * 
	 *  */

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(5);
		list.add(1);
		list.add(20);
		list.add(15);
		
		Integer[] x=list.stream().toArray(Integer[]::new);
		
		//Here we have used of([]) method which is used to enable the forEach method to print the Array
		Stream.of(x).forEach(System.out::println);
		
		System.out.println();
		
		//Conventional way of printing an Array using forEach loop
		
		for(Integer data:x) {
			System.out.println(data);
		}
		
		
		

	}

}
