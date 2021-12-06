package com.test_Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.BaseClass.BaseClass1;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions
(
		features = "src\\test\\java\\com\\feature_file\\Adactin.feature",
		glue = "com.step_Defenition",
		monochrome = true,
		dryRun=false,
		strict=true,
		//tags=("~@Test6"),
		plugin = {"html:Report/HTML",
				"json:Report/JSON.json",
				"pretty",
				"com.cucumber.listener.ExtentCucumberFormatter:Report/Extent.html"
		}
		
		)
public class Test_Runner {
	public static WebDriver driver;
	@BeforeClass
	public static void set_UP() {
		driver=BaseClass1.getBrowser("chrome");	
	}
	@AfterClass
	public static void tear_Down() {
	BaseClass1.quit();
	}

}
