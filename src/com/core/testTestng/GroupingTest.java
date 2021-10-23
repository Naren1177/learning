package com.core.testTestng;

import org.testng.annotations.Test;

public class GroupingTest {

	@Test()
	public void student1() {
		System.out.println("Stdent 1 method");
	}
	@Test
	public void student2() {
		System.out.println("Stdent 2 method");
	}
	@Test
	public void student3() {
		System.out.println("Stdent 3 method");
	}
	@Test(groups= {"Teacher"})
	public void teacher() {
		System.out.println("Teacher  method from gp method1");
	}
}
