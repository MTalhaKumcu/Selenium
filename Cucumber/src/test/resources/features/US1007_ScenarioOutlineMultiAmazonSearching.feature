Feature: US1007 amazon multi searching

  Scenario Outline: TC13 User can make multi searching in Amazon
    Given User goes to "amazonUrl" webpage
    Then Make searched "<searchedWord>"
    And Make test result of "<searchedWord>"
    And Close page

    Examples:
      | searchedWord |
      | Java         |
      | Python       |
      | Cucumber     |
      | Apple        |