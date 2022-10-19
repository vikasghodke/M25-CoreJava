package org.tnsindia.streamdemo;

import java.util.Arrays;
import java.util.List;

public class FilteringExample {

	public static void main(String[] args) {
		List<Integer>obj1=Arrays.asList(new Integer[] {34,56,78,90,54});
		obj1.stream().filter(i->i>56).forEach((i)->System.out.println(i+" "));

	}

}
