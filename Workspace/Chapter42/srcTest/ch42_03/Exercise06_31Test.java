package ch42_03;

import static org.junit.Assert.*;

import org.junit.Test;

public class Exercise06_31Test {

	@Test
	public void testIsValid() {
		assertTrue(Exercise06_31.isValid(379354508162306L));
		assertTrue(Exercise06_31.isValid(371449635398431L));
		assertTrue(Exercise06_31.isValid(4012888888881881L));
	}
	
	@Test
	public void testSumOfDoubleEvenPlace() {
		assertEquals(Exercise06_31.sumOfDoubleEvenPlace(379354508162306L), 25);
		assertEquals(Exercise06_31.sumOfDoubleEvenPlace(371449635398431L), 38);
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
