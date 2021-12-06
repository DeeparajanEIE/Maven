package com.Test_Driven_Devlopment;

import org.testng.annotations.Test;

public class Invocation_Count_Concept {
	@Test
	public void URL(){
		System.out.println("URL");	
	}
	@Test(invocationCount=3)
	public void refresh(){
		System.out.println("Refresh");	
	}
	@Test
	public void women(){
		System.out.println("Women");	
	}

}
