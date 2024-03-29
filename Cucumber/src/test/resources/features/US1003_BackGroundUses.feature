Feature: 1003 back ground uses

  Background: go to amazon page
    Given User goes to amazon webpage

  Scenario: TC05 Amazon Nutella Test

    When Make searched nutella
    Then Make test result of nutella
    And Close page

  Scenario: TC06 Amazon Java Test
    When Make searched java
    Then Make test result of java
    And Close page

  Scenario: TC07 Amazon Samsung Test
    When Make searched samsung
    Then Make test result of samsung
    And Close page
