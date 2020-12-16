/**
 * Day two - 2D Array assignment
 */
package com.ss.sf.assignments.day_two.array_2D;

// imports
import java.util.Arrays;

/**
 * @author jme27
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Create 2D array
		int[][] twoDArray = { { 6, 4, 3 }, { 2, 9, 10 }, { 1, 7, 11 }, { 12, 5, 8 } };
		// Create a variable to save the max number initiate with smallest number
		// possible
		int max = Integer.MIN_VALUE;
		// Save index in Array
		int[] indexOfMax = new int[2];
		// Create variables for inner(j) and outer(i) loop
		int i;
		int j;
		// Loop trough 2D array and compare with max
		for (i = 0; i < twoDArray.length; i++) {
			for (j = 0; j < twoDArray[i].length; j++) {
				// if max is less than element store in max and get index
				if (max < twoDArray[i][j]) {
					max = twoDArray[i][j];
					indexOfMax[0] = i;
					indexOfMax[1] = j;
				}
			}
		}
		// Print max number and index
		System.out.println("The biggest number is: " + max);
		System.out.println("The position is: " + Arrays.toString(indexOfMax));
	}

}
