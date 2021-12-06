package com.Test_Driven_Devlopment;

import org.testng.annotations.Test;

public class Priority_Concept {
	@Test(priority=-1)
	private void setProperty() {
		System.out.println("Set the Properties");
	}

	@Test(priority=0)
	private void browserLaunch() {
		System.out.println("Launch the Browser");
	}

	@Test
	private void getUrl() {
		System.out.println("Get The Url");
	}

	@Test(priority=1)
	private void women() {
		System.out.println("Women Page");
	}
}
