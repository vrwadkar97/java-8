package com.for_each;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class For_Each_Method {
	/*forEach() Method:-This method is used for iteration purpose.
	* This method is utility function which is used to iterate over collection such as set, list & map.
	* Additionally we can use it to iterate over stream also. 
	*/

	public static void main(String[] args) {
		Map<String, Integer> map=new LinkedHashMap<>();
		map.put("vishal", 1);
		map.put("akash", 2);
		map.put("rohan", 3);
		
		System.out.println("Original map>>"+map);
		
		//EntrySet:-
		
		Set<Map.Entry<String, Integer>> set =map.entrySet();
		
		for(Map.Entry<String, Integer> data:set) {
			System.out.println("key>>"+data.getKey());
			
			System.out.println("value>>"+data.getValue());
			
			System.out.println();
		}
		
		//KeySet:-
		
		Set<String> set2=map.keySet();
		
		for(String data:set2) {
			System.out.println("key>>"+data);
			System.out.println("value>>"+map.get(data));
			System.out.println();
		}
		

	}

}
