/**
 * Day Three - Character counter
 */
package com.ss.sf.assignments.day_three.char_counter;

//Imports
import java.io.File;
import java.io.FileNotFoundException;
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
		// File instance, Scanner for input, Scanner for file Counter, user input
		File file = new File("Test/test1.txt");
		Scanner scanInput = new Scanner(System.in);
		Scanner scanFile = null;
		int counter = 0;
		int i;
		String userInput = null;
		char userInputCharacter;

		try {
			scanFile = new Scanner(file);

			do {
				// Get one character from user
				System.out.println("Please enter one character: ");
				userInput = scanInput.next();
			} while (userInput.length() > 1);
			userInputCharacter = userInput.charAt(0);
			// Loop trough text
			while (scanFile.hasNextLine()) {
				String line = scanFile.nextLine();
				for (i = 0; i < line.length(); i++)
					// Loop trough lines if character is equal counter adds 1
					if (line.charAt(i) == userInputCharacter)
						counter++;
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (scanFile != null)
				scanFile.close();
			scanInput.close();
		}

		System.out.println("There are " + counter + " " + userInput + " in this text");
	}

}
