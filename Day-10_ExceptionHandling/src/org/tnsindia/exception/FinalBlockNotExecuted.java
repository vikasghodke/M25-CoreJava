package org.tnsindia.exception;

public class FinalBlockNotExecuted {
	
	public static void print()
	{
		try
		{
			int x=12;
			int y=5;
			System.out.println("inside try block"+x/y);
			System.exit(0);
		}
		catch(Exception e)
		{
			System.out.println("try block");
		}
	}
	
	public static void main(String[] args) {
		print();
		

	}

}
