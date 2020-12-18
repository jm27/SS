/**
 * Day Four - Deadlock Demo
 */
package com.ss.sf.assignments.day_four;

/**
 * @author jme27
 *
 */
public class DeadlockDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Create two strings for deadlock
		final String strOne = "Hello";
		final String strTwo = "World";

		// Create thread One to lock strOne then strTwo
		Thread t1 = new Thread() {
			public void run() {
				synchronized (strOne) {
					System.out.println("Thread 1 locked strOne");

					try {
						Thread.sleep(100);
					} catch (Exception e) {
						e.printStackTrace();
					}

					synchronized (strTwo) {
						System.out.println("Thread 1 locked strTwo");
					}
				}
			}
		};

		// Create thread Two to lock strTwo then strOne
		Thread t2 = new Thread() {
			public void run() {
				synchronized (strTwo) {
					System.out.println("Thread 2 locked strTwo");

					try {
						Thread.sleep(100);
					} catch (Exception e) {
						e.printStackTrace();
					}

					synchronized (strOne) {
						System.out.println("Thread 2 locked strOne");
					}
				}
			}
		};
		
		// Start both threads
		t1.start();
		t2.start();
		
	}

}
