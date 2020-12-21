/**
 * Week One Assignments - RemoveX's
 */
package com.ss.sf.assignments.week_one;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author jme27
 *
 */
public class RemoveX {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Create scanner for user input
		Scanner userInput = new Scanner(System.in);
		List<String> listOfNums = new ArrayList<String>();
		int list = 5;
		int i;
		try {
			// ask user for numbers
			System.out.println("Please enter five strings: ");
			// Add user input to list of integers
			for (i = 0; i < list; i++) {
				listOfNums.add(userInput.next());
			}
			listOfNums.forEach(s -> System.out.println(noX(s)));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			userInput.close();
		}
	}

	// Replace method on string
	public static String noX(String phrase) {
		return phrase.replace("x", "");
	}

}
