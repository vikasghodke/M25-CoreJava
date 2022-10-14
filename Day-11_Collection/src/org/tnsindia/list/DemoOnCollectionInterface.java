package org.tnsindia.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class DemoOnCollectionInterface {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>();
		list.add("umesh");
		list.add("rushikesh");
		list.add("Aditya");
		list.add("asmita");
		
		List<String> list1=new ArrayList<String>();
		list1.add("steve");
		list1.add("shene");
		list1.add("watson");
		list1.add("messy");
		System.out.println("the elements of first list:"+list);
		System.out.println("the elements of second list:"+list1);
		

	}

}
