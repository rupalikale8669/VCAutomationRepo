@smoke
Feature: VCShowroom test cases for Login,search and create new project Feature

  Background:
    Given User has installed the iOS mobile app
    And User has launched the VCShowroom application
    When the user is on the login page
    And User enters valid credentials and logs in
    Then the user should be logged in successfully

  Scenario Outline: User searches for a product in the global search
    Given I am on the home page
    When User searches for "<product_name>" in the global search
    Then Search results for "<product_name>" should be displayed

    Examples:
      | product_name |
      | LED Light    |


  Scenario: User logs out from the application
    When User navigates to the logout option
    And User confirms the logout action
    Then User should be logged out successfully