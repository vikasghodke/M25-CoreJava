package org.tnsindia.Overloading;

class MathmaticalOperation{
	
	public void addition(int a,int b)
	{
		System.out.println("the sum is:"+(a+b));
	}
	public void addition(float a, float b)
	{
		System.out.println("the sum is:"+(a+b));
	}
	public void multiplication(float b, float c)
	{
		System.out.println("multiplication od:"+(b*c));
	}
}


public class DemoOnMethodOverloading {

	public static void main(String[] args) {
		
		MathmaticalOperation M=new MathmaticalOperation();
		M.addition(90,100);
		M.addition(23,45);
		M.multiplication(23,56);
	}

}
