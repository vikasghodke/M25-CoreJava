package org.tnsindia.interfaceexample;

interface FunctionalInterface{
	void accept(String msg);
}
class FunctionalInterfaceExample implements FunctionalInterface{

	@Override
	public void accept(String msg) {
		System.out.println(msg);
		
	}
	
}

public class DemoFunctionalInterface {

	public static void main(String[] args) {
		FunctionalInterfaceExample f=new FunctionalInterfaceExample();
		f.accept("hello there");
		

	}

}
