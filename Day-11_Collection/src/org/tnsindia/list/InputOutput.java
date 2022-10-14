package org.tnsindia.list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class InputOutput {

	public static void main(String[] args) {
		List<Integer> list=new LinkedList<Integer>();
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the total no.of value to be shuffled:");
		int x=in.nextInt();
		
		while(x!=0)
		{
			list.add(in.nextInt());
			x--;
		}
		Collections.shuffle(list);
		System.out.println(list);
		
	}

}
