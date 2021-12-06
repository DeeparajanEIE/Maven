$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/feature_file/Automation.feature");
formatter.feature({
  "line": 1,
  "name": "Dress Purchase In Automation Practice Application",
  "description": "",
  "id": "dress-purchase-in-automation-practice-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "My Store Page",
  "description": "",
  "id": "dress-purchase-in-automation-practice-application;my-store-page",
  "type": "scenario",
  "keyword": "Scenario",
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
  "name": "user Click The SignIn Button And It Navigates To The Login Page",
  "keyword": "When "
});
formatter.match({
  "location": "Step_Defenition1.user_Launch_The_Application()"
});
formatter.result({
  "duration": 49575499200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defenition1.user_Click_The_SignIn_Button_And_It_Navigates_To_The_Login_Page()"
});
formatter.result({
  "duration": 8491447200,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Login Page",
  "description": "",
  "id": "dress-purchase-in-automation-practice-application;login-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@Test2"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "user Enter The \"kutydeepak@gmail.com\" In Email Address Field",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user Enter The \"deepak111\" In Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user Click The Signin Button And It Navigaes to My Account Page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "kutydeepak@gmail.com",
      "offset": 16
    }
  ],
  "location": "Step_Defenition1.user_Enter_The_In_Email_Address_Field(String)"
});
formatter.result({
  "duration": 253929500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "deepak111",
      "offset": 16
    }
  ],
  "location": "Step_Defenition1.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 260360301,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defenition1.user_Click_The_Signin_Button_And_It_Navigaes_to_My_Account_Page()"
});
formatter.result({
  "duration": 5014681599,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "My Account Page",
  "description": "",
  "id": "dress-purchase-in-automation-practice-application;my-account-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@Test3"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "user Select The Dress Type",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "user Click The Casual Dresses Button And It Navigates To The casual Dress Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Defenition1.user_Select_The_Dress_Type()"
});
formatter.result({
  "duration": 307916999,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defenition1.user_Click_The_Casual_Dresses_Button_And_It_Navigates_To_The_casual_Dress_Page()"
});
formatter.result({
  "duration": 13131648000,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Cassual Dress Page",
  "description": "",
  "id": "dress-purchase-in-automation-practice-application;cassual-dress-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@Test4"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "user ScrollDown And Select The Particular Dress",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "user Click The Add To Cart Button And It Opens A Proceed To CheckOut Page",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "user Click The Proceed To CheckOut Button And It Navigates To Order Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Defenition1.user_ScrollDown_And_Select_The_Particular_Dress()"
});
formatter.result({
  "duration": 249151800,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defenition1.user_Click_The_Add_To_Cart_Button_And_It_Opens_A_Proceed_To_CheckOut_Page()"
});
formatter.result({
  "duration": 122163800,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defenition1.user_Click_The_Proceed_To_CheckOut_Button_And_It_Navigates_To_Order_Page()"
});
formatter.result({
  "duration": 9270425000,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Order Page",
  "description": "",
  "id": "dress-purchase-in-automation-practice-application;order-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 20,
      "name": "@Test5"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "user Increase The Quantity In Quantity Field",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "user Click The Proceed To CheckOut Button And It Navigates To Order Address Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Defenition1.user_Increase_The_Quantity_In_Quantity_Field()"
});
formatter.result({
  "duration": 241021900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defenition1.user_Click_The_Proceed_To_CheckOut_Button_And_It_Navigates_To_Order_Address_Page()"
});
formatter.result({
  "duration": 3279302401,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "Order Address Page",
  "description": "",
  "id": "dress-purchase-in-automation-practice-application;order-address-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 24,
      "name": "@Test6"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "user Click The Proceed To CheckOut Button And It Navigates To Order Shipping Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Defenition1.user_Click_The_Proceed_To_CheckOut_Button_And_It_Navigates_To_Order_Shipping_Page()"
});
formatter.result({
  "duration": 2287121101,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "Order Shipping Page",
  "description": "",
  "id": "dress-purchase-in-automation-practice-application;order-shipping-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 27,
      "name": "@Test7"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "user Accept The Terms And Condition And Click The Box",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "user Click The Proceed To CheckOut Button And It Navigates To Order Payment Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Defenition1.user_Accept_The_Terms_And_Condition_And_Click_The_Box()"
});
formatter.result({
  "duration": 168715899,
  "status": "passed"
});
formatter.match({
  "location": "Step_Defenition1.user_Click_The_Proceed_To_CheckOut_Button_And_It_Navigates_To_Order_Payment_Page()"
});
formatter.result({
  "duration": 2655718801,
  "status": "passed"
});
formatter.scenario({
  "line": 32,
  "name": "Order Payment Page",
  "description": "",
  "id": "dress-purchase-in-automation-practice-application;order-payment-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 31,
      "name": "@Test8"
    }
  ]
});
formatter.step({
  "line": 33,
  "name": "user Click The Pay By Bank Wire Button And It Navigates To The Order Confirm Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Defenition1.user_Click_The_Pay_By_Bank_Wire_Button_And_It_Navigates_To_The_Order_Confirm_Page()"
});
formatter.result({
  "duration": 1883354000,
  "status": "passed"
});
formatter.scenario({
  "line": 35,
  "name": "Order Confirm Page",
  "description": "",
  "id": "dress-purchase-in-automation-practice-application;order-confirm-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 34,
      "name": "@Test9"
    }
  ]
});
formatter.step({
  "line": 36,
  "name": "user Click The I Conform My Order button And It Navigates To Confirmation page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Defenition1.user_Click_The_I_Conform_My_Order_button_And_It_Navigates_To_Confirmation_page()"
});
formatter.result({
  "duration": 5275526300,
  "status": "passed"
});
});