package com;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class TestPrime {
	@Test
	public void testprime() {
		assertEquals(false,Prime.prime(0));  
        assertEquals(true,Prime.prime(2));
        assertEquals(false,Prime.prime(10));
        assertEquals(false,Prime.prime(1));
	}
}
