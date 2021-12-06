package com.Test_Driven_Devlopment;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider_Concept {
	@DataProvider
	private Object[][] data() {
		return new Object[][] {
			{"Deepak","Deepak@123"},
			{"Kutty","12345"},{"Deeparajan","dee@134"}
		};
	}
	@Test(dataProvider = "data")
	private void credentials(String username,String password) {
		
		System.out.println("Username :"+username);
		System.out.println("Password :"+password);

	}
	@BeforeClass
	private void url() {
       System.out.println("url launch");
	}
}
