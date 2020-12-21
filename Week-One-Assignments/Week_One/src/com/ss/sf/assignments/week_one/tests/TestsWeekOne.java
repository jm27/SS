/**
 * Week One - Doubling Test
 */
package com.ss.sf.assignments.week_one.tests;

// Imports 

import com.ss.sf.assignments.week_one.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * @author jme27
 *
 */
public class TestsWeekOne {

	// Create instances of classes
	RemoveX removeX = new RemoveX();

	// Sample array
	int[] nums = {1,2,4,8,1};

	/**
	 * @param args
	 */
	@Test
	public void removeX() {
		assertEquals("jj", removeX.noX("jxjx"));
		assertNotEquals("jxjx", removeX.noX("jxjx"));
	}

	@Test
	public void rightDigitTest() {
		assertEquals(new Integer(4), RightDigit.rightMost(5884));
		assertNotEquals(new Integer(5), RightDigit.rightMost(5884));
	}

	@Test
	public void doublingTest() {
		assertEquals(new Integer(10), Doubling.timesTwo(5));
		assertNotEquals(new Integer(8), Doubling.timesTwo(5));
	}

	@Test
	public void recursionTest() {
		assertTrue(Recursion.recursionExample(0, nums, 14));
		assertFalse(Recursion.recursionExample(0, nums, 20));
	}

}
