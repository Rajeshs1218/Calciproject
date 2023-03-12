Feature: Check Calculator

  @testcase1
  Scenario: Check the borrow details
    Given Open Calculator
    When Check Estimation

 @testcase2
  Scenario: Check the borrow details
     Given Open Calculator
     When Check Estimation
     Then Start Over

  @testcase3
  Scenario: Check the borrow details
    Given Open Calculator
    Then Start Over
    Then Error Check
