package com.core.testTestng;

import org.testng.annotations.Test;

public class simpleTest {

	@Test
	public void helloWorld() {
		System.out.println("First TestNG program");
	}
	
	@Test
	public void helloworld2() {
		System.out.println("this will be executed after the first Test annotation");
	}
	
	// with testNG we can create multiple testcases in a single class which are executed in a sequential order
}
