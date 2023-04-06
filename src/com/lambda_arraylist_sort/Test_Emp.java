package com.lambda_arraylist_sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test_Emp {

	public static void main(String[] args) {
		List<Employee> list=new ArrayList<>();
		list.add(new Employee(104, "vishal", "kop"));
		list.add(new Employee(107, "akash", "pune"));
		list.add(new Employee(101, "rohan", "sangamner"));
		
		System.out.println("Original list"+list);
		
		Collections.sort(list, (e1,e2)->(e1.getId()<e2.getId())?-1:(e1.getId()>e2.getId())?1:0);
		
		System.out.println(list);
		
		Collections.sort(list, (e1,e2)->(e1.getName().compareTo(e2.getName())));
		
		System.out.println(list);
		
		Collections.sort(list, (e1,e2)->(e2.getName().compareTo(e1.getName())));
		
		System.out.println(list);

	}

}
