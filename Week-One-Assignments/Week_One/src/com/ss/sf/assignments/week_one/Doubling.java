/**
 * Week One Assignments - Doubling
 */
package com.ss.sf.assignments.week_one;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author jme27
 *
 */
public class Doubling {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Create scanner for user input
		Scanner userInput = new Scanner(System.in);
		List<Integer> listOfNums = new ArrayList<Integer>();
		int list = 5;
		int i;
		try {
			// ask user for numbers
			System.out.println("Please enter five numbers: ");
			// Add user input to list of integers
			for (i = 0; i < list; i++) {
				listOfNums.add(userInput.nextInt());
			}
			listOfNums.forEach(n -> System.out.println(timesTwo(n)));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			userInput.close();
		}
	}

	public static Integer timesTwo(Integer number) {
		number = number * 2;
		return number;
	}
}
