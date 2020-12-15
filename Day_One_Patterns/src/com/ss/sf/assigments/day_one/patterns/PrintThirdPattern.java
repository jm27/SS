/**
 * Class for Third pattern
 */
package com.ss.sf.assigments.day_one.patterns;

/**
 * @author jme27
 *
 */
public class PrintThirdPattern {

	/**
	 * @param args Print Third pattern method
	 */
	public static void main(String[] args) {
		// Create variables for rows(i), columns(j) and total rows
		int i;
		int j;
		int m = 0;
		int totalRows = 4;
		// Outer loop for rows
		for (i = 1; i <= totalRows; i++, m = 0) {
			// Inner loop for spaces
			for (j = 1; j <= totalRows - i; j++) {
				System.out.print(" ");
			}
			// Inner While loop for stars
			while (m != 2 * i - 1) {
				System.out.print("*");
				m++;
			}
			// New line
			System.out.println();
		}
		// Print ellipsis
		System.out.println("...........");

	}

}
