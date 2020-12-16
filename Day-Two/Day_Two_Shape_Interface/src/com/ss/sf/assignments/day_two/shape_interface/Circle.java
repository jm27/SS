/**
 * Circle class implement Shape interface
 */
package com.ss.sf.assignments.day_two.shape_interface;

/**
 * @author jme27
 *
 */
public class Circle implements ShapeInt {

	// Variables
	float radius = 3;
	float pi = (float) Math.PI;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Circle circleEx = new Circle();
		circleEx.calculateArea();
		circleEx.display();

	}

	@Override
	public Float calculateArea() {
		float area = pi * (radius * radius);
		System.out.println(area);
		return null;
	}

}
