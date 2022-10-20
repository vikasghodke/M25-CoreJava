package org.tnsindia.generics;

import java.util.LinkedList;
import java.util.List;

public class GenericsAdvantage {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		List obj=new LinkedList<>();
		obj.add(99);
	
		obj.add("dhanashri");
		obj.add(76);
		obj.add("vikas");
		System.out.println(obj);

	}

}
