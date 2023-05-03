#Senaryo :
#  Daha önceki Fee Functionality Senaryosunu
#  name, code, intCode ve priority için 5 farklı kombinasyon için çalıştırınız.

  Feature: Scenario Outline Database function on creating fees
    Background:
      Given Navigate to Campus
      When Enter username and password and click to the login button
      Then User should login succesfully
@Regression
Scenario Outline: Creating new fees

And Click to the element in LeftNav
|setup|
|parameter|
|fees|
And Click to the element in Dialog
|plus|

  When User creates a citizenship name as "<name>" and code name as "<code>" and priorty as "<priorty>"

And Click to the element in Dialog
|activeDialogBtn|
|saveButton|

Then Success message should be displayed

And User delete the "<name>"

Then Success message should be displayed

  Examples:
    |  name | code  |priorty|
    |h33rg | 4164   | 404   |
    |tswdy | 4889   | 990   |
    |tes2  | 0548   | 080   |
    |e222  | 0955   | 060   |
