package org.institutoserpis.ed;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayTest {

	@Test
	public void menor() {
	assertEquals(5, Array.menor(new int[]{5,9,6,14}));
	assertEquals(3, Array.menor(new int[]{5,9,6,14}));
	assertEquals(7, Array.menor(new int[]{9,8,12,7}));

	}

	@Test
	public void testIndexOf() {
		fail("Not yet implemented");
	}

}
