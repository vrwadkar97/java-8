package com.date_time_api;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class B_custom {

	public static void main(String[] args) {
		LocalDate date=LocalDate.now();
		
		int day=date.getDayOfMonth();
		
		int month=date.getMonthValue();
		
		int year=date.getYear();
		
		System.out.println(day+"-"+month+"-"+year);
		System.out.println();
		
		System.out.printf("%d-%d-%d",day,month,year);
		System.out.println();
		
		LocalDate lo=LocalDate.of(1997, Month.MAY, 25);
		System.out.println(lo);
		System.out.println();
		
		LocalTime time=LocalTime.now();
		
		int hour=time.getHour();
		int minute=time.getMinute();
		int second=time.getSecond();
		int nanosec=time.getNano();
		
		System.out.printf("%d:%d:%d:%d",hour,minute, second,nanosec);
		System.out.println();
		
		LocalTime ti=LocalTime.of(5, 35, 45, 200);
		System.out.println(ti);

	}

}
