package com.Test_Driven_Devlopment;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Parallel_Testing_concept {
	public WebDriver driver;
	@BeforeMethod
	private WebDriver browserlaunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dell\\eclipse-workspace\\MavenProject\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	@Test
	private void url() {
		driver.get("https://www.facebook.com/");
	}
	@Test
	private void url1() {
		driver.get("https://www.whatsapp.com/");
	}
	@Test
	private void url2() {
		driver.get("https://www.instagram.com/");
	}
	@AfterMethod
	private void quit() {
		driver.quit();
	}
}
