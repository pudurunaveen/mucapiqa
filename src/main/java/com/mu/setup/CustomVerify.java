package com.mu.setup;

import org.testng.Assert;
import org.testng.Reporter;

public class CustomVerify extends Assert {

	public static boolean ERROR_STATUS = false;

	public static void verifyEquals(String actual, String expected) {

		try {
			Assert.assertEquals(actual, expected);
		} catch (Error e) {
			Reporter.log("Error: " + e.getLocalizedMessage());
			ERROR_STATUS = true;
		}
	}

}
