Feature: Jenkins Test

  @instagramLogin
  Scenario: create account in instagram

    Given go to instagram page
    When accept cookies
    Then click singUp
    And fill 'user account info' requirements
    And click account info next button
    And fill 'birthDay' requirements
    And click birthday next button
    And Close page
