/**
 * Day two - CLI commands assignment
 */
package com.ss.sf.assignments.day_two.CLI_values;

/**
 * @author jme27
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// If there are CLI arguments
		if (args.length > 0) {
			// Create String builder to add CLI arguments
			StringBuilder argumentsSum = new StringBuilder();
			// loop trough each argument using for each loop and append to String Builder
			for (String arg : args) {
				argumentsSum.append(arg + " ");
			}
			// Print result
			System.out.println(argumentsSum);
		}
		// No arguments present
		else {
			System.out.println("No arguments, please provide some arguments");
		}
	}
}
