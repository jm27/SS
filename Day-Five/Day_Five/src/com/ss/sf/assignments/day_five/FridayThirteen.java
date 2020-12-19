/**
 * Day 5 - - Date and Time API - Find if given date is Friday 13th
 */
package com.ss.sf.assignments.day_five;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

/**
 * @author jme27
 *
 */
public class FridayThirteen {

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
			// Check if given Month and Year was a Friday 13th
			// Get local date format for input and day of the week to compare
			LocalDate date = LocalDate.of(year, month, 13);
			DayOfWeek day = date.getDayOfWeek();
			// If Friday the 13th print yes else print no and day of the week
			if (day == DayOfWeek.FRIDAY)
				System.out.println("Yep that was a Friday 13th");
			else
				System.out.println("Don't worry not a Friday 13th it actually was " + day + " 13th");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			userInput.close();
		}
	}

}
