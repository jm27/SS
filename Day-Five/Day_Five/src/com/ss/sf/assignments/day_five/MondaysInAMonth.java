/**
 * Day 5 - Date and Time API - Mondays in a month
 */
package com.ss.sf.assignments.day_five;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

/**
 * @author jme27
 *
 */
public class MondaysInAMonth {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
			// Get the number of Mondays in that month
			int count = countDayOccurenceInMonth(DayOfWeek.MONDAY, YearMonth.of(year, month));
			System.out.println(count); // prints 5
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			userInput.close();
		}

	}

	// Method to get the number of given day of week in a month
	public static int countDayOccurenceInMonth(DayOfWeek dow, YearMonth month) {
		LocalDate start = month.atDay(1).with(TemporalAdjusters.nextOrSame(dow));
		return (int) ChronoUnit.WEEKS.between(start, month.atEndOfMonth()) + 1;
	}
}
