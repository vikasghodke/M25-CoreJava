package org.tnsindia.enumdemo;

public class EnumCarDemo {

	public static void main(String[] args) {
		
		for(Car c:Car.values())
		{
			//System.out.println(c.MARUTI);
			System.out.println(c);
		}
	}
}


