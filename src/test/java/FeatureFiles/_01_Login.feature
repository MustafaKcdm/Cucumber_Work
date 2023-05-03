#Senaryo
  #siteye git
  #login bilgilerini gir
  #siteye girildiğini doğrula

Feature: Login Feature
  @SmokeTest @Regression
  Scenario: Login with valid username and password

    Given Navigate to Campus
    When Enter username and password and click to the login button
    Then User should login succesfully
