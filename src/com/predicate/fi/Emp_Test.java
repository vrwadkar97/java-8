package com.predicate.fi;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Emp_Test {

	public static void main(String[] args) {
		ArrayList<Employee> list=new ArrayList<>();
		
		list.add(new Employee(105, "vishal", "kop",20000l));
		list.add(new Employee(102, "akash", "pune",25000l));
		list.add(new Employee(107, "rohan", "sangamner",18000l));
		
		System.out.println("Original list"+list);
		
		Predicate<Employee> p=(e)->{return e.getSalary()>20000;};
		
		//consumer use for printing the data
		Consumer<Employee> c=e1->System.out.println(e1);
		
//		for(Employee data:list) {
//			if(p.test(data)) {
//				System.out.println(data);
//			}
//		}
		
		//making use of consumer for printing the data
		for(Employee data:list) {
			if(p.test(data)) {
				c.accept(data);
			}
		}

	}

}
