Feature:
  @SmokeTest
    #senaryo üzerine yazılır
  Scenario: Create Country

    Given Navigate to Campus
    When Enter username and password and click to the login button
    Then User should login succesfully
    And Navigate to country page
    When Create a country
    Then Success message should be displayed