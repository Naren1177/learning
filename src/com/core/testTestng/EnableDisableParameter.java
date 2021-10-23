package com.core.testTestng;

import org.testng.annotations.Test;

public class EnableDisableParameter {
	
	@Test(enabled=false)
	public void enableFalse() {
		System.out.println("enable parameter is false");
	} 
	
	@Test()
	public void runThis() {
		System.out.println("No enable parameter");
	} 
	
}
