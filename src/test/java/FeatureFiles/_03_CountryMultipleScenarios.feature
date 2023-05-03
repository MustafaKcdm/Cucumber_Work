Feature: Country Multi Scenario

  Background: #before scenario
    Given Navigate to Campus
    When  Enter username and password and click to the login button
    Then User should login succesfully
    And Navigate to country page

  Scenario: Create country
    When Create a country
    Then Success message should be displayed

    Scenario: Create a country 2
      When create a country name as "tryhardw2" code as "z123w4d"
      Then Success message should be displayed