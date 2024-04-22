
Feature: Login Feature
  Sign with SSO


  Scenario: User logs into the VC Showroom application
    Given the user is on the login page
    When  User enters valid credentials and logs in
    Then the user should be logged in successfully

  Scenario: User should be on the home page after login
    Then User should see a home page logo