package com.step_Defenition;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.BaseClass.BaseClass1;
import com.File_Reader.File_Reader_Manager;
import com.SDP.Page_Object_ManagerAdactin;
import com.test_Runner.Test_Runner;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Defenition extends BaseClass1{
	public static WebDriver driver=Test_Runner.driver;
	public static Page_Object_ManagerAdactin pom1 = new Page_Object_ManagerAdactin(driver);
	@Before
	public void beforeHooks(Scenario s) {
		String name = s.getName();
		System.out.println("Name : "+name);		
	}
	@After
	public void afterHook(Scenario s) throws IOException {
		if(s.isFailed()) {
			takeScreenshot("snap");
		}
		String status = s.getStatus();
		System.out.println("Status : "+status);
	}
	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
		String url1 = File_Reader_Manager.getInstanceFRM().getInstanceCR().getURL1();
		getURL(url1);
	}
	@When("^user Enter The \"([^\"]*)\" In Username Field$")
	public void user_Enter_The_In_Username_Field(String username) throws Throwable {
		sendKeys(pom1.getInstance_ReservationPage().getUsename(), username);
	}

	@When("^user Enter The \"([^\"]*)\" In Password Field$")
	public void user_Enter_The_In_Password_Field(String password) throws Throwable {
		sendKeys(pom1.getInstance_ReservationPage().getPassword(), password);
	}

	@Then("^user Click On The Login Button And It Navigates To The Search Hotel Page$")
	public void user_Click_On_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page() throws Throwable {
		click(pom1.getInstance_ReservationPage().getLogin_Btn());
	}

	@When("^user Select The Hotel Location$")
	public void user_Select_The_Hotel_Location() throws Throwable {
		click(pom1.getInstace_SearchPage().getSelect_Location());
		dropDown(pom1.getInstace_SearchPage().getSelect_Location(), "byvalue", "New York");
	}

	@When("^user Select The Hotel$")
	public void user_Select_The_Hotel() throws Throwable {
		click(pom1.getInstace_SearchPage().getSelect_Hotel());
		dropDown(pom1.getInstace_SearchPage().getSelect_Hotel(), "byvisibletext", "Hotel Creek");
	}

	@When("^user SelectThe Room Type$")
	public void user_SelectThe_Room_Type() throws Throwable {
		click(pom1.getInstace_SearchPage().getSelect_Roomtype());
		dropDown(pom1.getInstace_SearchPage().getSelect_Roomtype(), "byindex", "3");
	}

	@When("^user Select The Number Of Rooms$")
	public void user_Select_The_Number_Of_Rooms() throws Throwable {
		click(pom1.getInstace_SearchPage().getSelect_NumberOfRooms());
		dropDown(pom1.getInstace_SearchPage().getSelect_NumberOfRooms(), "byvalue", "3");
	}

	@When("^user Enter The Check In Date$")
	public void user_Enter_The_Check_In_Date() throws Throwable {
		clearTextBox(pom1.getInstace_SearchPage().getCheck_In_Date());
		String inDate = File_Reader_Manager.getInstanceFRM().getInstanceCR().getInDate();
		sendKeys(pom1.getInstace_SearchPage().getCheck_In_Date(), inDate);
	}

	@When("^user Enter The Check Out Date$")
	public void user_Enter_The_Check_Out_Date() throws Throwable {
		clearTextBox(pom1.getInstace_SearchPage().getCheck_Out_Date());
		String outDate = File_Reader_Manager.getInstanceFRM().getInstanceCR().getOutDate();
		sendKeys(pom1.getInstace_SearchPage().getCheck_Out_Date(), outDate);
	}

	@When("^user Select The Adult Per Room$")
	public void user_Select_The_Adult_Per_Room() throws Throwable {
		click(pom1.getInstace_SearchPage().getSelect_AdultPerRoom());
		dropDown(pom1.getInstace_SearchPage().getSelect_AdultPerRoom(), "byindex", "1");
	}

	@When("^user Select The Children Per Room$")
	public void user_Select_The_Children_Per_Room() throws Throwable {
		click(pom1.getInstace_SearchPage().getSelect_ChildrenPerRoom());
		dropDown(pom1.getInstace_SearchPage().getSelect_ChildrenPerRoom(), "byindex", "0");
	}

	@Then("^user Click The Search Button And It Navigates To The Select Hotel Page$")
	public void user_Click_The_Search_Button_And_It_Navigates_To_The_Select_Hotel_Page() throws Throwable {
		click(pom1.getInstace_SearchPage().getSearch_Btn());
	}

	@Then("^user Click The Continue Button And It Navigates To The Book Hotel Page$")
	public void user_Click_The_Continue_Button_And_It_Navigates_To_The_Book_Hotel_Page() throws Throwable {
		click(pom1.getINstance_SelectionPage().getSelect_HotelBtn());
		click(pom1.getINstance_SelectionPage().getCotinue_Btn());
	}

	@When("^user Enter The Firstname In FirstName Field$")
	public void user_Enter_The_Firstname_In_FirstName_Field() throws Throwable {
		String firstName = File_Reader_Manager.getInstanceFRM().getInstanceCR().getFirstName();
		sendKeys(pom1.getInstance_BookingPage().getFirst_Name(), firstName);
	}

	@When("^user Enter The Lastname In Lastname Field$")
	public void user_Enter_The_Lastname_In_Lastname_Field() throws Throwable {
		String lastName = File_Reader_Manager.getInstanceFRM().getInstanceCR().getLastName();
		sendKeys(pom1.getInstance_BookingPage().getLast_Name(), lastName);
	}

	@When("^user Enter The Address In Billing Address Field$")
	public void user_Enter_The_Address_In_Billing_Address_Field() throws Throwable {
		String address = File_Reader_Manager.getInstanceFRM().getInstanceCR().getAddress();
		sendKeys(pom1.getInstance_BookingPage().getBilling_Address(), address);
	}

	@When("^user Enter The Creditcard No In Creditcard No Field$")
	public void user_Enter_The_Creditcard_No_In_Creditcard_No_Field() throws Throwable {
		String ccNumber = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCCNumber();
		sendKeys(pom1.getInstance_BookingPage().getCc_Number(), ccNumber);
	}

	@When("^user Select The Creditcard Type$")
	public void user_Select_The_Creditcard_Type() throws Throwable {
		click(pom1.getInstance_BookingPage().getSelect_CC_Type());
		dropDown(pom1.getInstance_BookingPage().getSelect_CC_Type(), "byindex", "3");
	}

	@When("^user Select The Expired Month$")
	public void user_Select_The_Expired_Month() throws Throwable {
		click(pom1.getInstance_BookingPage().getSelect_ExpMonth());
		dropDown(pom1.getInstance_BookingPage().getSelect_ExpMonth(), "byvisibletext", "December");
	}

	@When("^user Select The Expired Year$")
	public void user_Select_The_Expired_Year() throws Throwable {
		click(pom1.getInstance_BookingPage().getSelect_ExpYear());
		dropDown(pom1.getInstance_BookingPage().getSelect_ExpYear(), "byvalue", "2022");
	}

	@When("^user Enter The CVV Number In CVV Number Field$")
	public void user_Enter_The_CVV_Number_In_CVV_Number_Field() throws Throwable {
		String cvvNumber = File_Reader_Manager.getInstanceFRM().getInstanceCR().getCVVNumber();
		sendKeys(pom1.getInstance_BookingPage().getCvv_Number(), cvvNumber);
	}

	@Then("^user Click The Book Now Button And It Navigates To The Booking Confirm Page$")
	public void user_Click_The_Book_Now_Button_And_It_Navigates_To_The_Booking_Confirm_Page() throws Throwable {
		click(pom1.getInstance_BookingPage().getBook_NowBtn());
	}

	@Then("^user Click The My Ltenarary Button And It Navigates To BookedItinerary Page$")
	public void user_Click_The_My_Ltenarary_Button_And_It_Navigates_To_BookedItinerary_Page() throws Throwable {
		explicitWait(30, pom1.getInstance_ConformPage().getMy_ltinerary_Btn());
		click(pom1.getInstance_ConformPage().getMy_ltinerary_Btn());
	}

	@Then("^user Click The Logout Button And It Navigates To Logout Page$")
	public void user_Click_The_Logout_Button_And_It_Navigates_To_Logout_Page() throws Throwable {
		click(pom1.getInstance_LogoutPage().getLogout_Btn());
	}



}
