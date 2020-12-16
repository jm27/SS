/**
 * Rectangle class implement Shape interface
 */
package com.ss.sf.assignments.day_two.shape_interface;

/**
 * @author jme27
 *
 */
public class Rectangle implements ShapeInt {

	// Variables
	float width = 10;
	float height = 12;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectEx = new Rectangle();
		rectEx.calculateArea();
		rectEx.display();
	}

	@Override
	public Float calculateArea() {
		float area = width * height;
		System.out.println(area);
		return null;
	}

}
