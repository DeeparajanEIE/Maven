Feature: Hotel Booking In Adactin Appication
@Test1
Scenario Outline: Login Page
Given user Launch The Application
When user Enter The "<Username>" In Username Field
And user Enter The "<Password>" In Password Field
Then user Click On The Login Button And It Navigates To The Search Hotel Page
Examples:
   |Username|Password|
   |Deepak|1234|
   |Deeparajan|Deepak123|
   |Deeparajan|Kuttydeepak@1| 
@Test2  
Scenario: Search Hotel Page
When user Select The Hotel Location
And user Select The Hotel
And user SelectThe Room Type
And user Select The Number Of Rooms
And user Enter The Check In Date
And user Enter The Check Out Date
And user Select The Adult Per Room
And user Select The Children Per Room
Then user Click The Search Button And It Navigates To The Select Hotel Page
@Test3
Scenario: Select Hotel Page
Then user Click The Continue Button And It Navigates To The Book Hotel Page
@Test4
Scenario: Book Hotel Page
When user Enter The Firstname In FirstName Field
And user Enter The Lastname In Lastname Field
And user Enter The Address In Billing Address Field
And user Enter The Creditcard No In Creditcard No Field
And user Select The Creditcard Type
And user Select The Expired Month
And user Select The Expired Year
And user Enter The CVV Number In CVV Number Field
Then user Click The Book Now Button And It Navigates To The Booking Confirm Page
@Test5
Scenario: Booking Confirm Page
Then user Click The My Ltenarary Button And It Navigates To BookedItinerary Page
@Test6
Scenario: BookedItinerary Page
Then user Click The Logout Button And It Navigates To Logout Page
