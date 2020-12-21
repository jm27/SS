/**
 * Week One - Right most digit
 */
package com.ss.sf.assignments.week_one;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author jme27
 *
 */
public class RightDigit {

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
			listOfNums.forEach(n -> System.out.println(rightMost(n)));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			userInput.close();
		}
	}

	public static Integer rightMost(Integer number) {
		if (number > 10)
			number = number % 10;
		return number;
	}

}
