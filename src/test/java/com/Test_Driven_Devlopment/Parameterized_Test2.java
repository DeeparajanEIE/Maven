package com.Test_Driven_Devlopment;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Test2 {
	@Test
	@Parameters({ "username", "pass" })
	private void m1(String username, String pass) {
		System.out.println("Name :" + username);
		System.out.println("Password :" + pass);
	}
	@AfterTest
	private void m2() {
		System.out.println("After Test");
	}

}
