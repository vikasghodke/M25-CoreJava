package org.tnsindia.streamdemo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceDemo {

	public static void main(String[] args) {
		List<Integer>obj1=Arrays.asList(new Integer[] {23,45,67,89,99});
		Optional<Integer>obj2=obj1.stream().reduce((a,b)->a>b?a:b);
		
		if(obj2.isPresent())
		{
			System.out.println(obj2.get());
		}
	}

}
