Feature: ApachePOI Citizen Func
  Background:
    Given Navigate to Campus
    When Enter username and password and click to the login button
    Then User should login succesfully
    And Navigate to citizenship page

    Scenario: Create and Delete CitizenShip from excel file
      When  User create citizenshio with ApachePOI
      Then User delete citizenship with ApachePOI

