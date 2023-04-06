package com.predicate.fi;

import java.util.function.Predicate;

/*Predicate Functional Interfaces:-
      There are predefined functional interfaces in java.util.function package.
      So these functional interfaces consist of only one abstract method to perform special operations.
      So these abstract methods can be directly invoked using lambda expressions.
      
      so in java 8 java has provided such a predefined functional interfaces as a new feature for carrying out specific operations
      using lambda expressions.
      
      Following are some of the most commonly used functional interfaces>>
      
      1:-Predicate
      2:-Function
      3:-Supplier
      4:-Consumer
      
      1:-Predicate:-
                This interface consist of test(T t) method which is used for conditional checks.
                For ex:-To check whether provided condition is true or false.
                
                the return type for this method is boolean so it will always return true or false.
                
       public interface Predicate<T> {
       
       public boolean test(T t);
       
       }
       
       
     
      */  
public class A {

	
	public static void main(String[] args) {
		//Ex:1:-I have to check whether provided number is even number or not.
		
		Predicate<Integer> p=(i)->{return i%2==0;};
		
		System.out.println(p.test(10));
		
		
		//Ex:-2:-I have to check whether the length of provided String is greater than 5 or not
		
		Predicate<String> p1=(s)->{return s.length()>5;};

		System.out.println(p1.test("vishal"));
		
		//Ex:-3:-Suppose I've String array & i want to fetch only elements from array whose length is 
		//greater than or equals to 5
		
		String[] s2= {"vishal","akash","rohan","sagar","abhijeet","amey","adi"};
		
		//Predicate<String> s3=(s4)->{return s4.length()%2==0;};
		
		
		Predicate<String> s3=(s4)->{return s4.length()>5;};
		
		for(String data:s2) {
			if(s3.test(data)) {
				System.out.println(data);
			}
		}
	}

}
