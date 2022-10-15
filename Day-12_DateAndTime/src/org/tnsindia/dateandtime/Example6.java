package org.tnsindia.dateandtime;

import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Set;

public class Example6 {

	public static void main(String[] args) {
		LocalTime t=LocalTime.now(ZoneId.of("Asia/Kolkata"));
		//LocalDateTime df=LocalDateTime.now
		for(String i:ZoneId.getAvailableZoneIds())
		{
			System.out.println(i);
		}
		

	}

}
