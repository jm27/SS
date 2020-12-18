/**
 * Day Four - Producer Consumer Problem
 */
package com.ss.sf.assignments.day_four;

/**
 * @author jme27
 *
 */
public class PCProblem {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		// Create new instance class that has produce and consume methods
		final PC pc = new PC();

		// Create first thread for producer
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					pc.produce();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		});

		// Create Second thread for Consumer
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					pc.consume();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		});

		// Start both threads
		t1.start();
		t2.start();

		// Wait for threads to die
		t1.join();
		t2.join();
	}

	// Method for producing integers into the array and consume or remove integers
	// from array
	public static class PC {
		// Create an array length of 2, shared by producer and consumer
		Integer[] intArray = { 0, 0 };
		int i = 0;

		// Method for producer to push into array
		public void produce() throws InterruptedException {
			int product = 1;
			while (true) {
				synchronized (this) {
					// Call wait method when array is full
					while (intArray[0] == 1 && intArray[1] == 1)
						wait();
					// Insert into array
					for (i = 0; i < intArray.length; i++)
						intArray[i] = product;
					System.out.println("Produced - " + 2);
					System.out.println("p " + intArray[0].toString());
					System.out.println("p " + intArray[1].toString());
					// Notify method to let consumer now it can get elements from array
					notify();
					// and sleep
					Thread.sleep(1000);
				}
			}
		}

		// Method for consumer to remove from array
		public void consume() throws InterruptedException {
			int j;
			while (true) {
				synchronized (this) {
					// Call wait method when array is empty
					while (intArray[0] == 0 && intArray[1] == 0)
						wait();

					// Remove element from array
					for (j = 0; j < intArray.length; j++)
						intArray[j] = 0;
					System.out.println("Consumed - " + 2);
					System.out.println("c " + intArray[0].toString());
					System.out.println("c " + intArray[1].toString());
					// notify method to let producer now it create elements for array
					notify();
					// and sleep
					Thread.sleep(1000);
				}
			}
		}
	}
}
