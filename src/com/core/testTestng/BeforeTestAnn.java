package com.core.testTestng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeTestAnn {

	@Test
	public void EnterCred() {

		System.out.println("Enter login Credentails");
	}

	@Test
	public void clickLogin() {

		System.out.println("Click Login");
	}

	@BeforeTest
	public void launchApp() {

		System.out.println("Launch Application URL - BeforeTest annotation");
	}

	@Test
	public void VerifyLoginScreen() {

		System.out.println("Login screen is loaded");
	}
}
