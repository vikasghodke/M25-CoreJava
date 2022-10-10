package org.tnsindia.statickey;

class D
{
	D()
	{
		this(5);
		System.out.println("default constructor");
	}
	D(int i)
	{
		System.out.println("parameterised constructor");
		
	}
}




public class DemoOnInvokeConstructor {

	public static void main(String[] args) {
		
		D c=new D();
		

	}

}
