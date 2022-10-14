package org.tnsindia.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("dhanashri");
		list.add("radha");
		list.add("ashik");
		list.add("something");
		
		for(String itr:list)
		{
			System.out.println(itr);
		}
		System.out.println("the elements are:"+list);
		

	}

}
