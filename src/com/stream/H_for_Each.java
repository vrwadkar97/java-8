package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class H_for_Each {
	
//forEach(c) method can be used to print the stream of collection objects one by one.
//Here (c) stands for consumer instance. So, we can even pass the consumer instance to the forEach(c) method of stream.

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(5);
		list.add(1);
		list.add(20);
		list.add(15);
		
		list.stream().forEach(System.out::println);
		
		Consumer<Integer> c=i->System.out.println("square of "+i+" is>>"+(i*i));
		System.out.println();
		
		list.stream().forEach(c);
		
		System.out.println();
		
		list.stream().forEach(i->{System.out.println("cube of "+i+" is>>"+(i*i*i));});

}
}
