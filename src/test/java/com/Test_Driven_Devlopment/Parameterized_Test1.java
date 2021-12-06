package com.Test_Driven_Devlopment;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class Parameterized_Test1 {
	@Test
	@Parameters({ "name", "password" })
	private void m1(@Optional("Kutty")String name,
			String password) {
		System.out.println("Name :" + name);
		System.out.println("Password :" + password);
	}
	@BeforeTest
	private void m2() {
		System.out.println("Before Test");
	}

}
