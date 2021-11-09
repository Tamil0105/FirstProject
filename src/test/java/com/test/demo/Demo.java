package com.test.demo;

import org.junit.Assert;
import org.testng.annotations.Test;


public class Demo {
	@Test(priority =1, invocationCount =2)
	public void B_verifyDigit() {

		System.out.println("Start test B......");
		int num = 3;
		// assert
		Assert.assertTrue(num > 2);

		// verify
		/*
		 * if(num > 5) {
		 * 
		 * System.out.println("Greater than 5"); }
		 * 
		 * else { System.out.println("less than 5"); }
		 */

		System.out.println("end test B");

	}
	@Test
	public void A_verifyString() {

		System.out.println("start test A.....");

		String actual = "WebDriver";
		String expected = "WebDriver";

		Assert.assertEquals(actual, expected);

		/*
		 * if(actual.equals(expected)) {
		 * 
		 * System.out.println("Both are equal"); }
		 * 
		 * else { System.out.println("Not Equal"); }
		 */

		System.out.println("end test....A");
	}
	@Test(priority =0)
	public void C_verifyInteger() {

		System.out.println("start test C.....");
		int val = 5;
		Assert.assertTrue(val>4);

		/*
		 * if(actual.equals(expected)) {
		 * 
		 * System.out.println("Both are equal"); }
		 * 
		 * else { System.out.println("Not Equal"); }
		 */

		System.out.println("end test....C");
	}

}
