package org.tnsindia.dateandtime;

import java.time.Instant;



public class Example7 {

	public static void main(String[] args) {
		
		
		Instant a=Instant.EPOCH;
		Instant b=Instant.EPOCH.now();
		System.out.println(a);
		System.out.println(b);

	}

}
