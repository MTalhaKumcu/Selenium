Feature: US1010 Automation Exercises2
  @test2
  Scenario: TC16 exercise 2 taking take users list
    Given User goes to "gurudemoUrl" webpage
    And guru99 cookies accept
    Then Write Company in console
    And "Quess Corp" is enable in the list
    Then Close page
