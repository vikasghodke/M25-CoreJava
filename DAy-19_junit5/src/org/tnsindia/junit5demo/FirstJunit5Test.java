package org.tnsindia.junit5demo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.disabled;

public class FirstJunit5Test {
	
	@Test
	//it will perform the testing on the method
	void test() {
		System.out.println("Hello everyone");
	}
	
	@Test
	@Disabled
	void display() {
		fail("hi");
	}

	
}
