Feature: US1009 create new user

  @test
  Scenario: TC15 User information

    Given User goes to "automationUrl" webpage
    And User click sign up link
    And User enter username and email in create account
    And singUp clicked
    And User enter own information
    And User create account clicked
    Then is new account enable
    Then Close page
