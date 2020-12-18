/**
 * Day 4 - Test for Line class
 */
package com.ss.sf.assignments.day_four.test;

// Imports
import com.ss.sf.assignments.day_four.Line;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * @author jme27
 *
 */
public class LineTest {

	// New line instance
	Line newLine = new Line(6, 2, 9, 4);
	// Two lines for parallel test
	Line newLine2 = new Line (3 ,4 ,2 ,4);
	Line newLine3 = new Line (12 ,4 ,18 ,8);

	
	@Test
	public void getSlopeTest() {
		assertEquals( 0.6666666666666666, newLine.getSlope(), 0.0001);
		assertNotEquals( 3, newLine.getSlope(), 0.0001);
	}

	@Test
	public void getDistanceTest() {
		assertEquals( 3.605551275463989, newLine.getDistance(), 0.0001);
		assertNotEquals( 4, newLine.getDistance(), 0.0001);
	}

	@Test
	public void parallelToTest() {
		assertTrue(newLine.parallelTo(newLine3));
		assertFalse(newLine.parallelTo(newLine2));
	}

}
