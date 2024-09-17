#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: User login to google

 Scenario: Sucessful login with valid UserID and Valid Password
    Given User launch Chrome browser
    When User opens URL "https://www.saucedemo.com/"
    And User enter valid userID as "standard_user" and password as "secret_sauce"
    And User clicks on login button.
    And Page title should be "Swag Labs"
   
 
