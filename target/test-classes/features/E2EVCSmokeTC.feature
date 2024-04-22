@Regression @TC_TC01 @TC02 @TC03 @TC04 @TC05 @TC_9994 @TC_10005 @TC_10039 @TC_14119 @TC_14118
Feature: VCShowroom test cases for Login,search and create new project Feature

  Background:
    Given User has installed the iOS mobile app
    When User logs into the app with valid credentials

  Scenario: Install iOS app, search product, create new project and add customer details
    Given I am on the home page
    When I search for a product with the searchText
      | searchText | errorMsg                                                              |
      | test       | We're sorry, but there are no results that match your search criteria |
      | fan        | We're sorry, but there are no results that match your search criteria |
    Then I should see the product details for the customer
    When I have created a new project
    And I have validate product search page details
    And I have validated the "<sortBy>" filter option
      | sortBy              |
      | Designer recommends |
      | Price High to Low   |
      | Price Low to High   |
    And I have selected a product "Antique Fan Downrods" to add to the project
    And I have click on Add to project button
    And I have click on back to project editor option
    And I edit the project details by adding quantity and comment
      | my first product |
    And I click on the Continue to Customer details option
    And I am on the customer details page
    And I enter the following customer details:
      | ProjectEmail   | PhoneNumber | CompanyName | Name | AddressLine       | AddressLine2 | City         | StateProvinces | ZipPostalCode | Country |
      | test@gmail.com | 988965555   | Facebook    | JON  | 1890 Thunder Road | Redwood City | Redwood City | California     | 94063         | US      |


  Scenario: Install iOS app, search product, create new project and add customer details
    Given I am on the home page
    When I have created a new project
    And I have validate product search page details
    And I have selected a product "Falaise Grande Two Tier Chandelier" to add to the project
    And I have click on Add to project button
    And I have click on back to project editor option
    And I click on the Continue to Customer details option
    And I am on the customer details page
    And I enter the following customer details:
      | ProjectEmail   | PhoneNumber | CompanyName | Name  | AddressLine       | AddressLine2 | City         | StateProvinces | ZipPostalCode | Country |
      | test@gmail.com | 988965555   | Google      | April | 1890 Thunder Road | Redwood City | Redwood City | California     | 94063         | US      |






