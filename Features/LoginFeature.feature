Feature: Login to testautmation websites
 
  Scenario: Sucessful login with valid UserID and Valid Password
    Given User launch Chrome browser
    When User opens URL "https://www.saucedemo.com/"
    And User enter valid userID as "standard_user" and password as "secret_sauce"
    And User clicks on login button.
    Then Page title should be "Swag Labs"
    
   
    Scenario Outline: Sucessful login with valid UserID and Valid Password with ddt
    Given User launch Chrome browser
    When User opens URL "https://www.saucedemo.com/"
    And User enter valid userID as "<UserID>" and password as "<password>"
    And User clicks on login button.
    Then Page title should be "Swag Labs"
    
    Examples:
    |UserID||password|
    |standard_user||secret_sauce|
    |locked_out_user||secret_sauce|
    |problem_user||secret_sauce|
  
