package org.tnsindia.junit5demo;
//import static org.junit.jupiter.api.Assertions.*;

//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.Test;

public class AssertDemo {
	
	@Test
	public void assertdemo()
	{
		//Fails when expected does not equal actual
		assertEquals(7,7);
	}
	
	private void assertEquals(int i, int j) {
		// TODO Auto-generated method stub
		
	}

	@Test
	public void assertdemo1()
	{
		//Fails when actual is not null
		assertNull(null);
	}

	private void assertNull(Object object) {
		// TODO Auto-generated method stub
		
	}



}
