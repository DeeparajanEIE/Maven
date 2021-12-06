package com.Step_Defenition1;

import org.openqa.selenium.WebDriver;

import com.BaseClass.BaseClass1;
import com.File_Reader.File_Reader_Manager;
import com.SDP.Page_Object_Manager;
import com.test_Runner1.Test_Runner1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Defenition1 extends BaseClass1 {
	public static WebDriver driver=Test_Runner1.driver;
	public static Page_Object_Manager pom=new Page_Object_Manager(driver);
	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getURL();
		getURL(url);
	}
	
	@When("^user Click The SignIn Button And It Navigates To The Login Page$")
	public void user_Click_The_SignIn_Button_And_It_Navigates_To_The_Login_Page() throws Throwable {
		click(pom.getInstanceHp().getSignin_Btn());
	}
	@When("^user Enter The \"([^\"]*)\" In Email Address Field$")
	public void user_Enter_The_In_Email_Address_Field(String mailId) throws Throwable {
		sendKeys(pom.getInstanceLp().getEmail(), mailId);
	}

	@When("^user Enter The \"([^\"]*)\" In Password Field$")
	public void user_Enter_The_In_Password_Field(String password) throws Throwable {
		sendKeys(pom.getInstanceLp().getPassword(), password);	
	}

	@Then("^user Click The Signin Button And It Navigaes to My Account Page$")
	public void user_Click_The_Signin_Button_And_It_Navigaes_to_My_Account_Page() throws Throwable {
		click(pom.getInstanceLp().getSignin_Btn());
	}

	@When("^user Select The Dress Type$")
	public void user_Select_The_Dress_Type() throws Throwable {
		action("movetoelement", pom.getInstanceMp().getWomen());
	}

	@Then("^user Click The Casual Dresses Button And It Navigates To The casual Dress Page$")
	public void user_Click_The_Casual_Dresses_Button_And_It_Navigates_To_The_casual_Dress_Page() throws Throwable {
		click(pom.getInstanceMp().getCasual_Dress());
	}

	@When("^user ScrollDown And Select The Particular Dress$")
	public void user_ScrollDown_And_Select_The_Particular_Dress() throws Throwable {
		scrollIntoView(pom.getInstanceCp().getPrintedDress());
		action("movetoelement", pom.getInstanceCp().getPrintedDress());
	}

	@Then("^user Click The Add To Cart Button And It Opens A Proceed To CheckOut Page$")
	public void user_Click_The_Add_To_Cart_Button_And_It_Opens_A_Proceed_To_CheckOut_Page() throws Throwable {
		click(pom.getInstanceCp().getAdd_To_Cart_Btn());
	}

	@Then("^user Click The Proceed To CheckOut Button And It Navigates To Order Page$")
	public void user_Click_The_Proceed_To_CheckOut_Button_And_It_Navigates_To_Order_Page() throws Throwable {
		explicitWait(30, pom.getInstanceCp().getProceed_To_Checkout_Btn());
		click(pom.getInstanceCp().getProceed_To_Checkout_Btn());
	}

	@When("^user Increase The Quantity In Quantity Field$")
	public void user_Increase_The_Quantity_In_Quantity_Field() throws Throwable {
		clearTextBox(pom.getInstanceOp().getQuantity_Enter_Box());
		String quantity = File_Reader_Manager.getInstanceFRM().getInstanceCR().getQuantity();
		sendKeys(pom.getInstanceOp().getQuantity_Enter_Box(), quantity);
	}

	@Then("^user Click The Proceed To CheckOut Button And It Navigates To Order Address Page$")
	public void user_Click_The_Proceed_To_CheckOut_Button_And_It_Navigates_To_Order_Address_Page() throws Throwable {
		click(pom.getInstanceOp().getProceed_To_Checkout_Btn());
	}

	@Then("^user Click The Proceed To CheckOut Button And It Navigates To Order Shipping Page$")
	public void user_Click_The_Proceed_To_CheckOut_Button_And_It_Navigates_To_Order_Shipping_Page() throws Throwable {
		click(pom.getInstanceOap().getProceed_To_Checkout_Btn());
	}

	@When("^user Accept The Terms And Condition And Click The Box$")
	public void user_Accept_The_Terms_And_Condition_And_Click_The_Box() throws Throwable {
		click(pom.getInstanceOsp().getAccept_Agreement());
	}

	@Then("^user Click The Proceed To CheckOut Button And It Navigates To Order Payment Page$")
	public void user_Click_The_Proceed_To_CheckOut_Button_And_It_Navigates_To_Order_Payment_Page() throws Throwable {
		click(pom.getInstanceOsp().getProceed_To_Checkout_Btn());
	}

	@Then("^user Click The Pay By Bank Wire Button And It Navigates To The Order Confirm Page$")
	public void user_Click_The_Pay_By_Bank_Wire_Button_And_It_Navigates_To_The_Order_Confirm_Page() throws Throwable {
		click(pom.getInstanceOpp().getPay_By_Bankwire_Btn());
	}

	@Then("^user Click The I Conform My Order button And It Navigates To Confirmation page$")
	public void user_Click_The_I_Conform_My_Order_button_And_It_Navigates_To_Confirmation_page() throws Throwable {
		click(pom.getInstanceCom().getConform_Order_Btn());
	}

	@Then("^user Click The SignOut Button And It Navigates To The Login Page$")
	public void user_Click_The_SignOut_Button_And_It_Navigates_To_The_Login_Page() throws Throwable {
		click(pom.getInstanceSF().getSignOut_Btn());
	}




}
