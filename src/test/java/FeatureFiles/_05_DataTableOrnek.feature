Feature: DataTable Ornek
  Scenario: User List
    When Write username"ismet"
    And Write username and as password "ismet" and "1234"
    And Write username as DataTable
    | ismet |
    | muco |
    | emre |
    | yunus |
    And Write username and as password as DataTable
      | ismet |  1234|
      | muco  |  1236|
      | emre  |  1237|
      | yunus |  1238|
