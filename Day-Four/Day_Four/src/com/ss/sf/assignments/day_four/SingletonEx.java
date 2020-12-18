/**
 * 
 */
package com.ss.sf.assignments.day_four;

/**
 * @author jme27
 *
 */
public class SingletonEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Threads
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				SingletonDCL singletonDCL1 = SingletonDCL.getInstance();
				System.out.println(singletonDCL1.hashCode());
			}

		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				SingletonDCL singletonDCL2 = SingletonDCL.getInstance();
				System.out.println(singletonDCL2.hashCode());
			}

		});
		
		t1.start();
		t2.start();
	}

}
