package ch42_03;

import static org.junit.Assert.*;

import org.junit.Test;

public class Exercise6_3Test {

	@Test
	public void testReverse() {
		assertEquals(Exercise6_3.reverse(123), 321);
		assertEquals(Exercise6_3.reverse(123321), 123321);
		assertEquals(Exercise6_3.reverse(1), 1);
	}
	
	@Test
	public void testIsPalindrome() {
		assertFalse(Exercise6_3.isPalindrome(123));
		assertTrue(Exercise6_3.isPalindrome(323));
		assertTrue(Exercise6_3.isPalindrome(1));
	}

}
