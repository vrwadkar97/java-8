package com.date_time_api;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class F_Zonal_time {
	//ZoneId:-It is a class which is used to represent zones on Earth so as to get zonal timings.

	public static void main(String[] args) {
		ZoneId zone=ZoneId.systemDefault();
		System.out.println(zone);
		ZonedDateTime defaultZone=ZonedDateTime.now(zone);
		System.out.println(defaultZone);
		System.out.println();
		
		ZoneId la=ZoneId.of("America/Los_Angeles");
		
		ZonedDateTime dt=ZonedDateTime.now(la);
		System.out.println(dt);
		

	}

}
