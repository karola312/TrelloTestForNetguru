Feature: As a user I would like to log in my account with my e-mail and password

  Scenario: User with valid credential is able to log in using his email address
    Given user is on login page
    When he logs in with email using valid credentials
    Then he is logged in