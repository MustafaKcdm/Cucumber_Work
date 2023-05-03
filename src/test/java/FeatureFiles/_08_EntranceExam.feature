#Senaryo :
#  Exam Formunun Çalışmasını test ediniz
#  1 sınav girişi yapıp
#  sonrasında silmesini yapınız

  Feature:
    Background:
      Given Navigate to Campus
      When Enter username and password and click to the login button
      Then User should login succesfully

@ExtendedReport
    Scenario: Adding entrance exam function

      And Click to the element in LeftNav
      |entranceExams|
      |examSetup|
      |entranceExams2|

      And Click to the element in Dialog
      |plus|

      And User sending the keys in the Dialog Content
      |nameInput| tryhrd003 |

      And Click to the element in Dialog
        |academicPeriod|
        |academicPeriod2|
        |gradeLevel|
        |gradeLevel2|


      And Click to the element in Dialog
      |saveButton|

      Then Success message should be displayed

      And Click to the element in LeftNav
        |entranceExams|
        |examSetup|
        |entranceExams2|
      And User delete item named from Dialog Content
        | tryhrd0032 |

      Then Success message should be displayed







