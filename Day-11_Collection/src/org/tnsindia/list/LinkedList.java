package org.tnsindia.list;
import java.util.ArrayList;

import javax.print.DocFlavor.STRING;

public class LinkedList {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("JAVA");
		list.add("J2EE");
		list.add("JSP");
		list.add("JAVA");
		list.add("SERVLETS");
		list.add("JAVA");
		list.add("STRUTS");
		list.add("DDDDDD");
		System.out.println(list);
		System.out.println(list.indexOf("java"));
		
		System.out.println(list.lastIndexOf("JAVA"));
				
		

	}

}
