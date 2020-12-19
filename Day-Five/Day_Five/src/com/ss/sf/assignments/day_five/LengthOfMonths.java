/**
 * Day 5 - Date and Time API - Length of months
 */
package com.ss.sf.assignments.day_five;

import java.time.YearMonth;
import java.util.Scanner;

/**
 * @author jme27
 *
 */
public class LengthOfMonths {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Create variables for user input, year and month
		Scanner userInput = new Scanner(System.in);
		int year;
		int month;
		try {
			do {
				System.out.println("Please enter a year in this format YYYY");
				year = userInput.nextInt();
				System.out.println("Please enter a month in this format MM");
				month = userInput.nextInt();
			} while (year > 9999 || month > 12);
			// Get the number of days in that month
			YearMonth yearMonthObject = YearMonth.of(year, month);
			int daysInMonth = yearMonthObject.lengthOfMonth();
			System.out.println(daysInMonth);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			userInput.close();
		}

	}

}
