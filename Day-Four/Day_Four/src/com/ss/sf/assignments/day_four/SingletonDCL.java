/**
 * Day Four - Singleton Double Checked Lock
 */
package com.ss.sf.assignments.day_four;

/**
 * @author jme27
 *
 */
public class SingletonDCL {
	// Local instance
	private static volatile SingletonDCL instance;

	private SingletonDCL() {
	}

	/**
	 * @param args
	 */
	public static SingletonDCL getInstance() {
		// Double check for an instance of singleton class with and without locking
		if (instance == null) {
			synchronized (SingletonDCL.class) {
				if (instance == null)
					instance = new SingletonDCL();
			}
		}
		return instance;
	}

}
