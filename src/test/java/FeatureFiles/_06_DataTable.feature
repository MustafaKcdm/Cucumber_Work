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

        Scenario: Creating new fee

          And Click to the element in LeftNav
            |setup|
            |parameter|
            |fees|
          And Click to the element in Dialog
            |plus|

          And User sending the keys in the Dialog Content
            |nameInput| trycdmz2|
            |codeInput| 232022|
            |priortyInput| 13202 |

          And Click to the element in Dialog
            |activeDialogBtn|



          And Click to the element in Dialog
            |saveButton|

          Then Success message should be displayed
          And User delete item named from Dialog Content
            |trycdmz2|

          Then Success message should be displayed


