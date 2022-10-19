package org.tnsindia.streamdemo;

//import java.util.Arrays;
//import java.util.List;
import java.util.stream.Stream;

public class BasicStreamDemo {

	public static void main(String[] args) {
		Stream<String>obj=Stream.of("vrushali","dhanashri","mansi");
		obj.forEach((i)->System.out.println(i+" "));
		
		System.out.println();
		
		/*@SuppressWarnings("removal")
		List<Integer> obj1=Arrays.asList(new Integer (34));
		
		obj1.forEach((i)->System.out.println(i+" "));*/
		

	}

}
