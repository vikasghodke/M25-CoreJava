package org.tnsindia.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList_2 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("shiwani");
		list.add("chinu");
		list.add("charu");
		list.add("shhoooo");
		
		Iterator itrl=list.iterator();
		while(itrl.hasNext()) {
			System.out.println(itrl.next());
		}
		System.out.println("the elements are:"+list);
		System.out.println(list.contains("vikas"));
		System.out.println(list.remove(0));
		System.out.println(list.size());
		

	}

}
