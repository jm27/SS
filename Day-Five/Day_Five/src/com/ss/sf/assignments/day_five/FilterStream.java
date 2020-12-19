/**
 * Day 5 - Filter Stream
 */
package com.ss.sf.assignments.day_five;

// Imports
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author jme27
 *
 */
public class FilterStream {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// List of names
		List<String> names = new ArrayList<>();
		names.add("anna");
		names.add("anne");
		names.add("anastasia");
		names.add("ana");
		names.add("Ana");
		names.add("Sarah");
		names.add("ale");
		// Filter by length of 3 and starts with "a"
		// ASCII value character of a is 97
		Stream<String> filteredNamesStream = names.stream().filter(n -> n.length() == 3 && n.charAt(0) == 97);
		// Print each name from stream
		filteredNamesStream.forEach(n -> System.out.println(n));
	}

}
