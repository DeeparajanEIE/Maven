Feature: Dress Purchase In Automation Practice Application
@Test1
Scenario: My Store Page
Given user Launch The Application
When user Click The SignIn Button And It Navigates To The Login Page
@Test2
Scenario: Login Page
When user Enter The "kutydeepak@gmail.com" In Email Address Field
And user Enter The "deepak111" In Password Field 
Then user Click The Signin Button And It Navigaes to My Account Page
@Test3
Scenario: My Account Page
When user Select The Dress Type
Then user Click The Casual Dresses Button And It Navigates To The casual Dress Page
@Test4
Scenario: Cassual Dress Page
When user ScrollDown And Select The Particular Dress
Then user Click The Add To Cart Button And It Opens A Proceed To CheckOut Page
Then user Click The Proceed To CheckOut Button And It Navigates To Order Page 
@Test5
Scenario: Order Page
When user Increase The Quantity In Quantity Field
Then user Click The Proceed To CheckOut Button And It Navigates To Order Address Page
@Test6
Scenario: Order Address Page
Then user Click The Proceed To CheckOut Button And It Navigates To Order Shipping Page
@Test7
Scenario: Order Shipping Page
When user Accept The Terms And Condition And Click The Box
Then user Click The Proceed To CheckOut Button And It Navigates To Order Payment Page
@Test8
Scenario: Order Payment Page
Then user Click The Pay By Bank Wire Button And It Navigates To The Order Confirm Page
@Test9
Scenario: Order Confirm Page
Then user Click The I Conform My Order button And It Navigates To Confirmation page
@Test10
Scenario: Confirmation page
Then user Click The SignOut Button And It Navigates To The Login Page
