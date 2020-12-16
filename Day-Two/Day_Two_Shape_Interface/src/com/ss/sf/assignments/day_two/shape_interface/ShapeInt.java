/**
 * Day two Assignment - Shape interface
 */
package com.ss.sf.assignments.day_two.shape_interface;

/**
 * @author jme27
 *
 */
public interface ShapeInt {

	/**
	 * Methods
	 */
	Float calculateArea();

	default Float display() {
		System.out.println(3 * 3);
		return null;
	}
}
