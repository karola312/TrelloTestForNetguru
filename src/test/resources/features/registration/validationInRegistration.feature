Feature: As a new user, I would like to register my account

  Background:
    Given user is on registration page

  Scenario: User with not correct email shouldn't be able to register
    When he tries to register with not correct email
    Then the validation message is displayed