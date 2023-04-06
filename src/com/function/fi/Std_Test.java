package com.function.fi;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Std_Test {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student(101, "vishal", 65));
		list.add(new Student(102, "akash", 75));
		list.add(new Student(103, "rohan", 60));
		list.add(new Student(104, "sagar", 45));
		list.add(new Student(105, "soham", 55));

		Function<Student, String> f = (s) -> {
			int marks = s.getMarks();
			String grade ;
			if (marks >= 75) {
				return "A";
			} else if (marks >= 65) {
				return "B";
			}
			if (marks >= 55) {
				return "C";
			} else if (marks >= 45) {
				return "D";
			} else if (marks >= 35) {
				return "E";
			}

			else {
				return "Failed";
			}

		};
        //Use of Predicate for applying conditions
		//Use of Consumer for consuming whatever we give input(like printing on console)
		Predicate<Student> fs = s -> s.getMarks() >= 60;
		Consumer<Student> c= st-> System.out.println(st);
		
		for(Student data:list) {
			if(fs.test(data)) {
			c.accept(data);
		}
		}

//		for (Student data : list) {
//
////			if (fs.test(data)) {
//				System.out.println(data);
//				System.out.println(f.apply(data));
////			}
//
//		}
	}

}

