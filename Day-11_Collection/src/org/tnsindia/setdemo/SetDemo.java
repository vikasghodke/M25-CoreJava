package org.tnsindia.setdemo;

import java.util.HashSet;
import java.util.Set;
//import java.util.set;

public class SetDemo {

	public static void main(String[] args) {
		
		Set<Object> s=new HashSet<>();
		s.add("vikas");
		s.add('f');
		s.add(34.56f);
		s.add(3456);
		s.add(null);
		s.add(null);
		s.add("ghodke");
		s.add("null");
		System.out.println(s);
		
		

	}

}
