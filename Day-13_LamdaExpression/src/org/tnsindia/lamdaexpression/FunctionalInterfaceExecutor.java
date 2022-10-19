package org.tnsindia.lamdaexpression;

public class FunctionalInterfaceExecutor {

	public static void main(String[] args) {
		FunctionalInterfaceDemo obj=(String str)->
		{
			return str;
		};
		System.out.println(obj.display("welcome to the concept of lambda Expression"));
	

	}

}
