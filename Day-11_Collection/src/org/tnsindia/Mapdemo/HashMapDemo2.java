package org.tnsindia.Mapdemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo2 {

	public static void main(String[] args) {
		Map<Integer,String> h=new HashMap<>();
		h.put(1,"nayan");
		h.put(2,"ghhhh");
		h.put(3,"harshad");
		h.put(4,"narendre");
		System.out.println(h);
		h.remove(1);
		System.out.println(h);
		for(Map.Entry m:obj.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
	

	}

}
