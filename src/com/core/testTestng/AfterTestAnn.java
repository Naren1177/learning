package com.core.testTestng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class AfterTestAnn {
	

	@AfterTest
	public void closeApp() {

		System.out.println("Close the Application  - AfterTest annotation");
	}

	@Test
	public void logoutApp() {
		
		System.out.println("Logout of application");
	}

}
