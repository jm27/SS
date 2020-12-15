/**
 * Class for printing second pattern
 */
package com.ss.sf.assigments.day_one.patterns;

/**
 * @author jme27
 *
 */
public class PrintSecondPattern {

	/**
	 * @param args Print Second pattern method
	 */
	public static void main(String[] args) {
		// Create variables for rows(i), columns(j) and total rows
		int i;
		int j;
		int totalRows = 4;
		// Print ellipsis
		System.out.println("..........");
		// Outer loop for rows
		for (i = totalRows - 1; i >= 0; i--) {
			// Inner loop for columns
			for (j = 0; j <= i; j++) {
				// Print stars
				System.out.print("*");
			}
			// Print new line
			System.out.println();
		}

	}

}