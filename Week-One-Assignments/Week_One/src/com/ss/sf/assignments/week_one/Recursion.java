/**
 * Week One - Assignments Recursion 
 */
package com.ss.sf.assignments.week_one;

import java.util.Scanner;

/**
 * @author jme27
 *
 */
public class Recursion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Create scanner for user input
		Scanner userInput = new Scanner(System.in);
		int[] listOfNums = { 0, 0, 0, 0, 0 };
		int list = 5;
		int i;
		try {
			// ask user for numbers
			System.out.println("Please enter five numbers: ");
			// Add user input to list of integers
			for (i = 0; i < list; i++) {
				listOfNums[i] = userInput.nextInt();
			}
			System.out.println(recursionExample(0, listOfNums, 14));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			userInput.close();
		}
	}

	// Recursion group numbers and add them
	public static boolean recursionExample(int start, int[] nums, int target) {
		if (target == 0) 
			return true;
		else if (start >= nums.length) // if start is bigger than length of array
			return false;
		else {
			int end = start; // where the end of grouping is
			while (end < nums.length && nums[end] == nums[start])
				end++;
			int length = end - start; // length of grouping
			return recursionExample(end, nums, target) || recursionExample(end, nums, target - nums[start] * length);
		}
	}

}
