package org.tnsindia.packagedemo;


import java.util.Scanner;
import java.util.Scanner.*;

import org.tnsindia.packageexample.PackageDemo;



public class PackageExample {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the string");
		String str1=in.nextLine();
		PackageDemo d=new PackageDemo();
		d.str=str1;
		d.display();
		in.close();
		

	}

}
