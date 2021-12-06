package com.Test_Driven_Devlopment;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_Assert {
	@Test
	private void method1() {

		String s1="Deeparajan";
		String s2="Deepak";
		Assert.assertEquals(s1, s2);
		System.out.println("Verification 1");
       
	}
	@Test
	private void method2() {

		String s1="Deeparajan";
		String s2="Deepak";
		Assert.assertNotEquals(s1, s2);
		System.out.println("Verification 2");
       
	}


}
