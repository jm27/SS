/**
 * Guess Random Number Assignment
 */
package com.ss.sf.assigments.day_one.randomNumber;

// Imports
import java.util.Scanner;

/**
 * @author jme27
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Create variables for chances, guess, random integer, difference and get
		// scanner instance
		Scanner scanner = new Scanner(System.in);
		int chances = 5;
		int guess;
		int difference = 0;
		int randInt = (int) Math.round(Math.random() * 100);
		// While loop until chances equal 0
		while (chances > 0) {
			// Ask user for guess between 1 - 100
			System.out.println("Guess a random number between 1-100");
			// Scan guess and save it in variable
			guess = scanner.nextInt();
			// Get the absolute value between guess and random number
			difference = Math.abs(guess - randInt);
			// If guess is within 10 numbers plus or minus from random Integer exit
			if (difference <= 10) {
				System.out.println("Congrats you won! random number is " + randInt);
				scanner.close();
				break;
			}
			// Subtract one chance
			chances--;
			// If no more chances user lost exit
			if (chances == 0) {
				System.out.println("Sorry you lost random number is " + randInt);
				scanner.close();
			}
		}

	}

}
