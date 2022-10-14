package org.tnsindia.list;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		
		Queue<Character> list=new PriorityQueue<>();
		list.add('a');
		list.add('r');
		list.offer('s');
		list.offer('p');
		
		for(Character c:list)
		{
			System.out.println(c);
		}
		System.out.println(list);
		list.remove();
		System.out.println(list);
		list.remove();
		System.out.println(list.peek());
		
		

	}

}
