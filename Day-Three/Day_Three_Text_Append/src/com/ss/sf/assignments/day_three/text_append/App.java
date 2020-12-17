/**
 * Day Three - Text append
 */
package com.ss.sf.assignments.day_three.text_append;

//Imports
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author jme27
 *
 */
public class App {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// Initiate FileWriter class instance
		FileWriter text = null;
		try {
			// Second parameter tells to append file
			text = new FileWriter("Test/test1.txt", true);
			// Append text to file
			text.write("Helloo World \n");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (text != null)
					text.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
