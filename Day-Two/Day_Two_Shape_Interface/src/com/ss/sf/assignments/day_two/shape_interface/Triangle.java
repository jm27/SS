/**
 * Triangle class implement Shape interface
 */
package com.ss.sf.assignments.day_two.shape_interface;

/**
 * @author jme27
 *
 */
public class Triangle implements ShapeInt {

	// Variables
	float base = 3;
	float height = 2;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle triangleEx = new Triangle();
		triangleEx.calculateArea();
		triangleEx.display();
	}

	@Override
	public Float calculateArea() {
		float area = (height * base) / 2;
		System.out.println(area);
		return null;
	}

}
