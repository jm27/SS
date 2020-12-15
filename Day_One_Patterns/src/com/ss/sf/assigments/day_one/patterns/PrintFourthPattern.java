/**
 * 
 */
package com.ss.sf.assigments.day_one.patterns;

/**
 * @author jme27
 *
 */
public class PrintFourthPattern {

	/**
	 * @param args Print Fourth pattern method
	 */
	public static void main(String[] args) {
		// Create variables for rows(i), columns(j) and total rows
		int i;
		int j;
		int m;
		int n;
		int totalRows = 4;
		// Print ellipsis
		System.out.println("............");
		// Outer loop for rows
		for (i = totalRows; i >= 1; i--) {
			// Inner loop for spaces
			for (j = 1; j <= totalRows - i; j++) {
				System.out.print(" ");
			}
			// Inner loop for stars
			for (m = i; m <= 2 * i - 1; m++) {
				System.out.print("*");
			}
			// Inner loop for stars
			for (n = 0; n < i - 1; n++) {
				System.out.print("*");
			}
			// Print new line
			System.out.println();
		}

	}

}
