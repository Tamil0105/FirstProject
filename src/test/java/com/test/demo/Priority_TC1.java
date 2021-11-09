package com.test.demo;

import org.testng.annotations.Test;

public class Priority_TC1 {

	@Test(priority=1, description = "Test summary")
	public void c_method() {
		System.out.println("I'm in method C");
	}

	@Test(invocationCount=2)
	public void b_method() {
		System.out.println("I'm in method B");
	}

	@Test(priority=2)
	public void a_method() {
		System.out.println("I'm in method A");
	}

	@Test(enabled = false)
	public void e_method() {
		System.out.println("I'm in method E");
	}

	@Test
	public void d_method() {
		System.out.println("I'm in method D");
	}

}
