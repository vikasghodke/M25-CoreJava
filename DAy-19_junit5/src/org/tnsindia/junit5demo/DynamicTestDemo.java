package org.tnsindia.junit5demo;
import java.util.Arrays;
import java.util.Collection;

public class DynamicTestDemo {
	
	//dynamic Test
			@TestFactory
			Collection<DynamicTest>print()
			{
				return Arrays.asList(dynamicTest("Simple Dynamic Test",()->assertTrue(true)),
						dynamicTest("My Executable class",new  MyExecutableDynamicTestDemo())
						);
						
			}

			
			}

		}

		class MyExecutableDynamicTestDemo implements Executable
		{

			public void execute() throws Throwable {
				System.out.println("Welcome to M25 Batch");
				
			}

	}


