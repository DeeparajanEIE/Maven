package com.Test_Driven_Devlopment;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_Class implements IRetryAnalyzer{
	int start=1;
	int end =5;

	public boolean retry(ITestResult result) {
		if(start<=end) {
			start++;
			// Invoke the failed test methods
			return true;
		}
		// Exit fromthe method
		return false;
	}

}
