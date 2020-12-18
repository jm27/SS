/**
 * Day 4 - Line class
 */
package com.ss.sf.assignments.day_four;

/**
 * @author jme27
 *
 */
public class Line {
	// Construct a line object
	public Line(double x0, double y0, double x1, double y1) {
		this.x0 = x0;
		this.y0 = y0;
		this.x1 = x1;
		this.y1 = y1;
	}

	// Calculate the slope of the line
	public double getSlope() {
		// Avoid dividing by zero
		if (x1 == x0) {
			throw new ArithmeticException();
		}

		return (y1 - y0) / (x1 - x0);
	}

	// Calculate the distance of the line
	public double getDistance() {
		return Math.sqrt((x1 - x0) * (x1 - x0) + (y1 - y0) * (y1 - y0));
	}

	// return whether a line is parallel to another
	public boolean parallelTo(Line l) {
		if (Math.abs(getSlope() - l.getSlope()) < .0001) {
			return true;
		} else {
			return false;
		}
	}

	// private member data
	private double x0, y0, x1, y1;
}
