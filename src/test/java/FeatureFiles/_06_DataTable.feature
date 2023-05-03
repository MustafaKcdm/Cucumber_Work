Feature: DataTable Function
  Background:
    Given Navigate to Campus
    When Enter username and password and click to the login button
    Then User should login succesfully

    Scenario: Create Country
      And Click to the element in LeftNav
      | setup     |
      | parameter |
      | countries |

      And Click to the element in Dialog
      | plus |

      And User sending the keys in the Dialog Content
      |nameInput|tryhard234z|
      |codeInput|122e34333|

      And Click to the element in Dialog
      |saveButton|

      Then Success message should be displayed

      And User delete item named from Dialog Content
      |tryhard234z|

      Then Success message should be displayed

  @Regression
      Scenario: Create Nationality

        And Click to the element in LeftNav
        |setup|
        |parameter|
        |nationalities|

        And Click to the element in Dialog
        |plus|

        And User sending the keys in the Dialog Content
        |nameInput| tryhrdzr12334|

        And Click to the element in Dialog
        |saveButton|

        Then Success message should be displayed

        And User delete item named from Dialog Content
          |tryhrdzr12334|

        Then Success message should be displayed

  @Regression
        Scenario: Creating new fee

          And Click to the element in LeftNav
            |setup|
            |parameter|
            |fees|
          And Click to the element in Dialog
            |plus|

          And User sending the keys in the Dialog Content
            |nameInput| trycmz2|
            |codeInput| 23222|
            |priortyInput| 1322 |

          And Click to the element in Dialog
            |saveButton|
            |saveButton|

          Then Success message should be displayed
          And User delete item named from Dialog Content
            |trycmz2|

          Then Success message should be displayed


