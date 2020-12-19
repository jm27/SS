/**
 * Day Five - Comma Separated String
 */
package com.ss.sf.assignments.day_five;

// Imports
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author jme27
 *
 */
public class OddEven {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Create a scanner for input
		Scanner userInput = new Scanner(System.in);
		// Create list of integers
		List<Integer> numbers = new ArrayList<>();
		int i;
		int list = 5;
		int number;
		try {
			System.out.println("Please enter five numbers: ");
			// Add user input to list of integers
			for (i = 0; i < list; i++) {
				number = userInput.nextInt();
				numbers.add(number);
			}

			// for each number if even return e + number, else return o + number
			numbers.forEach(n -> {
				if (n % 2 == 0) {
					System.out.print("e" + n + ",");
				} else {
					System.out.print("o" + n + ",");
				}
			});
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Close scanner
			userInput.close();
		}
	}

}
