package org.tnsindia.dateandtime;
import java.time.Clock;

public class ZoneId {

	public static void main(String[] args) {
		
		Clock c=Clock.systemDefaultZone();
		//Clock c1=Clock.systemDefaultZone();
		System.out.println(c);
		//System.out.println(c1);
		

	}

}
