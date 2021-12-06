package com.Test_Driven_Devlopment;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Failed_Test {
	@Test
	private void username_Validation() {
		String s1 = "Deeparajan";
		String s2 = "Deepak";
		Assert.assertEquals(s1, s2);
		System.out.println("Verification 1");
	}
	@Test
	private void password_Validation() {
		String s1 = "Deepak@1";
		String s2 = "Deepak@1";
		Assert.assertEquals(s1, s2);
		System.out.println("Verification 1");
	}
}
