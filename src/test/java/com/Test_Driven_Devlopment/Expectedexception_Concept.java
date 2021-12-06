package com.Test_Driven_Devlopment;

import org.testng.annotations.Test;

public class Expectedexception_Concept {
	@Test(expectedExceptions = NullPointerException.class)
	private void sum() {
		int a=10;
		System.out.println(a/0);

	}

}
