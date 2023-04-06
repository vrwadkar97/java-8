package com.date_time_api;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class D_Period_between {

	public static void main(String[] args) {
	LocalDate birthDate=LocalDate.of(1997, Month.JULY, 16);
	
	LocalDate todays_Date=LocalDate.now();
	
	Period p=Period.between(birthDate, todays_Date);
	
	System.out.printf(" My Age is %d Years %d Months %d Days",p.getYears(),p.getMonths(),p.getDays());
	System.out.println();
	
	//Que:How many years Sachin Tendulkar played for team INDIA
	
	LocalDate entryDay=LocalDate.of(1989, Month.NOVEMBER, 15);
	LocalDate lastDay=LocalDate.of(2013, Month.NOVEMBER	,14);
	
	Period p1=Period.between(entryDay, lastDay);
	
	System.out.printf("Sachin Tendulkar played % d years %d months & %d days",p1.getYears(),p1.getMonths(),p1.getDays());

	}

}
