package com.test_Runner1;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.BaseClass.BaseClass1;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		features="src\\test\\java\\com\\feature_file\\Automation.feature",
		glue="com.Step_Defenition1",
		monochrome=true,
		dryRun=false,
		strict=true,
		tags=("~@Test10"),
				plugin = {"html:Report/HTML1",
						"json:Report/JSON1.json",
						"pretty",
						"com.cucumber.listener.ExtentCucumberFormatter:Report/Extent1.html"
						}
		)


public class Test_Runner1 {
		public static WebDriver driver;
		@BeforeClass
		public static void set_Up() {
			driver=BaseClass1.getBrowser("Chrome");		
		}
		@AfterClass
		public static void tear_Down() {
			BaseClass1.quit();			
		}
}
