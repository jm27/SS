/**
 * 
 */
package com.ss.sf.assignments.day_four;

/**
 * @author jme27
 *
 */
public class Line2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Line newLine = new Line (6 ,2 ,9 ,4);
		Line newLine2 = new Line (3 ,4 ,2 ,4);
		Line newLine3 = new Line (12 ,4 ,18 ,8);
		System.out.println(newLine.parallelTo(newLine3));
	}

}
