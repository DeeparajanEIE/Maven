$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/feature_file/Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel Booking In Adactin Appication",
  "description": "",
  "id": "hotel-booking-in-adactin-appication",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Login Page",
  "description": "",
  "id": "hotel-booking-in-adactin-appication;login-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@Test1"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter The \"\u003cUsername\u003e\" In Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"\u003cPassword\u003e\" In Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click On The Login Button And It Navigates To The Search Hotel Page",
  "keyword": "Then "
});
formatter.examples({
  "line": 8,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-appication;login-page;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 9,
      "id": "hotel-booking-in-adactin-appication;login-page;;1"
    },
    {
      "cells": [
        "Deepak",
        "1234"
      ],
      "line": 10,
      "id": "hotel-booking-in-adactin-appication;login-page;;2"
    },
    {
      "cells": [
        "Deeparajan",
        "Deepak123"
      ],
      "line": 11,
      "id": "hotel-booking-in-adactin-appication;login-page;;3"
    },
    {
      "cells": [
        "Deeparajan",
        "Kuttydeepak@1"
      ],
      "line": 12,
      "id": "hotel-booking-in-adactin-appication;login-page;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 29065400,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Login Page",
  "description": "",
  "id": "hotel-booking-in-adactin-appication;login-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@Test1"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter The \"Deepak\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"1234\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click On The Login Button And It Navigates To The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Defenition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 6726080400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Deepak",
      "offset": 16
    }
  ],
  "location": "Step_Defenition.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 427763400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1234",
      "offset": 16
    }
  ],
  "location": "Step_Defenition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 127055800,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defenition.user_Click_On_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page()"
});
formatter.result({
  "duration": 685538800,
  "status": "passed"
});
formatter.after({
  "duration": 700500,
  "status": "passed"
});
formatter.before({
  "duration": 124100,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Login Page",
  "description": "",
  "id": "hotel-booking-in-adactin-appication;login-page;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@Test1"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter The \"Deeparajan\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"Deepak123\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click On The Login Button And It Navigates To The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Defenition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 312369400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Deeparajan",
      "offset": 16
    }
  ],
  "location": "Step_Defenition.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 164620000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Deepak123",
      "offset": 16
    }
  ],
  "location": "Step_Defenition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 132507300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defenition.user_Click_On_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page()"
});
formatter.result({
  "duration": 412304800,
  "status": "passed"
});
formatter.after({
  "duration": 200900,
  "status": "passed"
});
formatter.before({
  "duration": 161200,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Login Page",
  "description": "",
  "id": "hotel-booking-in-adactin-appication;login-page;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@Test1"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter The \"Deeparajan\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"Kuttydeepak@1\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click On The Login Button And It Navigates To The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Defenition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 290384200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Deeparajan",
      "offset": 16
    }
  ],
  "location": "Step_Defenition.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 304605500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Kuttydeepak@1",
      "offset": 16
    }
  ],
  "location": "Step_Defenition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 104212500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defenition.user_Click_On_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page()"
});
formatter.result({
  "duration": 1098013500,
  "status": "passed"
});
formatter.after({
  "duration": 142300,
  "status": "passed"
});
formatter.before({
  "duration": 158900,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Search Hotel Page",
  "description": "",
  "id": "hotel-booking-in-adactin-appication;search-hotel-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@Test2"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "user Select The Hotel Location",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "user Select The Hotel",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user SelectThe Room Type",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user Select The Number Of Rooms",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user Enter The Check In Date",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user Enter The Check Out Date",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user Select The Adult Per Room",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user Select The Children Per Room",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user Click The Search Button And It Navigates To The Select Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Defenition.user_Select_The_Hotel_Location()"
});
formatter.result({
  "duration": 564481000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defenition.user_Select_The_Hotel()"
});
formatter.result({
  "duration": 293153600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defenition.user_SelectThe_Room_Type()"
});
formatter.result({
  "duration": 337717700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defenition.user_Select_The_Number_Of_Rooms()"
});
formatter.result({
  "duration": 282307600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defenition.user_Enter_The_Check_In_Date()"
});
formatter.result({
  "duration": 255547300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defenition.user_Enter_The_Check_Out_Date()"
});
formatter.result({
  "duration": 162501300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defenition.user_Select_The_Adult_Per_Room()"
});
formatter.result({
  "duration": 249674900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defenition.user_Select_The_Children_Per_Room()"
});
formatter.result({
  "duration": 268587000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defenition.user_Click_The_Search_Button_And_It_Navigates_To_The_Select_Hotel_Page()"
});
formatter.result({
  "duration": 734715100,
  "status": "passed"
});
formatter.after({
  "duration": 104100,
  "status": "passed"
});
formatter.before({
  "duration": 121500,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "Select Hotel Page",
  "description": "",
  "id": "hotel-booking-in-adactin-appication;select-hotel-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 24,
      "name": "@Test3"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "user Click The Continue Button And It Navigates To The Book Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Defenition.user_Click_The_Continue_Button_And_It_Navigates_To_The_Book_Hotel_Page()"
});
formatter.result({
  "duration": 1232054900,
  "status": "passed"
});
formatter.after({
  "duration": 79300,
  "status": "passed"
});
formatter.before({
  "duration": 96900,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "Book Hotel Page",
  "description": "",
  "id": "hotel-booking-in-adactin-appication;book-hotel-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 27,
      "name": "@Test4"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "user Enter The Firstname In FirstName Field",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "user Enter The Lastname In Lastname Field",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "user Enter The Address In Billing Address Field",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "user Enter The Creditcard No In Creditcard No Field",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "user Select The Creditcard Type",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "user Select The Expired Month",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "user Select The Expired Year",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "user Enter The CVV Number In CVV Number Field",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "user Click The Book Now Button And It Navigates To The Booking Confirm Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Defenition.user_Enter_The_Firstname_In_FirstName_Field()"
});
formatter.result({
  "duration": 131255100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defenition.user_Enter_The_Lastname_In_Lastname_Field()"
});
formatter.result({
  "duration": 115637400,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defenition.user_Enter_The_Address_In_Billing_Address_Field()"
});
formatter.result({
  "duration": 140313200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defenition.user_Enter_The_Creditcard_No_In_Creditcard_No_Field()"
});
formatter.result({
  "duration": 130450400,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defenition.user_Select_The_Creditcard_Type()"
});
formatter.result({
  "duration": 348974500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defenition.user_Select_The_Expired_Month()"
});
formatter.result({
  "duration": 259036700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defenition.user_Select_The_Expired_Year()"
});
formatter.result({
  "duration": 268455600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defenition.user_Enter_The_CVV_Number_In_CVV_Number_Field()"
});
formatter.result({
  "duration": 95557400,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defenition.user_Click_The_Book_Now_Button_And_It_Navigates_To_The_Booking_Confirm_Page()"
});
formatter.result({
  "duration": 94319600,
  "status": "passed"
});
formatter.after({
  "duration": 102000,
  "status": "passed"
});
formatter.before({
  "duration": 106700,
  "status": "passed"
});
formatter.scenario({
  "line": 39,
  "name": "Booking Confirm Page",
  "description": "",
  "id": "hotel-booking-in-adactin-appication;booking-confirm-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 38,
      "name": "@Test5"
    }
  ]
});
formatter.step({
  "line": 40,
  "name": "user Click The My Ltenarary Button And It Navigates To BookedItinerary Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Defenition.user_Click_The_My_Ltenarary_Button_And_It_Navigates_To_BookedItinerary_Page()"
});
formatter.result({
  "duration": 7296636500,
  "status": "passed"
});
formatter.after({
  "duration": 89600,
  "status": "passed"
});
formatter.before({
  "duration": 95700,
  "status": "passed"
});
formatter.scenario({
  "line": 42,
  "name": "BookedItinerary Page",
  "description": "",
  "id": "hotel-booking-in-adactin-appication;bookeditinerary-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 41,
      "name": "@Test6"
    }
  ]
});
formatter.step({
  "line": 43,
  "name": "user Click The Logout Button And It Navigates To Logout Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Defenition.user_Click_The_Logout_Button_And_It_Navigates_To_Logout_Page()"
});
formatter.result({
  "duration": 423338700,
  "status": "passed"
});
formatter.after({
  "duration": 77800,
  "status": "passed"
});
});