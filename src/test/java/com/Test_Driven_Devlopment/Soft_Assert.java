package com.Test_Driven_Devlopment;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class Soft_Assert {
	@Test
	private void method1() {
		String s1 = "Deeparajan";
		String s2 = "Deepak";
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(s1, s2);
		System.out.println("Verification 1");
	}
	@Test
	private void method2() {
		String s1 = "Deeparajan";
		String s2 = "Deepak";
		SoftAssert soft = new SoftAssert();
		soft.assertNotEquals(s1, s2);
		System.out.println("Verification 2");
	}
}
