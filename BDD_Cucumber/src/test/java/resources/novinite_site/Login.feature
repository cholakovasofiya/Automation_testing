Feature: Login
  Scenario: user is able to login with valid username and password
    Given user navigates to myAccountMenu
    Given user enters valid username in the username field
    And user enters valid password in the password field
    When user clicks the login button
    Then user is logged in successfully

  Scenario: user is not able to login with valid username and wrong password
    Given user navigates to myAccountMenu
    Given user enters invalid username in the username field
    And user enters wrong password in the password field
    When user clicks the login button
    Then error message is displayed