package ch42_03;

import static org.junit.Assert.*;

import org.junit.Test;

public class Exercise6_37Test {

	@Test
	public void testFormat() {
		assertEquals(Exercise6_37.format(52, 4), "0052");
		assertEquals(Exercise6_37.format(52, 1), "52");
		assertEquals(Exercise6_37.format(123733, 10), "0000123733");
	}

}
