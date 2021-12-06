package com.Test_Driven_Devlopment;
import org.testng.annotations.Test;
public class Grouping_Concept {
	@Test(groups = "Social Media")
	private void facebook() {
		System.out.println("Facebook");
	}
	@Test(groups = "Social Media")
	private void whatsapp() {		
		System.out.println("Whatsapp");
	}
	@Test(groups = "Dress")
	private void women() {
		System.out.println("Women");
	}
	@Test(groups = "Dress")
	private void men() {
		System.out.println("Men");
	}
	@Test(groups = "Book")
	private void Ramayanam() {
		System.out.println("Ramayanam");
	}
	@Test(groups = "Book")
	private void mahabaratham() {
		System.out.println("Mahabaratham");
	}
}
