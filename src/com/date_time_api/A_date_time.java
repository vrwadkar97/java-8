package com.date_time_api;

import java.time.LocalDate;
import java.time.LocalTime;

public class A_date_time {
	
/*Date & Time API:- From java 1.8v a new Date & Time API introduced which consist of number of classes and interface.
 * 
 *  Up to java 1.7v java consist of date & time classes, interfaces which were not up to the mark in terms of
 *  performance, effectiveness & convenience.
 *  Hence joda.org company released new Date & Time API in comply with Java.
 *  Hence Date & Time API is sometimes also known as Joda Time API.
 *  
 *  below mentioned classes belongs to java.time. package.
 *  */
	
	public static void main(String[] args) {
		
		//This is used to show system date
		LocalDate date=LocalDate.now();
		System.out.println(date);
		
		//This is used to show system time
		LocalTime time=LocalTime.now();
		System.out.println(time);

	}

}
