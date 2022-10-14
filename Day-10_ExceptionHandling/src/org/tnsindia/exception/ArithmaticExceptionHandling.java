package org.tnsindia.exception;
import java.util.Scanner;

public class ArithmaticExceptionHandling {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("enter a value for a");
		int a=in.nextInt();
		System.out.println("enter a value for n:");
		int b=in.nextInt();
		
		try {
			int result=a/b;
			System.out.println("the result is:"+result);
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("arithmatic exception handled by using catch block");
		}
		
		finally
		{
			System.out.println("finally block is always executed");
		}
		in.close();
		
		

	}

}
