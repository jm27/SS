/**
 * Week One - Doubling Test
 */
package com.ss.sf.assignments.week_one.tests;

// Imports 

import com.ss.sf.assignments.week_one.Doubling;
import com.ss.sf.assignments.week_one.RemoveX;
import com.ss.sf.assignments.week_one.RightDigit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

/**
 * @author jme27
 *
 */
public class TestsWeekOne {

	// Create instances of classes
	RemoveX removeX = new RemoveX();

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

}
