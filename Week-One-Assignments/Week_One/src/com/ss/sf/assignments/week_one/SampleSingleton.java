/**
 * Week One - Sample Singleton Fix
 */
package com.ss.sf.assignments.week_one;

// Imports
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author jme27
 *
 */
public class SampleSingleton {

	private static Connection conn = null;
	// Add volatile to be able to multiple threads
	private static volatile SampleSingleton instance = null;

	// constructor set private
	private SampleSingleton() {

	}

	/**
	 * get instance double check Lock
	 */
	public static SampleSingleton getInstance() {
		if (instance == null) {
			synchronized (SampleSingleton.class) {
				if (instance == null) {
					instance = new SampleSingleton();
				}
			}
			return instance;
		}
		return instance;

	}

	public static void databaseQuery(BigDecimal input) throws SQLException {
		// Add try catch block
		try {
			conn = DriverManager.getConnection("url of database");
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("Select id from table");
			// Change x to big decimal
			BigDecimal x;
			while (rs.next()) {
				try {
					x = input.multiply(new BigDecimal(rs.getInt(1)));
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// close connection
			conn.close();
		}

	}

}
