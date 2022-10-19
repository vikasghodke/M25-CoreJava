package org.tnsindia.lamdaexpression;

public class RunnableInterfaceDemoUsingLambdaExp {

	public static void main(String[] args) {
		
		Runnable obj=new Runnable()
		{
			public void run() {
				System.out.println("implimenting runnable interface");
			}
		};
		Thread t=new Thread(obj);
		t.start();
		

		
		

	}

}
