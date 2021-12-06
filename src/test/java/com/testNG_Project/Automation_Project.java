package com.testNG_Project;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.BaseClass.BaseClass1;
import com.File_Reader.File_Reader_Manager;
import com.MavenProject.MavenProject1;
import com.SDP.Page_Object_Manager;


public class Automation_Project extends BaseClass1 {
	public static WebDriver driver = BaseClass1.getBrowser("chrome");
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	static Logger log=Logger.getLogger(MavenProject1.class);
@BeforeTest
private void browser_Launch() throws Throwable {
	PropertyConfigurator.configure("log4j.properties");
	implicitWait(30, TimeUnit.SECONDS);
    log.info("Get the URL");
	String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getURL();
	getURL(url);
}
@Test
private void signIn() throws IOException {
	log.info("Click the Signin Button");
	click(pom.getInstanceHp().getSignin_Btn());
	log.info("User Enter the Signin Credentials in Login Page");
	String username = testDataExcel("C:\\Users\\dell\\Desktop\\Automation_Testcase.xlsx", 0, 2, 5);
	sendKeys(pom.getInstanceLp().getEmail(), username);
	String password = testDataExcel("C:\\Users\\dell\\Desktop\\Automation_Testcase.xlsx", 0, 5, 5);
	sendKeys(pom.getInstanceLp().getPassword(), password);
	click(pom.getInstanceLp().getSignin_Btn());
}
@Test(priority=1)
private void dress_Type() {
	log.info("Select the Dress Type in MyAccount Page");
	action("movetoelement", pom.getInstanceMp().getWomen());
	click(pom.getInstanceMp().getCasual_Dress());
}
@Test(priority=2)
private void select_Dress() {
	log.info("Select the Dress in CasualDress page");
	scrollIntoView(pom.getInstanceCp().getPrintedDress());
	action("movetoelement", pom.getInstanceCp().getPrintedDress());
	click(pom.getInstanceCp().getAdd_To_Cart_Btn());
	explicitWait(30, pom.getInstanceCp().getProceed_To_Checkout_Btn());
	click(pom.getInstanceCp().getProceed_To_Checkout_Btn());
}
@Test(priority=3)
private void select_Quantity() throws Throwable {
	log.info("Check the Quantity in Order Page");
	clearTextBox(pom.getInstanceOp().getQuantity_Enter_Box());
	String quantity = File_Reader_Manager.getInstanceFRM().getInstanceCR().getQuantity();
	sendKeys(pom.getInstanceOp().getQuantity_Enter_Box(), quantity);
	click(pom.getInstanceOp().getProceed_To_Checkout_Btn());
}
@Test(priority=4)
private void check_Address() {
	log.info("Check the Address in Order Address Page");
	click(pom.getInstanceOap().getProceed_To_Checkout_Btn());
}
@Test(priority=5)
private void accept_Aggrement() {
	log.info("Accept the Agreement in Order Shipping Page");
	click(pom.getInstanceOsp().getAccept_Agreement());
	click(pom.getInstanceOsp().getProceed_To_Checkout_Btn());
}
@Test(priority=6)
private void payment_Process() {
	log.info("Choose the type of Payment in Order Payment Page");
	click(pom.getInstanceOpp().getPay_By_Bankwire_Btn());
}
@Test(priority=7)
private void confirm_Order() throws Throwable {
	log.info("Conformation in Conform Order Page");
	click(pom.getInstanceCom().getConform_Order_Btn());
	String screenShotName = File_Reader_Manager.getInstanceFRM().getInstanceCR().getScreenShotName();
	takeScreenshot(screenShotName);
}
@AfterTest
private void quit_Browser() {
	quit();
}
}
