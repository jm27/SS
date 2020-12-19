/**
 * 
 */
package com.ss.sf.assignments.day_five;

// Imports
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author jme27
 *
 */
public class BasicLambdas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create an Array with strings
		String[] words = { "hello", "goodbye", "ant", "hi", "work", "happy", "coding" };

		// Sort by length(Shortest to longest)
		Arrays.sort(words, (String a, String b) -> a.length() - b.length());
		System.out.println(Arrays.toString(words));

		// Sort by length reversed(Longest to shortest)
		Arrays.sort(words, (String a, String b) -> b.length() - a.length());
		System.out.println(Arrays.toString(words));

		// Sort Alphabetically
		Arrays.sort(words, (String a, String b) -> a.charAt(0) - b.charAt(0));
		System.out.println(Arrays.toString(words));

		// Sort by words that contain letter "e"
		Arrays.sort(words, Comparator.comparingInt(a -> (a.contains("E") || a.contains("e") ? 0 : 1)));
		System.out.println(Arrays.toString(words));
	}

}
