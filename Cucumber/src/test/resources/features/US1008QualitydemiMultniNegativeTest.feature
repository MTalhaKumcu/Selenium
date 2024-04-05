Feature: US1008 Multi negative login test with users list
 @smoke
  Scenario Outline: TC14 user does not enter user cridential to login

    Given User goes to "qdUrl" webpage
    Then click first login link
    And  user enter email"<email>"
    And  user enter password"<password>"
    When click login button
    Then isEnable to enter
    And Close page
    Examples:
      | email         | password |
      | abc@gmail.com | 123456   |
      | asd@gmail.com | 1234567  |
      | klm@gmail.com | asd2das  |
