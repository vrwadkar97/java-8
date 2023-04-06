package com.date_time_api;

import java.time.Year;
import java.util.Scanner;

public class E_Leap_Year {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Please enter the year to check whether it is leap or not>>");
		int year=scn.nextInt();
		
		Year y=Year.of(year);
		
		if(y.isLeap()) {
			System.out.println("year is Leap");
		}
		else {
			System.out.println("Year is not Leap");
		}
		
	
	}

}
