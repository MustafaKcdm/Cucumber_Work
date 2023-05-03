Feature:

  Background:
    Given Navigate to Campus
    When Enter username and password and click to the login button
    Then User should login succesfully
    And Navigate to citizenship page

Scenario Outline: Adding Citizenship
  When User creates a citizenship name as "<name>" and short name as "<short>"
  Then Success message should be displayed

  When User creates a citizenship name as "<name>" and short name as "<short>"
  Then Alert message should be displayed

  When User delete the "<name>"
  Then Success message should be displayed

  Examples:
    |  name  |  short |
    |h333rg | gf334u |
    |ts30wy | fg3s44 |
    |te3s2  | d31d43 |

