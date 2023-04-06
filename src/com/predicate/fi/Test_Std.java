package com.predicate.fi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Test_Std {

	public static void main(String[] args) {
	List<Student> list=new ArrayList<>();
	list.add(new Student(101, "vishal", 65));
	list.add(new Student(105, "akash", 75));
	list.add(new Student(104, "rohan",55));
	list.add(new Student(109, "sagar", 70));
	list.add(new Student(103, "soham", 50));
	
	System.out.println("Original List>>"+list);

	Predicate<Student> p=s->s.getMarks()>60;
    
	for(Student data:list) {
		if(p.test(data)) {
			System.out.println(data);
		}
	}
}
}
