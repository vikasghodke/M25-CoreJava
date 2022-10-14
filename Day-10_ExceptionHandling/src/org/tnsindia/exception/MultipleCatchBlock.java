package org.tnsindia.exception;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		try
		{
			int a=args.length;
			System.out.println("the length of a is:"+a);
			int b=12/a;
			System.out.println(b);
			int arr[]= {11,22,33};
			arr[4]=55;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmatic exception accured");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundException occured"+e);
		}
		

	}

}
