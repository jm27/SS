/**
 * Day 4 - Test for Line class
 */
package com.ss.sf.assignments.day_four.test;

// Imports
import com.ss.sf.assignments.day_four.Line;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author jme27
 *
 */
public class LineTest {

	// New line instance
	Line newLine = new Line(2, 2, 2, 2);

	@SuppressWarnings("deprecation")
	@Test
	public void getSlopeTest() {
		// TODO Auto-generated method stub
		assertEquals( 20, newLine.getSlope());
	}

	@Test
	public void getDistanceTest() {
		// TODO Auto-generated method stub

	}

	@Test
	public void parallelToTest() {
		// TODO Auto-generated method stub

	}

}
