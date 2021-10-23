package com.core.testTestng;

import org.testng.annotations.Test;

public class AttributeParameterTest {

	@Test()  
	public void testcase1()  
	{  
	System.out.println("HR");  
	}  
	@Test(priority=2)  
	public void testcase2()  
	{  
	System.out.println("Software Developer");  
	}  
	// low value parameter is executed with high importance. -5000 to 5000 is the priority range
	@Test(priority=-50)  
	public void testcase3()  
	{  
	System.out.println("QA Analyst"); 
	}
	@Test()
	public void testcase() {
		System.out.println("All about IT");
	}
}
