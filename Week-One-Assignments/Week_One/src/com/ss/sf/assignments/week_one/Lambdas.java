/**
 * Week One - Lambdas
 */
package com.ss.sf.assignments.week_one;

import java.util.Scanner;
//imports
import java.util.function.Function;

/**
 * @author jme27
 *
 */
public class Lambdas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Scanner instance
		Scanner userInput = new Scanner(System.in);
		int[] userNumbers = { 0, 0 };
		// Create Functions instances that take in an Integer and return the lambda
		// function
		// which returns a String
		Function<Integer, String> isOdd = isOdd();
		Function<Integer, String> isPrime = isPrime();
		Function<Long, String> isPalindrome = isPalindrome();
		try {
			do {
				// Ask user for input
				System.out.println("Please enter two numbers in this format n n, "
						+ "for the first number enter 1 to check if number is odd,\r\\n "
						+ "2 to check if number is prime, " + "and three to check if number is a palindrome,\r\n"
						+ " next enter the number to check");
				// Get numbers
				userNumbers[0] = userInput.nextInt();
				userNumbers[1] = userInput.nextInt();

				// Switch Statement for user input first number
				switch (userNumbers[0]) {
				// If 1 check if odd , 2 check if prime, 3 check if palindrome;
				case 1:
					System.out.println(isOdd.apply(userNumbers[1]));
					break;
				case 2:
					System.out.println(isPrime.apply(userNumbers[1]));
					break;
				case 3:
					System.out.println(isPalindrome.apply((long) userNumbers[1]));
					break;
				default:
					break;
				}

			} while (userNumbers[0] > 3);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			userInput.close();
		}
	}

	// Method for checking if number is odd
	public static Function<Integer, String> isOdd() {
		return n -> {
			if (n % 2 != 0)
				return "Odd";
			else
				return "Even";
		};
	}

	// Method for checking if number is prime
	public static Function<Integer, String> isPrime() {
		return n -> {
			if (n % 2 != 0 || n == 2 || n == 1)
				return "Prime";
			else
				return "Composite";
		};

	}

	// Method for checking if number is a Palindrome
	public static Function<Long, String> isPalindrome() {
		return n -> {
			long nPalindrome = 0;
			long numEmpty;
			long numClone = n;
			while (numClone > 0) {

				numEmpty = numClone % 10;
				nPalindrome = nPalindrome * 10 + numEmpty;
				numClone = numClone / 10;
			}
			if (nPalindrome == n)
				return "Palindrome";
			else
				return "Not a Palindrome";
		};
	}
}
