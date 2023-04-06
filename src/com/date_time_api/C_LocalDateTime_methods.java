package com.date_time_api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class C_LocalDateTime_methods {
	/*LocalDateTime:- This class is used to print all the info related to dates and time
	 * Even we can call all methods of LocalDate & LocalTime classes on instance of LocalDateTime.
	 *  */

	public static void main(String[] args) {
		LocalDateTime dt=LocalDateTime.now();
		System.out.println(dt);
		
		//Example:-calling methods of LocalDate & LocalTime classes on instance of LocalDateTime.
		
		int day=dt.getDayOfMonth();
		int month=dt.getMonthValue();
		int year=dt.getYear();
		
		int hour=dt.getHour();
		int minute=dt.getMinute();
		int second=dt.getSecond();
		int nano=dt.getNano();
		
		System.out.printf("Date:%d-%d-%d",day,month,year);
		System.out.println();
		
		System.out.printf("\nTime:%d:%d:%d",hour, minute,second,nano);
		System.out.println();
	
		LocalDateTime dt3=LocalDateTime.of(1997, Month.JANUARY, 1, 1, 45) ;
		System.out.println(dt3);
		System.out.println();
		
		System.out.println(dt3.plusYears(25));
		System.out.println(dt3.plusMonths(12));
		System.out.println(dt3.plusDays(30));
		
		System.out.println();
		
		System.out.println(dt3.minusYears(4));
		System.out.println(dt3.minusMonths(6));
		System.out.println(dt3.minusDays(10));
		
				
		
		
		

	}

}
