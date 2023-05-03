Feature: Scenario Outline Database function on creating fees
  Background:
  Background:
    Given Navigate to Campus
    When Enter username and password and click to the login button
    Then User should login succesfully
  @ExtendedReport
    Scenario Outline: Creating new exams

      And Click to the element in LeftNav
        |entranceExams|
        |examSetup|
        |entranceExams2|

      Then Click to the element in Dialog
        |plus|

      And User creates a exam name as "<name>"

      And Click to the element in Dialog
        |saveButton|
      Then Success message should be displayed

      And Click to the element in LeftNav
        |entranceExams|
        |examSetup|
        |entranceExams2|

      And User delete the "<name>"

      Then Success message should be displayed

          Examples:
        | name  |
        |h3352rg |
        |ts05wdy |

