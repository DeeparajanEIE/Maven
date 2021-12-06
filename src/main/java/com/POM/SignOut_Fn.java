package com.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignOut_Fn {
	public WebDriver driver;
	@FindBy(xpath="//a[@class='logout']")
	private WebElement signOut_Btn;
	 public SignOut_Fn(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}	
	public WebElement getSignOut_Btn() {
		return signOut_Btn;
	}

}
