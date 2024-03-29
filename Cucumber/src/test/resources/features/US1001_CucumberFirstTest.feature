Feature: 1001_Cucumber Amazon Search Test

  Scenario: TC01 Amazon Nutella Test
    Given User goes to amazon webpage
    When Make searched nutella
    Then Make test result of nutella
    And Close page

    Scenario: TC02 Amazon Java Test
      Given User goes to amazon webpage
      When Make searched java
      Then Make test result of java
      And Close page

    Scenario: TC03 Amazon Samsung Test
      Given User goes to amazon webpage
      When Make searched samsung
      Then Make test result of samsung
      And Close page
