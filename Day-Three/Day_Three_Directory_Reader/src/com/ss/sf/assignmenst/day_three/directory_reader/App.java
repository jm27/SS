/**
 * Day Four - Directory and File reader
 */
package com.ss.sf.assignmenst.day_three.directory_reader;

// Imports
import java.io.File;
import java.util.Arrays;

/**
 * @author jme27
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Create new File object, pass the directory to read from
		File directory = new File("Test");
		// Get list of files in string array
		String[] directoryContent = directory.list();
		// Print file content Array as a string
		System.out.println(Arrays.toString(directoryContent));

	}

}
