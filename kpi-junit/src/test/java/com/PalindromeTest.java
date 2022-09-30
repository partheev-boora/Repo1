package com;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class PalindromeTest {
	@Test
	public void testpal() {
		assertEquals(true,Palindrome.pal(0));  
        assertEquals(true,Palindrome.pal(99));
        assertEquals(false,Palindrome.pal(10));
        assertEquals(true,Palindrome.pal(343));
	}
}
