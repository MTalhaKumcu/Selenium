Feature: US1004 using parametre in steps

  Scenario: TC08 Amazon Nutella Test

    Given User goes to "amazonUrl" webpage
    When Make searched "nutella"
    Then Make test result of "nutella"
    And 3 sec wait
    And Close page

#@wip
  Scenario: TC09 Amazon Java Test

    Given User goes to "amazonUrl" webpage
    When Make searched "java"
    Then Make test result of "java"
    And Close page

#@wip
  Scenario: TC010 Amazon Samsung Test

    Given User goes to "amazonUrl" webpage
    When Make searched "samsung"
    Then Make test result of "samsung"
    And Close page
