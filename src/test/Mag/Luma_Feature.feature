Feature: End to End Testing the Luma Website

  Scenario:  Testing all the page

  Scenario Outline: Testing the Sign-in the page

    Given Launching the URL link

    And Clik the Signin link

    And User Enter the valid Email "<Email_Id>" and valid password "<password>"

    And Enter the Signin Button

    And User Signin Successfully

    And Take the screenshot of the curretnt page

    And User select the downarrow link

    And Clik the Signout button
Examples:
    |Email_Id                       |password|
    |vijay.sivakaarthik@gmail.com   |Sivakarthik@123|

#    Scenario Outline: Testing the invalid mail and password checking
#
#      Given Launching the URL link
#
#      And Clik the Signin link
#
#      And User enter the Invalid Email "<Email_Id>" and valid password "<password>"
#
#      And Enter the Signin Button
#
#      And User user login failed
#
#      And Take the screenshot of the Error page
#
#      Examples:
#        |Email_Id                       |password|
#        |vijay.sivakarthik@gmail.com   |Sivakarthik@123|
