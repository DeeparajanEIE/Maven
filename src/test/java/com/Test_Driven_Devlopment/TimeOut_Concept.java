package com.Test_Driven_Devlopment;

import org.testng.annotations.Test;

public class TimeOut_Concept {
	@Test(timeOut = 5000)
	private void login() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Get the Browser");
		Thread.sleep(2000);
		System.out.println("Launch the URL");
		Thread.sleep(2000);
		System.out.println("Go to Women Page");
	}
}
// If the timeout time is reached but the test cannot run within the time 
// it throws threadtimeout exception