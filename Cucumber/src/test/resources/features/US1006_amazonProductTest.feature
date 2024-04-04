Feature: US1006_amazonSearchTest

  #@wip
  Scenario: TC12 searched product test
    Given User goes to "amazonUrl" webpage
    Then Make searched "actualText"
    And click first product
    And opened producek is Contain "expetedText"
    And Close page