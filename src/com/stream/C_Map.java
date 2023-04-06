package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class C_Map {

//	Example:-To add 5 marks to the all individual marks

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(15);
		list.add(25);
		list.add(20);
		list.add(16);

		System.out.println(list);

		System.out.println();

		List<Integer> list2 = list.stream().map(m -> m + 5).collect(Collectors.toList());

		System.out.println(list2);

	}

}
