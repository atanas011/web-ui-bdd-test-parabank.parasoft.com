Feature: Login Functionality
  In order to use internet banking
  As a valid ParaBank client
  User wants to log in successfully

  Scenario Outline: Successful Login
    Given User is on the Login page of the ParaBank app
    When User submits valid <username> and <password>
    Then Overview page is displayed
    Examples:
      | username | password |
      | "AnaE"   | "123"    |
      | "IvaI"   | "456"    |