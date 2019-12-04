package ch42_03;

import static org.junit.Assert.*;

import org.junit.Test;

public class Exercise06_31Test {

	@Test
	public void testIsValid() {
		assertTrue(Exercise06_31.isValid(379354508162306L));
		assertTrue(Exercise06_31.isValid(371449635398431L));
		assertTrue(Exercise06_31.isValid(4012888888881881L));
		assertFalse(Exercise06_31.isValid(371111111111L)); // Size 12. Testing getSize(number) >= 13.
		assertFalse(Exercise06_31.isValid(37111111111111111L)); // Size 17. Testing getSize(number) <= 16.
		assertFalse(Exercise06_31.isValid(4111111111111L)); // Prefix 4. Testing prefixMatched(number, 4).
		assertFalse(Exercise06_31.isValid(5111111111111L)); // Prefix 5. Testing prefixMatched(number, 5).
		assertFalse(Exercise06_31.isValid(6111111111111L)); // Prefix 6. Testing prefixMatched(number, 6).
		assertFalse(Exercise06_31.isValid(37111111111111L)); // Prefix 37. Testing prefixMatched(number, 37).
		assertFalse(Exercise06_31.isValid(371449635398432L)); // One number off from line 12 number. Testing sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0;
	}
	
	@Test
	public void testSumOfDoubleEvenPlace() {
		assertEquals(Exercise06_31.sumOfDoubleEvenPlace(379354508162306L), 25);
		assertEquals(Exercise06_31.sumOfDoubleEvenPlace(371449635398431L), 47);
		assertEquals(Exercise06_31.sumOfDoubleEvenPlace(4012888888881881L), 47);
	}
	
	@Test
	public void testGetDigit() {
		assertEquals(Exercise06_31.getDigit(4), 4);
		assertEquals(Exercise06_31.getDigit(37), 10);
		assertEquals(Exercise06_31.getDigit(99), 18);
	}
	
	@Test
	public void testSumOfOddPlace() {
		assertEquals(Exercise06_31.sumOfOddPlace(379354508162306L), 45);
		assertEquals(Exercise06_31.sumOfOddPlace(371449635398431L), 33);
		assertEquals(Exercise06_31.sumOfOddPlace(4012888888881881L), 43);
	}
	
	@Test
	public void testPrefixMatched() {
		assertTrue(Exercise06_31.isValid(379354508162306L));
		assertTrue(Exercise06_31.isValid(371449635398431L));
		assertTrue(Exercise06_31.isValid(4012888888881881L));
	}
	
	@Test
	public void testGetSize() {
		assertEquals(Exercise06_31.getSize(379354508162306L), 15);
		assertEquals(Exercise06_31.getSize(371449635398431L), 15);
		assertEquals(Exercise06_31.getSize(4012888888881881L), 16);
	}
	
	@Test
	public void testGetPrefix() {
		assertEquals(Exercise06_31.getPrefix(379354508162306L, 2), 37);
		assertEquals(Exercise06_31.getPrefix(371449635398431L, 2), 37);
		assertEquals(Exercise06_31.getPrefix(4012888888881881L, 1), 4);
	}
}
