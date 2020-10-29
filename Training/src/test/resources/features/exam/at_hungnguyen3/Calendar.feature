Feature: Test on Calendar screen

  Background:
    Given Calendar screen is opened

  Scenario: Check display of Calendar screen
    When I check display of Calendar screen
    Then Calendar is displayed

  Scenario: Check function of back button
    When I tap on back button
    Then Home screen is opened

  Scenario: Check display initial time
    When I check display initial time
    Then The initial time is current time

  Scenario: Check function of
    When
    Then
