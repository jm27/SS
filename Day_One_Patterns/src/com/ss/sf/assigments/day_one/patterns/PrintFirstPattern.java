/**
 * Class for printing first pattern
 */
package com.ss.sf.assigments.day_one.patterns;

/**
 * @author jme27
 *
 */
public class PrintFirstPattern {

	/**
	 * @param args Print first pattern method
	 */
	public static void main(String[] args) {
		// Create variables for rows(i), columns(j) and total rows
		int i;
		int j;
		int totalRows = 4;
		// Outer loop for rows
		for (i = 0; i < totalRows; i++) {
			// Inner loop for columns
			for (j = 0; j <= i; j++) {
				// Print stars
				System.out.print("*");
			}
			System.out.println();
		}
		// Print ellipsis
		System.out.println(".........");
	}

}
