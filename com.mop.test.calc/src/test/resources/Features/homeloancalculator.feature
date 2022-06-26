Feature: Home loan Calculator

  Scenario: Checking the loan calculator working properly using valid inputs
    Given user navigates to home page
    When user lands on home page
    Then User inputs data to check the functionality of the calculator

   Scenario: Reset the given input by clicking start Over button
    Given user navigates to home page
    When user lands on home page
    Then Click start Over button on submitting 
    

   Scenario: Validating the error message on giving incomplete data as input
    Given user navigates to home page
    When user lands on home page
    Then User inputs incomplete data and check the error message
   
