package org.tnsindia.setdemo;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashset {

	public static void main(String[] args) {
		Set<Object> s=new LinkedHashSet<>();
		s.add("shiwani");
		s.add('g');
		s.add(45.67f);
		s.add(56);
		s.add("shiwani");
		s.add(null);
		s.add(null);
		for(Object ss:s)
		{
			System.out.println(ss);
		}
		System.out.println("the elements in the set are:"+s);
		

	}

}
