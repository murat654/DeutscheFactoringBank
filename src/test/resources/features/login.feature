@smoke
Feature: Login feature
  User Story: As a user, I should be able to login

  Background: User is expected to be on the login page for the scenarios on the feature file
    Given user is on the login page

  Scenario Outline: "Identity not registered" display verification for invalid credentials
    Given user clicks to forgot password link
    And user enters username "<username>" on the ForgotPasswordPage
    And user clicks to the send button on the ForgotPasswordPage
    Then user sees Identity not registered message
    Examples:
      | username |
      | a@aa     |
      | bb       |
      | @cc      |
      | [blank]  |