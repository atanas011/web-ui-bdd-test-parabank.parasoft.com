Feature: Login Functionality
  In order to use internet banking
  As a valid ParaBank client
  User wants to log in successfully

  Scenario: Successful Login
    Given User is on the Login page of the ParaBank app
    When User submits valid credentials
    Then Overview page is displayed